package typings.rascal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AckOrNack = js.Function2[
    /* err */ js.UndefOr[typings.std.Error], 
    /* recovery */ js.UndefOr[typings.rascal.mod.Recovery | js.Array[typings.rascal.mod.Recovery]], 
    scala.Unit
  ]
}
