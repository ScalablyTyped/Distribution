package typings.sharepoint.SP.Social

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Identifies an actor to the server. An actor can be a user, document, site, or tag. */
trait SocialActorInfo
  extends StObject
     with ClientValueObject {
  
  /** User account name.
    This property is only available for social actors of type "user". */
  def get_accountName(): String
  
  /** Identifies whether the actor is a user, document, site, or tag. */
  def get_actorType(): SocialActorType
  
  /** URI of the document or site content.
    This property is only available for social actors of type Document or Site. */
  def get_contentUri(): String
  
  /** Actor's unique identifier. */
  def get_id(): String
  
  /** GUID of the tag.
    Only available for social actors of type "tag" */
  def get_tagGuid(): String
  
  /** User account name.
    This property is only available for social actors of type "user". */
  def set_accountName(value: String): String
  
  /** Identifies whether the actor is a user, document, site, or tag. */
  def set_actorType(value: SocialActorType): SocialActorType
  
  /** URI of the document or site content.
    This property is only available for social actors of type Document or Site. */
  def set_contentUri(value: String): String
  
  /** Actor's unique identifier. */
  def set_id(value: String): String
  
  /** GUID of the tag.
    Only available for social actors of type "tag" */
  def set_tagGuid(value: String): String
}
object SocialActorInfo {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Unit,
    get_accountName: () => String,
    get_actorType: () => SocialActorType,
    get_contentUri: () => String,
    get_id: () => String,
    get_tagGuid: () => String,
    get_typeId: () => String,
    set_accountName: String => String,
    set_actorType: SocialActorType => SocialActorType,
    set_contentUri: String => String,
    set_id: String => String,
    set_tagGuid: String => String,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): SocialActorInfo = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_accountName = js.Any.fromFunction0(get_accountName), get_actorType = js.Any.fromFunction0(get_actorType), get_contentUri = js.Any.fromFunction0(get_contentUri), get_id = js.Any.fromFunction0(get_id), get_tagGuid = js.Any.fromFunction0(get_tagGuid), get_typeId = js.Any.fromFunction0(get_typeId), set_accountName = js.Any.fromFunction1(set_accountName), set_actorType = js.Any.fromFunction1(set_actorType), set_contentUri = js.Any.fromFunction1(set_contentUri), set_id = js.Any.fromFunction1(set_id), set_tagGuid = js.Any.fromFunction1(set_tagGuid), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[SocialActorInfo]
  }
  
  extension [Self <: SocialActorInfo](x: Self) {
    
    inline def setGet_accountName(value: () => String): Self = StObject.set(x, "get_accountName", js.Any.fromFunction0(value))
    
    inline def setGet_actorType(value: () => SocialActorType): Self = StObject.set(x, "get_actorType", js.Any.fromFunction0(value))
    
    inline def setGet_contentUri(value: () => String): Self = StObject.set(x, "get_contentUri", js.Any.fromFunction0(value))
    
    inline def setGet_id(value: () => String): Self = StObject.set(x, "get_id", js.Any.fromFunction0(value))
    
    inline def setGet_tagGuid(value: () => String): Self = StObject.set(x, "get_tagGuid", js.Any.fromFunction0(value))
    
    inline def setSet_accountName(value: String => String): Self = StObject.set(x, "set_accountName", js.Any.fromFunction1(value))
    
    inline def setSet_actorType(value: SocialActorType => SocialActorType): Self = StObject.set(x, "set_actorType", js.Any.fromFunction1(value))
    
    inline def setSet_contentUri(value: String => String): Self = StObject.set(x, "set_contentUri", js.Any.fromFunction1(value))
    
    inline def setSet_id(value: String => String): Self = StObject.set(x, "set_id", js.Any.fromFunction1(value))
    
    inline def setSet_tagGuid(value: String => String): Self = StObject.set(x, "set_tagGuid", js.Any.fromFunction1(value))
  }
}
