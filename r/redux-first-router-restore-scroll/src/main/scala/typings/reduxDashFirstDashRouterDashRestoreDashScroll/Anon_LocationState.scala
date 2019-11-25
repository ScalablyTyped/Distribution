package typings.reduxDashFirstDashRouterDashRestoreDashScroll

import typings.reduxDashFirstDashRouter.reduxDashFirstDashRouterMod.LocationState
import typings.reduxDashFirstDashRouterDashRestoreDashScroll.reduxDashFirstDashRouterDashRestoreDashScrollStrings.`profile-box`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LocationState extends js.Object {
  /** @default false */
  var manual: js.UndefOr[Boolean] = js.undefined
  /** Use to implement custom scroll positioning. */
  var shouldUpdateScroll: js.UndefOr[
    js.Function2[
      /* prev */ LocationState[js.Object, _], 
      /* locationState */ LocationState[js.Object, _], 
      Boolean | `profile-box` | (js.Tuple2[Double, Double])
    ]
  ] = js.undefined
  /**
    * To implement a custom backend storage for scroll state, pass a custom
    * stateStorage object. The object should implement the methods as described
    * by the package `scroll-behavior` as well as a function called setPrevKey
    * that keeps track of the previous key.
    */
  var stateStorage: js.UndefOr[Anon_Key] = js.undefined
}

object Anon_LocationState {
  @scala.inline
  def apply(
    manual: js.UndefOr[Boolean] = js.undefined,
    shouldUpdateScroll: (/* prev */ LocationState[js.Object, _], /* locationState */ LocationState[js.Object, _]) => Boolean | `profile-box` | (js.Tuple2[Double, Double]) = null,
    stateStorage: Anon_Key = null
  ): Anon_LocationState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(manual)) __obj.updateDynamic("manual")(manual.asInstanceOf[js.Any])
    if (shouldUpdateScroll != null) __obj.updateDynamic("shouldUpdateScroll")(js.Any.fromFunction2(shouldUpdateScroll))
    if (stateStorage != null) __obj.updateDynamic("stateStorage")(stateStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LocationState]
  }
}

