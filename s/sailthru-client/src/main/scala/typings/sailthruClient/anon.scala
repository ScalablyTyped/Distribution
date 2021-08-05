package typings.sailthruClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Error extends StObject {
    
    var error: String
    
    var errormsg: String
    
    var statusCode: String
  }
  object Error {
    
    inline def apply(error: String, errormsg: String, statusCode: String): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errormsg = errormsg.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrormsg(value: String): Self = StObject.set(x, "errormsg", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait Full extends StObject {
    
    var full: js.UndefOr[Url] = js.undefined
    
    var thumb: js.UndefOr[Url] = js.undefined
  }
  object Full {
    
    inline def apply(): Full = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Full]
    }
    
    extension [Self <: Full](x: Self) {
      
      inline def setFull(value: Url): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      inline def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
      
      inline def setThumb(value: Url): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
      
      inline def setThumbUndefined: Self = StObject.set(x, "thumb", js.undefined)
    }
  }
  
  trait Limit extends StObject {
    
    var limit: Double
    
    var remaining: Double
    
    var reset: Double
  }
  object Limit {
    
    inline def apply(limit: Double, remaining: Double, reset: Double): Limit = {
      val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], remaining = remaining.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Limit]
    }
    
    extension [Self <: Limit](x: Self) {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setRemaining(value: Double): Self = StObject.set(x, "remaining", value.asInstanceOf[js.Any])
      
      inline def setReset(value: Double): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    }
  }
  
  trait Url extends StObject {
    
    var url: String
  }
  object Url {
    
    inline def apply(url: String): Url = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Url]
    }
    
    extension [Self <: Url](x: Self) {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
