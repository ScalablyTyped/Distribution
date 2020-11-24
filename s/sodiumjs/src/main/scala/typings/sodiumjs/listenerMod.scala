package typings.sodiumjs

import typings.sodiumjs.vertexMod.Vertex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodiumjs/dist/typings/sodium/Listener", JSImport.Namespace)
@js.native
object listenerMod extends js.Object {
  
  @js.native
  class Listener[A] protected () extends js.Object {
    def this(h: js.Function1[/* a */ A, Unit], target: Vertex) = this()
    
    def h(a: A): Unit = js.native
    
    var target: Vertex = js.native
  }
}
