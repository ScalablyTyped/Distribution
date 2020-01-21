package typings.sodiumjs.lambdaMod

import typings.sodiumjs.cellMod.Cell
import typings.sodiumjs.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs/dist/typings/sodium/Lambda", "Lambda4_deps")
@js.native
object Lambda4Deps extends js.Object {
  def apply[A, B, C, D, E](f: js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, E]): js.Array[Stream[_] | Cell[_]] = js.native
  def apply[A, B, C, D, E](f: Lambda4_[A, B, C, D, E]): js.Array[Stream[_] | Cell[_]] = js.native
}

