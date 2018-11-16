package typings
package sharepointLib.SPNs.JsGridNs.EventArgsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.EventArgs.PropertyChanged")
@js.native
class PropertyChanged protected ()
  extends sharepointLib.SPNs.JsGridNs.IEventArgs {
  def this(recordKey: scala.Double, fieldKey: java.lang.String, oldProp: sharepointLib.SPNs.JsGridNs.InternalNs.PropertyUpdate, newProp: sharepointLib.SPNs.JsGridNs.InternalNs.PropertyUpdate, propType: sharepointLib.SPNs.JsGridNs.IPropertyType, changeKey: sharepointLib.SPNs.JsGridNs.IChangeKey, validationState: sharepointLib.SPNs.JsGridNs.ValidationState) = this()
  var changeKey: sharepointLib.SPNs.JsGridNs.IChangeKey = js.native
  var fieldKey: java.lang.String = js.native
  var newProp: sharepointLib.SPNs.JsGridNs.InternalNs.PropertyUpdate = js.native
  var oldProp: sharepointLib.SPNs.JsGridNs.InternalNs.PropertyUpdate = js.native
  var propType: sharepointLib.SPNs.JsGridNs.IPropertyType = js.native
  var recordKey: scala.Double = js.native
  var validationState: sharepointLib.SPNs.JsGridNs.ValidationState = js.native
}

