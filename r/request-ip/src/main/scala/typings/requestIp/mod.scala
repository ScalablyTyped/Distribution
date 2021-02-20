package typings.requestIp

import typings.node.httpMod.IncomingHttpHeaders
import typings.requestIp.anon.RemoteAddress
import typings.requestIp.anon.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("request-ip", "getClientIp")
  @js.native
  def getClientIp(req: Request): String | Null = js.native
  
  @JSImport("request-ip", "mw")
  @js.native
  def mw(): js.Function3[/* req */ Request, /* res */ js.Any, /* next */ js.Any, _] = js.native
  @JSImport("request-ip", "mw")
  @js.native
  def mw(options: Options): js.Function3[/* req */ Request, /* res */ js.Any, /* next */ js.Any, _] = js.native
  
  @js.native
  trait Options extends StObject {
    
    var attributeName: String = js.native
  }
  object Options {
    
    @scala.inline
    def apply(attributeName: String): Options = {
      val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Request extends StObject {
    
    var connection: Socket = js.native
    
    var headers: RequestHeaders = js.native
    
    var info: js.UndefOr[RemoteAddress] = js.native
    
    var socket: js.UndefOr[RemoteAddress] = js.native
  }
  object Request {
    
    @scala.inline
    def apply(connection: Socket, headers: RequestHeaders): Request = {
      val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    @scala.inline
    implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnection(value: Socket): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfo(value: RemoteAddress): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      @scala.inline
      def setSocket(value: RemoteAddress): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
    }
  }
  
  @js.native
  trait RequestHeaders extends IncomingHttpHeaders {
    
    var `forwarded-for`: js.UndefOr[String] = js.native
    
    var `x-client-ip`: js.UndefOr[String] = js.native
    
    var `x-cluster-client-ip`: js.UndefOr[String] = js.native
    
    var `x-forwarded`: js.UndefOr[String] = js.native
    
    var `x-forwarded-for`: js.UndefOr[String] = js.native
    
    var `x-real-ip`: js.UndefOr[String] = js.native
  }
  object RequestHeaders {
    
    @scala.inline
    def apply(): RequestHeaders = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestHeaders]
    }
    
    @scala.inline
    implicit class RequestHeadersMutableBuilder[Self <: RequestHeaders] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setForwarded-for`(value: String): Self = StObject.set(x, "forwarded-for", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setForwarded-forUndefined`: Self = StObject.set(x, "forwarded-for", js.undefined)
      
      @scala.inline
      def `setX-client-ip`(value: String): Self = StObject.set(x, "x-client-ip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setX-client-ipUndefined`: Self = StObject.set(x, "x-client-ip", js.undefined)
      
      @scala.inline
      def `setX-cluster-client-ip`(value: String): Self = StObject.set(x, "x-cluster-client-ip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setX-cluster-client-ipUndefined`: Self = StObject.set(x, "x-cluster-client-ip", js.undefined)
      
      @scala.inline
      def `setX-forwarded`(value: String): Self = StObject.set(x, "x-forwarded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setX-forwarded-for`(value: String): Self = StObject.set(x, "x-forwarded-for", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setX-forwarded-forUndefined`: Self = StObject.set(x, "x-forwarded-for", js.undefined)
      
      @scala.inline
      def `setX-forwardedUndefined`: Self = StObject.set(x, "x-forwarded", js.undefined)
      
      @scala.inline
      def `setX-real-ip`(value: String): Self = StObject.set(x, "x-real-ip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setX-real-ipUndefined`: Self = StObject.set(x, "x-real-ip", js.undefined)
    }
  }
  
  object global {
    
    object Express {
      
      @js.native
      trait Request extends StObject {
        
        var clientIp: js.UndefOr[String] = js.native
      }
      object Request {
        
        @scala.inline
        def apply(): typings.requestIp.mod.global.Express.Request = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.requestIp.mod.global.Express.Request]
        }
        
        @scala.inline
        implicit class RequestMutableBuilder[Self <: typings.requestIp.mod.global.Express.Request] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setClientIp(value: String): Self = StObject.set(x, "clientIp", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setClientIpUndefined: Self = StObject.set(x, "clientIp", js.undefined)
        }
      }
    }
  }
}
