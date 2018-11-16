package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashTrackingLib {
  // Duplicated from ES6 lib to remove the `void` typing, otherwise `track` can’t be used as a HOC function that passes
  // through a JSX component that be used without casting.
  type ClassDecorator = js.Function1[/* target */ js.Function, js.Function]
  type Decorator = ClassDecorator with MethodDecorator
  type Falsy = js.UndefOr[
    reactDashTrackingLib.reactDashTrackingLibNumbers.`false` | scala.Null | reactDashTrackingLib.reactDashTrackingLibStrings.Empty
  ]
  type MethodDecorator = js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    /* descriptor */ stdLib.TypedPropertyDescriptor[js.Any], 
    stdLib.TypedPropertyDescriptor[js.Any]
  ]
}
