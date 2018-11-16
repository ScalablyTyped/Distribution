package typings
package sharepointLib.SPNs.TaxonomyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Taxonomy.ChangedTerm")
@js.native
class ChangedTerm () extends ChangedItem {
  def get_changedCustomProperties(): js.Array[java.lang.String] = js.native
  def get_changedLocalCustomProperties(): js.Array[java.lang.String] = js.native
  def get_groupId(): sharepointLib.SPNs.Guid = js.native
  def get_lcidsForChangedDescriptions(): js.Array[scala.Double] = js.native
  def get_lcidsForChangedLabels(): js.Array[scala.Double] = js.native
  def get_termSetId(): sharepointLib.SPNs.Guid = js.native
}

