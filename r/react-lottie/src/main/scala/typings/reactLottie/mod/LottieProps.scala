package typings.reactLottie.mod

import typings.react.mod.CSSProperties
import typings.reactLottie.reactLottieStrings.animation
import typings.reactLottie.reactLottieStrings.button
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LottieProps extends js.Object {
  var ariaLabel: js.UndefOr[String | animation] = js.native
  var ariaRole: js.UndefOr[String | button] = js.native
  var direction: js.UndefOr[Double] = js.native
  /**
    * Array of objects containing eventName and a callback function that will be registered as eventListeners on the animation object.
    * Refer to Lottie documentation for a list of available events.
    */
  var eventListeners: js.UndefOr[js.Array[EventListener]] = js.native
  /**
    * Height size in pixels
    * @default '100%'
    */
  var height: js.UndefOr[Double | String] = js.native
  var isClickToPauseDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Describes if the animation must be in paused mode
    */
  var isPaused: js.UndefOr[Boolean] = js.native
  /**
    * Describes if the animation must be in stopped mode
    */
  var isStopped: js.UndefOr[Boolean] = js.native
  /**
    * Object representing animation settings
    */
  var options: Options = js.native
  var segments: js.UndefOr[js.Array[Double]] = js.native
  var speed: js.UndefOr[Double] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var title: js.UndefOr[String] = js.native
  /**
    * Width size in pixels
    * @default '100%'
    */
  var width: js.UndefOr[Double | String] = js.native
}

object LottieProps {
  @scala.inline
  def apply(options: Options): LottieProps = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[LottieProps]
  }
  @scala.inline
  implicit class LottiePropsOps[Self <: LottieProps] (val x: Self) extends AnyVal {
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
    def setOptions(value: Options): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setAriaLabel(value: String | animation): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    @scala.inline
    def setAriaRole(value: String | button): Self = this.set("ariaRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaRole: Self = this.set("ariaRole", js.undefined)
    @scala.inline
    def setDirection(value: Double): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setEventListenersVarargs(value: EventListener*): Self = this.set("eventListeners", js.Array(value :_*))
    @scala.inline
    def setEventListeners(value: js.Array[EventListener]): Self = this.set("eventListeners", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventListeners: Self = this.set("eventListeners", js.undefined)
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setIsClickToPauseDisabled(value: Boolean): Self = this.set("isClickToPauseDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsClickToPauseDisabled: Self = this.set("isClickToPauseDisabled", js.undefined)
    @scala.inline
    def setIsPaused(value: Boolean): Self = this.set("isPaused", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPaused: Self = this.set("isPaused", js.undefined)
    @scala.inline
    def setIsStopped(value: Boolean): Self = this.set("isStopped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsStopped: Self = this.set("isStopped", js.undefined)
    @scala.inline
    def setSegmentsVarargs(value: Double*): Self = this.set("segments", js.Array(value :_*))
    @scala.inline
    def setSegments(value: js.Array[Double]): Self = this.set("segments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegments: Self = this.set("segments", js.undefined)
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

