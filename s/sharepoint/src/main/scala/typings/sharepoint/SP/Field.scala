package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Field")
@js.native
class Field () extends ClientObject {
  def deleteObject(): Unit = js.native
  def get_canBeDeleted(): Boolean = js.native
  def get_defaultValue(): String = js.native
  def get_description(): String = js.native
  def get_direction(): String = js.native
  def get_enforceUniqueValues(): Boolean = js.native
  def get_entityPropertyName(): String = js.native
  def get_fieldTypeKind(): FieldType = js.native
  def get_filterable(): Boolean = js.native
  def get_fromBaseType(): Boolean = js.native
  def get_group(): String = js.native
  def get_hidden(): Boolean = js.native
  def get_id(): Guid = js.native
  def get_indexed(): Boolean = js.native
  def get_internalName(): String = js.native
  def get_jsLink(): String = js.native
  def get_readOnlyField(): Boolean = js.native
  def get_required(): Boolean = js.native
  def get_schemaXml(): String = js.native
  def get_schemaXmlWithResourceTokens(): String = js.native
  def get_scope(): String = js.native
  def get_sealed(): Boolean = js.native
  def get_sortable(): Boolean = js.native
  def get_staticName(): String = js.native
  def get_title(): String = js.native
  def get_typeAsString(): String = js.native
  def get_typeDisplayName(): String = js.native
  def get_typeShortDescription(): String = js.native
  def get_validationFormula(): String = js.native
  def get_validationMessage(): String = js.native
  def setShowInDisplayForm(value: Boolean): Unit = js.native
  def setShowInEditForm(value: Boolean): Unit = js.native
  def setShowInNewForm(value: Boolean): Unit = js.native
  def set_defaultValue(value: String): Unit = js.native
  def set_description(value: String): Unit = js.native
  def set_direction(value: String): Unit = js.native
  def set_enforceUniqueValues(value: Boolean): Unit = js.native
  def set_fieldTypeKind(value: FieldType): Unit = js.native
  def set_group(value: String): Unit = js.native
  def set_hidden(value: Boolean): Unit = js.native
  def set_indexed(value: Boolean): Unit = js.native
  def set_jsLink(value: String): Unit = js.native
  def set_readOnlyField(value: Boolean): Unit = js.native
  def set_required(value: Boolean): Unit = js.native
  def set_schemaXml(value: String): Unit = js.native
  def set_staticName(value: String): Unit = js.native
  def set_title(value: String): Unit = js.native
  def set_typeAsString(value: String): Unit = js.native
  def set_validationFormula(value: String): Unit = js.native
  def set_validationMessage(value: String): Unit = js.native
  def update(): Unit = js.native
  def updateAndPushChanges(pushChangesToLists: Boolean): Unit = js.native
  def validateSetValue[T](item: typings.sharepoint.SP.ListItem[T], value: String): Unit = js.native
}

