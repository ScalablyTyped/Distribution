package typings.simmerjs

import typings.std.ArrayLike
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object simmerjsMod {
  type QueryEngine = js.Function2[
    /* selector */ String, 
    /* onError */ js.Function1[/* error */ js.Any, Unit], 
    ArrayLike[Element]
  ]
}
