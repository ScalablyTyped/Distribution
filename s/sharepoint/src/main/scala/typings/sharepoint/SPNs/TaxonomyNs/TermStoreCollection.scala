package typings.sharepoint.SPNs.TaxonomyNs

import typings.sharepoint.SPNs.ClientObjectCollection
import typings.sharepoint.SPNs.Guid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TermStoreCollection extends ClientObjectCollection[TermStore] {
  def getById(id: Guid): TermStore = js.native
  def getByName(name: String): TermStore = js.native
  def get_item(index: Double): TermStore = js.native
  def itemAt(index: Double): TermStore = js.native
}

