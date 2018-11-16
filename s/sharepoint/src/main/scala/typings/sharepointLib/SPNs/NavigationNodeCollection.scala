package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationNodeCollection extends ClientObjectCollection[NavigationNode] {
  def add(parameters: NavigationNodeCreationInformation): NavigationNode = js.native
  def get_item(index: scala.Double): NavigationNode = js.native
  def itemAt(index: scala.Double): NavigationNode = js.native
}

