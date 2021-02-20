package typings.primus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Authenticate extends StObject {
    
    var authenticate: js.UndefOr[String] = js.native
    
    var message: js.UndefOr[String] = js.native
    
    var statusCode: js.UndefOr[Double] = js.native
  }
  object Authenticate {
    
    @scala.inline
    def apply(): Authenticate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Authenticate]
    }
    
    @scala.inline
    implicit class AuthenticateMutableBuilder[Self <: Authenticate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthenticate(value: String): Self = StObject.set(x, "authenticate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthenticateUndefined: Self = StObject.set(x, "authenticate", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
  
  @js.native
  trait Close extends StObject {
    
    var close: js.UndefOr[Boolean] = js.native
    
    var reconnect: Boolean = js.native
    
    var timeout: Double = js.native
  }
  object Close {
    
    @scala.inline
    def apply(reconnect: Boolean, timeout: Double): Close = {
      val __obj = js.Dynamic.literal(reconnect = reconnect.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Close]
    }
    
    @scala.inline
    implicit class CloseMutableBuilder[Self <: Close] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: Boolean): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setReconnect(value: Boolean): Self = StObject.set(x, "reconnect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Factor extends StObject {
    
    var factor: js.UndefOr[Double] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    var `reconnect timeout`: js.UndefOr[Double] = js.native
    
    var retries: js.UndefOr[Double] = js.native
  }
  object Factor {
    
    @scala.inline
    def apply(): Factor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Factor]
    }
    
    @scala.inline
    implicit class FactorMutableBuilder[Self <: Factor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def `setReconnect timeout`(value: Double): Self = StObject.set(x, "reconnect timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setReconnect timeoutUndefined`: Self = StObject.set(x, "reconnect timeout", js.undefined)
      
      @scala.inline
      def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
    }
  }
  
  @js.native
  trait Ip extends StObject {
    
    var ip: String = js.native
    
    var port: Double = js.native
    
    var secure: Boolean = js.native
  }
  object Ip {
    
    @scala.inline
    def apply(ip: String, port: Double, secure: Boolean): Ip = {
      val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ip]
    }
    
    @scala.inline
    implicit class IpMutableBuilder[Self <: Ip] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Name extends StObject {
    
    var name: String = js.native
  }
  object Name {
    
    @scala.inline
    def apply(name: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Reconnect extends StObject {
    
    var reconnect: js.UndefOr[Boolean] = js.native
  }
  object Reconnect {
    
    @scala.inline
    def apply(): Reconnect = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Reconnect]
    }
    
    @scala.inline
    implicit class ReconnectMutableBuilder[Self <: Reconnect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReconnect(value: Boolean): Self = StObject.set(x, "reconnect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReconnectUndefined: Self = StObject.set(x, "reconnect", js.undefined)
    }
  }
}
