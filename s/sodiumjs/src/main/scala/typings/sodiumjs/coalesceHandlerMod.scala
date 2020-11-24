package typings.sodiumjs

import typings.sodiumjs.lambdaMod.Lambda2_
import typings.sodiumjs.streamMod.StreamWithSend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sodiumjs/dist/typings/sodium/CoalesceHandler", JSImport.Namespace)
@js.native
object coalesceHandlerMod extends js.Object {
  
  @js.native
  class CoalesceHandler[A] protected () extends js.Object {
    def this(f: js.Function2[/* l */ A, /* r */ A, A], out: StreamWithSend[A]) = this()
    def this(f: Lambda2_[A, A, A], out: StreamWithSend[A]) = this()
    
    var accum: js.Any = js.native
    
    var accumValid: js.Any = js.native
    
    var f: js.Any = js.native
    
    var out: js.Any = js.native
    
    def send_(a: A): Unit = js.native
    
    var verbose: js.Any = js.native
  }
}
