package typings.sodiumjs.lambdaMod

import typings.sodiumjs.cellMod.Cell
import typings.sodiumjs.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs/dist/typings/sodium/Lambda", "lambda3")
@js.native
object lambda3 extends js.Object {
  def apply[A, B, C, D](f: js.Function3[/* a */ A, /* b */ B, /* c */ C, D], deps: js.Array[Stream[_] | Cell[_]]): Lambda3_[A, B, C, D] = js.native
}

