package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldCollection extends ClientObjectCollection[Field] {
  def add(field: Field): Field = js.native
  def addDependentLookup(displayName: String, primaryLookupField: Field, lookupField: String): Field = js.native
  def addFieldAsXml(schemaXml: String, addToDefaultView: Boolean, options: AddFieldOptions): Field = js.native
  def getById(id: Guid): Field = js.native
  def getByInternalNameOrTitle(strName: String): Field = js.native
  def getByTitle(title: String): Field = js.native
  def get_item(index: Double): Field = js.native
  def get_schemaXml(): String = js.native
  def itemAt(index: Double): Field = js.native
}

