package typings
package router5Lib.corePluginsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Plugin extends js.Object {
  var onStart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onStop: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onTransitionCancel: js.UndefOr[
    js.Function2[
      /* toState */ js.UndefOr[router5Lib.createDashRouterMod.State], 
      /* fromState */ js.UndefOr[router5Lib.createDashRouterMod.State], 
      scala.Unit
    ]
  ] = js.undefined
  var onTransitionError: js.UndefOr[
    js.Function3[
      /* toState */ js.UndefOr[router5Lib.createDashRouterMod.State], 
      /* fromState */ js.UndefOr[router5Lib.createDashRouterMod.State], 
      /* err */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  var onTransitionStart: js.UndefOr[
    js.Function2[
      /* toState */ js.UndefOr[router5Lib.createDashRouterMod.State], 
      /* fromState */ js.UndefOr[router5Lib.createDashRouterMod.State], 
      scala.Unit
    ]
  ] = js.undefined
  var onTransitionSuccess: js.UndefOr[
    js.Function3[
      /* toState */ js.UndefOr[router5Lib.createDashRouterMod.State], 
      /* fromState */ js.UndefOr[router5Lib.createDashRouterMod.State], 
      /* opts */ js.UndefOr[router5Lib.coreNavigationMod.NavigationOptions], 
      scala.Unit
    ]
  ] = js.undefined
}

