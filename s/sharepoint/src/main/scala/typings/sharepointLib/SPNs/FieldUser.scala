package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.FieldUser")
@js.native
class FieldUser () extends FieldLookup {
  def get_allowDisplay(): scala.Boolean = js.native
  def get_presence(): scala.Boolean = js.native
  def get_selectionGroup(): scala.Double = js.native
  def get_selectionMode(): FieldUserSelectionMode = js.native
  def set_allowDisplay(value: scala.Boolean): scala.Unit = js.native
  def set_presence(value: scala.Boolean): scala.Unit = js.native
  def set_selectionGroup(value: scala.Double): scala.Unit = js.native
  def set_selectionMode(value: FieldUserSelectionMode): scala.Unit = js.native
}

