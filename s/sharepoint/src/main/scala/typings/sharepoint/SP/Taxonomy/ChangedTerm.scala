package typings.sharepoint.SP.Taxonomy

import typings.sharepoint.SP.Guid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangedTerm
  extends StObject
     with ChangedItem {
  
  def get_changedCustomProperties(): js.Array[String] = js.native
  
  def get_changedLocalCustomProperties(): js.Array[String] = js.native
  
  def get_groupId(): Guid = js.native
  
  def get_lcidsForChangedDescriptions(): js.Array[Double] = js.native
  
  def get_lcidsForChangedLabels(): js.Array[Double] = js.native
  
  def get_termSetId(): Guid = js.native
}
