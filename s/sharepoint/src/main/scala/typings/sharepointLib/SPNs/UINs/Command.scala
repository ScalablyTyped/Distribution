package typings
package sharepointLib.SPNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.UI.Command")
@js.native
class Command protected () extends js.Object {
  def this(name: java.lang.String, displayName: java.lang.String) = this()
  def attachEvents(): scala.Unit = js.native
  def get_displayName(): java.lang.String = js.native
  def get_elementIDPrefix(): java.lang.String = js.native
  def get_href(): java.lang.String = js.native
  def get_isDropDownCommand(): scala.Boolean = js.native
  def get_isEnabled(): scala.Boolean = js.native
  def get_linkElement(): stdLib.HTMLAnchorElement = js.native
  def get_name(): java.lang.String = js.native
  def get_tooltip(): java.lang.String = js.native
  /**Should override*/
  def onClick(): scala.Unit = js.native
  def render(builder: sharepointLib.SPNs.HtmlBuilder): scala.Unit = js.native
  def set_displayName(value: java.lang.String): java.lang.String = js.native
  def set_elementIDPrefix(value: java.lang.String): java.lang.String = js.native
  def set_isDropDownCommand(value: scala.Boolean): scala.Boolean = js.native
  def set_isEnabled(value: scala.Boolean): scala.Boolean = js.native
  def set_tooltip(value: java.lang.String): java.lang.String = js.native
}

