package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelatedField
  extends StObject
     with ClientObject {
  
  def get_fieldId(): Guid = js.native
  
  def get_listId(): Guid = js.native
  
  def get_lookupList(): List[js.Any] = js.native
  
  def get_relationshipDeleteBehavior(): RelationshipDeleteBehaviorType = js.native
  
  def get_webId(): Guid = js.native
}
