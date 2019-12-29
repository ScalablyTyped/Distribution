package typings.reactDashTracking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashTrackingMod {
  import typings.react.reactMod.Context
  import typings.reactDashTracking.Anon_Tracking
  import typings.std.Partial
  import typings.std.Pick
  import typings.std.TypedPropertyDescriptor

  // Duplicated from ES6 lib to remove the `void` typing, otherwise `track` can’t be used as a HOC function that passes
  // through a JSX component that be used without casting.
  type ClassDecorator = js.Function1[/* target */ js.Function, js.Function]
  type Decorator = ClassDecorator with MethodDecorator
  /* Rewritten from type alias, can be one of: 
    - typings.reactDashTracking.reactDashTrackingBooleans.`false`
    - scala.Null
    - `js.undefined`
    - typings.reactDashTracking.reactDashTrackingStrings._empty
  */
  type Falsy = js.UndefOr[_Falsy | Null]
  type MethodDecorator = js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ String | js.Symbol, 
    /* descriptor */ TypedPropertyDescriptor[js.Any], 
    TypedPropertyDescriptor[js.Any]
  ]
  type Track[T, P, S] = js.Function2[
    /* trackingInfo */ js.UndefOr[TrackingInfo[Pick[T, String], P, S]], 
    /* options */ js.UndefOr[Options[Partial[T]]], 
    Decorator
  ]
  type TrackingContext[T] = Context[Anon_Tracking[T]]
  type TrackingInfo[T, P, S] = T | (js.Function3[
    /* props */ P, 
    /* state */ S, 
    /* import warning: importer.ImportType#apply Failed type conversion: any[any] */ /* args */ js.Any, 
    T | Falsy
  ])
}
