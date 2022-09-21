package typings.promiseTimeout

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("promise-timeout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("promise-timeout", "TimeoutError")
  @js.native
  open class TimeoutError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def timeout[T](promise: js.Promise[T], timeoutMillis: Double): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(promise.asInstanceOf[js.Any], timeoutMillis.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
}
