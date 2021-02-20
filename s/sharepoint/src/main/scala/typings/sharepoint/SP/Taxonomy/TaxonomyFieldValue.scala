package typings.sharepoint.SP.Taxonomy

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.Guid
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaxonomyFieldValue extends ClientValueObject {
  
  def get_label(): String = js.native
  
  def get_termGuid(): Guid = js.native
  
  def get_wssId(): Double = js.native
  
  def set_label(value: String): Unit = js.native
  
  def set_termGuid(value: Guid): Unit = js.native
  
  def set_wssId(value: Double): Unit = js.native
}
object TaxonomyFieldValue {
  
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_label: () => String,
    get_termGuid: () => Guid,
    get_typeId: () => String,
    get_wssId: () => Double,
    set_label: String => Unit,
    set_termGuid: Guid => Unit,
    set_wssId: Double => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): TaxonomyFieldValue = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_label = js.Any.fromFunction0(get_label), get_termGuid = js.Any.fromFunction0(get_termGuid), get_typeId = js.Any.fromFunction0(get_typeId), get_wssId = js.Any.fromFunction0(get_wssId), set_label = js.Any.fromFunction1(set_label), set_termGuid = js.Any.fromFunction1(set_termGuid), set_wssId = js.Any.fromFunction1(set_wssId), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[TaxonomyFieldValue]
  }
  
  @scala.inline
  implicit class TaxonomyFieldValueMutableBuilder[Self <: TaxonomyFieldValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet_label(value: () => String): Self = StObject.set(x, "get_label", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_termGuid(value: () => Guid): Self = StObject.set(x, "get_termGuid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_wssId(value: () => Double): Self = StObject.set(x, "get_wssId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet_label(value: String => Unit): Self = StObject.set(x, "set_label", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_termGuid(value: Guid => Unit): Self = StObject.set(x, "set_termGuid", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_wssId(value: Double => Unit): Self = StObject.set(x, "set_wssId", js.Any.fromFunction1(value))
  }
}
