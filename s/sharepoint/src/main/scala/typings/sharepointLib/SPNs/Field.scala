package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Field")
@js.native
class Field () extends ClientObject {
  def deleteObject(): scala.Unit = js.native
  def get_canBeDeleted(): scala.Boolean = js.native
  def get_defaultValue(): java.lang.String = js.native
  def get_description(): java.lang.String = js.native
  def get_direction(): java.lang.String = js.native
  def get_enforceUniqueValues(): scala.Boolean = js.native
  def get_entityPropertyName(): java.lang.String = js.native
  def get_fieldTypeKind(): FieldType = js.native
  def get_filterable(): scala.Boolean = js.native
  def get_fromBaseType(): scala.Boolean = js.native
  def get_group(): java.lang.String = js.native
  def get_hidden(): scala.Boolean = js.native
  def get_id(): Guid = js.native
  def get_indexed(): scala.Boolean = js.native
  def get_internalName(): java.lang.String = js.native
  def get_jsLink(): java.lang.String = js.native
  def get_readOnlyField(): scala.Boolean = js.native
  def get_required(): scala.Boolean = js.native
  def get_schemaXml(): java.lang.String = js.native
  def get_schemaXmlWithResourceTokens(): java.lang.String = js.native
  def get_scope(): java.lang.String = js.native
  def get_sealed(): scala.Boolean = js.native
  def get_sortable(): scala.Boolean = js.native
  def get_staticName(): java.lang.String = js.native
  def get_title(): java.lang.String = js.native
  def get_typeAsString(): java.lang.String = js.native
  def get_typeDisplayName(): java.lang.String = js.native
  def get_typeShortDescription(): java.lang.String = js.native
  def get_validationFormula(): java.lang.String = js.native
  def get_validationMessage(): java.lang.String = js.native
  def setShowInDisplayForm(value: scala.Boolean): scala.Unit = js.native
  def setShowInEditForm(value: scala.Boolean): scala.Unit = js.native
  def setShowInNewForm(value: scala.Boolean): scala.Unit = js.native
  def set_defaultValue(value: java.lang.String): scala.Unit = js.native
  def set_description(value: java.lang.String): scala.Unit = js.native
  def set_direction(value: java.lang.String): scala.Unit = js.native
  def set_enforceUniqueValues(value: scala.Boolean): scala.Unit = js.native
  def set_fieldTypeKind(value: FieldType): scala.Unit = js.native
  def set_group(value: java.lang.String): scala.Unit = js.native
  def set_hidden(value: scala.Boolean): scala.Unit = js.native
  def set_indexed(value: scala.Boolean): scala.Unit = js.native
  def set_jsLink(value: java.lang.String): scala.Unit = js.native
  def set_readOnlyField(value: scala.Boolean): scala.Unit = js.native
  def set_required(value: scala.Boolean): scala.Unit = js.native
  def set_schemaXml(value: java.lang.String): scala.Unit = js.native
  def set_staticName(value: java.lang.String): scala.Unit = js.native
  def set_title(value: java.lang.String): scala.Unit = js.native
  def set_typeAsString(value: java.lang.String): scala.Unit = js.native
  def set_validationFormula(value: java.lang.String): scala.Unit = js.native
  def set_validationMessage(value: java.lang.String): scala.Unit = js.native
  def update(): scala.Unit = js.native
  def updateAndPushChanges(pushChangesToLists: scala.Boolean): scala.Unit = js.native
  def validateSetValue[T](item: ListItem[T], value: java.lang.String): scala.Unit = js.native
}

