package typings.sharepoint.global.SP.JsGrid

import typings.sharepoint.SP.JsGrid.IPropertyBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.JsGrid.Property")
@js.native
class Property ()
  extends typings.sharepoint.SP.JsGrid.Property
object Property {
  
  /* static member */
  @JSGlobal("SP.JsGrid.Property.MakeProperty")
  @js.native
  def MakeProperty(
    dataValue: js.Any,
    localizedValue: String,
    bHasDataValue: Boolean,
    bHasLocalizedValue: Boolean,
    propType: js.Any
  ): IPropertyBase = js.native
  
  /* static member */
  @JSGlobal("SP.JsGrid.Property.MakePropertyFromGridField")
  @js.native
  def MakePropertyFromGridField(gridField: js.Any, dataValue: js.Any, localizedVal: String): IPropertyBase = js.native
  @JSGlobal("SP.JsGrid.Property.MakePropertyFromGridField")
  @js.native
  def MakePropertyFromGridField(gridField: js.Any, dataValue: js.Any, localizedVal: String, optPropType: js.Any): IPropertyBase = js.native
}
