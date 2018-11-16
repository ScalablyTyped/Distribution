package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.NavigationNodeCreationInformation")
@js.native
class NavigationNodeCreationInformation () extends ClientValueObject {
  def get_asLastNode(): scala.Boolean = js.native
  def get_isExternal(): scala.Boolean = js.native
  def get_previousNode(): NavigationNode = js.native
  def get_title(): java.lang.String = js.native
  def get_url(): java.lang.String = js.native
  def set_asLastNode(value: scala.Boolean): scala.Unit = js.native
  def set_isExternal(value: scala.Boolean): scala.Unit = js.native
  def set_previousNode(value: NavigationNode): scala.Unit = js.native
  def set_title(value: java.lang.String): scala.Unit = js.native
  def set_url(value: java.lang.String): scala.Unit = js.native
}

