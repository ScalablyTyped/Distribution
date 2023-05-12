package typings.refreshFetch

import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Body[ResponseBody] extends StObject {
    
    /* eslint-disable-next-line no-unnecessary-generics */
    var body: ResponseBody
    
    var response: Response
  }
  object Body {
    
    inline def apply[ResponseBody](body: ResponseBody, response: Response): Body[ResponseBody] = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[Body[ResponseBody]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Body[?], ResponseBody] (val x: Self & Body[ResponseBody]) extends AnyVal {
      
      inline def setBody(value: ResponseBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  trait Fetch[T] extends StObject {
    
    var fetch: T
    
    def refreshToken(): js.Promise[Unit]
    
    def shouldRefreshToken(error: Any): Boolean
  }
  object Fetch {
    
    inline def apply[T](fetch: T, refreshToken: () => js.Promise[Unit], shouldRefreshToken: Any => Boolean): Fetch[T] = {
      val __obj = js.Dynamic.literal(fetch = fetch.asInstanceOf[js.Any], refreshToken = js.Any.fromFunction0(refreshToken), shouldRefreshToken = js.Any.fromFunction1(shouldRefreshToken))
      __obj.asInstanceOf[Fetch[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Fetch[?], T] (val x: Self & Fetch[T]) extends AnyVal {
      
      inline def setFetch(value: T): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
      
      inline def setRefreshToken(value: () => js.Promise[Unit]): Self = StObject.set(x, "refreshToken", js.Any.fromFunction0(value))
      
      inline def setShouldRefreshToken(value: Any => Boolean): Self = StObject.set(x, "shouldRefreshToken", js.Any.fromFunction1(value))
    }
  }
}
