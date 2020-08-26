package typings.reactour.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactourStep extends js.Object {
  /**
    * Action that can be executed on target element of the step
    */
  var action: js.UndefOr[js.Function1[/* domNode */ js.Any, Unit]] = js.native
  /**
    * Content of the step
    */
  var content: ReactNode | (js.Function1[/* args */ ReactourStepContentArgs, ReactNode]) = js.native
  /**
    * Text read to screen reader software for this step's navigation dot
    */
  var navDotAriaLabel: js.UndefOr[String] = js.native
  /**
    * Position of step content
    */
  var position: js.UndefOr[ReactourStepPosition | (js.Tuple2[Double, Double])] = js.native
  /**
    * DOM selector to find the target element
    */
  var selector: js.UndefOr[String] = js.native
  /**
    * Disable interaction for this specific step.
    * Could be enabled passing `true`
    * when `disableInteraction` prop is present in Tour
    */
  var stepInteraction: js.UndefOr[Boolean] = js.native
  /**
    * Additional styles
    */
  var style: js.UndefOr[CSSProperties] = js.native
}

object ReactourStep {
  @scala.inline
  def apply(): ReactourStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactourStep]
  }
  @scala.inline
  implicit class ReactourStepOps[Self <: ReactourStep] (val x: Self) extends AnyVal {
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
    def setAction(value: /* domNode */ js.Any => Unit): Self = this.set("action", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setContentFunction1(value: /* args */ ReactourStepContentArgs => ReactNode): Self = this.set("content", js.Any.fromFunction1(value))
    @scala.inline
    def setContent(value: ReactNode | (js.Function1[/* args */ ReactourStepContentArgs, ReactNode])): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setNavDotAriaLabel(value: String): Self = this.set("navDotAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavDotAriaLabel: Self = this.set("navDotAriaLabel", js.undefined)
    @scala.inline
    def setPosition(value: ReactourStepPosition | (js.Tuple2[Double, Double])): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    @scala.inline
    def setStepInteraction(value: Boolean): Self = this.set("stepInteraction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStepInteraction: Self = this.set("stepInteraction", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

