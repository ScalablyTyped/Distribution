package typings.reactFoundation.sliderMod

import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.reactFoundation.sliderMod.SliderCommonProps because var conflicts: className. Inlined isVertical, isDisabled */ @js.native
trait SliderProps extends HTMLAttributes[HTMLDivElement] {
  var fill: js.UndefOr[SliderFillProps] = js.native
  var handle: js.UndefOr[SliderHandleProps] = js.native
  var initialStart: js.UndefOr[Double] = js.native
  var isDisabled: js.UndefOr[Boolean] = js.native
  var isVertical: js.UndefOr[Boolean] = js.native
}

object SliderProps {
  @scala.inline
  def apply(): SliderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderProps]
  }
  @scala.inline
  implicit class SliderPropsOps[Self <: SliderProps] (val x: Self) extends AnyVal {
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
    def setFill(value: SliderFillProps): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setHandle(value: SliderHandleProps): Self = this.set("handle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandle: Self = this.set("handle", js.undefined)
    @scala.inline
    def setInitialStart(value: Double): Self = this.set("initialStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialStart: Self = this.set("initialStart", js.undefined)
    @scala.inline
    def setIsDisabled(value: Boolean): Self = this.set("isDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDisabled: Self = this.set("isDisabled", js.undefined)
    @scala.inline
    def setIsVertical(value: Boolean): Self = this.set("isVertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsVertical: Self = this.set("isVertical", js.undefined)
  }
  
}

