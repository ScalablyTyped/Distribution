package typings.sodiumjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tuple2Mod {
  
  @JSImport("sodiumjs/dist/typings/sodium/Tuple2", "Tuple2")
  @js.native
  open class Tuple2[A, B] protected () extends StObject {
    def this(a: A, b: B) = this()
    
    var a: A = js.native
    
    var b: B = js.native
  }
}
