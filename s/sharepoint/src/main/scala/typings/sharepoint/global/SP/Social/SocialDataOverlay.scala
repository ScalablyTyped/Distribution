package typings.sharepoint.global.SP.Social

import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an overlay.
  An overlay is a substring in a post that represents a user, document, site, tag, or link.
  The SocialPost class contains an array of SocialDataOverlay objects.
  Each of the SocialDataOverlay objects specifies a link or one or more actors. */
@JSGlobal("SP.Social.SocialDataOverlay")
@js.native
class SocialDataOverlay ()
  extends typings.sharepoint.SP.Social.SocialDataOverlay {
  /* CompleteClass */
  override def customFromJson(obj: js.Any): Boolean = js.native
  /* CompleteClass */
  override def customWriteToXml(writer: XmlWriter, serializationContext: SerializationContext): Boolean = js.native
  /* CompleteClass */
  override def fromJson(obj: js.Any): Unit = js.native
  /** Specifies one or more actors as an array of integers where each integer specifies an index into the SocialThreadActors array.
    This property is only available if the get_overlayType() has a value of SocialDataOverlayType.actors. */
  /* CompleteClass */
  override def get_actorIndexes(): js.Array[Double] = js.native
  /** The Index property specifies the starting position of the overlay in the SocialPostText string  */
  /* CompleteClass */
  override def get_index(): Double = js.native
  /** The Length property specifies the number of characters in the overlay.  */
  /* CompleteClass */
  override def get_length(): Double = js.native
  /** The LinkUri property specifies the URI of the link.
    This property is only available if the get_overlayType() has a value of SocialDataOverlayType.link.  */
  /* CompleteClass */
  override def get_linkUri(): String = js.native
  /** Specifies whether the overlay is a link or one or more actors. */
  /* CompleteClass */
  override def get_overlayType(): typings.sharepoint.SP.Social.SocialDataOverlayType = js.native
  /* CompleteClass */
  override def get_typeId(): String = js.native
  /* CompleteClass */
  override def writeToXml(writer: XmlWriter, serializationContext: SerializationContext): Unit = js.native
}

