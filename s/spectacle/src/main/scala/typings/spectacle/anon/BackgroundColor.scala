package typings.spectacle.anon

import typings.react.mod.ReactNode
import typings.spectacle.mod.TemplateFn
import typings.spectacle.mod.TransitionEffect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundColor extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.native
  var backgroundImage: js.UndefOr[String] = js.native
  var backgroundOpacity: js.UndefOr[Double] = js.native
  var backgroundPosition: js.UndefOr[String] = js.native
  var backgroundRepeat: js.UndefOr[String] = js.native
  var backgroundSize: js.UndefOr[String] = js.native
  var children: ReactNode = js.native
  var scaleRatio: js.UndefOr[Double] = js.native
  var template: js.UndefOr[TemplateFn] = js.native
  var textColor: js.UndefOr[String] = js.native
  var transitionEffect: js.UndefOr[TransitionEffect] = js.native
}

object BackgroundColor {
  @scala.inline
  def apply(): BackgroundColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundColor]
  }
  @scala.inline
  implicit class BackgroundColorOps[Self <: BackgroundColor] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBackgroundImage(value: String): Self = this.set("backgroundImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundImage: Self = this.set("backgroundImage", js.undefined)
    @scala.inline
    def setBackgroundOpacity(value: Double): Self = this.set("backgroundOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundOpacity: Self = this.set("backgroundOpacity", js.undefined)
    @scala.inline
    def setBackgroundPosition(value: String): Self = this.set("backgroundPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundPosition: Self = this.set("backgroundPosition", js.undefined)
    @scala.inline
    def setBackgroundRepeat(value: String): Self = this.set("backgroundRepeat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundRepeat: Self = this.set("backgroundRepeat", js.undefined)
    @scala.inline
    def setBackgroundSize(value: String): Self = this.set("backgroundSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundSize: Self = this.set("backgroundSize", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setScaleRatio(value: Double): Self = this.set("scaleRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleRatio: Self = this.set("scaleRatio", js.undefined)
    @scala.inline
    def setTemplate(value: /* options */ CurrentSlide => ReactNode): Self = this.set("template", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setTextColor(value: String): Self = this.set("textColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
    @scala.inline
    def setTransitionEffect(value: TransitionEffect): Self = this.set("transitionEffect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitionEffect: Self = this.set("transitionEffect", js.undefined)
  }
  
}

