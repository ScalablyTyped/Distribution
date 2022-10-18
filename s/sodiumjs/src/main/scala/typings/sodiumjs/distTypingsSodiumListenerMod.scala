package typings.sodiumjs

import typings.sodiumjs.distTypingsSodiumVertexMod.Vertex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypingsSodiumListenerMod {
  
  @JSImport("sodiumjs/dist/typings/sodium/Listener", "Listener")
  @js.native
  open class Listener[A] protected () extends StObject {
    def this(h: js.Function1[/* a */ A, Unit], target: Vertex) = this()
    
    def h(a: A): Unit = js.native
    
    var target: Vertex = js.native
  }
}
