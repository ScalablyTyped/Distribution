package typings.sharepoint.global.SP.JsGrid

import typings.sharepoint.SP.JsGrid.IPropertyBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.Property")
@js.native
class Property ()
  extends typings.sharepoint.SP.JsGrid.Property

/* static members */
@JSGlobal("SP.JsGrid.Property")
@js.native
object Property extends js.Object {
  def MakeProperty(
    dataValue: js.Any,
    localizedValue: String,
    bHasDataValue: Boolean,
    bHasLocalizedValue: Boolean,
    propType: js.Any
  ): IPropertyBase = js.native
  def MakePropertyFromGridField(gridField: js.Any, dataValue: js.Any, localizedVal: String): IPropertyBase = js.native
  def MakePropertyFromGridField(gridField: js.Any, dataValue: js.Any, localizedVal: String, optPropType: js.Any): IPropertyBase = js.native
}

