package typings.sharepoint.SP.Social

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an overlay.
  An overlay is a substring in a post that represents a user, document, site, tag, or link.
  The SocialPost class contains an array of SocialDataOverlay objects.
  Each of the SocialDataOverlay objects specifies a link or one or more actors. */
@js.native
trait SocialDataOverlay extends ClientValueObject {
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

object SocialDataOverlay {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_actorIndexes: () => js.Array[Double],
    get_index: () => Double,
    get_length: () => Double,
    get_linkUri: () => String,
    get_overlayType: () => SocialDataOverlayType,
    get_typeId: () => String,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): SocialDataOverlay = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_actorIndexes = js.Any.fromFunction0(get_actorIndexes), get_index = js.Any.fromFunction0(get_index), get_length = js.Any.fromFunction0(get_length), get_linkUri = js.Any.fromFunction0(get_linkUri), get_overlayType = js.Any.fromFunction0(get_overlayType), get_typeId = js.Any.fromFunction0(get_typeId), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[SocialDataOverlay]
  }
  @scala.inline
  implicit class SocialDataOverlayOps[Self <: SocialDataOverlay] (val x: Self) extends AnyVal {
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
    def setGet_actorIndexes(value: () => js.Array[Double]): Self = this.set("get_actorIndexes", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_index(value: () => Double): Self = this.set("get_index", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_length(value: () => Double): Self = this.set("get_length", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_linkUri(value: () => String): Self = this.set("get_linkUri", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_overlayType(value: () => SocialDataOverlayType): Self = this.set("get_overlayType", js.Any.fromFunction0(value))
  }
  
}

