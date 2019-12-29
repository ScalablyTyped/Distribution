package typings.reactDashNativeDashVideo

import typings.reactDashNativeDashVideo.reactDashNativeDashVideoStrings.`applicationSlashx-subrip`
import typings.reactDashNativeDashVideo.reactDashNativeDashVideoStrings.applicationSlashttmlPlussignxml
import typings.reactDashNativeDashVideo.reactDashNativeDashVideoStrings.textSlashvtt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Applicationttmlxml extends js.Object {
  var language: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: `applicationSlashx-subrip` | applicationSlashttmlPlussignxml | textSlashvtt
  var uri: String
}

object Anon_Applicationttmlxml {
  @scala.inline
  def apply(
    `type`: `applicationSlashx-subrip` | applicationSlashttmlPlussignxml | textSlashvtt,
    uri: String,
    language: String = null,
    title: String = null
  ): Anon_Applicationttmlxml = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Applicationttmlxml]
  }
}

