package typings.scrollBehavior.mod

import typings.scrollBehavior.anon.Read
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollBehaviorOptions[TLocation /* <: LocationBase */, TContext] extends js.Object {
  var shouldUpdateScroll: js.UndefOr[ShouldUpdateScroll[TContext]] = js.undefined
  var stateStorage: Read[TLocation]
  def addTransitionHook(hook: TransitionHook): js.Function0[Unit]
  def getCurrentLocation(): TLocation
}

object ScrollBehaviorOptions {
  @scala.inline
  def apply[TLocation, TContext](
    addTransitionHook: TransitionHook => js.Function0[Unit],
    getCurrentLocation: () => TLocation,
    stateStorage: Read[TLocation],
    shouldUpdateScroll: (/* prevContext */ TContext | Null, TContext) => ScrollTarget = null
  ): ScrollBehaviorOptions[TLocation, TContext] = {
    val __obj = js.Dynamic.literal(addTransitionHook = js.Any.fromFunction1(addTransitionHook), getCurrentLocation = js.Any.fromFunction0(getCurrentLocation), stateStorage = stateStorage.asInstanceOf[js.Any])
    if (shouldUpdateScroll != null) __obj.updateDynamic("shouldUpdateScroll")(js.Any.fromFunction2(shouldUpdateScroll))
    __obj.asInstanceOf[ScrollBehaviorOptions[TLocation, TContext]]
  }
}

