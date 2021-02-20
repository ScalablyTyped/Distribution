package typings.request.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.httpMod.Agent
import typings.node.httpMod.AgentOptions
import typings.node.httpMod.IncomingMessage
import typings.request.requestNumbers.`4`
import typings.request.requestNumbers.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoreOptions extends StObject {
  
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
  implicit class CoreOptionsMutableBuilder[Self <: CoreOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgent(value: Agent | typings.node.httpsMod.Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentClass(value: js.Any): Self = StObject.set(x, "agentClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentClassUndefined: Self = StObject.set(x, "agentClass", js.undefined)
    
    @scala.inline
    def setAgentOptions(value: AgentOptions | typings.node.httpsMod.AgentOptions): Self = StObject.set(x, "agentOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentOptionsUndefined: Self = StObject.set(x, "agentOptions", js.undefined)
    
    @scala.inline
    def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
    
    @scala.inline
    def setAuth(value: AuthOptions): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setAws(value: AWSOptions): Self = StObject.set(x, "aws", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsUndefined: Self = StObject.set(x, "aws", js.undefined)
    
    @scala.inline
    def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
    
    @scala.inline
    def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setCa(value: String | Buffer | (js.Array[Buffer | String])): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
    
    @scala.inline
    def setCaVarargs(value: (Buffer | String)*): Self = StObject.set(x, "ca", js.Array(value :_*))
    
    @scala.inline
    def setCallback(value: (/* error */ js.Any, /* response */ Response, /* body */ js.Any) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setCert(value: Buffer): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setFamily(value: `4` | `6`): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
    
    @scala.inline
    def setFollowAllRedirects(value: Boolean): Self = StObject.set(x, "followAllRedirects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowAllRedirectsUndefined: Self = StObject.set(x, "followAllRedirects", js.undefined)
    
    @scala.inline
    def setFollowOriginalHttpMethod(value: Boolean): Self = StObject.set(x, "followOriginalHttpMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowOriginalHttpMethodUndefined: Self = StObject.set(x, "followOriginalHttpMethod", js.undefined)
    
    @scala.inline
    def setFollowRedirect(value: Boolean | (js.Function1[/* response */ IncomingMessage, Boolean])): Self = StObject.set(x, "followRedirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowRedirectFunction1(value: /* response */ IncomingMessage => Boolean): Self = StObject.set(x, "followRedirect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFollowRedirectUndefined: Self = StObject.set(x, "followRedirect", js.undefined)
    
    @scala.inline
    def setForever(value: js.Any): Self = StObject.set(x, "forever", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForeverUndefined: Self = StObject.set(x, "forever", js.undefined)
    
    @scala.inline
    def setForm(value: StringDictionary[js.Any] | String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormData(value: StringDictionary[js.Any]): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
    
    @scala.inline
    def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    @scala.inline
    def setGzip(value: Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
    
    @scala.inline
    def setHar(value: HttpArchiveRequest): Self = StObject.set(x, "har", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHarUndefined: Self = StObject.set(x, "har", js.undefined)
    
    @scala.inline
    def setHawk(value: HawkOptions): Self = StObject.set(x, "hawk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHawkUndefined: Self = StObject.set(x, "hawk", js.undefined)
    
    @scala.inline
    def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setJar(value: CookieJar | Boolean): Self = StObject.set(x, "jar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJarUndefined: Self = StObject.set(x, "jar", js.undefined)
    
    @scala.inline
    def setJson(value: js.Any): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonReplacer(value: (/* key */ String, /* value */ js.Any) => _): Self = StObject.set(x, "jsonReplacer", js.Any.fromFunction2(value))
    
    @scala.inline
    def setJsonReplacerUndefined: Self = StObject.set(x, "jsonReplacer", js.undefined)
    
    @scala.inline
    def setJsonReviver(value: (/* key */ String, /* value */ js.Any) => _): Self = StObject.set(x, "jsonReviver", js.Any.fromFunction2(value))
    
    @scala.inline
    def setJsonReviverUndefined: Self = StObject.set(x, "jsonReviver", js.undefined)
    
    @scala.inline
    def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    
    @scala.inline
    def setKey(value: Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
    
    @scala.inline
    def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRedirectsUndefined: Self = StObject.set(x, "maxRedirects", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setMultipart(value: js.Array[RequestPart] | Multipart): Self = StObject.set(x, "multipart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipartUndefined: Self = StObject.set(x, "multipart", js.undefined)
    
    @scala.inline
    def setMultipartVarargs(value: RequestPart*): Self = StObject.set(x, "multipart", js.Array(value :_*))
    
    @scala.inline
    def setOauth(value: OAuthOptions): Self = StObject.set(x, "oauth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauthUndefined: Self = StObject.set(x, "oauth", js.undefined)
    
    @scala.inline
    def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
    
    @scala.inline
    def setPool(value: PoolOptions): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolUndefined: Self = StObject.set(x, "pool", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setPostambleCRLF(value: Boolean): Self = StObject.set(x, "postambleCRLF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostambleCRLFUndefined: Self = StObject.set(x, "postambleCRLF", js.undefined)
    
    @scala.inline
    def setPreambleCRLF(value: Boolean): Self = StObject.set(x, "preambleCRLF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreambleCRLFUndefined: Self = StObject.set(x, "preambleCRLF", js.undefined)
    
    @scala.inline
    def setProxy(value: js.Any): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    @scala.inline
    def setQs(value: js.Any): Self = StObject.set(x, "qs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQsParseOptions(value: js.Any): Self = StObject.set(x, "qsParseOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQsParseOptionsUndefined: Self = StObject.set(x, "qsParseOptions", js.undefined)
    
    @scala.inline
    def setQsStringifyOptions(value: js.Any): Self = StObject.set(x, "qsStringifyOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQsStringifyOptionsUndefined: Self = StObject.set(x, "qsStringifyOptions", js.undefined)
    
    @scala.inline
    def setQsUndefined: Self = StObject.set(x, "qs", js.undefined)
    
    @scala.inline
    def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
    
    @scala.inline
    def setRemoveRefererHeader(value: Boolean): Self = StObject.set(x, "removeRefererHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveRefererHeaderUndefined: Self = StObject.set(x, "removeRefererHeader", js.undefined)
    
    @scala.inline
    def setStrictSSL(value: Boolean): Self = StObject.set(x, "strictSSL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictSSLUndefined: Self = StObject.set(x, "strictSSL", js.undefined)
    
    @scala.inline
    def setTime(value: Boolean): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setTunnel(value: Boolean): Self = StObject.set(x, "tunnel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTunnelUndefined: Self = StObject.set(x, "tunnel", js.undefined)
    
    @scala.inline
    def setUseQuerystring(value: Boolean): Self = StObject.set(x, "useQuerystring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseQuerystringUndefined: Self = StObject.set(x, "useQuerystring", js.undefined)
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
