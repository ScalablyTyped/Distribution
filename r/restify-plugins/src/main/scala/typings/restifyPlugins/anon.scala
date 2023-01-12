package typings.restifyPlugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Headers extends StObject {
    
    var headers: js.Array[String]
  }
  object Headers {
    
    inline def apply(headers: js.Array[String]): Headers = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Headers]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Headers] (val x: Self) extends AnyVal {
      
      inline def setHeaders(value: js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value*))
    }
  }
  
  trait MapParams extends StObject {
    
    var mapParams: js.UndefOr[Boolean] = js.undefined
    
    var overrideParams: js.UndefOr[Boolean] = js.undefined
    
    var reviver: js.UndefOr[Any] = js.undefined
  }
  object MapParams {
    
    inline def apply(): MapParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MapParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MapParams] (val x: Self) extends AnyVal {
      
      inline def setMapParams(value: Boolean): Self = StObject.set(x, "mapParams", value.asInstanceOf[js.Any])
      
      inline def setMapParamsUndefined: Self = StObject.set(x, "mapParams", js.undefined)
      
      inline def setOverrideParams(value: Boolean): Self = StObject.set(x, "overrideParams", value.asInstanceOf[js.Any])
      
      inline def setOverrideParamsUndefined: Self = StObject.set(x, "overrideParams", js.undefined)
      
      inline def setReviver(value: Any): Self = StObject.set(x, "reviver", value.asInstanceOf[js.Any])
      
      inline def setReviverUndefined: Self = StObject.set(x, "reviver", js.undefined)
    }
  }
  
  trait MaxBodySize extends StObject {
    
    var maxBodySize: js.UndefOr[Double] = js.undefined
  }
  object MaxBodySize {
    
    inline def apply(): MaxBodySize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxBodySize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MaxBodySize] (val x: Self) extends AnyVal {
      
      inline def setMaxBodySize(value: Double): Self = StObject.set(x, "maxBodySize", value.asInstanceOf[js.Any])
      
      inline def setMaxBodySizeUndefined: Self = StObject.set(x, "maxBodySize", js.undefined)
    }
  }
  
  trait Message extends StObject {
    
    var message: String
  }
  object Message {
    
    inline def apply(message: String): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait Server extends StObject {
    
    var server: typings.restify.mod.Server
  }
  object Server {
    
    inline def apply(server: typings.restify.mod.Server): Server = {
      val __obj = js.Dynamic.literal(server = server.asInstanceOf[js.Any])
      __obj.asInstanceOf[Server]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Server] (val x: Self) extends AnyVal {
      
      inline def setServer(value: typings.restify.mod.Server): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserAgentRegExp extends StObject {
    
    var userAgentRegExp: Any
  }
  object UserAgentRegExp {
    
    inline def apply(userAgentRegExp: Any): UserAgentRegExp = {
      val __obj = js.Dynamic.literal(userAgentRegExp = userAgentRegExp.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserAgentRegExp]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserAgentRegExp] (val x: Self) extends AnyVal {
      
      inline def setUserAgentRegExp(value: Any): Self = StObject.set(x, "userAgentRegExp", value.asInstanceOf[js.Any])
    }
  }
}
