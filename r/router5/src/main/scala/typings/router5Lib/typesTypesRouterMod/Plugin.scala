package typings
package router5Lib.typesTypesRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin extends js.Object {
  var onStart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onStop: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onTransitionCancel: js.UndefOr[
    js.Function2[
      /* toState */ js.UndefOr[router5Lib.typesTypesBaseMod.State], 
      /* fromState */ js.UndefOr[router5Lib.typesTypesBaseMod.State], 
      scala.Unit
    ]
  ] = js.undefined
  var onTransitionError: js.UndefOr[
    js.Function3[
      /* toState */ js.UndefOr[router5Lib.typesTypesBaseMod.State], 
      /* fromState */ js.UndefOr[router5Lib.typesTypesBaseMod.State], 
      /* err */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  var onTransitionStart: js.UndefOr[
    js.Function2[
      /* toState */ js.UndefOr[router5Lib.typesTypesBaseMod.State], 
      /* fromState */ js.UndefOr[router5Lib.typesTypesBaseMod.State], 
      scala.Unit
    ]
  ] = js.undefined
  var onTransitionSuccess: js.UndefOr[
    js.Function3[
      /* toState */ js.UndefOr[router5Lib.typesTypesBaseMod.State], 
      /* fromState */ js.UndefOr[router5Lib.typesTypesBaseMod.State], 
      /* opts */ js.UndefOr[router5Lib.typesTypesBaseMod.NavigationOptions], 
      scala.Unit
    ]
  ] = js.undefined
  var teardown: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

