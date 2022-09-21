package typings.sharepoint.global.SP.JsGrid

import typings.sharepoint.SP.JsGrid.IPropertyBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.JsGrid.Property")
@js.native
open class Property ()
  extends StObject
     with typings.sharepoint.SP.JsGrid.Property
object Property {
  
  @JSGlobal("SP.JsGrid.Property")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def MakeProperty(
    dataValue: Any,
    localizedValue: String,
    bHasDataValue: Boolean,
    bHasLocalizedValue: Boolean,
    propType: Any
  ): IPropertyBase = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeProperty")(dataValue.asInstanceOf[js.Any], localizedValue.asInstanceOf[js.Any], bHasDataValue.asInstanceOf[js.Any], bHasLocalizedValue.asInstanceOf[js.Any], propType.asInstanceOf[js.Any])).asInstanceOf[IPropertyBase]
  
  /* static member */
  inline def MakePropertyFromGridField(gridField: Any, dataValue: Any, localizedVal: String): IPropertyBase = (^.asInstanceOf[js.Dynamic].applyDynamic("MakePropertyFromGridField")(gridField.asInstanceOf[js.Any], dataValue.asInstanceOf[js.Any], localizedVal.asInstanceOf[js.Any])).asInstanceOf[IPropertyBase]
  inline def MakePropertyFromGridField(gridField: Any, dataValue: Any, localizedVal: String, optPropType: Any): IPropertyBase = (^.asInstanceOf[js.Dynamic].applyDynamic("MakePropertyFromGridField")(gridField.asInstanceOf[js.Any], dataValue.asInstanceOf[js.Any], localizedVal.asInstanceOf[js.Any], optPropType.asInstanceOf[js.Any])).asInstanceOf[IPropertyBase]
}
