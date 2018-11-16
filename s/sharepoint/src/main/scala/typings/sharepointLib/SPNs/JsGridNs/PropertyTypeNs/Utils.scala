package typings
package sharepointLib.SPNs.JsGridNs.PropertyTypeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.PropertyType.Utils")
@js.native
class Utils () extends js.Object

@JSGlobal("SP.JsGrid.PropertyType.Utils")
@js.native
object Utils extends js.Object {
  def RegisterDisplayControl(name: java.lang.String, singleton: js.Any, requiredFunctionNames: js.Array[java.lang.String]): scala.Unit = js.native
  def RegisterEditControl(
    name: java.lang.String,
    factory: js.Function2[
      /* gridContext */ sharepointLib.SPNs.JsGridNs.IEditControlGridContext, 
      /* gridTextInputElement */ stdLib.HTMLElement, 
      sharepointLib.SPNs.JsGridNs.IEditControl
    ],
    requiredFunctionNames: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def RegisterWidgetControl(
    name: java.lang.String,
    factory: js.Function1[/* ddContext */ js.Any, sharepointLib.SPNs.JsGridNs.IPropertyType],
    requiredFunctionNames: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def UpdateDisplayControlForPropType(propTypeName: java.lang.String, displayControlType: java.lang.String): scala.Unit = js.native
}

