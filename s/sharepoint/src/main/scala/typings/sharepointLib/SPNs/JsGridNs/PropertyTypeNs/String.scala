package typings
package sharepointLib.SPNs.JsGridNs.PropertyTypeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.PropertyType.String")
@js.native
class String ()
  extends sharepointLib.SPNs.JsGridNs.IPropertyType {
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
}

