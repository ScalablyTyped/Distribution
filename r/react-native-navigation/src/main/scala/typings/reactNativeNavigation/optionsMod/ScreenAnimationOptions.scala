package typings.reactNativeNavigation.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScreenAnimationOptions extends js.Object {
  /**
    * Animate the element over opacity
    */
  var alpha: js.UndefOr[OptionsAnimationPropertyConfig] = js.native
  /**
    * Enable or disable the animation
    * @default true
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Animate the element over rotation
    */
  var rotation: js.UndefOr[OptionsAnimationPropertyConfig] = js.native
  /**
    * Animate the element over rotationX
    */
  var rotationX: js.UndefOr[OptionsAnimationPropertyConfig] = js.native
  /**
    * Animate the element over rotationY
    */
  var rotationY: js.UndefOr[OptionsAnimationPropertyConfig] = js.native
  /**
    * Animate the element over scaleX
    */
  var scaleX: js.UndefOr[OptionsAnimationPropertyConfig] = js.native
  /**
    * Animate the element over scaleY
    */
  var scaleY: js.UndefOr[OptionsAnimationPropertyConfig] = js.native
  /**
    * Animate the element over translateX
    */
  var translationX: js.UndefOr[OptionsAnimationPropertyConfig] = js.native
  /**
    * Animate the element over translateY
    */
  var translationY: js.UndefOr[OptionsAnimationPropertyConfig] = js.native
  /**
    * Wait for the root view to render before start animation
    */
  var waitForRender: js.UndefOr[Boolean] = js.native
  /**
    * Animate the element over x value
    */
  var x: js.UndefOr[OptionsAnimationPropertyConfig] = js.native
  /**
    * Animate the element over y value
    */
  var y: js.UndefOr[OptionsAnimationPropertyConfig] = js.native
}

object ScreenAnimationOptions {
  @scala.inline
  def apply(): ScreenAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScreenAnimationOptions]
  }
  @scala.inline
  implicit class ScreenAnimationOptionsOps[Self <: ScreenAnimationOptions] (val x: Self) extends AnyVal {
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
    def setAlpha(value: OptionsAnimationPropertyConfig): Self = this.set("alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setRotation(value: OptionsAnimationPropertyConfig): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    @scala.inline
    def setRotationX(value: OptionsAnimationPropertyConfig): Self = this.set("rotationX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotationX: Self = this.set("rotationX", js.undefined)
    @scala.inline
    def setRotationY(value: OptionsAnimationPropertyConfig): Self = this.set("rotationY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotationY: Self = this.set("rotationY", js.undefined)
    @scala.inline
    def setScaleX(value: OptionsAnimationPropertyConfig): Self = this.set("scaleX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleX: Self = this.set("scaleX", js.undefined)
    @scala.inline
    def setScaleY(value: OptionsAnimationPropertyConfig): Self = this.set("scaleY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleY: Self = this.set("scaleY", js.undefined)
    @scala.inline
    def setTranslationX(value: OptionsAnimationPropertyConfig): Self = this.set("translationX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslationX: Self = this.set("translationX", js.undefined)
    @scala.inline
    def setTranslationY(value: OptionsAnimationPropertyConfig): Self = this.set("translationY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslationY: Self = this.set("translationY", js.undefined)
    @scala.inline
    def setWaitForRender(value: Boolean): Self = this.set("waitForRender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitForRender: Self = this.set("waitForRender", js.undefined)
    @scala.inline
    def setX(value: OptionsAnimationPropertyConfig): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: OptionsAnimationPropertyConfig): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

