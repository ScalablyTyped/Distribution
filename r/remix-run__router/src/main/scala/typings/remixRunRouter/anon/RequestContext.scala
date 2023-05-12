package typings.remixRunRouter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestContext extends StObject {
  
  var requestContext: js.UndefOr[Any] = js.undefined
}
object RequestContext {
  
  inline def apply(): RequestContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestContext] (val x: Self) extends AnyVal {
    
    inline def setRequestContext(value: Any): Self = StObject.set(x, "requestContext", value.asInstanceOf[js.Any])
    
    inline def setRequestContextUndefined: Self = StObject.set(x, "requestContext", js.undefined)
  }
}
