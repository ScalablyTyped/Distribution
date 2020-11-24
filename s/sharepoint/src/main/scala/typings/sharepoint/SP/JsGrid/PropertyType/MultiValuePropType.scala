package typings.sharepoint.SP.JsGrid.PropertyType

import typings.sharepoint.SP.JsGrid.IMultiValuePropertyType
import typings.sharepoint.anon.BDelayInit
import typings.sharepoint.anon.DataValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiValuePropType extends IMultiValuePropertyType
object MultiValuePropType {
  
  @scala.inline
  def apply(
    BeginValidateNormalizeConvert: (Double, java.lang.String, js.Any, Boolean, js.Function1[/* args */ DataValue, Unit], js.Any) => Unit,
    GetSerializableMultiValuePropType: () => BDelayInit,
    ID: java.lang.String,
    InitSingleValuePropType: () => Unit,
    LocStrArrayToLocStr: js.Array[java.lang.String] => java.lang.String,
    LocStrToLocStrArray: java.lang.String => js.Array[java.lang.String],
    bMultiValue: Boolean,
    separator: java.lang.String,
    singleValuePropType: java.lang.String
  ): MultiValuePropType = {
    val __obj = js.Dynamic.literal(BeginValidateNormalizeConvert = js.Any.fromFunction6(BeginValidateNormalizeConvert), GetSerializableMultiValuePropType = js.Any.fromFunction0(GetSerializableMultiValuePropType), ID = ID.asInstanceOf[js.Any], InitSingleValuePropType = js.Any.fromFunction0(InitSingleValuePropType), LocStrArrayToLocStr = js.Any.fromFunction1(LocStrArrayToLocStr), LocStrToLocStrArray = js.Any.fromFunction1(LocStrToLocStrArray), bMultiValue = bMultiValue.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any], singleValuePropType = singleValuePropType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiValuePropType]
  }
}
