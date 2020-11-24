package typings.sodiumjs.lambdaMod

import typings.sodiumjs.cellMod.Cell
import typings.sodiumjs.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodiumjs/dist/typings/sodium/Lambda", "lambda1")
@js.native
object lambda1 extends js.Object {
  
  def apply[A, B](f: js.Function1[/* a */ A, B], deps: js.Array[Stream[_] | Cell[_]]): Lambda1_[A, B] = js.native
}
