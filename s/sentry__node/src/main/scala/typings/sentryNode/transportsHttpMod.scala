package typings.sentryNode

import typings.node.bufferMod.global.Buffer
import typings.sentryNode.httpModuleMod.HTTPModule
import typings.sentryTypes.clientreportMod.EventDropReason
import typings.sentryTypes.datacategoryMod.DataCategory
import typings.sentryTypes.transportMod.BaseTransportOptions
import typings.sentryTypes.transportMod.Transport
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transportsHttpMod {
  
  @JSImport("@sentry/node/types/transports/http", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeNodeTransport(options: NodeTransportOptions): Transport = ^.asInstanceOf[js.Dynamic].applyDynamic("makeNodeTransport")(options.asInstanceOf[js.Any]).asInstanceOf[Transport]
  
  trait NodeTransportOptions
    extends StObject
       with BaseTransportOptions {
    
    /** HTTPS proxy CA certificates */
    var caCerts: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
    
    /** Define custom headers */
    var headers: js.UndefOr[Record[String, String]] = js.undefined
    
    /** Custom HTTP module. Defaults to the native 'http' and 'https' modules. */
    var httpModule: js.UndefOr[HTTPModule] = js.undefined
    
    /** Set a proxy that should be used for outbound requests. */
    var proxy: js.UndefOr[String] = js.undefined
  }
  object NodeTransportOptions {
    
    inline def apply(recordDroppedEvent: (EventDropReason, DataCategory) => Unit, url: String): NodeTransportOptions = {
      val __obj = js.Dynamic.literal(recordDroppedEvent = js.Any.fromFunction2(recordDroppedEvent), url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeTransportOptions]
    }
    
    extension [Self <: NodeTransportOptions](x: Self) {
      
      inline def setCaCerts(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "caCerts", value.asInstanceOf[js.Any])
      
      inline def setCaCertsUndefined: Self = StObject.set(x, "caCerts", js.undefined)
      
      inline def setCaCertsVarargs(value: (String | Buffer)*): Self = StObject.set(x, "caCerts", js.Array(value*))
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHttpModule(value: HTTPModule): Self = StObject.set(x, "httpModule", value.asInstanceOf[js.Any])
      
      inline def setHttpModuleUndefined: Self = StObject.set(x, "httpModule", js.undefined)
      
      inline def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    }
  }
}
