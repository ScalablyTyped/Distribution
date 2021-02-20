package typings.restify.mod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerOptions extends StObject {
  
  var ca: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.native
  
  var cert: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.native
  
  var certificate: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.native
  
  var ciphers: js.UndefOr[String] = js.native
  
  var dtrace: js.UndefOr[Boolean] = js.native
  
  var formatters: js.UndefOr[Formatters_] = js.native
  
  var handleUncaughtExceptions: js.UndefOr[Boolean] = js.native
  
  var handleUpgrades: js.UndefOr[Boolean] = js.native
  
  var http2: js.UndefOr[js.Any] = js.native
  
  var httpsServerOptions: js.UndefOr[typings.node.httpsMod.ServerOptions] = js.native
  
  var ignoreTrailingSlash: js.UndefOr[Boolean] = js.native
  
  var key: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.native
  
  var log: js.UndefOr[typings.bunyan.mod.^] = js.native
  
  var maxParamLength: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var noWriteContinue: js.UndefOr[Boolean] = js.native
  
  var onceNext: js.UndefOr[Boolean] = js.native
  
  var passphrase: js.UndefOr[String] = js.native
  
  var rejectUnauthorized: js.UndefOr[Boolean] = js.native
  
  var requestCert: js.UndefOr[Boolean] = js.native
  
  var router: js.UndefOr[Router] = js.native
  
  var secureOptions: js.UndefOr[Double] = js.native
  
  var socketio: js.UndefOr[Boolean] = js.native
  
  var spdy: js.UndefOr[typings.spdy.mod.ServerOptions] = js.native
  
  var strictNext: js.UndefOr[Boolean] = js.native
  
  var version: js.UndefOr[String] = js.native
  
  var versions: js.UndefOr[js.Array[String]] = js.native
}
object ServerOptions {
  
  @scala.inline
  def apply(): ServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerOptions]
  }
  
  @scala.inline
  implicit class ServerOptionsMutableBuilder[Self <: ServerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCa(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
    
    @scala.inline
    def setCaVarargs(value: (String | Buffer)*): Self = StObject.set(x, "ca", js.Array(value :_*))
    
    @scala.inline
    def setCert(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
    
    @scala.inline
    def setCertVarargs(value: (String | Buffer)*): Self = StObject.set(x, "cert", js.Array(value :_*))
    
    @scala.inline
    def setCertificate(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
    
    @scala.inline
    def setCertificateVarargs(value: (String | Buffer)*): Self = StObject.set(x, "certificate", js.Array(value :_*))
    
    @scala.inline
    def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCiphersUndefined: Self = StObject.set(x, "ciphers", js.undefined)
    
    @scala.inline
    def setDtrace(value: Boolean): Self = StObject.set(x, "dtrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDtraceUndefined: Self = StObject.set(x, "dtrace", js.undefined)
    
    @scala.inline
    def setFormatters(value: Formatters_): Self = StObject.set(x, "formatters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattersUndefined: Self = StObject.set(x, "formatters", js.undefined)
    
    @scala.inline
    def setHandleUncaughtExceptions(value: Boolean): Self = StObject.set(x, "handleUncaughtExceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleUncaughtExceptionsUndefined: Self = StObject.set(x, "handleUncaughtExceptions", js.undefined)
    
    @scala.inline
    def setHandleUpgrades(value: Boolean): Self = StObject.set(x, "handleUpgrades", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleUpgradesUndefined: Self = StObject.set(x, "handleUpgrades", js.undefined)
    
    @scala.inline
    def setHttp2(value: js.Any): Self = StObject.set(x, "http2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttp2Undefined: Self = StObject.set(x, "http2", js.undefined)
    
    @scala.inline
    def setHttpsServerOptions(value: typings.node.httpsMod.ServerOptions): Self = StObject.set(x, "httpsServerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpsServerOptionsUndefined: Self = StObject.set(x, "httpsServerOptions", js.undefined)
    
    @scala.inline
    def setIgnoreTrailingSlash(value: Boolean): Self = StObject.set(x, "ignoreTrailingSlash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreTrailingSlashUndefined: Self = StObject.set(x, "ignoreTrailingSlash", js.undefined)
    
    @scala.inline
    def setKey(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setKeyVarargs(value: (String | Buffer)*): Self = StObject.set(x, "key", js.Array(value :_*))
    
    @scala.inline
    def setLog(value: typings.bunyan.mod.^): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    @scala.inline
    def setMaxParamLength(value: Double): Self = StObject.set(x, "maxParamLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxParamLengthUndefined: Self = StObject.set(x, "maxParamLength", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNoWriteContinue(value: Boolean): Self = StObject.set(x, "noWriteContinue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoWriteContinueUndefined: Self = StObject.set(x, "noWriteContinue", js.undefined)
    
    @scala.inline
    def setOnceNext(value: Boolean): Self = StObject.set(x, "onceNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnceNextUndefined: Self = StObject.set(x, "onceNext", js.undefined)
    
    @scala.inline
    def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
    
    @scala.inline
    def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
    
    @scala.inline
    def setRequestCert(value: Boolean): Self = StObject.set(x, "requestCert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestCertUndefined: Self = StObject.set(x, "requestCert", js.undefined)
    
    @scala.inline
    def setRouter(value: Router): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouterUndefined: Self = StObject.set(x, "router", js.undefined)
    
    @scala.inline
    def setSecureOptions(value: Double): Self = StObject.set(x, "secureOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureOptionsUndefined: Self = StObject.set(x, "secureOptions", js.undefined)
    
    @scala.inline
    def setSocketio(value: Boolean): Self = StObject.set(x, "socketio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocketioUndefined: Self = StObject.set(x, "socketio", js.undefined)
    
    @scala.inline
    def setSpdy(value: typings.spdy.mod.ServerOptions): Self = StObject.set(x, "spdy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpdyUndefined: Self = StObject.set(x, "spdy", js.undefined)
    
    @scala.inline
    def setStrictNext(value: Boolean): Self = StObject.set(x, "strictNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictNextUndefined: Self = StObject.set(x, "strictNext", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def setVersions(value: js.Array[String]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    @scala.inline
    def setVersionsVarargs(value: String*): Self = StObject.set(x, "versions", js.Array(value :_*))
  }
}
