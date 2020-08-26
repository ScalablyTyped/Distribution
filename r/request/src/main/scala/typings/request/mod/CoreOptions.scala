package typings.request.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.httpMod.Agent
import typings.node.httpMod.AgentOptions
import typings.node.httpMod.IncomingMessage
import typings.request.requestNumbers.`4`
import typings.request.requestNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoreOptions extends js.Object {
  var agent: js.UndefOr[Agent | typings.node.httpsMod.Agent] = js.native
  var agentClass: js.UndefOr[js.Any] = js.native
  var agentOptions: js.UndefOr[AgentOptions | typings.node.httpsMod.AgentOptions] = js.native
  var auth: js.UndefOr[AuthOptions] = js.native
  var aws: js.UndefOr[AWSOptions] = js.native
  var baseUrl: js.UndefOr[String] = js.native
  var body: js.UndefOr[js.Any] = js.native
  var ca: js.UndefOr[String | Buffer | (js.Array[Buffer | String])] = js.native
  var callback: js.UndefOr[RequestCallback] = js.native
  var cert: js.UndefOr[Buffer] = js.native
  var encoding: js.UndefOr[String | Null] = js.native
  var family: js.UndefOr[`4` | `6`] = js.native
  var followAllRedirects: js.UndefOr[Boolean] = js.native
  var followOriginalHttpMethod: js.UndefOr[Boolean] = js.native
  var followRedirect: js.UndefOr[Boolean | (js.Function1[/* response */ IncomingMessage, Boolean])] = js.native
  var forever: js.UndefOr[js.Any] = js.native
  var form: js.UndefOr[StringDictionary[js.Any] | String] = js.native
  var formData: js.UndefOr[StringDictionary[js.Any]] = js.native
  var gzip: js.UndefOr[Boolean] = js.native
  var har: js.UndefOr[HttpArchiveRequest] = js.native
  var hawk: js.UndefOr[HawkOptions] = js.native
  var headers: js.UndefOr[Headers] = js.native
  var host: js.UndefOr[String] = js.native
  var jar: js.UndefOr[CookieJar | Boolean] = js.native
  var json: js.UndefOr[js.Any] = js.native
  var jsonReplacer: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, _]] = js.native
  var jsonReviver: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, _]] = js.native
  var key: js.UndefOr[Buffer] = js.native
  var localAddress: js.UndefOr[String] = js.native
  var maxRedirects: js.UndefOr[Double] = js.native
  var method: js.UndefOr[String] = js.native
  var multipart: js.UndefOr[js.Array[RequestPart] | Multipart] = js.native
  var oauth: js.UndefOr[OAuthOptions] = js.native
  var passphrase: js.UndefOr[String] = js.native
  var pool: js.UndefOr[PoolOptions] = js.native
  var port: js.UndefOr[Double] = js.native
  var postambleCRLF: js.UndefOr[Boolean] = js.native
  var preambleCRLF: js.UndefOr[Boolean] = js.native
  var proxy: js.UndefOr[js.Any] = js.native
  var qs: js.UndefOr[js.Any] = js.native
  var qsParseOptions: js.UndefOr[js.Any] = js.native
  var qsStringifyOptions: js.UndefOr[js.Any] = js.native
  var rejectUnauthorized: js.UndefOr[Boolean] = js.native
  var removeRefererHeader: js.UndefOr[Boolean] = js.native
  var strictSSL: js.UndefOr[Boolean] = js.native
  var time: js.UndefOr[Boolean] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var tunnel: js.UndefOr[Boolean] = js.native
  var useQuerystring: js.UndefOr[Boolean] = js.native
  var withCredentials: js.UndefOr[Boolean] = js.native
}

