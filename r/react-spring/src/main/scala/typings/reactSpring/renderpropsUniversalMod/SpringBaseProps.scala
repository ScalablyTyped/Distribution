package typings.reactSpring.renderpropsUniversalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpringBaseProps extends js.Object {
  /**
    * Spring config, or for individual keys: fn(key => config)
    * @default config.default
    */
  var config: js.UndefOr[SpringConfig | (js.Function1[/* key */ String, SpringConfig])] = js.native
  /**
    * Animation start delay, optional
    */
  var delay: js.UndefOr[Double] = js.native
  /**
    * Prevents animation if true
    * @default false
    */
  var immediate: js.UndefOr[Boolean | (js.Function1[/* key */ String, Boolean])] = js.native
  /**
    * Will skip rendering the component if true and write to the dom directly
    * @default false
    */
  var native: js.UndefOr[Boolean] = js.native
  /**
    * Callback when the animation starts to animate
    */
  var onStart: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * When true it literally resets: from -> to
    * @default false
    */
  var reset: js.UndefOr[Boolean] = js.native
  /**
    * reverse the animation
    */
  var reverse: js.UndefOr[Boolean] = js.native
}

object SpringBaseProps {
  @scala.inline
  def apply(): SpringBaseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpringBaseProps]
  }
  @scala.inline
  implicit class SpringBasePropsOps[Self <: SpringBaseProps] (val x: Self) extends AnyVal {
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
    def setConfigFunction1(value: /* key */ String => SpringConfig): Self = this.set("config", js.Any.fromFunction1(value))
    @scala.inline
    def setConfig(value: SpringConfig | (js.Function1[/* key */ String, SpringConfig])): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setImmediateFunction1(value: /* key */ String => Boolean): Self = this.set("immediate", js.Any.fromFunction1(value))
    @scala.inline
    def setImmediate(value: Boolean | (js.Function1[/* key */ String, Boolean])): Self = this.set("immediate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImmediate: Self = this.set("immediate", js.undefined)
    @scala.inline
    def setNative(value: Boolean): Self = this.set("native", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNative: Self = this.set("native", js.undefined)
    @scala.inline
    def setOnStart(value: () => Unit): Self = this.set("onStart", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnStart: Self = this.set("onStart", js.undefined)
    @scala.inline
    def setReset(value: Boolean): Self = this.set("reset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReset: Self = this.set("reset", js.undefined)
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
  }
  
}

