package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.PropertyType")
@js.native
class PropertyType () extends js.Object

@JSGlobal("SP.JsGrid.PropertyType")
@js.native
object PropertyType extends js.Object {
  /** Register a custom property type. */
  def RegisterNewCustomPropType(
    propType: sharepointLib.SPNs.JsGridNs.IPropertyType,
    displayCtrlName: java.lang.String,
    editControlName: java.lang.String,
    widgetControlNames: js.Array[java.lang.String]
  ): scala.Unit = js.native
  /** Register a custom property type, where display and edit controls, and also widgets, are derived from the specified parent property type. */
  def RegisterNewDerivedCustomPropType(propType: sharepointLib.SPNs.JsGridNs.IPropertyType, baseTypeName: java.lang.String): scala.Unit = js.native
  /** Lookup property type factory, based on SP.JsGrid.PropertyType.LookupTable class.
                  displayCtrlName should be one of the following: SP.JsGrid.DisplayControl.Type.Image, SP.JsGrid.DisplayControl.Type.ImageText or SP.JsGrid.DisplayControl.Type.Text
               */
  def RegisterNewLookupPropType(
    id: java.lang.String,
    items: js.Array[_],
    displayCtrlName: java.lang.String,
    bLimitToList: scala.Boolean
  ): scala.Unit = js.native
}

