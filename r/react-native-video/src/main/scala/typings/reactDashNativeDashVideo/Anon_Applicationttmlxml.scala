package typings.reactDashNativeDashVideo

import typings.reactDashNativeDashVideo.reactDashNativeDashVideoStrings.`application/ttml+xml`
import typings.reactDashNativeDashVideo.reactDashNativeDashVideoStrings.`application/x-subrip`
import typings.reactDashNativeDashVideo.reactDashNativeDashVideoStrings.`text/vtt`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Applicationttmlxml extends js.Object {
  var language: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: `application/x-subrip` | `application/ttml+xml` | `text/vtt`
  var uri: String
}

object Anon_Applicationttmlxml {
  @scala.inline
  def apply(
    `type`: `application/x-subrip` | `application/ttml+xml` | `text/vtt`,
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

