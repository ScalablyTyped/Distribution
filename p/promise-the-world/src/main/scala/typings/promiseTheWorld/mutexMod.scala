package typings.promiseTheWorld

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mutexMod {
  
  inline def apply(): Mutex = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Mutex]
  
  @JSImport("promise-the-world/mutex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("promise-the-world/mutex", "Mutex")
  @js.native
  class Mutex () extends StObject {
    
    def lock(): js.Promise[Unit] = js.native
    
    def unlock(): js.Promise[Unit] = js.native
  }
}
