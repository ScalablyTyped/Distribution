package typings.sentryNode.anon

import typings.sentryNode.handlersMod.MiddlewareError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShouldHandleError extends StObject {
  
  /**
    * Callback method deciding whether error should be captured and sent to Sentry
    * @param error Captured middleware error
    */
  var shouldHandleError: js.UndefOr[js.Function1[/* error */ MiddlewareError, Boolean]] = js.undefined
}
object ShouldHandleError {
  
  inline def apply(): ShouldHandleError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShouldHandleError]
  }
  
  extension [Self <: ShouldHandleError](x: Self) {
    
    inline def setShouldHandleError(value: /* error */ MiddlewareError => Boolean): Self = StObject.set(x, "shouldHandleError", js.Any.fromFunction1(value))
    
    inline def setShouldHandleErrorUndefined: Self = StObject.set(x, "shouldHandleError", js.undefined)
  }
}
