package typings.sharepoint.SP.JsGrid

import typings.sharepoint.AnonBDelayInit
import typings.sharepoint.AnonDataValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IMultiValuePropertyType extends IPropertyType {
  var bMultiValue: Boolean
  var separator: String
  var singleValuePropType: String
  def GetSerializableMultiValuePropType(): AnonBDelayInit
  def InitSingleValuePropType(): Unit
  def LocStrArrayToLocStr(locStrArray: js.Array[String]): String
  def LocStrToLocStrArray(locStr: String): js.Array[String]
}

object IMultiValuePropertyType {
  @scala.inline
  def apply(
    BeginValidateNormalizeConvert: (Double, String, js.Any, Boolean, js.Function1[/* args */ AnonDataValue, Unit], js.Any) => Unit,
    GetSerializableMultiValuePropType: () => AnonBDelayInit,
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
}

