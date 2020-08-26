package typings.restify.mod

import typings.bunyan.mod.^
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerOptions extends js.Object {
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
  var log: js.UndefOr[^] = js.native
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
  implicit class ServerOptionsOps[Self <: ServerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCaVarargs(value: (String | Buffer)*): Self = this.set("ca", js.Array(value :_*))
    @scala.inline
    def setCa(value: String | Buffer | (js.Array[String | Buffer])): Self = this.set("ca", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCa: Self = this.set("ca", js.undefined)
    @scala.inline
    def setCertVarargs(value: (String | Buffer)*): Self = this.set("cert", js.Array(value :_*))
    @scala.inline
    def setCert(value: String | Buffer | (js.Array[String | Buffer])): Self = this.set("cert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCert: Self = this.set("cert", js.undefined)
    @scala.inline
    def setCertificateVarargs(value: (String | Buffer)*): Self = this.set("certificate", js.Array(value :_*))
    @scala.inline
    def setCertificate(value: String | Buffer | (js.Array[String | Buffer])): Self = this.set("certificate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificate: Self = this.set("certificate", js.undefined)
    @scala.inline
    def setCiphers(value: String): Self = this.set("ciphers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCiphers: Self = this.set("ciphers", js.undefined)
    @scala.inline
    def setDtrace(value: Boolean): Self = this.set("dtrace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDtrace: Self = this.set("dtrace", js.undefined)
    @scala.inline
    def setFormatters(value: Formatters_): Self = this.set("formatters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatters: Self = this.set("formatters", js.undefined)
    @scala.inline
    def setHandleUncaughtExceptions(value: Boolean): Self = this.set("handleUncaughtExceptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandleUncaughtExceptions: Self = this.set("handleUncaughtExceptions", js.undefined)
    @scala.inline
    def setHandleUpgrades(value: Boolean): Self = this.set("handleUpgrades", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandleUpgrades: Self = this.set("handleUpgrades", js.undefined)
    @scala.inline
    def setHttp2(value: js.Any): Self = this.set("http2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttp2: Self = this.set("http2", js.undefined)
    @scala.inline
    def setHttpsServerOptions(value: typings.node.httpsMod.ServerOptions): Self = this.set("httpsServerOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpsServerOptions: Self = this.set("httpsServerOptions", js.undefined)
    @scala.inline
    def setIgnoreTrailingSlash(value: Boolean): Self = this.set("ignoreTrailingSlash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreTrailingSlash: Self = this.set("ignoreTrailingSlash", js.undefined)
    @scala.inline
    def setKeyVarargs(value: (String | Buffer)*): Self = this.set("key", js.Array(value :_*))
    @scala.inline
    def setKey(value: String | Buffer | (js.Array[String | Buffer])): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLog(value: ^): Self = this.set("log", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    @scala.inline
    def setMaxParamLength(value: Double): Self = this.set("maxParamLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxParamLength: Self = this.set("maxParamLength", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNoWriteContinue(value: Boolean): Self = this.set("noWriteContinue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoWriteContinue: Self = this.set("noWriteContinue", js.undefined)
    @scala.inline
    def setOnceNext(value: Boolean): Self = this.set("onceNext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnceNext: Self = this.set("onceNext", js.undefined)
    @scala.inline
    def setPassphrase(value: String): Self = this.set("passphrase", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassphrase: Self = this.set("passphrase", js.undefined)
    @scala.inline
    def setRejectUnauthorized(value: Boolean): Self = this.set("rejectUnauthorized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRejectUnauthorized: Self = this.set("rejectUnauthorized", js.undefined)
    @scala.inline
    def setRequestCert(value: Boolean): Self = this.set("requestCert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestCert: Self = this.set("requestCert", js.undefined)
    @scala.inline
    def setRouter(value: Router): Self = this.set("router", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouter: Self = this.set("router", js.undefined)
    @scala.inline
    def setSecureOptions(value: Double): Self = this.set("secureOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecureOptions: Self = this.set("secureOptions", js.undefined)
    @scala.inline
    def setSocketio(value: Boolean): Self = this.set("socketio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSocketio: Self = this.set("socketio", js.undefined)
    @scala.inline
    def setSpdy(value: typings.spdy.mod.ServerOptions): Self = this.set("spdy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpdy: Self = this.set("spdy", js.undefined)
    @scala.inline
    def setStrictNext(value: Boolean): Self = this.set("strictNext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrictNext: Self = this.set("strictNext", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    @scala.inline
    def setVersionsVarargs(value: String*): Self = this.set("versions", js.Array(value :_*))
    @scala.inline
    def setVersions(value: js.Array[String]): Self = this.set("versions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersions: Self = this.set("versions", js.undefined)
  }
  
}

