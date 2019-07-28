package typings.sharepoint.SPNs.JsGridNs.PropertyTypeNs

import typings.sharepoint.Anon_DataValue
import typings.sharepoint.SPNs.JsGridNs.IPropertyType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.PropertyType.String")
@js.native
class String () extends IPropertyType {
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
}

