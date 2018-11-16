package typings
package sharepointLib.SPNs.JsGridNs.PropertyTypeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.PropertyType.LookupTable")
@js.native
class LookupTable protected ()
  extends sharepointLib.SPNs.JsGridNs.ILookupPropertyType {
  def this(items: js.Array[_], id: java.lang.String, bLimitToList: scala.Boolean) = this()
  /* CompleteClass */
  override var ID: java.lang.String = js.native
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
  override def DataToLocalized(dataValue: js.Any): java.lang.String = js.native
  /* CompleteClass */
  override def GetImageSource(record: sharepointLib.SPNs.JsGridNs.IRecord, dataValue: js.Any): java.lang.String = js.native
  /* CompleteClass */
  override def GetIsLimitedToList(): scala.Boolean = js.native
  /* CompleteClass */
  override def GetItems(fnCallback: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def GetSerializableLookupPropType(): sharepointLib.Anon_BLimitToList = js.native
  /* CompleteClass */
  override def GetStyleId(dataValue: js.Any): java.lang.String = js.native
  /* CompleteClass */
  override def LocalizedToData(localized: java.lang.String): js.Any = js.native
}

