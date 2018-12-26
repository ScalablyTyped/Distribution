package typings
package reDashReselectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reDashReselectMod {
  type CreateSelectorInstance = js.Function2[
    /* selectors */ js.Array[reselectLib.reselectMod.ParametricSelector[js.Any, js.Any, js.Any]], 
    /* combiner */ js.Function1[/* repeated */js.Any, js.Any], 
    reselectLib.reselectMod.OutputParametricSelector[js.Any, js.Any, js.Any, js.Function1[/* repeated */js.Any, js.Any]]
  ]
  type OutputCachedSelector[S, R, C] = js.Function2[
    /* resolver */ Resolver[S], 
    /* optionsOrSelectorCreator */ js.UndefOr[reDashReselectLib.Options], 
    (OutputSelector[S, R, C]) with (reDashReselectLib.Anon_ClearCacheRemoveMatchingSelector[S, R, C])
  ]
  type OutputParametricCachedSelector[S, P, R, C] = js.Function2[
    /* resolver */ ParametricResolver[S, P], 
    /* optionsOrSelectorCreator */ js.UndefOr[reDashReselectLib.Options], 
    (OutputParametricSelector[S, P, R, C]) with (reDashReselectLib.Anon_ClearCache[S, P, R, C])
  ]
  type OutputParametricSelector[S, P, R, C] = (ParametricSelector[S, P, R]) with reDashReselectLib.Anon_Recomputations[C]
  type OutputSelector[S, R, C] = (Selector[S, R]) with reDashReselectLib.Anon_Recomputations[C]
  type ParametricResolver[S, P] = js.Function3[/* state */ S, /* props */ P, /* repeated */js.Any, js.Any]
  type ParametricSelector[S, P, R] = js.Function3[/* state */ S, /* props */ P, /* repeated */js.Any, R]
  type Resolver[S] = js.Function2[/* state */ S, /* repeated */js.Any, js.Any]
  type Selector[S, R] = js.Function1[/* state */ S, R]
}
