package typings.promiseTheWorld

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queueMod {
  
  inline def apply(): Queue = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Queue]
  inline def apply(maxPending: Double): Queue = ^.asInstanceOf[js.Dynamic].apply(maxPending.asInstanceOf[js.Any]).asInstanceOf[Queue]
  inline def apply(maxPending: Double, maxQueued: Double): Queue = (^.asInstanceOf[js.Dynamic].apply(maxPending.asInstanceOf[js.Any], maxQueued.asInstanceOf[js.Any])).asInstanceOf[Queue]
  inline def apply(maxPending: Unit, maxQueued: Double): Queue = (^.asInstanceOf[js.Dynamic].apply(maxPending.asInstanceOf[js.Any], maxQueued.asInstanceOf[js.Any])).asInstanceOf[Queue]
  
  @JSImport("promise-the-world/queue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("promise-the-world/queue", "Queue")
  @js.native
  open class Queue () extends StObject {
    
    def add[T](factory: js.Function0[js.Promise[T]]): js.Promise[T] = js.native
    
    var length: Double = js.native
    
    var maxPending: Double = js.native
    
    var maxQueued: Double = js.native
    
    var pending: Double = js.native
  }
}
