package typings.sailthruClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Error extends StObject {
    
    var error: String = js.native
    
    var errormsg: String = js.native
    
    var statusCode: String = js.native
  }
  object Error {
    
    @scala.inline
    def apply(error: String, errormsg: String, statusCode: String): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errormsg = errormsg.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrormsg(value: String): Self = StObject.set(x, "errormsg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Full extends StObject {
    
    var full: js.UndefOr[Url] = js.native
    
    var thumb: js.UndefOr[Url] = js.native
  }
  object Full {
    
    @scala.inline
    def apply(): Full = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Full]
    }
    
    @scala.inline
    implicit class FullMutableBuilder[Self <: Full] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFull(value: Url): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
      
      @scala.inline
      def setThumb(value: Url): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbUndefined: Self = StObject.set(x, "thumb", js.undefined)
    }
  }
  
  @js.native
  trait Limit extends StObject {
    
    var limit: Double = js.native
    
    var remaining: Double = js.native
    
    var reset: Double = js.native
  }
  object Limit {
    
    @scala.inline
    def apply(limit: Double, remaining: Double, reset: Double): Limit = {
      val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], remaining = remaining.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Limit]
    }
    
    @scala.inline
    implicit class LimitMutableBuilder[Self <: Limit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemaining(value: Double): Self = StObject.set(x, "remaining", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReset(value: Double): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Url extends StObject {
    
    var url: String = js.native
  }
  object Url {
    
    @scala.inline
    def apply(url: String): Url = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Url]
    }
    
    @scala.inline
    implicit class UrlMutableBuilder[Self <: Url] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
