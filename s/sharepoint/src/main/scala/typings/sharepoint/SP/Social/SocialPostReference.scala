package typings.sharepoint.SP.Social

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies a reference to a post in another thread.
  The referenced post can be a post with a tag, a post that is liked, a post that mentions a user, or a post that is a reply. */
trait SocialPostReference
  extends StObject
     with ClientValueObject {
  
  /** Provides a digest of the thread containing the referenced post */
  def get_digest(): SocialThread
  
  def get_post(): SocialPost
  
  /** Specifies the unique identifier of the thread containing the referenced post. */
  def get_threadId(): String
  
  /** Specifies the current owner of the thread as an index into the SocialThreadActors array. */
  def get_threadOwnerIndex(): Double
}
object SocialPostReference {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Unit,
    get_digest: () => SocialThread,
    get_post: () => SocialPost,
    get_threadId: () => String,
    get_threadOwnerIndex: () => Double,
    get_typeId: () => String,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): SocialPostReference = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_digest = js.Any.fromFunction0(get_digest), get_post = js.Any.fromFunction0(get_post), get_threadId = js.Any.fromFunction0(get_threadId), get_threadOwnerIndex = js.Any.fromFunction0(get_threadOwnerIndex), get_typeId = js.Any.fromFunction0(get_typeId), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[SocialPostReference]
  }
  
  extension [Self <: SocialPostReference](x: Self) {
    
    inline def setGet_digest(value: () => SocialThread): Self = StObject.set(x, "get_digest", js.Any.fromFunction0(value))
    
    inline def setGet_post(value: () => SocialPost): Self = StObject.set(x, "get_post", js.Any.fromFunction0(value))
    
    inline def setGet_threadId(value: () => String): Self = StObject.set(x, "get_threadId", js.Any.fromFunction0(value))
    
    inline def setGet_threadOwnerIndex(value: () => Double): Self = StObject.set(x, "get_threadOwnerIndex", js.Any.fromFunction0(value))
  }
}
