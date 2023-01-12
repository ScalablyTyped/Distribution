package typings.pusherJs

import typings.pusherJs.typesSrcCoreHttpAjaxMod.Ajax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreHttpRequestHooksMod {
  
  trait RequestHooks extends StObject {
    
    def abortRequest(HTTPRequest: Any): Unit
    
    def getRequest(HTTPRequest: Any): Ajax
  }
  object RequestHooks {
    
    inline def apply(abortRequest: Any => Unit, getRequest: Any => Ajax): RequestHooks = {
      val __obj = js.Dynamic.literal(abortRequest = js.Any.fromFunction1(abortRequest), getRequest = js.Any.fromFunction1(getRequest))
      __obj.asInstanceOf[RequestHooks]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestHooks] (val x: Self) extends AnyVal {
      
      inline def setAbortRequest(value: Any => Unit): Self = StObject.set(x, "abortRequest", js.Any.fromFunction1(value))
      
      inline def setGetRequest(value: Any => Ajax): Self = StObject.set(x, "getRequest", js.Any.fromFunction1(value))
    }
  }
}
