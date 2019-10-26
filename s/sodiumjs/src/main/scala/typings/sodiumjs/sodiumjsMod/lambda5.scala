package typings.sodiumjs.sodiumjsMod

import typings.sodiumjs.distTypingsSodiumLambdaMod.Lambda5
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs", "lambda5")
@js.native
object lambda5 extends js.Object {
  def apply[A, B, C, D, E, F](
    f: js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, F],
    deps: js.Array[
      typings.sodiumjs.distTypingsSodiumStreamMod.Stream[_] | typings.sodiumjs.distTypingsSodiumCellMod.Cell[_]
    ]
  ): Lambda5[A, B, C, D, E, F] = js.native
}

