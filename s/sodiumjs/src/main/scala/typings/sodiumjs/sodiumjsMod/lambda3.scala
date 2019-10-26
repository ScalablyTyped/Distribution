package typings.sodiumjs.sodiumjsMod

import typings.sodiumjs.distTypingsSodiumLambdaMod.Lambda3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs", "lambda3")
@js.native
object lambda3 extends js.Object {
  def apply[A, B, C, D](
    f: js.Function3[/* a */ A, /* b */ B, /* c */ C, D],
    deps: js.Array[
      typings.sodiumjs.distTypingsSodiumStreamMod.Stream[_] | typings.sodiumjs.distTypingsSodiumCellMod.Cell[_]
    ]
  ): Lambda3[A, B, C, D] = js.native
}

