package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Navigation")
@js.native
class Navigation () extends ClientObject {
  def getNodeById(id: scala.Double): NavigationNode = js.native
  def get_quickLaunch(): NavigationNodeCollection = js.native
  def get_topNavigationBar(): NavigationNodeCollection = js.native
  def get_useShared(): scala.Boolean = js.native
  def set_useShared(value: scala.Boolean): scala.Unit = js.native
}

