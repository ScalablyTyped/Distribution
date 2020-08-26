package typings.reactNativeFirebase.mod.RNFirebase.links

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocialParameters extends js.Object {
  def setDescriptionText(descriptionText: String): DynamicLink = js.native
  def setImageUrl(imageUrl: String): DynamicLink = js.native
  def setTitle(title: String): DynamicLink = js.native
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
  @scala.inline
  implicit class SocialParametersOps[Self <: SocialParameters] (val x: Self) extends AnyVal {
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
    def setSetDescriptionText(value: String => DynamicLink): Self = this.set("setDescriptionText", js.Any.fromFunction1(value))
    @scala.inline
    def setSetImageUrl(value: String => DynamicLink): Self = this.set("setImageUrl", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTitle(value: String => DynamicLink): Self = this.set("setTitle", js.Any.fromFunction1(value))
  }
  
}

