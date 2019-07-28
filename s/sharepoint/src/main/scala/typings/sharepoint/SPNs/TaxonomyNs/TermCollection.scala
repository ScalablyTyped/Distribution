package typings.sharepoint.SPNs.TaxonomyNs

import typings.sharepoint.SPNs.ClientObjectCollection
import typings.sharepoint.SPNs.Guid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TermCollection extends ClientObjectCollection[Term] {
  def getById(id: Guid): Term = js.native
  def getByName(name: String): Term = js.native
  def get_item(index: Double): Term = js.native
  def itemAt(index: Double): Term = js.native
}

