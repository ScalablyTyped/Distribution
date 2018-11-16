package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebCollection extends ClientObjectCollection[Web] {
  def add(parameters: WebCreationInformation): Web = js.native
  def get_item(index: scala.Double): Web = js.native
  def itemAt(index: scala.Double): Web = js.native
}

