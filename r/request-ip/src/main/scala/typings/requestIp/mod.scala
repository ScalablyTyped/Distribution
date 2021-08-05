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
  
  inline def mw(): js.Function3[/* req */ Request, /* res */ js.Any, /* next */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("mw")().asInstanceOf[js.Function3[/* req */ Request, /* res */ js.Any, /* next */ js.Any, js.Any]]
  inline def mw(options: Options): js.Function3[/* req */ Request, /* res */ js.Any, /* next */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("mw")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* req */ Request, /* res */ js.Any, /* next */ js.Any, js.Any]]
  
  trait Options extends StObject {
    
    var attributeName: String
  }
  object Options {
    
    inline def apply(attributeName: String): Options = {
      val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
    }
  }
  
  trait Request extends StObject {
    
    var connection: Socket
    
    var headers: RequestHeaders
    
    var info: js.UndefOr[RemoteAddress] = js.undefined
    
    var socket: js.UndefOr[RemoteAddress] = js.undefined
  }
  object Request {
    
    inline def apply(connection: Socket, headers: RequestHeaders): Request = {
      val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    extension [Self <: Request](x: Self) {
      
      inline def setConnection(value: Socket): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
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
    
    extension [Self <: RequestHeaders](x: Self) {
      
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
        
        extension [Self <: typings.requestIp.mod.global.Express.Request](x: Self) {
          
          inline def setClientIp(value: String): Self = StObject.set(x, "clientIp", value.asInstanceOf[js.Any])
          
          inline def setClientIpUndefined: Self = StObject.set(x, "clientIp", js.undefined)
        }
      }
    }
  }
}
