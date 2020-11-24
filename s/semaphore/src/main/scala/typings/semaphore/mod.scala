package typings.semaphore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("semaphore", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(): Semaphore = js.native
  def apply(capacity: Double): Semaphore = js.native
  
  @js.native
  trait Semaphore extends js.Object {
    
    def available(n: Double): Boolean = js.native
    
    var capacity: Double = js.native
    
    def leave(): Unit = js.native
    def leave(n: Double): Unit = js.native
    
    def take(n: Double, task: Task): Unit = js.native
    def take(task: Task): Unit = js.native
  }
  
  type Task = js.Function0[Unit]
}
