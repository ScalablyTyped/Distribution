package typings.rfc6902

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object diffMod {
  import typings.rfc6902.pointerMod.Pointer

  type Diff = js.Function3[/* input */ js.Any, /* output */ js.Any, /* ptr */ Pointer, js.Array[Operation]]
  type VoidableDiff = js.Function3[/* input */ js.Any, /* output */ js.Any, /* ptr */ Pointer, js.Array[Operation] | Unit]
}
