package typings
package sharepointLib.SPNs.JsGridNs.PropertyTypeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.PropertyType.MultiValuePropType")
@js.native
class MultiValuePropType ()
  extends sharepointLib.SPNs.JsGridNs.IMultiValuePropertyType {
  /* CompleteClass */
  override var ID: java.lang.String = js.native
  /* CompleteClass */
  override var bMultiValue: scala.Boolean = js.native
  /* CompleteClass */
  override var separator: java.lang.String = js.native
  /* CompleteClass */
  override var singleValuePropType: java.lang.String = js.native
  /* CompleteClass */
  override def BeginValidateNormalizeConvert(
    recordKey: scala.Double,
    fieldKey: java.lang.String,
    newValue: js.Any,
    bIsLocalized: scala.Boolean,
    fnCallback: js.Function1[/* args */ sharepointLib.Anon_DataValue, scala.Unit],
    fnError: js.Any
  ): scala.Unit = js.native
  /* CompleteClass */
  override def GetSerializableMultiValuePropType(): sharepointLib.Anon_BDelayInit = js.native
  /* CompleteClass */
  override def InitSingleValuePropType(): scala.Unit = js.native
  /* CompleteClass */
  override def LocStrArrayToLocStr(locStrArray: js.Array[java.lang.String]): java.lang.String = js.native
  /* CompleteClass */
  override def LocStrToLocStrArray(locStr: java.lang.String): js.Array[java.lang.String] = js.native
}

