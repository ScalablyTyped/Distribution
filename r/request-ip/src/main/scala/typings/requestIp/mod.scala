package typings.requestIp

import typings.node.httpMod.IncomingHttpHeaders
import typings.requestIp.anon.RemoteAddress
import typings.requestIp.anon.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("request-ip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getClientIp(req: Request): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getClientIp")(req.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def mw(): js.Function3[/* req */ Request, /* res */ Any, /* next */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("mw")().asInstanceOf[js.Function3[/* req */ Request, /* res */ Any, /* next */ Any, Any]]
  inline def mw(options: Options): js.Function3[/* req */ Request, /* res */ Any, /* next */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("mw")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* req */ Request, /* res */ Any, /* next */ Any, Any]]
  
  trait Options extends StObject {
    
    var attributeName: String
  }
  object Options {
    
    inline def apply(attributeName: String): Options = {
      val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
    }
  }
  
  trait Request extends StObject {
    
    var connection: js.UndefOr[Socket] = js.undefined
    
    var headers: RequestHeaders
    
    var info: js.UndefOr[RemoteAddress] = js.undefined
    
    var socket: js.UndefOr[RemoteAddress] = js.undefined
  }
  object Request {
    
    inline def apply(headers: RequestHeaders): Request = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
      
      inline def setConnection(value: Socket): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
      
      inline def setHeaders(value: RequestHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: RemoteAddress): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setSocket(value: RemoteAddress): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      inline def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
    }
  }
  
  trait RequestHeaders
    extends StObject
       with IncomingHttpHeaders {
    
    var `forwarded-for`: js.UndefOr[String] = js.undefined
    
    var `x-client-ip`: js.UndefOr[String] = js.undefined
    
    var `x-cluster-client-ip`: js.UndefOr[String] = js.undefined
    
    var `x-forwarded`: js.UndefOr[String] = js.undefined
    
    var `x-forwarded-for`: js.UndefOr[String] = js.undefined
    
    var `x-real-ip`: js.UndefOr[String] = js.undefined
  }
  object RequestHeaders {
    
    inline def apply(): RequestHeaders = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestHeaders]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestHeaders] (val x: Self) extends AnyVal {
      
      inline def `setForwarded-for`(value: String): Self = StObject.set(x, "forwarded-for", value.asInstanceOf[js.Any])
      
      inline def `setForwarded-forUndefined`: Self = StObject.set(x, "forwarded-for", js.undefined)
      
      inline def `setX-client-ip`(value: String): Self = StObject.set(x, "x-client-ip", value.asInstanceOf[js.Any])
      
      inline def `setX-client-ipUndefined`: Self = StObject.set(x, "x-client-ip", js.undefined)
      
      inline def `setX-cluster-client-ip`(value: String): Self = StObject.set(x, "x-cluster-client-ip", value.asInstanceOf[js.Any])
      
      inline def `setX-cluster-client-ipUndefined`: Self = StObject.set(x, "x-cluster-client-ip", js.undefined)
      
      inline def `setX-forwarded`(value: String): Self = StObject.set(x, "x-forwarded", value.asInstanceOf[js.Any])
      
      inline def `setX-forwarded-for`(value: String): Self = StObject.set(x, "x-forwarded-for", value.asInstanceOf[js.Any])
      
      inline def `setX-forwarded-forUndefined`: Self = StObject.set(x, "x-forwarded-for", js.undefined)
      
      inline def `setX-forwardedUndefined`: Self = StObject.set(x, "x-forwarded", js.undefined)
      
      inline def `setX-real-ip`(value: String): Self = StObject.set(x, "x-real-ip", value.asInstanceOf[js.Any])
      
      inline def `setX-real-ipUndefined`: Self = StObject.set(x, "x-real-ip", js.undefined)
    }
  }
  
  object global {
    
    object Express {
      
      trait Request extends StObject {
        
        var clientIp: js.UndefOr[String] = js.undefined
      }
      object Request {
        
        inline def apply(): typings.requestIp.mod.global.Express.Request = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.requestIp.mod.global.Express.Request]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: typings.requestIp.mod.global.Express.Request] (val x: Self) extends AnyVal {
          
          inline def setClientIp(value: String): Self = StObject.set(x, "clientIp", value.asInstanceOf[js.Any])
          
          inline def setClientIpUndefined: Self = StObject.set(x, "clientIp", js.undefined)
        }
      }
    }
  }
}
