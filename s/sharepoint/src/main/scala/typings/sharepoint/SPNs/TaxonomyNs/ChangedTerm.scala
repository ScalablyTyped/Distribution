package typings.sharepoint.SPNs.TaxonomyNs

import typings.sharepoint.SPNs.Guid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Taxonomy.ChangedTerm")
@js.native
class ChangedTerm () extends ChangedItem {
  def get_changedCustomProperties(): js.Array[String] = js.native
  def get_changedLocalCustomProperties(): js.Array[String] = js.native
  def get_groupId(): Guid = js.native
  def get_lcidsForChangedDescriptions(): js.Array[Double] = js.native
  def get_lcidsForChangedLabels(): js.Array[Double] = js.native
  def get_termSetId(): Guid = js.native
}

