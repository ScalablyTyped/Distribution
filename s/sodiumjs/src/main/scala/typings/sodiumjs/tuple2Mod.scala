package typings.sodiumjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodiumjs/dist/typings/sodium/Tuple2", JSImport.Namespace)
@js.native
object tuple2Mod extends js.Object {
  
  @js.native
  class Tuple2[A, B] protected () extends js.Object {
    def this(a: A, b: B) = this()
    
    var a: A = js.native
    
    var b: B = js.native
  }
}
