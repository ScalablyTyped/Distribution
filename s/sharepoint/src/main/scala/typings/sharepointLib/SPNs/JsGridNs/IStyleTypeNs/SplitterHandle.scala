package typings
package sharepointLib.SPNs.JsGridNs.IStyleTypeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitterHandle
  extends sharepointLib.SPNs.JsGridNs.IStyleType {
  var backgroundColor: js.Any
  var gripLowerColor: js.Any
  var gripUpperColor: js.Any
  var innerBorderColor: js.Any
  var leftInnerBorderColor: js.Any
  var outerBorderColor: js.Any
}

object SplitterHandle {
  @scala.inline
  def apply(
    backgroundColor: js.Any,
    gripLowerColor: js.Any,
    gripUpperColor: js.Any,
    innerBorderColor: js.Any,
    leftInnerBorderColor: js.Any,
    outerBorderColor: js.Any
  ): SplitterHandle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("backgroundColor")(backgroundColor)
    __obj.updateDynamic("gripLowerColor")(gripLowerColor)
    __obj.updateDynamic("gripUpperColor")(gripUpperColor)
    __obj.updateDynamic("innerBorderColor")(innerBorderColor)
    __obj.updateDynamic("leftInnerBorderColor")(leftInnerBorderColor)
    __obj.updateDynamic("outerBorderColor")(outerBorderColor)
    __obj.asInstanceOf[SplitterHandle]
  }
}

