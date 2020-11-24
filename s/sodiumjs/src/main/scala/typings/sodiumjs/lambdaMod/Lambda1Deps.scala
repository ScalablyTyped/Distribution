package typings.sodiumjs.lambdaMod

import typings.sodiumjs.cellMod.Cell
import typings.sodiumjs.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodiumjs/dist/typings/sodium/Lambda", "Lambda1_deps")
@js.native
object Lambda1Deps extends js.Object {
  
  def apply[A, B](f: js.Function1[/* a */ A, B]): js.Array[Stream[_] | Cell[_]] = js.native
  def apply[A, B](f: Lambda1_[A, B]): js.Array[Stream[_] | Cell[_]] = js.native
}
