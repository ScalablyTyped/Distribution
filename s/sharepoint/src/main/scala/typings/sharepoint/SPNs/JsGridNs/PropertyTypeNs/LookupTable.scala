package typings.sharepoint.SPNs.JsGridNs.PropertyTypeNs

import typings.sharepoint.Anon_BLimitToList
import typings.sharepoint.Anon_DataValue
import typings.sharepoint.SPNs.JsGridNs.ILookupPropertyType
import typings.sharepoint.SPNs.JsGridNs.IRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.PropertyType.LookupTable")
@js.native
class LookupTable protected () extends ILookupPropertyType {
  def this(items: js.Array[_], id: java.lang.String, bLimitToList: Boolean) = this()
  /* CompleteClass */
  override var ID: java.lang.String = js.native
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
  override def DataToLocalized(dataValue: js.Any): java.lang.String = js.native
  /* CompleteClass */
  override def GetImageSource(record: IRecord, dataValue: js.Any): java.lang.String = js.native
  /* CompleteClass */
  override def GetIsLimitedToList(): Boolean = js.native
  /* CompleteClass */
  override def GetItems(fnCallback: js.Any): Unit = js.native
  /* CompleteClass */
  override def GetSerializableLookupPropType(): Anon_BLimitToList = js.native
  /* CompleteClass */
  override def GetStyleId(dataValue: js.Any): java.lang.String = js.native
  /* CompleteClass */
  override def LocalizedToData(localized: java.lang.String): js.Any = js.native
}

