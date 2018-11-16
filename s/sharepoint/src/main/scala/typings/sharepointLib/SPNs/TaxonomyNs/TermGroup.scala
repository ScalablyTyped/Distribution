package typings
package sharepointLib.SPNs.TaxonomyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Taxonomy.TermGroup")
@js.native
class TermGroup () extends TaxonomyItem {
  def createTermSet(name: java.lang.String, newTermSetId: sharepointLib.SPNs.Guid, lcid: scala.Double): TermSet = js.native
  def exportObject(): sharepointLib.SPNs.StringResult = js.native
  def getChanges(changeInformation: ChangeInformation): ChangedItemCollection = js.native
  def getTermSetsWithCustomProperty(customPropertyMatchInformation: CustomPropertyMatchInformation): TermSetCollection = js.native
  def get_description(): java.lang.String = js.native
  def get_isSiteCollectionGroup(): scala.Boolean = js.native
  def get_isSystemGroup(): scala.Boolean = js.native
  def get_termSets(): TermSetCollection = js.native
  def set_description(value: java.lang.String): scala.Unit = js.native
}

