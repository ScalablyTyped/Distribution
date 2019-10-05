package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.FieldUser")
@js.native
class FieldUser () extends FieldLookup {
  def get_allowDisplay(): Boolean = js.native
  def get_presence(): Boolean = js.native
  def get_selectionGroup(): Double = js.native
  def get_selectionMode(): FieldUserSelectionMode = js.native
  def set_allowDisplay(value: Boolean): Unit = js.native
  def set_presence(value: Boolean): Unit = js.native
  def set_selectionGroup(value: Double): Unit = js.native
  def set_selectionMode(value: FieldUserSelectionMode): Unit = js.native
}

