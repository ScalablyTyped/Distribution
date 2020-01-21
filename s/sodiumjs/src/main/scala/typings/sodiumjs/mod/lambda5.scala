package typings.sodiumjs.mod

import typings.sodiumjs.lambdaMod.Lambda5_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs", "lambda5")
@js.native
object lambda5 extends js.Object {
  def apply[A, B, C, D, E, F](
    f: js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, F],
    deps: js.Array[typings.sodiumjs.streamMod.Stream[_] | typings.sodiumjs.cellMod.Cell[_]]
  ): Lambda5_[A, B, C, D, E, F] = js.native
}

