package typings
package sharepointLib.SPNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.UI.CommandBar")
@js.native
class CommandBar () extends js.Object {
  def addCommand(action: Command): scala.Unit = js.native
  def attachEvents(): scala.Unit = js.native
  def findCommandByName(name: java.lang.String): Command = js.native
  def get_commands(): js.Array[Command] = js.native
  def get_dropDownThreshold(): scala.Double = js.native
  def get_elementID(): java.lang.String = js.native
  def get_overrideClass(): java.lang.String = js.native
  def insertCommand(action: Command, position: scala.Double): scala.Unit = js.native
  def render(builder: sharepointLib.SPNs.HtmlBuilder): scala.Unit = js.native
  def set_dropDownThreshold(value: scala.Double): scala.Double = js.native
  def set_overrideClass(value: java.lang.String): java.lang.String = js.native
}

