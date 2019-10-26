package typings.sodiumjs.sodiumjsMod

import typings.sodiumjs.distTypingsSodiumLambdaMod.Lambda1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs", "lambda1")
@js.native
object lambda1 extends js.Object {
  def apply[A, B](
    f: js.Function1[/* a */ A, B],
    deps: js.Array[
      typings.sodiumjs.distTypingsSodiumStreamMod.Stream[_] | typings.sodiumjs.distTypingsSodiumCellMod.Cell[_]
    ]
  ): Lambda1[A, B] = js.native
}

