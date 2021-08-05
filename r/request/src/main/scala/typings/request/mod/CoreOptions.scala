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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreOptions extends StObject {
  
  var agent: js.UndefOr[Agent | typings.node.httpsMod.Agent] = js.undefined
  
  var agentClass: js.UndefOr[js.Any] = js.undefined
  
  var agentOptions: js.UndefOr[AgentOptions | typings.node.httpsMod.AgentOptions] = js.undefined
  
  var auth: js.UndefOr[AuthOptions] = js.undefined
  
  var aws: js.UndefOr[AWSOptions] = js.undefined
  
  var baseUrl: js.UndefOr[String] = js.undefined
  
  var body: js.UndefOr[js.Any] = js.undefined
  
  var ca: js.UndefOr[String | Buffer | (js.Array[Buffer | String])] = js.undefined
  
  var callback: js.UndefOr[RequestCallback] = js.undefined
  
  var cert: js.UndefOr[Buffer] = js.undefined
  
  var encoding: js.UndefOr[String | Null] = js.undefined
  
  var family: js.UndefOr[`4` | `6`] = js.undefined
  
  var followAllRedirects: js.UndefOr[Boolean] = js.undefined
  
  var followOriginalHttpMethod: js.UndefOr[Boolean] = js.undefined
  
  var followRedirect: js.UndefOr[Boolean | (js.Function1[/* response */ IncomingMessage, Boolean])] = js.undefined
  
  var forever: js.UndefOr[js.Any] = js.undefined
  
  var form: js.UndefOr[StringDictionary[js.Any] | String] = js.undefined
  
  var formData: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  var gzip: js.UndefOr[Boolean] = js.undefined
  
  var har: js.UndefOr[HttpArchiveRequest] = js.undefined
  
  var hawk: js.UndefOr[HawkOptions] = js.undefined
  
  var headers: js.UndefOr[Headers] = js.undefined
  
  var host: js.UndefOr[String] = js.undefined
  
  var jar: js.UndefOr[CookieJar | Boolean] = js.undefined
  
  var json: js.UndefOr[js.Any] = js.undefined
  
  var jsonReplacer: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, js.Any]] = js.undefined
  
  var jsonReviver: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, js.Any]] = js.undefined
  
  var key: js.UndefOr[Buffer] = js.undefined
  
  var localAddress: js.UndefOr[String] = js.undefined
  
  var maxRedirects: js.UndefOr[Double] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  var multipart: js.UndefOr[js.Array[RequestPart] | Multipart] = js.undefined
  
  var oauth: js.UndefOr[OAuthOptions] = js.undefined
  
  var passphrase: js.UndefOr[String] = js.undefined
  
  var pool: js.UndefOr[PoolOptions] = js.undefined
  
  var port: js.UndefOr[Double] = js.undefined
  
  var postambleCRLF: js.UndefOr[Boolean] = js.undefined
  
  var preambleCRLF: js.UndefOr[Boolean] = js.undefined
  
  var proxy: js.UndefOr[js.Any] = js.undefined
  
  var qs: js.UndefOr[js.Any] = js.undefined
  
  var qsParseOptions: js.UndefOr[js.Any] = js.undefined
  
  var qsStringifyOptions: js.UndefOr[js.Any] = js.undefined
  
  var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
  
  var removeRefererHeader: js.UndefOr[Boolean] = js.undefined
  
  var strictSSL: js.UndefOr[Boolean] = js.undefined
  
  var time: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var tunnel: js.UndefOr[Boolean] = js.undefined
  
  var useQuerystring: js.UndefOr[Boolean] = js.undefined
  
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}
object CoreOptions {
  
