package typings.refreshFetch

import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Body[ResponseBody] extends StObject {
    
    /* tslint:disable-next-line no-unnecessary-generics */
    var body: ResponseBody
    
    var response: Response
  }
  object Body {
    
    @scala.inline
    def apply[ResponseBody](body: ResponseBody, response: Response): Body[ResponseBody] = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[Body[ResponseBody]]
    }
    
    @scala.inline
    implicit class BodyMutableBuilder[Self <: Body[?], ResponseBody] (val x: Self & Body[ResponseBody]) extends AnyVal {
      
      @scala.inline
      def setBody(value: ResponseBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  trait Fetch[T] extends StObject {
    
    var fetch: T
    
    def refreshToken(): js.Promise[Unit]
    
    def shouldRefreshToken(error: js.Any): Boolean
  }
  object Fetch {
    
    @scala.inline
    def apply[T](fetch: T, refreshToken: () => js.Promise[Unit], shouldRefreshToken: js.Any => Boolean): Fetch[T] = {
      val __obj = js.Dynamic.literal(fetch = fetch.asInstanceOf[js.Any], refreshToken = js.Any.fromFunction0(refreshToken), shouldRefreshToken = js.Any.fromFunction1(shouldRefreshToken))
      __obj.asInstanceOf[Fetch[T]]
    }
    
    @scala.inline
    implicit class FetchMutableBuilder[Self <: Fetch[?], T] (val x: Self & Fetch[T]) extends AnyVal {
      
      @scala.inline
      def setFetch(value: T): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshToken(value: () => js.Promise[Unit]): Self = StObject.set(x, "refreshToken", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShouldRefreshToken(value: js.Any => Boolean): Self = StObject.set(x, "shouldRefreshToken", js.Any.fromFunction1(value))
    }
  }
}
