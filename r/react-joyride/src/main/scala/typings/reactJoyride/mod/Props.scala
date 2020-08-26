package typings.reactJoyride.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends CommonProps {
  var callback: js.UndefOr[js.Function1[/* data */ CallBackProps, Unit]] = js.native
  var continuous: js.UndefOr[Boolean] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var getHelpers: js.UndefOr[js.Function1[/* helpers */ StoreHelpers, _]] = js.native
  var run: js.UndefOr[Boolean] = js.native
  var scrollOffset: js.UndefOr[Double] = js.native
  var scrollToFirstStep: js.UndefOr[Boolean] = js.native
  var stepIndex: js.UndefOr[Double] = js.native
  var steps: js.Array[Step] = js.native
}

object Props {
  @scala.inline
  def apply(steps: js.Array[Step]): Props = {
    val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
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
    def setStepsVarargs(value: Step*): Self = this.set("steps", js.Array(value :_*))
    @scala.inline
    def setSteps(value: js.Array[Step]): Self = this.set("steps", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallback(value: /* data */ CallBackProps => Unit): Self = this.set("callback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setContinuous(value: Boolean): Self = this.set("continuous", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContinuous: Self = this.set("continuous", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setGetHelpers(value: /* helpers */ StoreHelpers => _): Self = this.set("getHelpers", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetHelpers: Self = this.set("getHelpers", js.undefined)
    @scala.inline
    def setRun(value: Boolean): Self = this.set("run", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRun: Self = this.set("run", js.undefined)
    @scala.inline
    def setScrollOffset(value: Double): Self = this.set("scrollOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollOffset: Self = this.set("scrollOffset", js.undefined)
    @scala.inline
    def setScrollToFirstStep(value: Boolean): Self = this.set("scrollToFirstStep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollToFirstStep: Self = this.set("scrollToFirstStep", js.undefined)
    @scala.inline
    def setStepIndex(value: Double): Self = this.set("stepIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStepIndex: Self = this.set("stepIndex", js.undefined)
  }
  
}

