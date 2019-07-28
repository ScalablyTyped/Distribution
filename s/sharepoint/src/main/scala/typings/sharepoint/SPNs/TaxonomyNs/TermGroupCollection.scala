package typings.sharepoint.SPNs.TaxonomyNs

import typings.sharepoint.SPNs.ClientObjectCollection
import typings.sharepoint.SPNs.Guid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TermGroupCollection extends ClientObjectCollection[TermGroup] {
  def getById(id: Guid): TermGroup = js.native
  def getByName(name: String): TermGroup = js.native
  def get_item(index: Double): TermGroup = js.native
  def itemAt(index: Double): TermGroup = js.native
}

