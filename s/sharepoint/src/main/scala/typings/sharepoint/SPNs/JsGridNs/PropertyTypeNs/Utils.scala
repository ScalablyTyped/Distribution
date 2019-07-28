package typings.sharepoint.SPNs.JsGridNs.PropertyTypeNs

import typings.sharepoint.SPNs.JsGridNs.IEditControl
import typings.sharepoint.SPNs.JsGridNs.IEditControlGridContext
import typings.sharepoint.SPNs.JsGridNs.IPropertyType
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.PropertyType.Utils")
@js.native
class Utils () extends js.Object

/* static members */
@JSGlobal("SP.JsGrid.PropertyType.Utils")
@js.native
object Utils extends js.Object {
  def RegisterDisplayControl(name: java.lang.String, singleton: js.Any, requiredFunctionNames: js.Array[java.lang.String]): Unit = js.native
  def RegisterEditControl(
    name: java.lang.String,
    factory: js.Function2[
      /* gridContext */ IEditControlGridContext, 
      /* gridTextInputElement */ HTMLElement, 
      IEditControl
    ],
    requiredFunctionNames: js.Array[java.lang.String]
  ): Unit = js.native
  def RegisterWidgetControl(
    name: java.lang.String,
    factory: js.Function1[/* ddContext */ js.Any, IPropertyType],
    requiredFunctionNames: js.Array[java.lang.String]
  ): Unit = js.native
  def UpdateDisplayControlForPropType(propTypeName: java.lang.String, displayControlType: java.lang.String): Unit = js.native
}

