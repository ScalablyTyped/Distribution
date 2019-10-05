package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.NavigationNodeCreationInformation")
@js.native
class NavigationNodeCreationInformation () extends ClientValueObject {
  def get_asLastNode(): Boolean = js.native
  def get_isExternal(): Boolean = js.native
  def get_previousNode(): NavigationNode = js.native
  def get_title(): String = js.native
  def get_url(): String = js.native
  def set_asLastNode(value: Boolean): Unit = js.native
  def set_isExternal(value: Boolean): Unit = js.native
  def set_previousNode(value: NavigationNode): Unit = js.native
  def set_title(value: String): Unit = js.native
  def set_url(value: String): Unit = js.native
}

