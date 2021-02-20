package typings.promiseTheWorld

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queueMod {
  
  @JSImport("promise-the-world/queue", JSImport.Namespace)
  @js.native
  def apply(): Queue = js.native
  @JSImport("promise-the-world/queue", JSImport.Namespace)
  @js.native
  def apply(maxPending: js.UndefOr[scala.Nothing], maxQueued: Double): Queue = js.native
  @JSImport("promise-the-world/queue", JSImport.Namespace)
  @js.native
  def apply(maxPending: Double): Queue = js.native
  @JSImport("promise-the-world/queue", JSImport.Namespace)
  @js.native
  def apply(maxPending: Double, maxQueued: Double): Queue = js.native
  
  @JSImport("promise-the-world/queue", "Queue")
  @js.native
  class Queue () extends StObject {
    
    def add[T](factory: js.Function0[js.Promise[T]]): js.Promise[T] = js.native
    
    var length: Double = js.native
    
    var maxPending: Double = js.native
    
    var maxQueued: Double = js.native
    
    var pending: Double = js.native
  }
}
