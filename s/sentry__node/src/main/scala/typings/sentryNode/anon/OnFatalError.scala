package typings.sentryNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnFatalError extends StObject {
  
  /**
    * Default onFatalError handler
    * @param firstError Error that has been thrown
    * @param secondError If this was called multiple times this will be set
    */
  var onFatalError: js.UndefOr[
    js.Function2[/* firstError */ js.Error, /* secondError */ js.UndefOr[js.Error], Unit]
  ] = js.undefined
}
object OnFatalError {
  
  inline def apply(): OnFatalError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnFatalError]
  }
  
  extension [Self <: OnFatalError](x: Self) {
    
    inline def setOnFatalError(value: (/* firstError */ js.Error, /* secondError */ js.UndefOr[js.Error]) => Unit): Self = StObject.set(x, "onFatalError", js.Any.fromFunction2(value))
    
    inline def setOnFatalErrorUndefined: Self = StObject.set(x, "onFatalError", js.undefined)
  }
}
