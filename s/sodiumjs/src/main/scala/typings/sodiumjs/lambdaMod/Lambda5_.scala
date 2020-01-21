package typings.sodiumjs.lambdaMod

import typings.sodiumjs.cellMod.Cell
import typings.sodiumjs.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs/dist/typings/sodium/Lambda", "Lambda5")
@js.native
class Lambda5_[A, B, C, D, E, F] protected () extends js.Object {
  def this(
    f: js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, F],
    deps: js.Array[Stream[_] | Cell[_]]
  ) = this()
  var deps: js.Array[Stream[_] | Cell[_]] = js.native
  def f(a: A, b: B, c: C, d: D, e: E): F = js.native
}

