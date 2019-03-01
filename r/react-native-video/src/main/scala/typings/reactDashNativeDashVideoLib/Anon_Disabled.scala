package typings
package reactDashNativeDashVideoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Disabled extends js.Object {
  var `type`: reactDashNativeDashVideoLib.reactDashNativeDashVideoLibStrings.system | reactDashNativeDashVideoLib.reactDashNativeDashVideoLibStrings.disabled | reactDashNativeDashVideoLib.reactDashNativeDashVideoLibStrings.title | reactDashNativeDashVideoLib.reactDashNativeDashVideoLibStrings.language | reactDashNativeDashVideoLib.reactDashNativeDashVideoLibStrings.index
  var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object Anon_Disabled {
  @scala.inline
  def apply(
    `type`: reactDashNativeDashVideoLib.reactDashNativeDashVideoLibStrings.system | reactDashNativeDashVideoLib.reactDashNativeDashVideoLibStrings.disabled | reactDashNativeDashVideoLib.reactDashNativeDashVideoLibStrings.title | reactDashNativeDashVideoLib.reactDashNativeDashVideoLibStrings.language | reactDashNativeDashVideoLib.reactDashNativeDashVideoLibStrings.index,
    value: java.lang.String | scala.Double = null
  ): Anon_Disabled = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Disabled]
  }
}

