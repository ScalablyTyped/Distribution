package typings.restify

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
    
    extension [Self <: Headers](x: Self) {
      
      inline def setHeaders(value: js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value :_*))
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
    
    extension [Self <: MaxBodySize](x: Self) {
      
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
    
    extension [Self <: Message](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait Password extends StObject {
    
    var password: String
    
    var username: String
  }
  object Password {
    
    inline def apply(password: String, username: String): Password = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Password]
    }
    
    extension [Self <: Password](x: Self) {
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
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
    
    extension [Self <: Server](x: Self) {
      
      inline def setServer(value: typings.restify.mod.Server): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserAgentRegExp extends StObject {
    
    var userAgentRegExp: js.Any
  }
  object UserAgentRegExp {
    
    inline def apply(userAgentRegExp: js.Any): UserAgentRegExp = {
      val __obj = js.Dynamic.literal(userAgentRegExp = userAgentRegExp.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserAgentRegExp]
    }
    
    extension [Self <: UserAgentRegExp](x: Self) {
      
      inline def setUserAgentRegExp(value: js.Any): Self = StObject.set(x, "userAgentRegExp", value.asInstanceOf[js.Any])
    }
  }
}
