package typings
package reactDashFormLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Label extends js.Object {
  var label: java.lang.String
  var value: reactDashFormLib.reactDashFormMod.FormValue
}

object Anon_Label {
  @scala.inline
  def apply(label: java.lang.String, value: reactDashFormLib.reactDashFormMod.FormValue): Anon_Label = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Label]
  }
}

