package typings.promiseTheWorld

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("promise-the-world/defer", JSImport.Namespace)
@js.native
object deferMod extends js.Object {
  
  // tslint:disable-next-line no-unnecessary-generics
  def apply[T](): Deferred[T] = js.native
  
  @js.native
  class Deferred[T] () extends js.Object {
    
    var promise: js.Promise[T] = js.native
    
    def reject(error: Error): Unit = js.native
    
    def resolve(resolved: T): Unit = js.native
  }
}
