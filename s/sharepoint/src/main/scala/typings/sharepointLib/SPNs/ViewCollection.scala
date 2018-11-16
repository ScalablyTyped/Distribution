package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewCollection extends ClientObjectCollection[View] {
  def add(parameters: ViewCreationInformation): View = js.native
  def getById(guidId: Guid): View = js.native
  def getByTitle(strTitle: java.lang.String): View = js.native
  def get_item(index: scala.Double): View = js.native
  def itemAt(index: scala.Double): View = js.native
}

