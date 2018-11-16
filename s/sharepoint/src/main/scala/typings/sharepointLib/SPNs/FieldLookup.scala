package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.FieldLookup")
@js.native
class FieldLookup () extends Field {
  def get_allowMultipleValues(): scala.Boolean = js.native
  def get_isRelationship(): scala.Boolean = js.native
  def get_lookupField(): java.lang.String = js.native
  def get_lookupList(): java.lang.String = js.native
  def get_lookupWebId(): Guid = js.native
  def get_primaryFieldId(): java.lang.String = js.native
  def get_relationshipDeleteBehavior(): RelationshipDeleteBehaviorType = js.native
  def set_allowMultipleValues(value: scala.Boolean): scala.Unit = js.native
  def set_isRelationship(value: scala.Boolean): scala.Unit = js.native
  def set_lookupField(value: java.lang.String): scala.Unit = js.native
  def set_lookupList(value: java.lang.String): scala.Unit = js.native
  def set_lookupWebId(value: Guid): scala.Unit = js.native
  def set_primaryFieldId(value: java.lang.String): scala.Unit = js.native
  def set_relationshipDeleteBehavior(value: RelationshipDeleteBehaviorType): scala.Unit = js.native
}

