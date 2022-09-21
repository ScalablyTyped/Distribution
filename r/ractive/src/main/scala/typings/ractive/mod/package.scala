package typings.ractive.mod

import org.scalablytyped.runtime.StringDictionary
import typings.ractive.anon.Teardown
import typings.ractive.ractiveNumbers.`-1`
import typings.ractive.ractiveNumbers.`0`
import typings.ractive.ractiveNumbers.`1`
import typings.std.ArrayLike
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AdaptorPrefixer = js.Function1[/* map */ ValueMap, ValueMap]

type Component = Static[Any] | js.Promise[Static[Any]]

type Computation[T /* <: Ractive[T] */] = String | ComputationFn[T] | ComputationDescriptor[T]

type ComputationFn[T /* <: Ractive[T] */] = js.ThisFunction2[/* this */ T, /* context */ Any, /* keypath */ String, Any]

type CssFn = js.Function1[/* data */ DataGetFn, String]

type Data = ValueMap

type DataFn[T /* <: Ractive[T] */] = js.ThisFunction0[/* this */ T, ValueMap]

type DataGetFn = js.Function1[/* keypath */ String, Any]

type Easing = js.Function1[/* time */ Double, Double]

type EventPlugin[T /* <: Ractive[T] */] = js.ThisFunction2[
/* this */ T, 
/* node */ HTMLElement, 
/* fire */ js.Function1[/* event */ js.UndefOr[ValueMap], Unit], 
Teardown]

type Interpolator = js.Function2[/* from */ Any, /* to */ Any, js.Function1[/* t */ Double, Any]]

type MacroFn = js.Function1[/* helper */ MacroHelper, MacroHandle]

type Merge[T, U /* <: js.Array[Any] */, X] = /* import warning: importer.ImportType#apply Failed type conversion: ractive.anon.0<T, U, X>[U['length'] extends 0 ? 0 : 1] */ js.Any

type ObserverArrayCallback[T /* <: Ractive[T] */] = js.ThisFunction1[/* this */ T, /* changes */ ArrayChanges, Unit | js.Promise[Any]]

type ParseDelimiters = js.Tuple2[String, String]

type ParseFn = js.Function1[/* helper */ ParseHelper, String | (js.Array[js.Object | String]) | ParsedTemplate]

type Partial = String | js.Array[Any] | ParseFn | Macro

type PartialMap = StringDictionary[Partial]

type Plugin = js.Function1[/* args */ PluginArgs, Unit]

type Registry[T] = StringDictionary[T]

type ShuffleFn = js.Function2[/* left */ Any, /* right */ Any, `1` | `0` | `-1`]

type Shuffler = Boolean | String | ShuffleFn

type Target = String | HTMLElement | ArrayLike[Any]

type Template = ParsedTemplate | String | js.Array[Any] | ParseFn

type ValueMap = StringDictionary[Any]
