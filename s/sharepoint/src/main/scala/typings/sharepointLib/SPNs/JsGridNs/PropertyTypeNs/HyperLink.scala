package typings
package sharepointLib.SPNs.JsGridNs.PropertyTypeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.PropertyType.HyperLink")
@js.native
class HyperLink ()
  extends sharepointLib.SPNs.JsGridNs.IPropertyType {
  /* CompleteClass */
  override var ID: java.lang.String = js.native
  var bHyperlink: scala.Boolean = js.native
  /* CompleteClass */
  override def BeginValidateNormalizeConvert(
    recordKey: scala.Double,
    fieldKey: java.lang.String,
    newValue: js.Any,
    bIsLocalized: scala.Boolean,
    fnCallback: js.Function1[/* args */ sharepointLib.Anon_DataValue, scala.Unit],
    fnError: js.Any
  ): scala.Unit = js.native
  def DataToLocalized(dataValue: js.Any): java.lang.String = js.native
  def GetAddress(dataValue: js.Any): java.lang.String = js.native
  /** Returns string like this: '"http:// site.com, Site title"' */
  def GetCopyValue(record: sharepointLib.SPNs.JsGridNs.IRecord, dataValue: js.Any, locValue: java.lang.String): java.lang.String = js.native
}

