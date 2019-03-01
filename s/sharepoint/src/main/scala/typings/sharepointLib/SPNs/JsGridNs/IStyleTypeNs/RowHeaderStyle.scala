package typings
package sharepointLib.SPNs.JsGridNs.IStyleTypeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowHeaderStyle extends js.Object {
  var backgroundColor: js.Any
  var innerBorderColor: js.Any
  var outerBorderColor: js.Any
}

object RowHeaderStyle {
  @scala.inline
  def apply(backgroundColor: js.Any, innerBorderColor: js.Any, outerBorderColor: js.Any): RowHeaderStyle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("backgroundColor")(backgroundColor)
    __obj.updateDynamic("innerBorderColor")(innerBorderColor)
    __obj.updateDynamic("outerBorderColor")(outerBorderColor)
    __obj.asInstanceOf[RowHeaderStyle]
  }
}

