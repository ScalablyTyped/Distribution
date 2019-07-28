package typings.sharepoint.SPNs.JsGridNs.PropertyTypeNs

import typings.sharepoint.Anon_BDelayInit
import typings.sharepoint.Anon_DataValue
import typings.sharepoint.SPNs.JsGridNs.IMultiValuePropertyType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.PropertyType.MultiValuePropType")
@js.native
class MultiValuePropType () extends IMultiValuePropertyType {
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
    fnCallback: js.Function1[/* args */ Anon_DataValue, Unit],
    fnError: js.Any
  ): Unit = js.native
  /* CompleteClass */
  override def GetSerializableMultiValuePropType(): Anon_BDelayInit = js.native
  /* CompleteClass */
  override def InitSingleValuePropType(): Unit = js.native
  /* CompleteClass */
  override def LocStrArrayToLocStr(locStrArray: js.Array[java.lang.String]): java.lang.String = js.native
  /* CompleteClass */
  override def LocStrToLocStrArray(locStr: java.lang.String): js.Array[java.lang.String] = js.native
}

