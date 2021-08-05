package typings.sharepoint.SP.Social

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies an item to be inserted in a post by replacing a token in the post definition.
  This type can only be specified in a server-to-server call. */
trait SocialPostDefinitionDataItem
  extends StObject
     with ClientValueObject {
  
  /** Specifies the name of the user.
    This property is only used if the ItemType property specifies that the item is a User. */
  def get_accountName(): String
  
  /** Specifies whether the item being formatted is a text element, a user, a document, a site, a tag, or a link. */
  def get_itemType(): SocialPostDefinitionDataItemType
  
  /** Specifies the post definition token to be replaced by the item */
  def get_placeholderName(): String
  
  /** Specifies the GUID that identifies the tag.
    This property is only used if the ItemType property specifies that the item is a Tag. */
  def get_tagGuid(): String
  
  /** Specifies the text that is substituted for the placeholder */
  def get_text(): String
  
  /** Specifies the URI of the document, site, or link.
    This property is only available if the ItemType property specifies that the item is a Document, Link, or Site. */
  def get_uri(): String
  
  /** Specifies the name of the user.
    This property is only used if the ItemType property specifies that the item is a User. */
  def set_accountName(value: String): String
  
  /** Specifies whether the item being formatted is a text element, a user, a document, a site, a tag, or a link. */
  def set_itemType(value: SocialPostDefinitionDataItemType): SocialPostDefinitionDataItemType
  
  /** Specifies the post definition token to be replaced by the item */
  def set_placeholderName(value: String): String
  
  /** Specifies the GUID that identifies the tag.
    This property is only used if the ItemType property specifies that the item is a Tag. */
  def set_tagGuid(value: String): String
  
  /** Specifies the text that is substituted for the placeholder */
  def set_text(value: String): String
  
  /** Specifies the URI of the document, site, or link.
    This property is only available if the ItemType property specifies that the item is a Document, Link, or Site. */
  def set_uri(value: String): String
}
object SocialPostDefinitionDataItem {
  
  inline def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_accountName: () => String,
    get_itemType: () => SocialPostDefinitionDataItemType,
    get_placeholderName: () => String,
    get_tagGuid: () => String,
    get_text: () => String,
    get_typeId: () => String,
    get_uri: () => String,
    set_accountName: String => String,
    set_itemType: SocialPostDefinitionDataItemType => SocialPostDefinitionDataItemType,
    set_placeholderName: String => String,
    set_tagGuid: String => String,
    set_text: String => String,
    set_uri: String => String,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): SocialPostDefinitionDataItem = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_accountName = js.Any.fromFunction0(get_accountName), get_itemType = js.Any.fromFunction0(get_itemType), get_placeholderName = js.Any.fromFunction0(get_placeholderName), get_tagGuid = js.Any.fromFunction0(get_tagGuid), get_text = js.Any.fromFunction0(get_text), get_typeId = js.Any.fromFunction0(get_typeId), get_uri = js.Any.fromFunction0(get_uri), set_accountName = js.Any.fromFunction1(set_accountName), set_itemType = js.Any.fromFunction1(set_itemType), set_placeholderName = js.Any.fromFunction1(set_placeholderName), set_tagGuid = js.Any.fromFunction1(set_tagGuid), set_text = js.Any.fromFunction1(set_text), set_uri = js.Any.fromFunction1(set_uri), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[SocialPostDefinitionDataItem]
  }
  
  extension [Self <: SocialPostDefinitionDataItem](x: Self) {
    
    inline def setGet_accountName(value: () => String): Self = StObject.set(x, "get_accountName", js.Any.fromFunction0(value))
    
    inline def setGet_itemType(value: () => SocialPostDefinitionDataItemType): Self = StObject.set(x, "get_itemType", js.Any.fromFunction0(value))
    
    inline def setGet_placeholderName(value: () => String): Self = StObject.set(x, "get_placeholderName", js.Any.fromFunction0(value))
    
    inline def setGet_tagGuid(value: () => String): Self = StObject.set(x, "get_tagGuid", js.Any.fromFunction0(value))
    
    inline def setGet_text(value: () => String): Self = StObject.set(x, "get_text", js.Any.fromFunction0(value))
    
    inline def setGet_uri(value: () => String): Self = StObject.set(x, "get_uri", js.Any.fromFunction0(value))
    
    inline def setSet_accountName(value: String => String): Self = StObject.set(x, "set_accountName", js.Any.fromFunction1(value))
    
    inline def setSet_itemType(value: SocialPostDefinitionDataItemType => SocialPostDefinitionDataItemType): Self = StObject.set(x, "set_itemType", js.Any.fromFunction1(value))
    
    inline def setSet_placeholderName(value: String => String): Self = StObject.set(x, "set_placeholderName", js.Any.fromFunction1(value))
    
    inline def setSet_tagGuid(value: String => String): Self = StObject.set(x, "set_tagGuid", js.Any.fromFunction1(value))
    
    inline def setSet_text(value: String => String): Self = StObject.set(x, "set_text", js.Any.fromFunction1(value))
    
    inline def setSet_uri(value: String => String): Self = StObject.set(x, "set_uri", js.Any.fromFunction1(value))
  }
}
