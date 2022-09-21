package typings.sodiumjs

import typings.sodiumjs.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routerMod {
  
  @JSImport("sodiumjs/dist/typings/sodium/Router", "Router")
  @js.native
  open class Router[A, K] protected () extends StObject {
    def this(inStream: Stream[A], selector: js.Function1[/* a */ A, js.Array[K]]) = this()
    def this(
      inStream: Stream[A],
      selector: js.Function1[/* a */ A, js.Array[K]],
      keyToStr: js.Function1[/* k */ K, String]
    ) = this()
    
    /* private */ var _inStream: Any = js.native
    
    /* private */ var _table: Any = js.native
    
    /* private */ var _vertex: Any = js.native
    
    def filterMatches(k: K): Stream[A] = js.native
  }
}
