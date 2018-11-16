package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldCollection extends ClientObjectCollection[Field] {
  def add(field: Field): Field = js.native
  def addDependentLookup(displayName: java.lang.String, primaryLookupField: Field, lookupField: java.lang.String): Field = js.native
  def addFieldAsXml(schemaXml: java.lang.String, addToDefaultView: scala.Boolean, options: AddFieldOptions): Field = js.native
  def getById(id: Guid): Field = js.native
  def getByInternalNameOrTitle(strName: java.lang.String): Field = js.native
  def getByTitle(title: java.lang.String): Field = js.native
  def get_item(index: scala.Double): Field = js.native
  def get_schemaXml(): java.lang.String = js.native
  def itemAt(index: scala.Double): Field = js.native
}

