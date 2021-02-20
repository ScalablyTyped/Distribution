package typings.semaphore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("semaphore", JSImport.Namespace)
  @js.native
  def apply(): Semaphore = js.native
  @JSImport("semaphore", JSImport.Namespace)
  @js.native
  def apply(capacity: Double): Semaphore = js.native
  
  @js.native
  trait Semaphore extends StObject {
    
    def available(n: Double): Boolean = js.native
    
    var capacity: Double = js.native
    
    def leave(): Unit = js.native
    def leave(n: Double): Unit = js.native
    
    def take(n: Double, task: Task): Unit = js.native
    def take(task: Task): Unit = js.native
  }
  
  type Task = js.Function0[Unit]
}
