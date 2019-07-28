package typings.sharepoint.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.PropertyType")
@js.native
class PropertyType () extends js.Object

/* static members */
@JSGlobal("SP.JsGrid.PropertyType")
@js.native
object PropertyType extends js.Object {
  /** Register a custom property type. */
  def RegisterNewCustomPropType(
    propType: IPropertyType,
    displayCtrlName: String,
    editControlName: String,
    widgetControlNames: js.Array[String]
  ): Unit = js.native
  /** Register a custom property type, where display and edit controls, and also widgets, are derived from the specified parent property type. */
  def RegisterNewDerivedCustomPropType(propType: IPropertyType, baseTypeName: String): Unit = js.native
  /** Lookup property type factory, based on SP.JsGrid.PropertyType.LookupTable class.
    displayCtrlName should be one of the following: SP.JsGrid.DisplayControl.Type.Image, SP.JsGrid.DisplayControl.Type.ImageText or SP.JsGrid.DisplayControl.Type.Text
    */
  def RegisterNewLookupPropType(id: String, items: js.Array[_], displayCtrlName: String, bLimitToList: Boolean): Unit = js.native
}

