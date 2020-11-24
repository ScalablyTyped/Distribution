package typings.sharepoint.SP.JsGrid

import typings.sharepoint.anon.BDelayInit
import typings.sharepoint.anon.DataValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMultiValuePropertyType extends IPropertyType {
  
  def GetSerializableMultiValuePropType(): BDelayInit = js.native
  
  def InitSingleValuePropType(): Unit = js.native
  
  def LocStrArrayToLocStr(locStrArray: js.Array[String]): String = js.native
  
  def LocStrToLocStrArray(locStr: String): js.Array[String] = js.native
  
  var bMultiValue: Boolean = js.native
  
  var separator: String = js.native
  
  var singleValuePropType: String = js.native
}
object IMultiValuePropertyType {
  
  @scala.inline
  def apply(
    BeginValidateNormalizeConvert: (Double, String, js.Any, Boolean, js.Function1[/* args */ DataValue, Unit], js.Any) => Unit,
    GetSerializableMultiValuePropType: () => BDelayInit,
    ID: String,
    InitSingleValuePropType: () => Unit,
    LocStrArrayToLocStr: js.Array[String] => String,
    LocStrToLocStrArray: String => js.Array[String],
    bMultiValue: Boolean,
    separator: String,
    singleValuePropType: String
  ): IMultiValuePropertyType = {
    val __obj = js.Dynamic.literal(BeginValidateNormalizeConvert = js.Any.fromFunction6(BeginValidateNormalizeConvert), GetSerializableMultiValuePropType = js.Any.fromFunction0(GetSerializableMultiValuePropType), ID = ID.asInstanceOf[js.Any], InitSingleValuePropType = js.Any.fromFunction0(InitSingleValuePropType), LocStrArrayToLocStr = js.Any.fromFunction1(LocStrArrayToLocStr), LocStrToLocStrArray = js.Any.fromFunction1(LocStrToLocStrArray), bMultiValue = bMultiValue.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any], singleValuePropType = singleValuePropType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMultiValuePropertyType]
  }
  
  @scala.inline
  implicit class IMultiValuePropertyTypeOps[Self <: IMultiValuePropertyType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetSerializableMultiValuePropType(value: () => BDelayInit): Self = this.set("GetSerializableMultiValuePropType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInitSingleValuePropType(value: () => Unit): Self = this.set("InitSingleValuePropType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLocStrArrayToLocStr(value: js.Array[String] => String): Self = this.set("LocStrArrayToLocStr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLocStrToLocStrArray(value: String => js.Array[String]): Self = this.set("LocStrToLocStrArray", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBMultiValue(value: Boolean): Self = this.set("bMultiValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleValuePropType(value: String): Self = this.set("singleValuePropType", value.asInstanceOf[js.Any])
  }
}
