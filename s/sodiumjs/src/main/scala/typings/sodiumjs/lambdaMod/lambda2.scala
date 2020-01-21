package typings.sodiumjs.lambdaMod

import typings.sodiumjs.cellMod.Cell
import typings.sodiumjs.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs/dist/typings/sodium/Lambda", "lambda2")
@js.native
object lambda2 extends js.Object {
  def apply[A, B, C](f: js.Function2[/* a */ A, /* b */ B, C], deps: js.Array[Stream[_] | Cell[_]]): Lambda2_[A, B, C] = js.native
}

