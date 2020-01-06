package typings.reDashReselect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reDashReselectMod {
  import typings.reDashReselect.Anon_Args
  import typings.reDashReselect.Anon_ArgsCache
  import typings.reDashReselect.Anon_Dependencies
  import typings.reDashReselect.Anon_InputSelectors
  import typings.reDashReselect.Anon_InputSelectorsKeySelector

  type $Values[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  type KeySelector[S] = js.Function2[/* state */ S, /* repeated */ js.Any, js.Any]
  type KeySelectorCreator[S, C, D] = js.Function1[/* selectorInputs */ Anon_InputSelectors[D, C, S], KeySelector[S]]
  type ObjectCacheKey = String | Double
  type OutputCachedSelector[S, R, C, D] = js.Function2[
    /* options */ KeySelector[S] | (Options[S, C, D]), 
    /* legacyOptions */ js.UndefOr[(Options[S, C, D]) | CreateSelectorInstance], 
    (OutputSelector[S, R, C, D]) with (Anon_Args[S, R, C, D])
  ]
  type OutputParametricCachedSelector[S, P, R, C, D] = js.Function2[
    /* options */ (ParametricKeySelector[S, P]) | (ParametricOptions[S, P, C, D]), 
    /* legacyOptions */ js.UndefOr[(ParametricOptions[S, P, C, D]) | CreateSelectorInstance], 
    (OutputParametricSelector[S, P, R, C, D]) with (Anon_ArgsCache[S, P, R, C, D])
  ]
  type OutputParametricSelector[S, P, R, C, D] = (ParametricSelector[S, P, R]) with (Anon_Dependencies[C, D])
  type OutputSelector[S, R, C, D] = (Selector[S, R]) with (Anon_Dependencies[C, D])
  type ParametricKeySelector[S, P] = js.Function3[/* state */ S, /* props */ P, /* repeated */ js.Any, js.Any]
  type ParametricKeySelectorCreator[S, P, C, D] = js.Function1[
    /* selectorInputs */ Anon_InputSelectorsKeySelector[D, C, S, P], 
    ParametricKeySelector[S, P]
  ]
  type ParametricSelector[S, P, R] = js.Function3[/* state */ S, /* props */ P, /* repeated */ js.Any, R]
  type Selector[S, R] = js.Function1[/* state */ S, R]
}
