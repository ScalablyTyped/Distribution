package typings.sodiumjs.mod

import typings.sodiumjs.lambdaMod.Lambda6_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs", "lambda6")
@js.native
object lambda6 extends js.Object {
  def apply[A, B, C, D, E, F, G](
    f: js.Function6[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, G],
    deps: js.Array[typings.sodiumjs.streamMod.Stream[_] | typings.sodiumjs.cellMod.Cell[_]]
  ): Lambda6_[A, B, C, D, E, F, G] = js.native
}

