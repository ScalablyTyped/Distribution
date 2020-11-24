package typings.sharepoint.SP.Taxonomy

import typings.sharepoint.SP.FieldLookup
import typings.sharepoint.SP.Guid
import typings.sharepoint.SP.ListItem
import typings.sharepoint.SP.StringResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaxonomyField extends FieldLookup {
  
  def getFieldValueAsHtml(value: TaxonomyFieldValue): StringResult = js.native
  
  def getFieldValueAsTaxonomyFieldValue(value: String): TaxonomyFieldValue = js.native
  
  def getFieldValueAsTaxonomyFieldValueCollection(value: String): TaxonomyFieldValueCollection = js.native
  
  def getFieldValueAsText(value: TaxonomyFieldValue): StringResult = js.native
  
  def getValidatedString(value: TaxonomyFieldValue): StringResult = js.native
  
  def get_anchorId(): Guid = js.native
  
  def get_createValuesInEditForm(): Boolean = js.native
  
  def get_isAnchorValid(): Boolean = js.native
  
  def get_isKeyword(): Boolean = js.native
  
  def get_isPathRendered(): Boolean = js.native
  
  def get_isTermSetValid(): Boolean = js.native
  
  def get_open(): Boolean = js.native
  
  def get_sspId(): Guid = js.native
  
  def get_targetTemplate(): String = js.native
  
  def get_termSetId(): Guid = js.native
  
  def get_textField(): Guid = js.native
  
  def get_userCreated(): Guid = js.native
  
  def setFieldValueByCollection[T](listItem: ListItem[T], terms: js.Array[Term], lcid: Double): Unit = js.native
  
  def setFieldValueByTerm[T](listItem: ListItem[T], term: Term, lcid: Double): Unit = js.native
  
  def setFieldValueByTermCollection[T](listItem: ListItem[T], terms: TermCollection, lcid: Double): Unit = js.native
  
  def setFieldValueByValue[T](listItem: ListItem[T], taxValue: TaxonomyFieldValue): Unit = js.native
  
  def setFieldValueByValueCollection[T](listItem: ListItem[T], taxValueCollection: TaxonomyFieldValueCollection): Unit = js.native
  
  def set_anchorId(value: Guid): Unit = js.native
  
  def set_createValuesInEditForm(value: Boolean): Unit = js.native
  
  def set_isKeyword(value: Boolean): Unit = js.native
  
  def set_isPathRendered(value: Boolean): Unit = js.native
  
  def set_open(value: Boolean): Unit = js.native
  
  def set_sspId(value: Guid): Unit = js.native
  
  def set_targetTemplate(value: String): Unit = js.native
  
  def set_termSetId(value: Guid): Unit = js.native
  
  def set_userCreated(value: Guid): Unit = js.native
}
