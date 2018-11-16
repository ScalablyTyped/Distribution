package typings
package reduxDashFirstDashRouterDashRestoreDashScrollLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_ShouldUpdateScroll extends js.Object {
  /** @default false */
  var manual: js.UndefOr[scala.Boolean] = js.undefined
  /** Use to implement custom scroll positioning. */
  var shouldUpdateScroll: js.UndefOr[
    js.Function2[
      /* prev */ reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod.LocationState[js.Object, _], 
      /* locationState */ reduxDashFirstDashRouterLib.reduxDashFirstDashRouterMod.LocationState[js.Object, _], 
      scala.Boolean | reduxDashFirstDashRouterDashRestoreDashScrollLib.reduxDashFirstDashRouterDashRestoreDashScrollLibStrings.`profile-box` | (js.Tuple2[scala.Double, scala.Double])
    ]
  ] = js.undefined
  /**
       * To implement a custom backend storage for scroll state, pass a custom
       * stateStorage object. The object should implement the methods as described
       * by the package `scroll-behavior` as well as a function called setPrevKey
       * that keeps track of the previous key.
       */
  var stateStorage: js.UndefOr[Anon_SetPrevKey] = js.undefined
}

