package typings.sharepoint.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationNodeCollection extends ClientObjectCollection[NavigationNode] {
  def add(parameters: NavigationNodeCreationInformation): NavigationNode = js.native
  def get_item(index: Double): NavigationNode = js.native
  def itemAt(index: Double): NavigationNode = js.native
}

