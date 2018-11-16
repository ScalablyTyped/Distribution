package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldLinkCollection extends ClientObjectCollection[FieldLink] {
  def add(parameters: FieldLinkCreationInformation): FieldLink = js.native
  def getById(id: Guid): FieldLink = js.native
  def get_item(index: scala.Double): FieldLink = js.native
  def itemAt(index: scala.Double): FieldLink = js.native
  def reorder(internalNames: js.Array[java.lang.String]): scala.Unit = js.native
}

