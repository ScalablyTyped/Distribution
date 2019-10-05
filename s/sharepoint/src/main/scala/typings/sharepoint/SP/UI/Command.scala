package typings.sharepoint.SP.UI

import typings.sharepoint.SP.HtmlBuilder
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.UI.Command")
@js.native
class Command protected () extends js.Object {
  def this(name: String, displayName: String) = this()
  def attachEvents(): Unit = js.native
  def get_displayName(): String = js.native
  def get_elementIDPrefix(): String = js.native
  def get_href(): String = js.native
  def get_isDropDownCommand(): Boolean = js.native
  def get_isEnabled(): Boolean = js.native
  def get_linkElement(): HTMLAnchorElement = js.native
  def get_name(): String = js.native
  def get_tooltip(): String = js.native
  /**Should override*/
  def onClick(): Unit = js.native
  def render(builder: HtmlBuilder): Unit = js.native
  def set_displayName(value: String): String = js.native
  def set_elementIDPrefix(value: String): String = js.native
  def set_isDropDownCommand(value: Boolean): Boolean = js.native
  def set_isEnabled(value: Boolean): Boolean = js.native
  def set_tooltip(value: String): String = js.native
}

