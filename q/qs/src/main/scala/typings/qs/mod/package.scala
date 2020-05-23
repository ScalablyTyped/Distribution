package typings.qs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // TODO: The value type here is a "poor man's `unknown`". When these types support TypeScript
  // 3.0+, we can replace this with `unknown`.
  type PoorMansUnknown = js.UndefOr[js.Object | scala.Null]
  type defaultDecoder = js.Function3[
    /* str */ java.lang.String, 
    /* decoder */ js.UndefOr[js.Any], 
    /* charset */ js.UndefOr[java.lang.String], 
    java.lang.String
  ]
  type defaultEncoder = js.Function3[
    /* str */ js.Any, 
    /* defaultEncoder */ js.UndefOr[js.Any], 
    /* charset */ js.UndefOr[java.lang.String], 
    java.lang.String
  ]
}
