package typings.reactNativeFirebase.mod.RNFirebase.links

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocialParameters extends js.Object {
  def setDescriptionText(descriptionText: String): DynamicLink
  def setImageUrl(imageUrl: String): DynamicLink
  def setTitle(title: String): DynamicLink
}

object SocialParameters {
  @scala.inline
  def apply(
    setDescriptionText: String => DynamicLink,
    setImageUrl: String => DynamicLink,
    setTitle: String => DynamicLink
  ): SocialParameters = {
    val __obj = js.Dynamic.literal(setDescriptionText = js.Any.fromFunction1(setDescriptionText), setImageUrl = js.Any.fromFunction1(setImageUrl), setTitle = js.Any.fromFunction1(setTitle))
  
    __obj.asInstanceOf[SocialParameters]
  }
}

