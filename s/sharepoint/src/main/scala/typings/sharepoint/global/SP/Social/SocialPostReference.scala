package typings.sharepoint.global.SP.Social

import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies a reference to a post in another thread.
  The referenced post can be a post with a tag, a post that is liked, a post that mentions a user, or a post that is a reply. */
@JSGlobal("SP.Social.SocialPostReference")
@js.native
class SocialPostReference ()
  extends typings.sharepoint.SP.Social.SocialPostReference {
  /* CompleteClass */
  override def customFromJson(obj: js.Any): Boolean = js.native
  /* CompleteClass */
  override def customWriteToXml(writer: XmlWriter, serializationContext: SerializationContext): Boolean = js.native
  /* CompleteClass */
  override def fromJson(obj: js.Any): Unit = js.native
  /** Provides a digest of the thread containing the referenced post */
  /* CompleteClass */
  override def get_digest(): typings.sharepoint.SP.Social.SocialThread = js.native
  /* CompleteClass */
  override def get_post(): typings.sharepoint.SP.Social.SocialPost = js.native
  /** Specifies the unique identifier of the thread containing the referenced post. */
  /* CompleteClass */
  override def get_threadId(): String = js.native
  /** Specifies the current owner of the thread as an index into the SocialThreadActors array. */
  /* CompleteClass */
  override def get_threadOwnerIndex(): Double = js.native
  /* CompleteClass */
  override def get_typeId(): String = js.native
  /* CompleteClass */
  override def writeToXml(writer: XmlWriter, serializationContext: SerializationContext): Unit = js.native
}

