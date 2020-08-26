package typings.router5.routerMod

import typings.router5.baseMod.NavigationOptions
import typings.router5.baseMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plugin extends js.Object {
  var onStart: js.UndefOr[js.Function0[Unit]] = js.native
  var onStop: js.UndefOr[js.Function0[Unit]] = js.native
  var onTransitionCancel: js.UndefOr[
    js.Function2[/* toState */ js.UndefOr[State], /* fromState */ js.UndefOr[State], Unit]
  ] = js.native
  var onTransitionError: js.UndefOr[
    js.Function3[
      /* toState */ js.UndefOr[State], 
      /* fromState */ js.UndefOr[State], 
      /* err */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  var onTransitionStart: js.UndefOr[
    js.Function2[/* toState */ js.UndefOr[State], /* fromState */ js.UndefOr[State], Unit]
  ] = js.native
  var onTransitionSuccess: js.UndefOr[
    js.Function3[
      /* toState */ js.UndefOr[State], 
      /* fromState */ js.UndefOr[State], 
      /* opts */ js.UndefOr[NavigationOptions], 
      Unit
    ]
  ] = js.native
  var teardown: js.UndefOr[js.Function0[Unit]] = js.native
}

object Plugin {
  @scala.inline
  def apply(): Plugin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Plugin]
  }
  @scala.inline
  implicit class PluginOps[Self <: Plugin] (val x: Self) extends AnyVal {
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
    def setOnStart(value: () => Unit): Self = this.set("onStart", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnStart: Self = this.set("onStart", js.undefined)
    @scala.inline
    def setOnStop(value: () => Unit): Self = this.set("onStop", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnStop: Self = this.set("onStop", js.undefined)
    @scala.inline
    def setOnTransitionCancel(value: (/* toState */ js.UndefOr[State], /* fromState */ js.UndefOr[State]) => Unit): Self = this.set("onTransitionCancel", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnTransitionCancel: Self = this.set("onTransitionCancel", js.undefined)
    @scala.inline
    def setOnTransitionError(
      value: (/* toState */ js.UndefOr[State], /* fromState */ js.UndefOr[State], /* err */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("onTransitionError", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnTransitionError: Self = this.set("onTransitionError", js.undefined)
    @scala.inline
    def setOnTransitionStart(value: (/* toState */ js.UndefOr[State], /* fromState */ js.UndefOr[State]) => Unit): Self = this.set("onTransitionStart", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnTransitionStart: Self = this.set("onTransitionStart", js.undefined)
    @scala.inline
    def setOnTransitionSuccess(
      value: (/* toState */ js.UndefOr[State], /* fromState */ js.UndefOr[State], /* opts */ js.UndefOr[NavigationOptions]) => Unit
    ): Self = this.set("onTransitionSuccess", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnTransitionSuccess: Self = this.set("onTransitionSuccess", js.undefined)
    @scala.inline
    def setTeardown(value: () => Unit): Self = this.set("teardown", js.Any.fromFunction0(value))
    @scala.inline
    def deleteTeardown: Self = this.set("teardown", js.undefined)
  }
  
}

