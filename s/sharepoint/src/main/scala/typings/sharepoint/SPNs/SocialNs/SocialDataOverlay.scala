package typings.sharepoint.SPNs.SocialNs

import typings.sharepoint.SPNs.ClientValueObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an overlay.
  An overlay is a substring in a post that represents a user, document, site, tag, or link.
  The SocialPost class contains an array of SocialDataOverlay objects.
  Each of the SocialDataOverlay objects specifies a link or one or more actors. */
@JSGlobal("SP.Social.SocialDataOverlay")
@js.native
class SocialDataOverlay () extends ClientValueObject {
  /** Specifies one or more actors as an array of integers where each integer specifies an index into the SocialThreadActors array.
    This property is only available if the get_overlayType() has a value of SocialDataOverlayType.actors. */
  def get_actorIndexes(): js.Array[Double] = js.native
  /** The Index property specifies the starting position of the overlay in the SocialPostText string  */
  def get_index(): Double = js.native
  /** The Length property specifies the number of characters in the overlay.  */
  def get_length(): Double = js.native
  /** The LinkUri property specifies the URI of the link.
    This property is only available if the get_overlayType() has a value of SocialDataOverlayType.link.  */
  def get_linkUri(): String = js.native
  /** Specifies whether the overlay is a link or one or more actors. */
  def get_overlayType(): SocialDataOverlayType = js.native
}

