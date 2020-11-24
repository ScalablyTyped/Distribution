package typings.sharepoint.SP.Taxonomy

import typings.sharepoint.SP.Guid
import typings.sharepoint.SP.StringResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TermGroup extends TaxonomyItem {
  
  def createTermSet(name: String, newTermSetId: Guid, lcid: Double): TermSet = js.native
  
  def exportObject(): StringResult = js.native
  
  def getChanges(changeInformation: ChangeInformation): ChangedItemCollection = js.native
  
  def getTermSetsWithCustomProperty(customPropertyMatchInformation: CustomPropertyMatchInformation): TermSetCollection = js.native
  
  def get_description(): String = js.native
  
  def get_isSiteCollectionGroup(): Boolean = js.native
  
  def get_isSystemGroup(): Boolean = js.native
  
  def get_termSets(): TermSetCollection = js.native
  
  def set_description(value: String): Unit = js.native
}
