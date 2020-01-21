package typings.simmerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type QueryEngine = js.Function2[
    /* selector */ java.lang.String, 
    /* onError */ js.Function1[/* error */ js.Any, scala.Unit], 
    typings.std.ArrayLike[typings.std.Element]
  ]
}
