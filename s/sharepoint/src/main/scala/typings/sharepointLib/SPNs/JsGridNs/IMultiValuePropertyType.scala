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
    BeginValidateNormalizeConvert: js.Function6[
      scala.Double, 
      java.lang.String, 
      js.Any, 
      scala.Boolean, 
      js.Function1[/* args */ sharepointLib.Anon_DataValue, scala.Unit], 
      js.Any, 
      scala.Unit
    ],
    GetSerializableMultiValuePropType: js.Function0[sharepointLib.Anon_BDelayInit],
    ID: java.lang.String,
    InitSingleValuePropType: js.Function0[scala.Unit],
    LocStrArrayToLocStr: js.Function1[js.Array[java.lang.String], java.lang.String],
    LocStrToLocStrArray: js.Function1[java.lang.String, js.Array[java.lang.String]],
    bMultiValue: scala.Boolean,
    separator: java.lang.String,
    singleValuePropType: java.lang.String
  ): IMultiValuePropertyType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BeginValidateNormalizeConvert")(BeginValidateNormalizeConvert)
    __obj.updateDynamic("GetSerializableMultiValuePropType")(GetSerializableMultiValuePropType)
    __obj.updateDynamic("ID")(ID)
    __obj.updateDynamic("InitSingleValuePropType")(InitSingleValuePropType)
    __obj.updateDynamic("LocStrArrayToLocStr")(LocStrArrayToLocStr)
    __obj.updateDynamic("LocStrToLocStrArray")(LocStrToLocStrArray)
    __obj.updateDynamic("bMultiValue")(bMultiValue)
    __obj.updateDynamic("separator")(separator)
    __obj.updateDynamic("singleValuePropType")(singleValuePropType)
    __obj.asInstanceOf[IMultiValuePropertyType]
  }
}

