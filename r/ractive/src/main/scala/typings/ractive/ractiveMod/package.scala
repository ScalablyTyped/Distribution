package typings.ractive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ractiveMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.ractive.Anon_Teardown
  import typings.ractive.ractiveNumbers.`-1`
  import typings.ractive.ractiveNumbers.`0`
  import typings.ractive.ractiveNumbers.`1`
  import typings.std.ArrayLike
  import typings.std.Event
  import typings.std.HTMLElement

  type AdaptorPrefixer = js.Function1[/* map */ ValueMap, ValueMap]
  type Component = Static[Ractive[Ractive[js.Any]]] | js.Promise[Static[Ractive[Ractive[js.Any]]]]
  type Computation[T /* <: Ractive[T] */] = String | ComputationFn[T] | ComputationDescriptor[T]
  type ComputationFn[T /* <: Ractive[T] */] = js.ThisFunction0[/* this */ T, js.Any]
  type CssFn = js.Function1[/* data */ DataGetFn, String]
  type Data = ValueMap
  type DataFn[T /* <: Ractive[T] */] = js.ThisFunction0[/* this */ T, ValueMap]
  type DataGetFn = js.Function1[/* keypath */ String, js.Any]
  type Decorator[T /* <: Ractive[T] */] = js.ThisFunction2[/* this */ T, /* node */ HTMLElement, /* repeated */ js.Any, DecoratorHandle]
  type Easing = js.Function1[/* time */ Double, Double]
  type EventPlugin[T /* <: Ractive[T] */] = js.ThisFunction2[
    /* this */ T, 
    /* node */ HTMLElement, 
    /* fire */ js.Function1[/* event */ Event, Unit], 
    Anon_Teardown
  ]
  type Helper = js.ThisFunction1[/* this */ Ractive[Ractive[js.Any]], /* repeated */ js.Any, js.Any]
  type Interpolator = js.Function2[/* from */ js.Any, /* to */ js.Any, js.Function1[/* t */ Double, js.Any]]
  type ListenerCallback[T /* <: Ractive[T] */] = js.ThisFunction2[
    /* this */ T, 
    /* ctx */ ContextHelper, 
    /* repeated */ js.Any, 
    Boolean | Unit | js.Promise[js.Any]
  ]
  type MacroFn = js.Function1[/* MacroHelper */ js.Any, MacroHandle]
  type ObserverArrayCallback[T /* <: Ractive[T] */] = js.ThisFunction1[/* this */ T, /* changes */ ArrayChanges, Unit | js.Promise[js.Any]]
  type ObserverCallback[T /* <: Ractive[T] */] = js.ThisFunction4[
    /* this */ T, 
    /* value */ js.Any, 
    /* old */ js.Any, 
    /* keypath */ String, 
    /* repeated */ String, 
    Unit | js.Promise[js.Any]
  ]
  type ParseDelimiters = js.Tuple2[String, String]
  type ParseFn = js.Function1[/* helper */ ParseHelper, String | (js.Array[js.Object | String]) | ParsedTemplate]
  type Partial = String | js.Array[js.Any] | ParseFn | Macro
  type PartialMap = StringDictionary[Partial]
  type Plugin = js.Function1[/* PluginArgsBase */ js.Any, Unit]
  type PluginExtend = js.Function1[/* PluginArgsExtend */ js.Any, Unit]
  type PluginInstance = js.Function1[/* PluginArgsInstance */ js.Any, Unit]
  type Registry[T] = StringDictionary[T]
  type ShuffleFn = js.Function2[/* left */ js.Any, /* right */ js.Any, `1` | `0` | `-1`]
  type Shuffler = Boolean | String | ShuffleFn
  type Target = String | HTMLElement | ArrayLike[js.Any]
  type Template = ParsedTemplate | String | js.Array[js.Any] | ParseFn
  type Transition = js.Function2[/* helper */ TransitionHelper, /* repeated */ js.Any, Unit | js.Promise[Unit]]
  type ValueMap = StringDictionary[js.Any]
}
