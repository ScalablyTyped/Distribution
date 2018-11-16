package typings
package sharepointLib.SPNs.SocialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies a post read from the server. */
@JSGlobal("SP.Social.SocialPost")
@js.native
class SocialPost ()
  extends sharepointLib.SPNs.ClientValueObject {
  /** Specifies an image, document preview, or video preview attachment */
  def get_attachment(): SocialAttachment = js.native
  /** Describes attributes about the post, such as whether the current user can delete or like the post.  */
  def get_attributes(): SocialPostAttributes = js.native
  /** Specifies the author of the post as an index to the social thread's Actors array. */
  def get_authorIndex(): scala.Double = js.native
  /** Specifies the date and time that the post was created on the server. */
  def get_createdTime(): java.lang.String = js.native
  /** Specifies the unique identifier of the post. */
  def get_id(): java.lang.String = js.native
  /** Specifies information about users who like the post. */
  def get_likerInfo(): SocialPostActorInfo = js.native
  /** Specifies the date and time that the post was last modified on the server. */
  def get_modifiedTime(): java.lang.String = js.native
  /** An array of objects in a post, where each object represents a user, document, site, tag, or link. */
  def get_overlays(): js.Array[SocialDataOverlay] = js.native
  /** Specifies whether a post is the root post or a reply post in a thread */
  def get_postType(): SocialPostType = js.native
  /** Specifies the URI of the image to be displayed with the post.  */
  def get_preferredImageUri(): java.lang.String = js.native
  /** Specifies the link to a web site associated with the application that created the post. */
  def get_source(): SocialLink = js.native
  /** Specifies the text of the post. */
  def get_text(): java.lang.String = js.native
}

