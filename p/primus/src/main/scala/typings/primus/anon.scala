package typings.primus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Authenticate extends StObject {
    
    var authenticate: js.UndefOr[String] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var statusCode: js.UndefOr[Double] = js.undefined
  }
  object Authenticate {
    
    inline def apply(): Authenticate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Authenticate]
    }
    
    extension [Self <: Authenticate](x: Self) {
      
      inline def setAuthenticate(value: String): Self = StObject.set(x, "authenticate", value.asInstanceOf[js.Any])
      
      inline def setAuthenticateUndefined: Self = StObject.set(x, "authenticate", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
  
  trait Close extends StObject {
    
    var close: js.UndefOr[Boolean] = js.undefined
    
    var reconnect: Boolean
    
    var timeout: Double
  }
  object Close {
    
    inline def apply(reconnect: Boolean, timeout: Double): Close = {
      val __obj = js.Dynamic.literal(reconnect = reconnect.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Close]
    }
    
    extension [Self <: Close](x: Self) {
      
      inline def setClose(value: Boolean): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setReconnect(value: Boolean): Self = StObject.set(x, "reconnect", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  trait Factor extends StObject {
    
    var factor: js.UndefOr[Double] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var `reconnect timeout`: js.UndefOr[Double] = js.undefined
    
    var retries: js.UndefOr[Double] = js.undefined
  }
  object Factor {
    
    inline def apply(): Factor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Factor]
    }
    
    extension [Self <: Factor](x: Self) {
      
      inline def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
      
      inline def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def `setReconnect timeout`(value: Double): Self = StObject.set(x, "reconnect timeout", value.asInstanceOf[js.Any])
      
      inline def `setReconnect timeoutUndefined`: Self = StObject.set(x, "reconnect timeout", js.undefined)
      
      inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
    }
  }
  
  trait Ip extends StObject {
    
    var ip: String
    
    var port: Double
    
    var secure: Boolean
  }
  object Ip {
    
    inline def apply(ip: String, port: Double, secure: Boolean): Ip = {
      val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ip]
    }
    
    extension [Self <: Ip](x: Self) {
      
      inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: String
  }
  object Name {
    
    inline def apply(name: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Reconnect extends StObject {
    
    var reconnect: js.UndefOr[Boolean] = js.undefined
  }
  object Reconnect {
    
    inline def apply(): Reconnect = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Reconnect]
    }
    
    extension [Self <: Reconnect](x: Self) {
      
      inline def setReconnect(value: Boolean): Self = StObject.set(x, "reconnect", value.asInstanceOf[js.Any])
      
      inline def setReconnectUndefined: Self = StObject.set(x, "reconnect", js.undefined)
    }
  }
}
