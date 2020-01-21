package typings.reduxFirstRouterRestoreScroll

import typings.reduxFirstRouter.mod.LocationState
import typings.reduxFirstRouterRestoreScroll.reduxFirstRouterRestoreScrollStrings.`profile-box`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLocationState extends js.Object {
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
  var stateStorage: js.UndefOr[AnonKey] = js.undefined
}

object AnonLocationState {
  @scala.inline
  def apply(
    manual: js.UndefOr[Boolean] = js.undefined,
    shouldUpdateScroll: (/* prev */ LocationState[js.Object, _], /* locationState */ LocationState[js.Object, _]) => Boolean | `profile-box` | (js.Tuple2[Double, Double]) = null,
    stateStorage: AnonKey = null
  ): AnonLocationState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(manual)) __obj.updateDynamic("manual")(manual.asInstanceOf[js.Any])
    if (shouldUpdateScroll != null) __obj.updateDynamic("shouldUpdateScroll")(js.Any.fromFunction2(shouldUpdateScroll))
    if (stateStorage != null) __obj.updateDynamic("stateStorage")(stateStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLocationState]
  }
}

