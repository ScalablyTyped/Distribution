package typings.sharepoint.SPNs.JsGridNs.PropertyTypeNs

import typings.sharepoint.Anon_DataValue
import typings.sharepoint.SPNs.JsGridNs.IPropertyType
import typings.sharepoint.SPNs.JsGridNs.IRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.PropertyType.HyperLink")
@js.native
class HyperLink () extends IPropertyType {
  /* CompleteClass */
  override var ID: java.lang.String = js.native
  var bHyperlink: Boolean = js.native
  /* CompleteClass */
  override def BeginValidateNormalizeConvert(
    recordKey: Double,
    fieldKey: java.lang.String,
    newValue: js.Any,
    bIsLocalized: Boolean,
    fnCallback: js.Function1[/* args */ Anon_DataValue, Unit],
    fnError: js.Any
  ): Unit = js.native
  def DataToLocalized(dataValue: js.Any): java.lang.String = js.native
  def GetAddress(dataValue: js.Any): java.lang.String = js.native
  /** Returns string like this: '"http:// site.com, Site title"' */
  def GetCopyValue(record: IRecord, dataValue: js.Any, locValue: java.lang.String): java.lang.String = js.native
}

