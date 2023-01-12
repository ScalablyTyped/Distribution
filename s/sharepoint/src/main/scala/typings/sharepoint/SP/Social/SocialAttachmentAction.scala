package typings.sharepoint.SP.Social

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the user actions that are allowed for the attachment object. */
trait SocialAttachmentAction
  extends StObject
     with ClientValueObject {
  
  /** Specifies whether the action is to navigate to a URI or an action that is dependent on the context in which the object is presented to the user. */
  def get_actionKind(): SocialAttachmentActionKind
  
  /** Specifies the URI associated with the action. */
  def get_actionUri(): String
  
  /** Specifies whether the action is to navigate to a URI or an action that is dependent on the context in which the object is presented to the user. */
  def set_actionKind(value: SocialAttachmentActionKind): SocialAttachmentActionKind
  
  /** Specifies the URI associated with the action. */
  def set_actionUri(value: String): String
}
object SocialAttachmentAction {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Unit,
    get_actionKind: () => SocialAttachmentActionKind,
    get_actionUri: () => String,
    get_typeId: () => String,
    set_actionKind: SocialAttachmentActionKind => SocialAttachmentActionKind,
    set_actionUri: String => String,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): SocialAttachmentAction = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_actionKind = js.Any.fromFunction0(get_actionKind), get_actionUri = js.Any.fromFunction0(get_actionUri), get_typeId = js.Any.fromFunction0(get_typeId), set_actionKind = js.Any.fromFunction1(set_actionKind), set_actionUri = js.Any.fromFunction1(set_actionUri), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[SocialAttachmentAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SocialAttachmentAction] (val x: Self) extends AnyVal {
    
    inline def setGet_actionKind(value: () => SocialAttachmentActionKind): Self = StObject.set(x, "get_actionKind", js.Any.fromFunction0(value))
    
    inline def setGet_actionUri(value: () => String): Self = StObject.set(x, "get_actionUri", js.Any.fromFunction0(value))
    
    inline def setSet_actionKind(value: SocialAttachmentActionKind => SocialAttachmentActionKind): Self = StObject.set(x, "set_actionKind", js.Any.fromFunction1(value))
    
    inline def setSet_actionUri(value: String => String): Self = StObject.set(x, "set_actionUri", js.Any.fromFunction1(value))
  }
}
