package typings.sodiumjs.lambdaMod

import typings.sodiumjs.cellMod.Cell
import typings.sodiumjs.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodiumjs/dist/typings/sodium/Lambda", "Lambda2_deps")
@js.native
object Lambda2Deps extends js.Object {
  
  def apply[A, B, C](f: js.Function2[/* a */ A, /* b */ B, C]): js.Array[Stream[_] | Cell[_]] = js.native
  def apply[A, B, C](f: Lambda2_[A, B, C]): js.Array[Stream[_] | Cell[_]] = js.native
}
