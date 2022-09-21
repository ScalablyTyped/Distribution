package typings.sharepoint.global.SP.JsGrid

import typings.sharepoint.SP.JsGrid.IEditControl
import typings.sharepoint.SP.JsGrid.IEditControlGridContext
import typings.sharepoint.SP.JsGrid.IPropertyType
import typings.sharepoint.SP.JsGrid.IRecord
import typings.sharepoint.anon.BDelayInit
import typings.sharepoint.anon.BLimitToList
import typings.sharepoint.anon.DataValue
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.JsGrid.PropertyType")
@js.native
open class PropertyType ()
  extends StObject
     with typings.sharepoint.SP.JsGrid.PropertyType
object PropertyType {
  
  @JSGlobal("SP.JsGrid.PropertyType")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("SP.JsGrid.PropertyType.CheckBoxBoolean")
  @js.native
  open class CheckBoxBoolean ()
    extends StObject
       with typings.sharepoint.SP.JsGrid.PropertyType.CheckBoxBoolean {
    
    /* CompleteClass */
    override def BeginValidateNormalizeConvert(
      recordKey: Double,
      fieldKey: java.lang.String,
      newValue: Any,
      bIsLocalized: Boolean,
      fnCallback: js.Function1[/* args */ DataValue, Unit],
      fnError: Any
    ): Unit = js.native
    
    /* CompleteClass */
    override def DataToLocalized(dataValue: Any): java.lang.String = js.native
    
    /* CompleteClass */
    override def GetBool(dataValue: Any): Boolean = js.native
    
    /* CompleteClass */
    var ID: java.lang.String = js.native
  }
  
  @JSGlobal("SP.JsGrid.PropertyType.DropDownBoolean")
  @js.native
  open class DropDownBoolean ()
    extends StObject
       with typings.sharepoint.SP.JsGrid.PropertyType.DropDownBoolean {
    
    /* CompleteClass */
    override def BeginValidateNormalizeConvert(
      recordKey: Double,
      fieldKey: java.lang.String,
      newValue: Any,
      bIsLocalized: Boolean,
      fnCallback: js.Function1[/* args */ DataValue, Unit],
      fnError: Any
    ): Unit = js.native
    
    /* CompleteClass */
    override def DataToLocalized(dataValue: Any): java.lang.String = js.native
    
    /* CompleteClass */
    override def GetBool(dataValue: Any): Boolean = js.native
    
    /* CompleteClass */
    var ID: java.lang.String = js.native
  }
  
  @JSGlobal("SP.JsGrid.PropertyType.HyperLink")
  @js.native
  open class HyperLink ()
    extends StObject
       with typings.sharepoint.SP.JsGrid.PropertyType.HyperLink {
    
    /* CompleteClass */
    override def BeginValidateNormalizeConvert(
      recordKey: Double,
      fieldKey: java.lang.String,
      newValue: Any,
      bIsLocalized: Boolean,
      fnCallback: js.Function1[/* args */ DataValue, Unit],
      fnError: Any
    ): Unit = js.native
    
    /* CompleteClass */
    override def DataToLocalized(dataValue: Any): java.lang.String = js.native
    
    /* CompleteClass */
    override def GetAddress(dataValue: Any): java.lang.String = js.native
    
    /** Returns string like this: '"http:// site.com, Site title"' */
    /* CompleteClass */
    override def GetCopyValue(record: IRecord, dataValue: Any, locValue: java.lang.String): java.lang.String = js.native
    
    /* CompleteClass */
    var ID: java.lang.String = js.native
    
    /* CompleteClass */
    var bHyperlink: Boolean = js.native
  }
  
  @JSGlobal("SP.JsGrid.PropertyType.LookupTable")
  @js.native
  open class LookupTable protected ()
    extends StObject
       with typings.sharepoint.SP.JsGrid.PropertyType.LookupTable {
    def this(items: js.Array[Any], id: java.lang.String, bLimitToList: Boolean) = this()
    
    /* CompleteClass */
    override def BeginValidateNormalizeConvert(
      recordKey: Double,
      fieldKey: java.lang.String,
      newValue: Any,
      bIsLocalized: Boolean,
      fnCallback: js.Function1[/* args */ DataValue, Unit],
      fnError: Any
    ): Unit = js.native
    
    /* CompleteClass */
    override def DataToLocalized(dataValue: Any): java.lang.String = js.native
    
    /* CompleteClass */
    override def GetImageSource(record: IRecord, dataValue: Any): java.lang.String = js.native
    
    /* CompleteClass */
    override def GetIsLimitedToList(): Boolean = js.native
    
    /* CompleteClass */
    override def GetItems(fnCallback: Any): Unit = js.native
    
    /* CompleteClass */
    override def GetSerializableLookupPropType(): BLimitToList = js.native
    
    /* CompleteClass */
    override def GetStyleId(dataValue: Any): java.lang.String = js.native
    
    /* CompleteClass */
    var ID: java.lang.String = js.native
    
    /* CompleteClass */
    override def LocalizedToData(localized: java.lang.String): Any = js.native
  }
  
