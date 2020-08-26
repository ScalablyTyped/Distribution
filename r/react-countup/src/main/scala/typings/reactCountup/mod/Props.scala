package typings.reactCountup.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.reactCountup.anon.PauseResume
import typings.reactCountup.anon.PauseResumeReset
import typings.reactCountup.anon.Reset
import typings.reactCountup.anon.Start
import typings.reactCountup.anon.Update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  var children: js.UndefOr[js.Function1[/* data */ RenderProps, ReactElement]] = js.native
  /**
    * CSS class name of the span element.
    * Note: This won't be applied when using CountUp with render props.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Specifies decimal character.
    * Default: .
    */
  var decimal: js.UndefOr[String] = js.native
  /**
    * Amount of decimals to display.
    * Default: 0
    */
  var decimals: js.UndefOr[Double] = js.native
  /**
    * Delay in seconds before starting the transition.
    * Default: null
    * Note: delay={0} will automatically start the count up.
    */
  var delay: js.UndefOr[Double] = js.native
  /**
    * Duration in seconds.
    * Default: 2
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * Easing function. http://robertpenner.com/easing for more details.
    * Default: easeInExpo
    */
  var easingFn: js.UndefOr[
    js.Function4[/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double, Unit]
  ] = js.native
  /**
    * Target value.
    */
  var end: js.UndefOr[Double] = js.native
  /**
    * Function to customize the formatting of the number
    */
  var formattingFn: js.UndefOr[js.Function1[/* value */ Double, String]] = js.native
  /**
    * Callback function on transition end.
    */
  var onEnd: js.UndefOr[js.Function1[/* providedFn */ PauseResume, Unit]] = js.native
  /**
    * Callback function on pause or resume.
    */
  var onPauseResume: js.UndefOr[js.Function0[js.Function1[/* providedFn */ Start, Unit]]] = js.native
  /**
    * Callback function on reset.
    */
  var onReset: js.UndefOr[js.Function0[js.Function1[/* providedFn */ Update, Unit]]] = js.native
  /**
    * Callback function on transition start.
    */
  var onStart: js.UndefOr[js.Function1[/* providedFn */ Reset, Unit]] = js.native
  /**
    * Callback function on update.
    */
  var onUpdate: js.UndefOr[js.Function1[/* providedFn */ PauseResumeReset, Unit]] = js.native
  /**
    * Static text before the transitioning value.
    */
  var prefix: js.UndefOr[String] = js.native
  /**
    * Save previously ended number to start every new animation from it.
    * Default: false
    */
  var preserveValue: js.UndefOr[Boolean] = js.native
  /**
    * Forces count up transition on every component update.
    * Default: false
    */
  var redraw: js.UndefOr[Boolean] = js.native
  /**
    * Specifies character of thousands separator.
    */
  var separator: js.UndefOr[String] = js.native
  /**
    * Initial value.
    * Default: 0
    */
  var start: js.UndefOr[Double] = js.native
  /**
    * Use for start counter on mount for hook usage.
    * Default: true
    */
  var startOnMount: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  /**
    * Static text after the transitioning value.
    */
  var suffix: js.UndefOr[String] = js.native
  /**
    * Enables easing. Set to false for a linear transition.
    * Default: true
    */
  var useEasing: js.UndefOr[Boolean] = js.native
}

object Props {
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
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
    def setChildren(value: /* data */ RenderProps => ReactElement): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDecimal(value: String): Self = this.set("decimal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecimal: Self = this.set("decimal", js.undefined)
    @scala.inline
    def setDecimals(value: Double): Self = this.set("decimals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecimals: Self = this.set("decimals", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setEasingFn(value: (/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double) => Unit): Self = this.set("easingFn", js.Any.fromFunction4(value))
    @scala.inline
    def deleteEasingFn: Self = this.set("easingFn", js.undefined)
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setFormattingFn(value: /* value */ Double => String): Self = this.set("formattingFn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFormattingFn: Self = this.set("formattingFn", js.undefined)
    @scala.inline
    def setOnEnd(value: /* providedFn */ PauseResume => Unit): Self = this.set("onEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEnd: Self = this.set("onEnd", js.undefined)
    @scala.inline
    def setOnPauseResume(value: () => js.Function1[/* providedFn */ Start, Unit]): Self = this.set("onPauseResume", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnPauseResume: Self = this.set("onPauseResume", js.undefined)
    @scala.inline
    def setOnReset(value: () => js.Function1[/* providedFn */ Update, Unit]): Self = this.set("onReset", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnReset: Self = this.set("onReset", js.undefined)
    @scala.inline
    def setOnStart(value: /* providedFn */ Reset => Unit): Self = this.set("onStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnStart: Self = this.set("onStart", js.undefined)
    @scala.inline
    def setOnUpdate(value: /* providedFn */ PauseResumeReset => Unit): Self = this.set("onUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnUpdate: Self = this.set("onUpdate", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setPreserveValue(value: Boolean): Self = this.set("preserveValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveValue: Self = this.set("preserveValue", js.undefined)
    @scala.inline
    def setRedraw(value: Boolean): Self = this.set("redraw", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedraw: Self = this.set("redraw", js.undefined)
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setStartOnMount(value: Boolean): Self = this.set("startOnMount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartOnMount: Self = this.set("startOnMount", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
    @scala.inline
    def setUseEasing(value: Boolean): Self = this.set("useEasing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseEasing: Self = this.set("useEasing", js.undefined)
  }
  
}

