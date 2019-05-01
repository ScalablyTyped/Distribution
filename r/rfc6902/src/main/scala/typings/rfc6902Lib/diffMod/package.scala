package typings
package rfc6902Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object diffMod {
  type Diff = js.Function3[
    /* input */ js.Any, 
    /* output */ js.Any, 
    /* ptr */ rfc6902Lib.pointerMod.Pointer, 
    js.Array[Operation]
  ]
  type VoidableDiff = js.Function3[
    /* input */ js.Any, 
    /* output */ js.Any, 
    /* ptr */ rfc6902Lib.pointerMod.Pointer, 
    js.Array[Operation] | scala.Unit
  ]
}