object CoreOptions {
  @scala.inline
  def apply(): CoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoreOptions]
  }
  @scala.inline
  implicit class CoreOptionsOps[Self <: CoreOptions] (val x: Self) extends AnyVal {
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
    def setAgent(value: Agent | typings.node.httpsMod.Agent): Self = this.set("agent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgent: Self = this.set("agent", js.undefined)
    @scala.inline
    def setAgentClass(value: js.Any): Self = this.set("agentClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgentClass: Self = this.set("agentClass", js.undefined)
    @scala.inline
    def setAgentOptions(value: AgentOptions | typings.node.httpsMod.AgentOptions): Self = this.set("agentOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgentOptions: Self = this.set("agentOptions", js.undefined)
    @scala.inline
    def setAuth(value: AuthOptions): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setAws(value: AWSOptions): Self = this.set("aws", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAws: Self = this.set("aws", js.undefined)
    @scala.inline
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseUrl: Self = this.set("baseUrl", js.undefined)
    @scala.inline
    def setBody(value: js.Any): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setCaVarargs(value: (Buffer | String)*): Self = this.set("ca", js.Array(value :_*))
    @scala.inline
    def setCa(value: String | Buffer | (js.Array[Buffer | String])): Self = this.set("ca", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCa: Self = this.set("ca", js.undefined)
    @scala.inline
    def setCallback(value: (/* error */ js.Any, /* response */ Response, /* body */ js.Any) => Unit): Self = this.set("callback", js.Any.fromFunction3(value))
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setCert(value: Buffer): Self = this.set("cert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCert: Self = this.set("cert", js.undefined)
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setEncodingNull: Self = this.set("encoding", null)
    @scala.inline
    def setFamily(value: `4` | `6`): Self = this.set("family", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFamily: Self = this.set("family", js.undefined)
    @scala.inline
    def setFollowAllRedirects(value: Boolean): Self = this.set("followAllRedirects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFollowAllRedirects: Self = this.set("followAllRedirects", js.undefined)
    @scala.inline
    def setFollowOriginalHttpMethod(value: Boolean): Self = this.set("followOriginalHttpMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFollowOriginalHttpMethod: Self = this.set("followOriginalHttpMethod", js.undefined)
    @scala.inline
    def setFollowRedirectFunction1(value: /* response */ IncomingMessage => Boolean): Self = this.set("followRedirect", js.Any.fromFunction1(value))
    @scala.inline
    def setFollowRedirect(value: Boolean | (js.Function1[/* response */ IncomingMessage, Boolean])): Self = this.set("followRedirect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFollowRedirect: Self = this.set("followRedirect", js.undefined)
    @scala.inline
    def setForever(value: js.Any): Self = this.set("forever", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForever: Self = this.set("forever", js.undefined)
    @scala.inline
    def setForm(value: StringDictionary[js.Any] | String): Self = this.set("form", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    @scala.inline
    def setFormData(value: StringDictionary[js.Any]): Self = this.set("formData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormData: Self = this.set("formData", js.undefined)
    @scala.inline
    def setGzip(value: Boolean): Self = this.set("gzip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGzip: Self = this.set("gzip", js.undefined)
    @scala.inline
    def setHar(value: HttpArchiveRequest): Self = this.set("har", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHar: Self = this.set("har", js.undefined)
    @scala.inline
    def setHawk(value: HawkOptions): Self = this.set("hawk", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHawk: Self = this.set("hawk", js.undefined)
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setJar(value: CookieJar | Boolean): Self = this.set("jar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJar: Self = this.set("jar", js.undefined)
    @scala.inline
    def setJson(value: js.Any): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
    @scala.inline
    def setJsonReplacer(value: (/* key */ String, /* value */ js.Any) => _): Self = this.set("jsonReplacer", js.Any.fromFunction2(value))
    @scala.inline
    def deleteJsonReplacer: Self = this.set("jsonReplacer", js.undefined)
    @scala.inline
    def setJsonReviver(value: (/* key */ String, /* value */ js.Any) => _): Self = this.set("jsonReviver", js.Any.fromFunction2(value))
    @scala.inline
    def deleteJsonReviver: Self = this.set("jsonReviver", js.undefined)
    @scala.inline
    def setKey(value: Buffer): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLocalAddress(value: String): Self = this.set("localAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalAddress: Self = this.set("localAddress", js.undefined)
    @scala.inline
    def setMaxRedirects(value: Double): Self = this.set("maxRedirects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRedirects: Self = this.set("maxRedirects", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setMultipartVarargs(value: RequestPart*): Self = this.set("multipart", js.Array(value :_*))
    @scala.inline
    def setMultipart(value: js.Array[RequestPart] | Multipart): Self = this.set("multipart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultipart: Self = this.set("multipart", js.undefined)
    @scala.inline
    def setOauth(value: OAuthOptions): Self = this.set("oauth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOauth: Self = this.set("oauth", js.undefined)
    @scala.inline
    def setPassphrase(value: String): Self = this.set("passphrase", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassphrase: Self = this.set("passphrase", js.undefined)
    @scala.inline
    def setPool(value: PoolOptions): Self = this.set("pool", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePool: Self = this.set("pool", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setPostambleCRLF(value: Boolean): Self = this.set("postambleCRLF", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostambleCRLF: Self = this.set("postambleCRLF", js.undefined)
    @scala.inline
    def setPreambleCRLF(value: Boolean): Self = this.set("preambleCRLF", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreambleCRLF: Self = this.set("preambleCRLF", js.undefined)
    @scala.inline
    def setProxy(value: js.Any): Self = this.set("proxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    @scala.inline
    def setQs(value: js.Any): Self = this.set("qs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQs: Self = this.set("qs", js.undefined)
    @scala.inline
    def setQsParseOptions(value: js.Any): Self = this.set("qsParseOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQsParseOptions: Self = this.set("qsParseOptions", js.undefined)
    @scala.inline
    def setQsStringifyOptions(value: js.Any): Self = this.set("qsStringifyOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQsStringifyOptions: Self = this.set("qsStringifyOptions", js.undefined)
    @scala.inline
    def setRejectUnauthorized(value: Boolean): Self = this.set("rejectUnauthorized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRejectUnauthorized: Self = this.set("rejectUnauthorized", js.undefined)
    @scala.inline
    def setRemoveRefererHeader(value: Boolean): Self = this.set("removeRefererHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveRefererHeader: Self = this.set("removeRefererHeader", js.undefined)
    @scala.inline
    def setStrictSSL(value: Boolean): Self = this.set("strictSSL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrictSSL: Self = this.set("strictSSL", js.undefined)
    @scala.inline
    def setTime(value: Boolean): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setTunnel(value: Boolean): Self = this.set("tunnel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTunnel: Self = this.set("tunnel", js.undefined)
    @scala.inline
    def setUseQuerystring(value: Boolean): Self = this.set("useQuerystring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseQuerystring: Self = this.set("useQuerystring", js.undefined)
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithCredentials: Self = this.set("withCredentials", js.undefined)
  }
  
}

