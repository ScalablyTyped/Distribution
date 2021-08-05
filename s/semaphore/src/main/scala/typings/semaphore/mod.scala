package typings.semaphore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Semaphore = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Semaphore]
  inline def apply(capacity: Double): Semaphore = ^.asInstanceOf[js.Dynamic].apply(capacity.asInstanceOf[js.Any]).asInstanceOf[Semaphore]
  
  @JSImport("semaphore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
