package typings.reactNativeNavigation.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementTransition extends js.Object {
  var alpha: js.UndefOr[AppearingElementAnimation | DisappearingElementAnimation] = js.native
  var id: String = js.native
  var rotationX: js.UndefOr[AppearingElementAnimation | DisappearingElementAnimation] = js.native
  var rotationY: js.UndefOr[AppearingElementAnimation | DisappearingElementAnimation] = js.native
  var scaleX: js.UndefOr[AppearingElementAnimation | DisappearingElementAnimation] = js.native
  var scaleY: js.UndefOr[AppearingElementAnimation | DisappearingElementAnimation] = js.native
  var translationX: js.UndefOr[AppearingElementAnimation | DisappearingElementAnimation] = js.native
  var translationY: js.UndefOr[AppearingElementAnimation | DisappearingElementAnimation] = js.native
  var x: js.UndefOr[AppearingElementAnimation | DisappearingElementAnimation] = js.native
  var y: js.UndefOr[AppearingElementAnimation | DisappearingElementAnimation] = js.native
}

object ElementTransition {
  @scala.inline
  def apply(id: String): ElementTransition = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementTransition]
  }
  @scala.inline
  implicit class ElementTransitionOps[Self <: ElementTransition] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlpha(value: AppearingElementAnimation | DisappearingElementAnimation): Self = this.set("alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    @scala.inline
    def setRotationX(value: AppearingElementAnimation | DisappearingElementAnimation): Self = this.set("rotationX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotationX: Self = this.set("rotationX", js.undefined)
    @scala.inline
    def setRotationY(value: AppearingElementAnimation | DisappearingElementAnimation): Self = this.set("rotationY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotationY: Self = this.set("rotationY", js.undefined)
    @scala.inline
    def setScaleX(value: AppearingElementAnimation | DisappearingElementAnimation): Self = this.set("scaleX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleX: Self = this.set("scaleX", js.undefined)
    @scala.inline
    def setScaleY(value: AppearingElementAnimation | DisappearingElementAnimation): Self = this.set("scaleY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleY: Self = this.set("scaleY", js.undefined)
    @scala.inline
    def setTranslationX(value: AppearingElementAnimation | DisappearingElementAnimation): Self = this.set("translationX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslationX: Self = this.set("translationX", js.undefined)
    @scala.inline
    def setTranslationY(value: AppearingElementAnimation | DisappearingElementAnimation): Self = this.set("translationY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslationY: Self = this.set("translationY", js.undefined)
    @scala.inline
    def setX(value: AppearingElementAnimation | DisappearingElementAnimation): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: AppearingElementAnimation | DisappearingElementAnimation): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

