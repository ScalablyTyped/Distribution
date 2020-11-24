package typings.sodiumjs.lambdaMod

import typings.sodiumjs.cellMod.Cell
import typings.sodiumjs.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodiumjs/dist/typings/sodium/Lambda", "Lambda1")
@js.native
class Lambda1_[A, B] protected () extends js.Object {
  def this(f: js.Function1[/* a */ A, B], deps: js.Array[Stream[_] | Cell[_]]) = this()
  
  var deps: js.Array[Stream[_] | Cell[_]] = js.native
  
  def f(a: A): B = js.native
}
