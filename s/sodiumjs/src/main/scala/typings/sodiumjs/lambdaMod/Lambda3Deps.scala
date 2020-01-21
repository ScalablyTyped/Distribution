package typings.sodiumjs.lambdaMod

import typings.sodiumjs.cellMod.Cell
import typings.sodiumjs.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs/dist/typings/sodium/Lambda", "Lambda3_deps")
@js.native
object Lambda3Deps extends js.Object {
  def apply[A, B, C, D](f: js.Function3[/* a */ A, /* b */ B, /* c */ C, D]): js.Array[Stream[_] | Cell[_]] = js.native
  def apply[A, B, C, D](f: Lambda3_[A, B, C, D]): js.Array[Stream[_] | Cell[_]] = js.native
}

