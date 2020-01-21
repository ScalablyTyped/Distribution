package typings.sodiumjs

import typings.sodiumjs.vertexMod.Vertex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodiumjs/dist/typings/sodium/Listener", JSImport.Namespace)
@js.native
object listenerMod extends js.Object {
  @js.native
  class Listener[A] protected () extends js.Object {
    def this(h: js.Function1[/* a */ A, Unit], target: Vertex) = this()
    var target: Vertex = js.native
    def h(a: A): Unit = js.native
  }
  
}

