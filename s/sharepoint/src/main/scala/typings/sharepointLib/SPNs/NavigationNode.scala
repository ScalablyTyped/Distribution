package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.NavigationNode")
@js.native
class NavigationNode () extends ClientObject {
  def deleteObject(): scala.Unit = js.native
  def get_children(): NavigationNodeCollection = js.native
  def get_id(): scala.Double = js.native
  def get_isDocLib(): scala.Boolean = js.native
  def get_isExternal(): scala.Boolean = js.native
  def get_isVisible(): scala.Boolean = js.native
  def get_title(): java.lang.String = js.native
  def get_url(): java.lang.String = js.native
  def set_isVisible(value: scala.Boolean): scala.Unit = js.native
  def set_title(value: java.lang.String): scala.Unit = js.native
  def set_url(value: java.lang.String): scala.Unit = js.native
  def update(): scala.Unit = js.native
}

