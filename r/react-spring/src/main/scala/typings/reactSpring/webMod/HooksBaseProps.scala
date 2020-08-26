package typings.reactSpring.webMod

import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<react-spring.react-spring/renderprops-universal.SpringBaseProps, std.Exclude<keyof react-spring.react-spring/renderprops-universal.SpringBaseProps, 'config'>> */
@js.native
trait HooksBaseProps extends js.Object {
  var delay: js.UndefOr[Double] = js.native
  var immediate: js.UndefOr[Boolean | (js.Function1[/* key */ String, Boolean])] = js.native
  /**
    * Will skip rendering the component if true and write to the dom directly.
    * @default true
    * @deprecated
    */
  var native: js.UndefOr[scala.Nothing] = js.native
  var onStart: js.UndefOr[js.Function0[Unit]] = js.native
  // there is an undocumented onKeyframesHalt which passes the controller instance,
  // so it also cannot be typed unless Controller types are written
  var ref: js.UndefOr[RefObject[ReactSpringHook]] = js.native
  var reset: js.UndefOr[Boolean] = js.native
  var reverse: js.UndefOr[Boolean] = js.native
}

object HooksBaseProps {
  @scala.inline
  def apply(): HooksBaseProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HooksBaseProps]
  }
  @scala.inline
  implicit class HooksBasePropsOps[Self <: HooksBaseProps] (val x: Self) extends AnyVal {
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
    def setOnStart(value: () => Unit): Self = this.set("onStart", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnStart: Self = this.set("onStart", js.undefined)
    @scala.inline
    def setRef(value: RefObject[ReactSpringHook]): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
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

