package typings.router5.routerMod

import typings.router5.baseMod.NavigationOptions
import typings.router5.baseMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin extends js.Object {
  var onStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onStop: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onTransitionCancel: js.UndefOr[
    js.Function2[/* toState */ js.UndefOr[State], /* fromState */ js.UndefOr[State], Unit]
  ] = js.undefined
  var onTransitionError: js.UndefOr[
    js.Function3[
      /* toState */ js.UndefOr[State], 
      /* fromState */ js.UndefOr[State], 
      /* err */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  var onTransitionStart: js.UndefOr[
    js.Function2[/* toState */ js.UndefOr[State], /* fromState */ js.UndefOr[State], Unit]
  ] = js.undefined
  var onTransitionSuccess: js.UndefOr[
    js.Function3[
      /* toState */ js.UndefOr[State], 
      /* fromState */ js.UndefOr[State], 
      /* opts */ js.UndefOr[NavigationOptions], 
      Unit
    ]
  ] = js.undefined
  var teardown: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object Plugin {
  @scala.inline
  def apply(
    onStart: () => Unit = null,
    onStop: () => Unit = null,
    onTransitionCancel: (/* toState */ js.UndefOr[State], /* fromState */ js.UndefOr[State]) => Unit = null,
    onTransitionError: (/* toState */ js.UndefOr[State], /* fromState */ js.UndefOr[State], /* err */ js.UndefOr[js.Any]) => Unit = null,
    onTransitionStart: (/* toState */ js.UndefOr[State], /* fromState */ js.UndefOr[State]) => Unit = null,
    onTransitionSuccess: (/* toState */ js.UndefOr[State], /* fromState */ js.UndefOr[State], /* opts */ js.UndefOr[NavigationOptions]) => Unit = null,
    teardown: () => Unit = null
  ): Plugin = {
    val __obj = js.Dynamic.literal()
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction0(onStart))
    if (onStop != null) __obj.updateDynamic("onStop")(js.Any.fromFunction0(onStop))
    if (onTransitionCancel != null) __obj.updateDynamic("onTransitionCancel")(js.Any.fromFunction2(onTransitionCancel))
    if (onTransitionError != null) __obj.updateDynamic("onTransitionError")(js.Any.fromFunction3(onTransitionError))
    if (onTransitionStart != null) __obj.updateDynamic("onTransitionStart")(js.Any.fromFunction2(onTransitionStart))
    if (onTransitionSuccess != null) __obj.updateDynamic("onTransitionSuccess")(js.Any.fromFunction3(onTransitionSuccess))
    if (teardown != null) __obj.updateDynamic("teardown")(js.Any.fromFunction0(teardown))
    __obj.asInstanceOf[Plugin]
  }
}

