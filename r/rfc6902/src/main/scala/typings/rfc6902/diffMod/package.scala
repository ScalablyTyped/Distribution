package typings.rfc6902

import typings.rfc6902.pointerMod.Pointer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object diffMod {
  type Diff = js.Function3[/* input */ js.Any, /* output */ js.Any, /* ptr */ Pointer, js.Array[Operation]]
  type VoidableDiff = js.Function3[/* input */ js.Any, /* output */ js.Any, /* ptr */ Pointer, js.Array[Operation] | Unit]
}