  inline def apply(): CoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoreOptions]
  }
  
  extension [Self <: CoreOptions](x: Self) {
    
    inline def setAgent(value: Agent | typings.node.httpsMod.Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    inline def setAgentClass(value: js.Any): Self = StObject.set(x, "agentClass", value.asInstanceOf[js.Any])
    
    inline def setAgentClassUndefined: Self = StObject.set(x, "agentClass", js.undefined)
    
    inline def setAgentOptions(value: AgentOptions | typings.node.httpsMod.AgentOptions): Self = StObject.set(x, "agentOptions", value.asInstanceOf[js.Any])
    
    inline def setAgentOptionsUndefined: Self = StObject.set(x, "agentOptions", js.undefined)
    
    inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
    
    inline def setAuth(value: AuthOptions): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setAws(value: AWSOptions): Self = StObject.set(x, "aws", value.asInstanceOf[js.Any])
    
    inline def setAwsUndefined: Self = StObject.set(x, "aws", js.undefined)
    
    inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
    
    inline def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setCa(value: String | Buffer | (js.Array[Buffer | String])): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
    
    inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
    
    inline def setCaVarargs(value: (Buffer | String)*): Self = StObject.set(x, "ca", js.Array(value :_*))
    
    inline def setCallback(value: (/* error */ js.Any, /* response */ Response, /* body */ js.Any) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction3(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setCert(value: Buffer): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
    
    inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setFamily(value: `4` | `6`): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
    
    inline def setFollowAllRedirects(value: Boolean): Self = StObject.set(x, "followAllRedirects", value.asInstanceOf[js.Any])
    
    inline def setFollowAllRedirectsUndefined: Self = StObject.set(x, "followAllRedirects", js.undefined)
    
    inline def setFollowOriginalHttpMethod(value: Boolean): Self = StObject.set(x, "followOriginalHttpMethod", value.asInstanceOf[js.Any])
    
    inline def setFollowOriginalHttpMethodUndefined: Self = StObject.set(x, "followOriginalHttpMethod", js.undefined)
    
    inline def setFollowRedirect(value: Boolean | (js.Function1[/* response */ IncomingMessage, Boolean])): Self = StObject.set(x, "followRedirect", value.asInstanceOf[js.Any])
    
    inline def setFollowRedirectFunction1(value: /* response */ IncomingMessage => Boolean): Self = StObject.set(x, "followRedirect", js.Any.fromFunction1(value))
    
    inline def setFollowRedirectUndefined: Self = StObject.set(x, "followRedirect", js.undefined)
    
    inline def setForever(value: js.Any): Self = StObject.set(x, "forever", value.asInstanceOf[js.Any])
    
    inline def setForeverUndefined: Self = StObject.set(x, "forever", js.undefined)
    
    inline def setForm(value: StringDictionary[js.Any] | String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormData(value: StringDictionary[js.Any]): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    inline def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setGzip(value: Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
    
    inline def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
    
    inline def setHar(value: HttpArchiveRequest): Self = StObject.set(x, "har", value.asInstanceOf[js.Any])
    
    inline def setHarUndefined: Self = StObject.set(x, "har", js.undefined)
    
    inline def setHawk(value: HawkOptions): Self = StObject.set(x, "hawk", value.asInstanceOf[js.Any])
    
    inline def setHawkUndefined: Self = StObject.set(x, "hawk", js.undefined)
    
    inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setJar(value: CookieJar | Boolean): Self = StObject.set(x, "jar", value.asInstanceOf[js.Any])
    
    inline def setJarUndefined: Self = StObject.set(x, "jar", js.undefined)
    
    inline def setJson(value: js.Any): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setJsonReplacer(value: (/* key */ String, /* value */ js.Any) => js.Any): Self = StObject.set(x, "jsonReplacer", js.Any.fromFunction2(value))
    
    inline def setJsonReplacerUndefined: Self = StObject.set(x, "jsonReplacer", js.undefined)
    
    inline def setJsonReviver(value: (/* key */ String, /* value */ js.Any) => js.Any): Self = StObject.set(x, "jsonReviver", js.Any.fromFunction2(value))
    
    inline def setJsonReviverUndefined: Self = StObject.set(x, "jsonReviver", js.undefined)
    
    inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    
    inline def setKey(value: Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
    
    inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
    
    inline def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
    
    inline def setMaxRedirectsUndefined: Self = StObject.set(x, "maxRedirects", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setMultipart(value: js.Array[RequestPart] | Multipart): Self = StObject.set(x, "multipart", value.asInstanceOf[js.Any])
    
    inline def setMultipartUndefined: Self = StObject.set(x, "multipart", js.undefined)
    
    inline def setMultipartVarargs(value: RequestPart*): Self = StObject.set(x, "multipart", js.Array(value :_*))
    
    inline def setOauth(value: OAuthOptions): Self = StObject.set(x, "oauth", value.asInstanceOf[js.Any])
    
    inline def setOauthUndefined: Self = StObject.set(x, "oauth", js.undefined)
    
    inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
    
    inline def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
    
    inline def setPool(value: PoolOptions): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
    
    inline def setPoolUndefined: Self = StObject.set(x, "pool", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setPostambleCRLF(value: Boolean): Self = StObject.set(x, "postambleCRLF", value.asInstanceOf[js.Any])
    
    inline def setPostambleCRLFUndefined: Self = StObject.set(x, "postambleCRLF", js.undefined)
    
    inline def setPreambleCRLF(value: Boolean): Self = StObject.set(x, "preambleCRLF", value.asInstanceOf[js.Any])
    
    inline def setPreambleCRLFUndefined: Self = StObject.set(x, "preambleCRLF", js.undefined)
    
    inline def setProxy(value: js.Any): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    inline def setQs(value: js.Any): Self = StObject.set(x, "qs", value.asInstanceOf[js.Any])
    
    inline def setQsParseOptions(value: js.Any): Self = StObject.set(x, "qsParseOptions", value.asInstanceOf[js.Any])
    
    inline def setQsParseOptionsUndefined: Self = StObject.set(x, "qsParseOptions", js.undefined)
    
    inline def setQsStringifyOptions(value: js.Any): Self = StObject.set(x, "qsStringifyOptions", value.asInstanceOf[js.Any])
    
    inline def setQsStringifyOptionsUndefined: Self = StObject.set(x, "qsStringifyOptions", js.undefined)
    
    inline def setQsUndefined: Self = StObject.set(x, "qs", js.undefined)
    
    inline def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
    
    inline def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
    
    inline def setRemoveRefererHeader(value: Boolean): Self = StObject.set(x, "removeRefererHeader", value.asInstanceOf[js.Any])
    
    inline def setRemoveRefererHeaderUndefined: Self = StObject.set(x, "removeRefererHeader", js.undefined)
    
    inline def setStrictSSL(value: Boolean): Self = StObject.set(x, "strictSSL", value.asInstanceOf[js.Any])
    
    inline def setStrictSSLUndefined: Self = StObject.set(x, "strictSSL", js.undefined)
    
    inline def setTime(value: Boolean): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTunnel(value: Boolean): Self = StObject.set(x, "tunnel", value.asInstanceOf[js.Any])
    
    inline def setTunnelUndefined: Self = StObject.set(x, "tunnel", js.undefined)
    
    inline def setUseQuerystring(value: Boolean): Self = StObject.set(x, "useQuerystring", value.asInstanceOf[js.Any])
    
    inline def setUseQuerystringUndefined: Self = StObject.set(x, "useQuerystring", js.undefined)
    
    inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
