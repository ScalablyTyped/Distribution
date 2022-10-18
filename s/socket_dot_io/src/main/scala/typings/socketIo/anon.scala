package typings.socketIo

import org.scalablytyped.runtime.Instantiable0
import typings.cors.mod.CorsOptions
import typings.cors.mod.CorsOptionsDelegate
import typings.cors.mod.CorsRequest
import typings.engineIo.anon.CookieSerializeOptionsnam
import typings.engineIo.buildServerMod.Transport
import typings.node.httpMod.IncomingMessage
import typings.socketIo.distNamespaceMod.Namespace
import typings.socketIo.distTypedEventsMod.DefaultEventsMap
import typings.socketIo.mod.AdapterConstructor
import typings.socketIoAdapter.mod.Adapter
import typings.socketIoParser.mod.Decoder
import typings.socketIoParser.mod.Encoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<socket.io.socket.io.ServerOptions> */
  trait PartialServerOptions extends StObject {
    
    var adapter: js.UndefOr[AdapterConstructor] = js.undefined
    
    var allowEIO3: js.UndefOr[Boolean] = js.undefined
    
    var allowRequest: js.UndefOr[
        js.Function2[
          /* req */ IncomingMessage, 
          /* fn */ js.Function2[/* err */ js.UndefOr[String | Null], /* success */ Boolean, Unit], 
          Unit
        ]
      ] = js.undefined
    
    var allowUpgrades: js.UndefOr[Boolean] = js.undefined
    
    var connectTimeout: js.UndefOr[Double] = js.undefined
    
    var cookie: js.UndefOr[CookieSerializeOptionsnam | Boolean] = js.undefined
    
    var cors: js.UndefOr[CorsOptions | CorsOptionsDelegate[CorsRequest]] = js.undefined
    
    var destroyUpgrade: js.UndefOr[Boolean] = js.undefined
    
    var destroyUpgradeTimeout: js.UndefOr[Double] = js.undefined
    
    var httpCompression: js.UndefOr[Boolean | js.Object] = js.undefined
    
    var initialPacket: js.UndefOr[Any] = js.undefined
    
    var maxHttpBufferSize: js.UndefOr[Double] = js.undefined
    
    var parser: js.UndefOr[Any] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var perMessageDeflate: js.UndefOr[Boolean | js.Object] = js.undefined
    
    var pingInterval: js.UndefOr[Double] = js.undefined
    
    var pingTimeout: js.UndefOr[Double] = js.undefined
    
    var serveClient: js.UndefOr[Boolean] = js.undefined
    
    var transports: js.UndefOr[js.Array[Transport]] = js.undefined
    
    var upgradeTimeout: js.UndefOr[Double] = js.undefined
    
    var wsEngine: js.UndefOr[Any] = js.undefined
  }
  object PartialServerOptions {
    
    inline def apply(): PartialServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialServerOptions]
    }
    
    extension [Self <: PartialServerOptions](x: Self) {
      
      inline def setAdapter(value: AdapterConstructor): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
      
      inline def setAdapterFunction1(value: /* nsp */ Namespace[DefaultEventsMap, DefaultEventsMap, DefaultEventsMap, Any] => Adapter): Self = StObject.set(x, "adapter", js.Any.fromFunction1(value))
      
      inline def setAdapterUndefined: Self = StObject.set(x, "adapter", js.undefined)
      
      inline def setAllowEIO3(value: Boolean): Self = StObject.set(x, "allowEIO3", value.asInstanceOf[js.Any])
      
      inline def setAllowEIO3Undefined: Self = StObject.set(x, "allowEIO3", js.undefined)
      
      inline def setAllowRequest(
        value: (/* req */ IncomingMessage, /* fn */ js.Function2[/* err */ js.UndefOr[String | Null], /* success */ Boolean, Unit]) => Unit
      ): Self = StObject.set(x, "allowRequest", js.Any.fromFunction2(value))
      
      inline def setAllowRequestUndefined: Self = StObject.set(x, "allowRequest", js.undefined)
      
      inline def setAllowUpgrades(value: Boolean): Self = StObject.set(x, "allowUpgrades", value.asInstanceOf[js.Any])
      
      inline def setAllowUpgradesUndefined: Self = StObject.set(x, "allowUpgrades", js.undefined)
      
      inline def setConnectTimeout(value: Double): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
      
      inline def setConnectTimeoutUndefined: Self = StObject.set(x, "connectTimeout", js.undefined)
      
      inline def setCookie(value: CookieSerializeOptionsnam | Boolean): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      inline def setCors(value: CorsOptions | CorsOptionsDelegate[CorsRequest]): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
      
      inline def setCorsFunction2(
        value: (CorsRequest, /* callback */ js.Function2[/* err */ js.Error | Null, /* options */ js.UndefOr[CorsOptions], Unit]) => Unit
      ): Self = StObject.set(x, "cors", js.Any.fromFunction2(value))
      
      inline def setCorsUndefined: Self = StObject.set(x, "cors", js.undefined)
      
      inline def setDestroyUpgrade(value: Boolean): Self = StObject.set(x, "destroyUpgrade", value.asInstanceOf[js.Any])
      
      inline def setDestroyUpgradeTimeout(value: Double): Self = StObject.set(x, "destroyUpgradeTimeout", value.asInstanceOf[js.Any])
      
      inline def setDestroyUpgradeTimeoutUndefined: Self = StObject.set(x, "destroyUpgradeTimeout", js.undefined)
      
      inline def setDestroyUpgradeUndefined: Self = StObject.set(x, "destroyUpgrade", js.undefined)
      
      inline def setHttpCompression(value: Boolean | js.Object): Self = StObject.set(x, "httpCompression", value.asInstanceOf[js.Any])
      
      inline def setHttpCompressionUndefined: Self = StObject.set(x, "httpCompression", js.undefined)
      
      inline def setInitialPacket(value: Any): Self = StObject.set(x, "initialPacket", value.asInstanceOf[js.Any])
      
      inline def setInitialPacketUndefined: Self = StObject.set(x, "initialPacket", js.undefined)
      
      inline def setMaxHttpBufferSize(value: Double): Self = StObject.set(x, "maxHttpBufferSize", value.asInstanceOf[js.Any])
      
      inline def setMaxHttpBufferSizeUndefined: Self = StObject.set(x, "maxHttpBufferSize", js.undefined)
      
      inline def setParser(value: Any): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPerMessageDeflate(value: Boolean | js.Object): Self = StObject.set(x, "perMessageDeflate", value.asInstanceOf[js.Any])
      
      inline def setPerMessageDeflateUndefined: Self = StObject.set(x, "perMessageDeflate", js.undefined)
      
      inline def setPingInterval(value: Double): Self = StObject.set(x, "pingInterval", value.asInstanceOf[js.Any])
      
      inline def setPingIntervalUndefined: Self = StObject.set(x, "pingInterval", js.undefined)
      
      inline def setPingTimeout(value: Double): Self = StObject.set(x, "pingTimeout", value.asInstanceOf[js.Any])
      
      inline def setPingTimeoutUndefined: Self = StObject.set(x, "pingTimeout", js.undefined)
      
      inline def setServeClient(value: Boolean): Self = StObject.set(x, "serveClient", value.asInstanceOf[js.Any])
      
      inline def setServeClientUndefined: Self = StObject.set(x, "serveClient", js.undefined)
      
      inline def setTransports(value: js.Array[Transport]): Self = StObject.set(x, "transports", value.asInstanceOf[js.Any])
      
      inline def setTransportsUndefined: Self = StObject.set(x, "transports", js.undefined)
      
      inline def setTransportsVarargs(value: Transport*): Self = StObject.set(x, "transports", js.Array(value*))
      
      inline def setUpgradeTimeout(value: Double): Self = StObject.set(x, "upgradeTimeout", value.asInstanceOf[js.Any])
      
      inline def setUpgradeTimeoutUndefined: Self = StObject.set(x, "upgradeTimeout", js.undefined)
      
      inline def setWsEngine(value: Any): Self = StObject.set(x, "wsEngine", value.asInstanceOf[js.Any])
      
      inline def setWsEngineUndefined: Self = StObject.set(x, "wsEngine", js.undefined)
    }
  }
  
  @js.native
  trait TypeofDecoder
    extends StObject
       with Instantiable0[Decoder] {
    
    /* private */ var isPayloadValid: Any = js.native
  }
  
  trait Typeofparser extends StObject {
    
    var Decoder: TypeofDecoder
    
    var Encoder: Instantiable0[typings.socketIoParser.mod.Encoder]
    
    val protocol: Double
  }
  object Typeofparser {
    
    inline def apply(Decoder: TypeofDecoder, Encoder: Instantiable0[Encoder], protocol: Double): Typeofparser = {
      val __obj = js.Dynamic.literal(Decoder = Decoder.asInstanceOf[js.Any], Encoder = Encoder.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeofparser]
    }
    
    extension [Self <: Typeofparser](x: Self) {
      
      inline def setDecoder(value: TypeofDecoder): Self = StObject.set(x, "Decoder", value.asInstanceOf[js.Any])
      
      inline def setEncoder(value: Instantiable0[Encoder]): Self = StObject.set(x, "Encoder", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: Double): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    }
  }
}
