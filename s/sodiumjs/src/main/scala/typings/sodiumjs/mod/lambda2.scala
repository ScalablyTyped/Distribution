package typings.sodiumjs.mod

import typings.sodiumjs.lambdaMod.Lambda2_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodiumjs", "lambda2")
@js.native
object lambda2 extends js.Object {
  
  def apply[A, B, C](
    f: js.Function2[/* a */ A, /* b */ B, C],
    deps: js.Array[typings.sodiumjs.streamMod.Stream[_] | typings.sodiumjs.cellMod.Cell[_]]
  ): Lambda2_[A, B, C] = js.native
}
