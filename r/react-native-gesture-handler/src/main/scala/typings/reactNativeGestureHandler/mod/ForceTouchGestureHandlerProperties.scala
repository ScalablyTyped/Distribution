package typings.reactNativeGestureHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForceTouchGestureHandlerProperties extends GestureHandlerProperties {
  var feedbackOnActivation: js.UndefOr[Boolean] = js.native
  var maxForce: js.UndefOr[Double] = js.native
  var minForce: js.UndefOr[Double] = js.native
  var onGestureEvent: js.UndefOr[js.Function1[/* event */ ForceTouchGestureHandlerGestureEvent, Unit]] = js.native
  var onHandlerStateChange: js.UndefOr[js.Function1[/* event */ ForceTouchGestureHandlerStateChangeEvent, Unit]] = js.native
}

object ForceTouchGestureHandlerProperties {
  @scala.inline
  def apply(): ForceTouchGestureHandlerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForceTouchGestureHandlerProperties]
  }
  @scala.inline
  implicit class ForceTouchGestureHandlerPropertiesOps[Self <: ForceTouchGestureHandlerProperties] (val x: Self) extends AnyVal {
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
    def setFeedbackOnActivation(value: Boolean): Self = this.set("feedbackOnActivation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeedbackOnActivation: Self = this.set("feedbackOnActivation", js.undefined)
    @scala.inline
    def setMaxForce(value: Double): Self = this.set("maxForce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxForce: Self = this.set("maxForce", js.undefined)
    @scala.inline
    def setMinForce(value: Double): Self = this.set("minForce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinForce: Self = this.set("minForce", js.undefined)
    @scala.inline
    def setOnGestureEvent(value: /* event */ ForceTouchGestureHandlerGestureEvent => Unit): Self = this.set("onGestureEvent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnGestureEvent: Self = this.set("onGestureEvent", js.undefined)
    @scala.inline
    def setOnHandlerStateChange(value: /* event */ ForceTouchGestureHandlerStateChangeEvent => Unit): Self = this.set("onHandlerStateChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnHandlerStateChange: Self = this.set("onHandlerStateChange", js.undefined)
  }
  
}

