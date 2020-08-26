package typings.reactTransitionGroup.transitionMod

import typings.reactTransitionGroup.anon.Appear
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeoutProps[RefElement /* <: js.UndefOr[HTMLElement] */]
  extends BaseTransitionProps[RefElement]
     with TransitionProps[RefElement] {
  /**
    * Add a custom transition end trigger. Called with the transitioning DOM
    * node and a done callback. Allows for more fine grained transition end
    * logic. Note: Timeouts are still used as a fallback if provided.
    */
  var addEndListener: js.UndefOr[EndHandler[RefElement]] = js.native
  /**
    * The duration of the transition, in milliseconds. Required unless addEndListener is provided.
    *
    * You may specify a single timeout for all transitions:
    * ```js
    *   timeout={500}
    * ```
    * or individually:
    * ```js
    * timeout={{
    *  appear: 500,
    *  enter: 300,
    *  exit: 500,
    * }}
    * ```
    * - appear defaults to the value of `enter`
    * - enter defaults to `0`
    * - exit defaults to `0`
    */
  var timeout: Double | Appear = js.native
}

object TimeoutProps {
  @scala.inline
  def apply[/* <: js.UndefOr[typings.std.HTMLElement] */ RefElement](timeout: Double | Appear): TimeoutProps[RefElement] = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeoutProps[RefElement]]
  }
  @scala.inline
  implicit class TimeoutPropsOps[Self <: TimeoutProps[_], /* <: js.UndefOr[typings.std.HTMLElement] */ RefElement] (val x: Self with TimeoutProps[RefElement]) extends AnyVal {
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
    def setTimeout(value: Double | Appear): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddEndListener(value: EndHandler[RefElement]): Self = this.set("addEndListener", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddEndListener: Self = this.set("addEndListener", js.undefined)
  }
  
}

