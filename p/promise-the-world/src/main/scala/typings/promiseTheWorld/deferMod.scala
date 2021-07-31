package typings.promiseTheWorld

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deferMod {
  
  // tslint:disable-next-line no-unnecessary-generics
  @scala.inline
  def apply[T](): Deferred[T] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Deferred[T]]
  
  @JSImport("promise-the-world/defer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("promise-the-world/defer", "Deferred")
  @js.native
  class Deferred[T] () extends StObject {
    
    var promise: js.Promise[T] = js.native
    
    def reject(error: Error): Unit = js.native
    
    def resolve(resolved: T): Unit = js.native
  }
}
