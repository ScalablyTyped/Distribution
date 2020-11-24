package typings.sodiumjs.mod

import typings.sodiumjs.lambdaMod.Lambda4_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodiumjs", "lambda4")
@js.native
object lambda4 extends js.Object {
  
  def apply[A, B, C, D, E](
    f: js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, E],
    deps: js.Array[typings.sodiumjs.streamMod.Stream[_] | typings.sodiumjs.cellMod.Cell[_]]
  ): Lambda4_[A, B, C, D, E] = js.native
}
