package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.RelatedField")
@js.native
class RelatedField () extends ClientObject {
  def get_fieldId(): Guid = js.native
  def get_listId(): Guid = js.native
  def get_lookupList(): List[_] = js.native
  def get_relationshipDeleteBehavior(): RelationshipDeleteBehaviorType = js.native
  def get_webId(): Guid = js.native
}

