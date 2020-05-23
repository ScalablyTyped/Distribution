package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldLookup extends Field {
  def get_allowMultipleValues(): Boolean = js.native
  def get_isRelationship(): Boolean = js.native
  def get_lookupField(): String = js.native
  def get_lookupList(): String = js.native
  def get_lookupWebId(): Guid = js.native
  def get_primaryFieldId(): String = js.native
  def get_relationshipDeleteBehavior(): RelationshipDeleteBehaviorType = js.native
  def set_allowMultipleValues(value: Boolean): Unit = js.native
  def set_isRelationship(value: Boolean): Unit = js.native
  def set_lookupField(value: String): Unit = js.native
  def set_lookupList(value: String): Unit = js.native
  def set_lookupWebId(value: Guid): Unit = js.native
  def set_primaryFieldId(value: String): Unit = js.native
  def set_relationshipDeleteBehavior(value: RelationshipDeleteBehaviorType): Unit = js.native
}