  @JSGlobal("SP.JsGrid.PropertyType.MultiValuePropType")
  @js.native
  open class MultiValuePropType ()
    extends StObject
       with typings.sharepoint.SP.JsGrid.PropertyType.MultiValuePropType {
    
    /* CompleteClass */
    override def BeginValidateNormalizeConvert(
      recordKey: Double,
      fieldKey: java.lang.String,
      newValue: Any,
      bIsLocalized: Boolean,
      fnCallback: js.Function1[/* args */ DataValue, Unit],
      fnError: Any
    ): Unit = js.native
    
    /* CompleteClass */
    override def GetSerializableMultiValuePropType(): BDelayInit = js.native
    
    /* CompleteClass */
    var ID: java.lang.String = js.native
    
    /* CompleteClass */
    override def InitSingleValuePropType(): Unit = js.native
    
    /* CompleteClass */
    override def LocStrArrayToLocStr(locStrArray: js.Array[java.lang.String]): java.lang.String = js.native
    
    /* CompleteClass */
    override def LocStrToLocStrArray(locStr: java.lang.String): js.Array[java.lang.String] = js.native
    
    /* CompleteClass */
    var bMultiValue: Boolean = js.native
    
    /* CompleteClass */
    var separator: java.lang.String = js.native
    
    /* CompleteClass */
    var singleValuePropType: java.lang.String = js.native
  }
  
  /** Register a custom property type. */
  /* static member */
  inline def RegisterNewCustomPropType(
    propType: IPropertyType,
    displayCtrlName: java.lang.String,
    editControlName: java.lang.String,
    widgetControlNames: js.Array[java.lang.String]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RegisterNewCustomPropType")(propType.asInstanceOf[js.Any], displayCtrlName.asInstanceOf[js.Any], editControlName.asInstanceOf[js.Any], widgetControlNames.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Register a custom property type, where display and edit controls, and also widgets, are derived from the specified parent property type. */
  /* static member */
  inline def RegisterNewDerivedCustomPropType(propType: IPropertyType, baseTypeName: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RegisterNewDerivedCustomPropType")(propType.asInstanceOf[js.Any], baseTypeName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Lookup property type factory, based on SP.JsGrid.PropertyType.LookupTable class.
    displayCtrlName should be one of the following: SP.JsGrid.DisplayControl.Type.Image, SP.JsGrid.DisplayControl.Type.ImageText or SP.JsGrid.DisplayControl.Type.Text
    */
  /* static member */
  inline def RegisterNewLookupPropType(
    id: java.lang.String,
    items: js.Array[Any],
    displayCtrlName: java.lang.String,
    bLimitToList: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RegisterNewLookupPropType")(id.asInstanceOf[js.Any], items.asInstanceOf[js.Any], displayCtrlName.asInstanceOf[js.Any], bLimitToList.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("SP.JsGrid.PropertyType.String")
  @js.native
  open class String ()
    extends StObject
       with typings.sharepoint.SP.JsGrid.PropertyType.String {
    
    /* CompleteClass */
    override def BeginValidateNormalizeConvert(
      recordKey: Double,
      fieldKey: java.lang.String,
      newValue: Any,
      bIsLocalized: Boolean,
      fnCallback: js.Function1[/* args */ DataValue, Unit],
      fnError: Any
    ): Unit = js.native
    
    /* CompleteClass */
    var ID: java.lang.String = js.native
  }
  
  @JSGlobal("SP.JsGrid.PropertyType.Utils")
  @js.native
  open class Utils ()
    extends StObject
       with typings.sharepoint.SP.JsGrid.PropertyType.Utils
  object Utils {
    
    @JSGlobal("SP.JsGrid.PropertyType.Utils")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def RegisterDisplayControl(name: java.lang.String, singleton: Any, requiredFunctionNames: js.Array[java.lang.String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RegisterDisplayControl")(name.asInstanceOf[js.Any], singleton.asInstanceOf[js.Any], requiredFunctionNames.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def RegisterEditControl(
      name: java.lang.String,
      factory: js.Function2[
          /* gridContext */ IEditControlGridContext, 
          /* gridTextInputElement */ HTMLElement, 
          IEditControl
        ],
      requiredFunctionNames: js.Array[java.lang.String]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RegisterEditControl")(name.asInstanceOf[js.Any], factory.asInstanceOf[js.Any], requiredFunctionNames.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def RegisterWidgetControl(
      name: java.lang.String,
      factory: js.Function1[/* ddContext */ Any, IPropertyType],
      requiredFunctionNames: js.Array[java.lang.String]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RegisterWidgetControl")(name.asInstanceOf[js.Any], factory.asInstanceOf[js.Any], requiredFunctionNames.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /* static member */
    inline def UpdateDisplayControlForPropType(propTypeName: java.lang.String, displayControlType: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("UpdateDisplayControlForPropType")(propTypeName.asInstanceOf[js.Any], displayControlType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
