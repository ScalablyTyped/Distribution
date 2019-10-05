package typings.sharepoint.SP.Social

import typings.sharepoint.SP.ClientValueObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies a reference to a post in another thread.
  The referenced post can be a post with a tag, a post that is liked, a post that mentions a user, or a post that is a reply. */
@JSGlobal("SP.Social.SocialPostReference")
@js.native
class SocialPostReference () extends ClientValueObject {
  /** Provides a digest of the thread containing the referenced post */
  def get_digest(): SocialThread = js.native
  def get_post(): SocialPost = js.native
  /** Specifies the unique identifier of the thread containing the referenced post. */
  def get_threadId(): String = js.native
  /** Specifies the current owner of the thread as an index into the SocialThreadActors array. */
  def get_threadOwnerIndex(): Double = js.native
}

