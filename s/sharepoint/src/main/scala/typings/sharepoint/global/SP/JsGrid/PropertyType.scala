package typings.sharepoint.global.SP.JsGrid

import typings.sharepoint.SP.JsGrid.IEditControl
import typings.sharepoint.SP.JsGrid.IEditControlGridContext
import typings.sharepoint.SP.JsGrid.IPropertyType
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.JsGrid.PropertyType")
@js.native
class PropertyType ()
  extends typings.sharepoint.SP.JsGrid.PropertyType
object PropertyType {
  
  @JSGlobal("SP.JsGrid.PropertyType.CheckBoxBoolean")
  @js.native
  class CheckBoxBoolean ()
    extends typings.sharepoint.SP.JsGrid.PropertyType.CheckBoxBoolean
  
  @JSGlobal("SP.JsGrid.PropertyType.DropDownBoolean")
  @js.native
  class DropDownBoolean ()
    extends typings.sharepoint.SP.JsGrid.PropertyType.DropDownBoolean
  
  @JSGlobal("SP.JsGrid.PropertyType.HyperLink")
  @js.native
  class HyperLink ()
    extends typings.sharepoint.SP.JsGrid.PropertyType.HyperLink
  
  @JSGlobal("SP.JsGrid.PropertyType.LookupTable")
  @js.native
  class LookupTable protected ()
    extends typings.sharepoint.SP.JsGrid.PropertyType.LookupTable {
    def this(items: js.Array[_], id: java.lang.String, bLimitToList: Boolean) = this()
  }
  
  @JSGlobal("SP.JsGrid.PropertyType.MultiValuePropType")
  @js.native
  class MultiValuePropType ()
    extends typings.sharepoint.SP.JsGrid.PropertyType.MultiValuePropType
  
  /** Register a custom property type. */
  /* static member */
  @JSGlobal("SP.JsGrid.PropertyType.RegisterNewCustomPropType")
  @js.native
  def RegisterNewCustomPropType(
    propType: IPropertyType,
    displayCtrlName: java.lang.String,
    editControlName: java.lang.String,
    widgetControlNames: js.Array[java.lang.String]
  ): Unit = js.native
  
  /** Register a custom property type, where display and edit controls, and also widgets, are derived from the specified parent property type. */
  /* static member */
  @JSGlobal("SP.JsGrid.PropertyType.RegisterNewDerivedCustomPropType")
  @js.native
  def RegisterNewDerivedCustomPropType(propType: IPropertyType, baseTypeName: java.lang.String): Unit = js.native
  
  /** Lookup property type factory, based on SP.JsGrid.PropertyType.LookupTable class.
    displayCtrlName should be one of the following: SP.JsGrid.DisplayControl.Type.Image, SP.JsGrid.DisplayControl.Type.ImageText or SP.JsGrid.DisplayControl.Type.Text
    */
  /* static member */
  @JSGlobal("SP.JsGrid.PropertyType.RegisterNewLookupPropType")
  @js.native
  def RegisterNewLookupPropType(id: java.lang.String, items: js.Array[_], displayCtrlName: java.lang.String, bLimitToList: Boolean): Unit = js.native
  
  @JSGlobal("SP.JsGrid.PropertyType.String")
  @js.native
  class String ()
    extends typings.sharepoint.SP.JsGrid.PropertyType.String
  
  @JSGlobal("SP.JsGrid.PropertyType.Utils")
  @js.native
  class Utils ()
    extends typings.sharepoint.SP.JsGrid.PropertyType.Utils
  object Utils {
    
    /* static member */
    @JSGlobal("SP.JsGrid.PropertyType.Utils.RegisterDisplayControl")
    @js.native
    def RegisterDisplayControl(name: java.lang.String, singleton: js.Any, requiredFunctionNames: js.Array[java.lang.String]): Unit = js.native
    
    /* static member */
    @JSGlobal("SP.JsGrid.PropertyType.Utils.RegisterEditControl")
    @js.native
    def RegisterEditControl(
      name: java.lang.String,
      factory: js.Function2[
          /* gridContext */ IEditControlGridContext, 
          /* gridTextInputElement */ HTMLElement, 
          IEditControl
        ],
      requiredFunctionNames: js.Array[java.lang.String]
    ): Unit = js.native
    
    /* static member */
    @JSGlobal("SP.JsGrid.PropertyType.Utils.RegisterWidgetControl")
    @js.native
    def RegisterWidgetControl(
      name: java.lang.String,
      factory: js.Function1[/* ddContext */ js.Any, IPropertyType],
      requiredFunctionNames: js.Array[java.lang.String]
    ): Unit = js.native
    
    /* static member */
    @JSGlobal("SP.JsGrid.PropertyType.Utils.UpdateDisplayControlForPropType")
    @js.native
    def UpdateDisplayControlForPropType(propTypeName: java.lang.String, displayControlType: java.lang.String): Unit = js.native
  }
}
