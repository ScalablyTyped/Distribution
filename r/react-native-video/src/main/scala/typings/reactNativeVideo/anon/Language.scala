package typings.reactNativeVideo.anon

import typings.reactNativeVideo.reactNativeVideoStrings.`applicationSlashx-subrip`
import typings.reactNativeVideo.reactNativeVideoStrings.applicationSlashttmlPlussignxml
import typings.reactNativeVideo.reactNativeVideoStrings.textSlashvtt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Language extends js.Object {
  var language: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: `applicationSlashx-subrip` | applicationSlashttmlPlussignxml | textSlashvtt
  var uri: String
}

object Language {
  @scala.inline
  def apply(
    `type`: `applicationSlashx-subrip` | applicationSlashttmlPlussignxml | textSlashvtt,
    uri: String,
    language: String = null,
    title: String = null
  ): Language = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Language]
  }
}

