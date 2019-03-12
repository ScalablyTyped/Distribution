package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IMultiValuePropertyType extends IPropertyType {
  var bMultiValue: scala.Boolean
  var separator: java.lang.String
  var singleValuePropType: java.lang.String
  def GetSerializableMultiValuePropType(): sharepointLib.Anon_BDelayInit
  def InitSingleValuePropType(): scala.Unit
  def LocStrArrayToLocStr(locStrArray: js.Array[java.lang.String]): java.lang.String
  def LocStrToLocStrArray(locStr: java.lang.String): js.Array[java.lang.String]
}

object IMultiValuePropertyType {
  @scala.inline
  def apply(
    BeginValidateNormalizeConvert: (scala.Double, java.lang.String, js.Any, scala.Boolean, js.Function1[/* args */ sharepointLib.Anon_DataValue, scala.Unit], js.Any) => scala.Unit,
    GetSerializableMultiValuePropType: () => sharepointLib.Anon_BDelayInit,
    ID: java.lang.String,
    InitSingleValuePropType: () => scala.Unit,
    LocStrArrayToLocStr: js.Array[java.lang.String] => java.lang.String,
    LocStrToLocStrArray: java.lang.String => js.Array[java.lang.String],
    bMultiValue: scala.Boolean,
    separator: java.lang.String,
    singleValuePropType: java.lang.String
  ): IMultiValuePropertyType = {
    val __obj = js.Dynamic.literal(BeginValidateNormalizeConvert = js.Any.fromFunction6(BeginValidateNormalizeConvert), GetSerializableMultiValuePropType = js.Any.fromFunction0(GetSerializableMultiValuePropType), ID = ID, InitSingleValuePropType = js.Any.fromFunction0(InitSingleValuePropType), LocStrArrayToLocStr = js.Any.fromFunction1(LocStrArrayToLocStr), LocStrToLocStrArray = js.Any.fromFunction1(LocStrToLocStrArray), bMultiValue = bMultiValue, separator = separator, singleValuePropType = singleValuePropType)
  
    __obj.asInstanceOf[IMultiValuePropertyType]
  }
}

