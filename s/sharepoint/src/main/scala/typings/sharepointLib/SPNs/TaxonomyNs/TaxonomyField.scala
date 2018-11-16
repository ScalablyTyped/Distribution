package typings
package sharepointLib.SPNs.TaxonomyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Taxonomy.TaxonomyField")
@js.native
class TaxonomyField protected ()
  extends sharepointLib.SPNs.FieldLookup {
  def this(context: sharepointLib.SPNs.ClientContext, fields: sharepointLib.SPNs.FieldCollection, filedName: java.lang.String) = this()
  def getFieldValueAsHtml(value: TaxonomyFieldValue): sharepointLib.SPNs.StringResult = js.native
  def getFieldValueAsTaxonomyFieldValue(value: java.lang.String): TaxonomyFieldValue = js.native
  def getFieldValueAsTaxonomyFieldValueCollection(value: java.lang.String): TaxonomyFieldValueCollection = js.native
  def getFieldValueAsText(value: TaxonomyFieldValue): sharepointLib.SPNs.StringResult = js.native
  def getValidatedString(value: TaxonomyFieldValue): sharepointLib.SPNs.StringResult = js.native
  def get_anchorId(): sharepointLib.SPNs.Guid = js.native
  def get_createValuesInEditForm(): scala.Boolean = js.native
  def get_isAnchorValid(): scala.Boolean = js.native
  def get_isKeyword(): scala.Boolean = js.native
  def get_isPathRendered(): scala.Boolean = js.native
  def get_isTermSetValid(): scala.Boolean = js.native
  def get_open(): scala.Boolean = js.native
  def get_sspId(): sharepointLib.SPNs.Guid = js.native
  def get_targetTemplate(): java.lang.String = js.native
  def get_termSetId(): sharepointLib.SPNs.Guid = js.native
  def get_textField(): sharepointLib.SPNs.Guid = js.native
  def get_userCreated(): sharepointLib.SPNs.Guid = js.native
  def setFieldValueByCollection[T](listItem: sharepointLib.SPNs.ListItem[T], terms: js.Array[Term], lcid: scala.Double): scala.Unit = js.native
  def setFieldValueByTerm[T](listItem: sharepointLib.SPNs.ListItem[T], term: Term, lcid: scala.Double): scala.Unit = js.native
  def setFieldValueByTermCollection[T](listItem: sharepointLib.SPNs.ListItem[T], terms: TermCollection, lcid: scala.Double): scala.Unit = js.native
  def setFieldValueByValue[T](listItem: sharepointLib.SPNs.ListItem[T], taxValue: TaxonomyFieldValue): scala.Unit = js.native
  def setFieldValueByValueCollection[T](listItem: sharepointLib.SPNs.ListItem[T], taxValueCollection: TaxonomyFieldValueCollection): scala.Unit = js.native
  def set_anchorId(value: sharepointLib.SPNs.Guid): scala.Unit = js.native
  def set_createValuesInEditForm(value: scala.Boolean): scala.Unit = js.native
  def set_isKeyword(value: scala.Boolean): scala.Unit = js.native
  def set_isPathRendered(value: scala.Boolean): scala.Unit = js.native
  def set_open(value: scala.Boolean): scala.Unit = js.native
  def set_sspId(value: sharepointLib.SPNs.Guid): scala.Unit = js.native
  def set_targetTemplate(value: java.lang.String): scala.Unit = js.native
  def set_termSetId(value: sharepointLib.SPNs.Guid): scala.Unit = js.native
  def set_userCreated(value: sharepointLib.SPNs.Guid): scala.Unit = js.native
}

