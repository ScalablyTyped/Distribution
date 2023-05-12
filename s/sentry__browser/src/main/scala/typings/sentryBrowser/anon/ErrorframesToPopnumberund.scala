package typings.sentryBrowser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Error & {  framesToPop :number | undefined,   stacktrace :string | undefined} */
trait ErrorframesToPopnumberund extends StObject {
  
  /* standard es2022.error */
  var cause: js.UndefOr[Any] = js.undefined
  
  var framesToPop: js.UndefOr[Double] = js.undefined
  
  /* standard es5 */
  var message: String
  
  /* standard es5 */
  var name: String
  
  /* standard es5 */
  var stack: js.UndefOr[String] = js.undefined
  
  var stacktrace: js.UndefOr[String] = js.undefined
}
object ErrorframesToPopnumberund {
  
  inline def apply(message: String, name: String): ErrorframesToPopnumberund = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorframesToPopnumberund]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorframesToPopnumberund] (val x: Self) extends AnyVal {
    
    inline def setCause(value: Any): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    
    inline def setFramesToPop(value: Double): Self = StObject.set(x, "framesToPop", value.asInstanceOf[js.Any])
    
    inline def setFramesToPopUndefined: Self = StObject.set(x, "framesToPop", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    inline def setStacktrace(value: String): Self = StObject.set(x, "stacktrace", value.asInstanceOf[js.Any])
    
    inline def setStacktraceUndefined: Self = StObject.set(x, "stacktrace", js.undefined)
  }
}
