package typings.promiseTheWorld

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("promise-the-world/mutex", JSImport.Namespace)
@js.native
object mutexMod extends js.Object {
  
  def apply(): Mutex = js.native
  
  @js.native
  class Mutex () extends js.Object {
    
    def lock(): js.Promise[Unit] = js.native
    
    def unlock(): js.Promise[Unit] = js.native
  }
}
