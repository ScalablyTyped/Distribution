package typings.sharepoint.SP.Social

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies a reference to a post in another thread.
  The referenced post can be a post with a tag, a post that is liked, a post that mentions a user, or a post that is a reply. */
@js.native
trait SocialPostReference extends ClientValueObject {
  
  /** Provides a digest of the thread containing the referenced post */
  def get_digest(): SocialThread = js.native
  
  def get_post(): SocialPost = js.native
  
  /** Specifies the unique identifier of the thread containing the referenced post. */
  def get_threadId(): String = js.native
  
  /** Specifies the current owner of the thread as an index into the SocialThreadActors array. */
  def get_threadOwnerIndex(): Double = js.native
}
object SocialPostReference {
  
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
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
  
  @scala.inline
  implicit class SocialPostReferenceOps[Self <: SocialPostReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGet_digest(value: () => SocialThread): Self = this.set("get_digest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_post(value: () => SocialPost): Self = this.set("get_post", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_threadId(value: () => String): Self = this.set("get_threadId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_threadOwnerIndex(value: () => Double): Self = this.set("get_threadOwnerIndex", js.Any.fromFunction0(value))
  }
}
