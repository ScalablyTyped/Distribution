package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.Property")
@js.native
class Property () extends js.Object

/* static members */
@JSGlobal("SP.JsGrid.Property")
@js.native
object Property extends js.Object {
  def MakeProperty(
    dataValue: js.Any,
    localizedValue: java.lang.String,
    bHasDataValue: scala.Boolean,
    bHasLocalizedValue: scala.Boolean,
    propType: js.Any
  ): sharepointLib.SPNs.JsGridNs.IPropertyBase = js.native
  def MakePropertyFromGridField(gridField: js.Any, dataValue: js.Any, localizedVal: java.lang.String): sharepointLib.SPNs.JsGridNs.IPropertyBase = js.native
  def MakePropertyFromGridField(gridField: js.Any, dataValue: js.Any, localizedVal: java.lang.String, optPropType: js.Any): sharepointLib.SPNs.JsGridNs.IPropertyBase = js.native
}

