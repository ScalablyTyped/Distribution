package typings.sharepoint.SPNs.UINs

import typings.sharepoint.SPNs.HtmlBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.UI.CommandBar")
@js.native
class CommandBar () extends js.Object {
  def addCommand(action: Command): Unit = js.native
  def attachEvents(): Unit = js.native
  def findCommandByName(name: String): Command = js.native
  def get_commands(): js.Array[Command] = js.native
  def get_dropDownThreshold(): Double = js.native
  def get_elementID(): String = js.native
  def get_overrideClass(): String = js.native
  def insertCommand(action: Command, position: Double): Unit = js.native
  def render(builder: HtmlBuilder): Unit = js.native
  def set_dropDownThreshold(value: Double): Double = js.native
  def set_overrideClass(value: String): String = js.native
}

