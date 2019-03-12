package typings
package reactDashInstantsearchDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_End extends js.Object {
  var end: js.UndefOr[scala.Double] = js.undefined
  var label: java.lang.String | reactLib.reactMod.Global.JSXNs.Element
  var start: js.UndefOr[scala.Double] = js.undefined
}

object Anon_End {
  @scala.inline
  def apply(
    label: java.lang.String | reactLib.reactMod.Global.JSXNs.Element,
    end: scala.Int | scala.Double = null,
    start: scala.Int | scala.Double = null
  ): Anon_End = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_End]
  }
}

