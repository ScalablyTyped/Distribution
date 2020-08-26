package typings.reactNativeVideo.anon

import typings.reactNativeVideo.reactNativeVideoStrings.`applicationSlashx-subrip`
import typings.reactNativeVideo.reactNativeVideoStrings.applicationSlashttmlPlussignxml
import typings.reactNativeVideo.reactNativeVideoStrings.textSlashvtt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Language extends js.Object {
  var language: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var `type`: `applicationSlashx-subrip` | applicationSlashttmlPlussignxml | textSlashvtt = js.native
  var uri: String = js.native
}

object Language {
  @scala.inline
  def apply(`type`: `applicationSlashx-subrip` | applicationSlashttmlPlussignxml | textSlashvtt, uri: String): Language = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Language]
  }
  @scala.inline
  implicit class LanguageOps[Self <: Language] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: `applicationSlashx-subrip` | applicationSlashttmlPlussignxml | textSlashvtt): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

