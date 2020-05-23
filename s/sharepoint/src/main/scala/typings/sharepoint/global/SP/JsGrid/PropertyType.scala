package typings.sharepoint.global.SP.JsGrid

import typings.sharepoint.SP.JsGrid.IEditControl
import typings.sharepoint.SP.JsGrid.IEditControlGridContext
import typings.sharepoint.SP.JsGrid.IPropertyType
import typings.sharepoint.SP.JsGrid.IRecord
import typings.sharepoint.anon.BDelayInit
import typings.sharepoint.anon.BLimitToList
import typings.sharepoint.anon.DataValue
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.PropertyType")
@js.native
class PropertyType ()
  extends typings.sharepoint.SP.JsGrid.PropertyType

/* static members */
@JSGlobal("SP.JsGrid.PropertyType")
@js.native
object PropertyType extends js.Object {
  @js.native
  class CheckBoxBoolean ()
    extends typings.sharepoint.SP.JsGrid.PropertyType.CheckBoxBoolean {
    /* CompleteClass */
    override var ID: java.lang.String = js.native
    /* CompleteClass */
    override def BeginValidateNormalizeConvert(
      recordKey: Double,
      fieldKey: java.lang.String,
      newValue: js.Any,
      bIsLocalized: Boolean,
      fnCallback: js.Function1[/* args */ DataValue, Unit],
      fnError: js.Any
    ): Unit = js.native
    /* CompleteClass */
    override def DataToLocalized(dataValue: js.Any): java.lang.String = js.native
    /* CompleteClass */
    override def GetBool(dataValue: js.Any): Boolean = js.native
  }
  
  @js.native
  class DropDownBoolean ()
    extends typings.sharepoint.SP.JsGrid.PropertyType.DropDownBoolean {
    /* CompleteClass */
    override var ID: java.lang.String = js.native
    /* CompleteClass */
    override def BeginValidateNormalizeConvert(
      recordKey: Double,
      fieldKey: java.lang.String,
      newValue: js.Any,
      bIsLocalized: Boolean,
      fnCallback: js.Function1[/* args */ DataValue, Unit],
      fnError: js.Any
    ): Unit = js.native
    /* CompleteClass */
    override def DataToLocalized(dataValue: js.Any): java.lang.String = js.native
    /* CompleteClass */
    override def GetBool(dataValue: js.Any): Boolean = js.native
  }
  
  @js.native
  class HyperLink ()
    extends typings.sharepoint.SP.JsGrid.PropertyType.HyperLink {
    /* CompleteClass */
    override var ID: java.lang.String = js.native
    /* CompleteClass */
    override var bHyperlink: Boolean = js.native
    /* CompleteClass */
    override def BeginValidateNormalizeConvert(
      recordKey: Double,
      fieldKey: java.lang.String,
      newValue: js.Any,
      bIsLocalized: Boolean,
      fnCallback: js.Function1[/* args */ DataValue, Unit],
      fnError: js.Any
    ): Unit = js.native
    /* CompleteClass */
    override def DataToLocalized(dataValue: js.Any): java.lang.String = js.native
    /* CompleteClass */
    override def GetAddress(dataValue: js.Any): java.lang.String = js.native
    /** Returns string like this: '"http:// site.com, Site title"' */
    /* CompleteClass */
    override def GetCopyValue(record: IRecord, dataValue: js.Any, locValue: java.lang.String): java.lang.String = js.native
  }
  
  @js.native
  class LookupTable protected ()
    extends typings.sharepoint.SP.JsGrid.PropertyType.LookupTable {
    def this(items: js.Array[_], id: java.lang.String, bLimitToList: Boolean) = this()
    /* CompleteClass */
    override var ID: java.lang.String = js.native
    /* CompleteClass */
    override def BeginValidateNormalizeConvert(
      recordKey: Double,
      fieldKey: java.lang.String,
      newValue: js.Any,
      bIsLocalized: Boolean,
      fnCallback: js.Function1[/* args */ DataValue, Unit],
      fnError: js.Any
    ): Unit = js.native
    /* CompleteClass */
    override def DataToLocalized(dataValue: js.Any): java.lang.String = js.native
    /* CompleteClass */
    override def GetImageSource(record: IRecord, dataValue: js.Any): java.lang.String = js.native
    /* CompleteClass */
    override def GetIsLimitedToList(): Boolean = js.native
    /* CompleteClass */
    override def GetItems(fnCallback: js.Any): Unit = js.native
    /* CompleteClass */
    override def GetSerializableLookupPropType(): BLimitToList = js.native
    /* CompleteClass */
    override def GetStyleId(dataValue: js.Any): java.lang.String = js.native
    /* CompleteClass */
    override def LocalizedToData(localized: java.lang.String): js.Any = js.native
  }
  
  @js.native
  class MultiValuePropType ()
    extends typings.sharepoint.SP.JsGrid.PropertyType.MultiValuePropType {
    /* CompleteClass */
    override var ID: java.lang.String = js.native
    /* CompleteClass */
    override var bMultiValue: Boolean = js.native
    /* CompleteClass */
    override var separator: java.lang.String = js.native
    /* CompleteClass */
    override var singleValuePropType: java.lang.String = js.native
    /* CompleteClass */
    override def BeginValidateNormalizeConvert(
      recordKey: Double,
      fieldKey: java.lang.String,
      newValue: js.Any,
      bIsLocalized: Boolean,
      fnCallback: js.Function1[/* args */ DataValue, Unit],
      fnError: js.Any
    ): Unit = js.native
    /* CompleteClass */
    override def GetSerializableMultiValuePropType(): BDelayInit = js.native
    /* CompleteClass */
    override def InitSingleValuePropType(): Unit = js.native
    /* CompleteClass */
    override def LocStrArrayToLocStr(locStrArray: js.Array[java.lang.String]): java.lang.String = js.native
    /* CompleteClass */
    override def LocStrToLocStrArray(locStr: java.lang.String): js.Array[java.lang.String] = js.native
  }
  
  @js.native
  class String ()
    extends typings.sharepoint.SP.JsGrid.PropertyType.String {
    /* CompleteClass */
    override var ID: java.lang.String = js.native
    /* CompleteClass */
    override def BeginValidateNormalizeConvert(
      recordKey: Double,
      fieldKey: java.lang.String,
      newValue: js.Any,
      bIsLocalized: Boolean,
      fnCallback: js.Function1[/* args */ DataValue, Unit],
      fnError: js.Any
    ): Unit = js.native
  }
  
  @js.native
  class Utils ()
    extends typings.sharepoint.SP.JsGrid.PropertyType.Utils
  
  /** Register a custom property type. */
  def RegisterNewCustomPropType(
    propType: IPropertyType,
    displayCtrlName: java.lang.String,
    editControlName: java.lang.String,
    widgetControlNames: js.Array[java.lang.String]
  ): Unit = js.native
  /** Register a custom property type, where display and edit controls, and also widgets, are derived from the specified parent property type. */
  def RegisterNewDerivedCustomPropType(propType: IPropertyType, baseTypeName: java.lang.String): Unit = js.native
  /** Lookup property type factory, based on SP.JsGrid.PropertyType.LookupTable class.
    displayCtrlName should be one of the following: SP.JsGrid.DisplayControl.Type.Image, SP.JsGrid.DisplayControl.Type.ImageText or SP.JsGrid.DisplayControl.Type.Text
    */
  def RegisterNewLookupPropType(id: java.lang.String, items: js.Array[_], displayCtrlName: java.lang.String, bLimitToList: Boolean): Unit = js.native
  /* static members */
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
  
}

