package typings.restify.mod

import org.scalablytyped.runtime.Instantiable1
import typings.node.bufferMod.global.Buffer
import typings.node.nodeColonhttpMod.IncomingMessage
import typings.node.nodeColonhttpMod.ServerResponse
import typings.node.nodeColonnetMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerOptions extends StObject {
  
  var ca: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
  
  var cert: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
  
  var certificate: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
  
  var ciphers: js.UndefOr[String] = js.undefined
  
  var dtrace: js.UndefOr[Boolean] = js.undefined
  
  var formatters: js.UndefOr[Formatters_] = js.undefined
  
  var handleUncaughtExceptions: js.UndefOr[Boolean] = js.undefined
  
  var handleUpgrades: js.UndefOr[Boolean] = js.undefined
  
  var http2: js.UndefOr[Any] = js.undefined
  
  var httpsServerOptions: js.UndefOr[
    typings.node.httpsMod.ServerOptions[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[typings.node.httpMod.IncomingMessage]
      ]
    ]
  ] = js.undefined
  
  var ignoreTrailingSlash: js.UndefOr[Boolean] = js.undefined
  
  var key: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
  
  var log: js.UndefOr[typings.bunyan.mod.^] = js.undefined
  
  var maxParamLength: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var noWriteContinue: js.UndefOr[Boolean] = js.undefined
  
  var onceNext: js.UndefOr[Boolean] = js.undefined
  
  var passphrase: js.UndefOr[String] = js.undefined
  
  var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
  
  var requestCert: js.UndefOr[Boolean] = js.undefined
  
  var router: js.UndefOr[Router] = js.undefined
  
  var secureOptions: js.UndefOr[Double] = js.undefined
  
  var socketio: js.UndefOr[Boolean] = js.undefined
  
  var spdy: js.UndefOr[typings.spdy.mod.ServerOptions] = js.undefined
  
  var strictFormatters: js.UndefOr[Boolean] = js.undefined
  
  var strictNext: js.UndefOr[Boolean] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
  
  var versions: js.UndefOr[js.Array[String]] = js.undefined
}
object ServerOptions {
  
  inline def apply(): ServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServerOptions] (val x: Self) extends AnyVal {
    
    inline def setCa(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
    
    inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
    
    inline def setCaVarargs(value: (String | Buffer)*): Self = StObject.set(x, "ca", js.Array(value*))
    
    inline def setCert(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
    
    inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
    
    inline def setCertVarargs(value: (String | Buffer)*): Self = StObject.set(x, "cert", js.Array(value*))
    
    inline def setCertificate(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    inline def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
    
    inline def setCertificateVarargs(value: (String | Buffer)*): Self = StObject.set(x, "certificate", js.Array(value*))
    
    inline def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
    
    inline def setCiphersUndefined: Self = StObject.set(x, "ciphers", js.undefined)
    
    inline def setDtrace(value: Boolean): Self = StObject.set(x, "dtrace", value.asInstanceOf[js.Any])
    
    inline def setDtraceUndefined: Self = StObject.set(x, "dtrace", js.undefined)
    
    inline def setFormatters(value: Formatters_): Self = StObject.set(x, "formatters", value.asInstanceOf[js.Any])
    
    inline def setFormattersUndefined: Self = StObject.set(x, "formatters", js.undefined)
    
    inline def setHandleUncaughtExceptions(value: Boolean): Self = StObject.set(x, "handleUncaughtExceptions", value.asInstanceOf[js.Any])
    
    inline def setHandleUncaughtExceptionsUndefined: Self = StObject.set(x, "handleUncaughtExceptions", js.undefined)
    
    inline def setHandleUpgrades(value: Boolean): Self = StObject.set(x, "handleUpgrades", value.asInstanceOf[js.Any])
    
    inline def setHandleUpgradesUndefined: Self = StObject.set(x, "handleUpgrades", js.undefined)
    
    inline def setHttp2(value: Any): Self = StObject.set(x, "http2", value.asInstanceOf[js.Any])
    
    inline def setHttp2Undefined: Self = StObject.set(x, "http2", js.undefined)
    
    inline def setHttpsServerOptions(
      value: typings.node.httpsMod.ServerOptions[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[typings.node.httpMod.IncomingMessage]
          ]
        ]
    ): Self = StObject.set(x, "httpsServerOptions", value.asInstanceOf[js.Any])
    
    inline def setHttpsServerOptionsUndefined: Self = StObject.set(x, "httpsServerOptions", js.undefined)
    
    inline def setIgnoreTrailingSlash(value: Boolean): Self = StObject.set(x, "ignoreTrailingSlash", value.asInstanceOf[js.Any])
    
    inline def setIgnoreTrailingSlashUndefined: Self = StObject.set(x, "ignoreTrailingSlash", js.undefined)
    
    inline def setKey(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setKeyVarargs(value: (String | Buffer)*): Self = StObject.set(x, "key", js.Array(value*))
    
    inline def setLog(value: typings.bunyan.mod.^): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    inline def setMaxParamLength(value: Double): Self = StObject.set(x, "maxParamLength", value.asInstanceOf[js.Any])
    
    inline def setMaxParamLengthUndefined: Self = StObject.set(x, "maxParamLength", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNoWriteContinue(value: Boolean): Self = StObject.set(x, "noWriteContinue", value.asInstanceOf[js.Any])
    
    inline def setNoWriteContinueUndefined: Self = StObject.set(x, "noWriteContinue", js.undefined)
    
    inline def setOnceNext(value: Boolean): Self = StObject.set(x, "onceNext", value.asInstanceOf[js.Any])
    
    inline def setOnceNextUndefined: Self = StObject.set(x, "onceNext", js.undefined)
    
    inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
    
    inline def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
    
    inline def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
    
    inline def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
    
    inline def setRequestCert(value: Boolean): Self = StObject.set(x, "requestCert", value.asInstanceOf[js.Any])
    
    inline def setRequestCertUndefined: Self = StObject.set(x, "requestCert", js.undefined)
    
    inline def setRouter(value: Router): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
    
    inline def setRouterUndefined: Self = StObject.set(x, "router", js.undefined)
    
    inline def setSecureOptions(value: Double): Self = StObject.set(x, "secureOptions", value.asInstanceOf[js.Any])
    
    inline def setSecureOptionsUndefined: Self = StObject.set(x, "secureOptions", js.undefined)
    
    inline def setSocketio(value: Boolean): Self = StObject.set(x, "socketio", value.asInstanceOf[js.Any])
    
    inline def setSocketioUndefined: Self = StObject.set(x, "socketio", js.undefined)
    
    inline def setSpdy(value: typings.spdy.mod.ServerOptions): Self = StObject.set(x, "spdy", value.asInstanceOf[js.Any])
    
    inline def setSpdyUndefined: Self = StObject.set(x, "spdy", js.undefined)
    
    inline def setStrictFormatters(value: Boolean): Self = StObject.set(x, "strictFormatters", value.asInstanceOf[js.Any])
    
    inline def setStrictFormattersUndefined: Self = StObject.set(x, "strictFormatters", js.undefined)
    
    inline def setStrictNext(value: Boolean): Self = StObject.set(x, "strictNext", value.asInstanceOf[js.Any])
    
    inline def setStrictNextUndefined: Self = StObject.set(x, "strictNext", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVersions(value: js.Array[String]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    inline def setVersionsVarargs(value: String*): Self = StObject.set(x, "versions", js.Array(value*))
  }
}
