package typings
package reactDashNativeDashVideoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApplicationttmlxmlApplicationxsubrip extends js.Object {
  var language: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `type`: reactDashNativeDashVideoLib.reactDashNativeDashVideoLibStrings.`application/x-subrip` | reactDashNativeDashVideoLib.reactDashNativeDashVideoLibStrings.`application/ttml+xml` | reactDashNativeDashVideoLib.reactDashNativeDashVideoLibStrings.`text/vtt`
  var uri: java.lang.String
}

object Anon_ApplicationttmlxmlApplicationxsubrip {
  @scala.inline
  def apply(
    `type`: reactDashNativeDashVideoLib.reactDashNativeDashVideoLibStrings.`application/x-subrip` | reactDashNativeDashVideoLib.reactDashNativeDashVideoLibStrings.`application/ttml+xml` | reactDashNativeDashVideoLib.reactDashNativeDashVideoLibStrings.`text/vtt`,
    uri: java.lang.String,
    language: java.lang.String = null,
    title: java.lang.String = null
  ): Anon_ApplicationttmlxmlApplicationxsubrip = {
    val __obj = js.Dynamic.literal(uri = uri)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_ApplicationttmlxmlApplicationxsubrip]
  }
}

