package typings.request.requestMod

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

trait CoreOptions extends js.Object {
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
  var jsonReplacer: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, _]] = js.undefined
  var jsonReviver: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, _]] = js.undefined
  var key: js.UndefOr[Buffer] = js.undefined
  var localAddress: js.UndefOr[String] = js.undefined
  var maxRedirects: js.UndefOr[Double] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var multipart: js.UndefOr[js.Array[RequestPart] | Multipart] = js.undefined
  var oauth: js.UndefOr[OAuthOptions] = js.undefined
  var passphrase: js.UndefOr[String] = js.undefined
  var pool: js.UndefOr[js.Any] = js.undefined
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
  @scala.inline
  def apply(
    agent: Agent | typings.node.httpsMod.Agent = null,
    agentClass: js.Any = null,
    agentOptions: AgentOptions | typings.node.httpsMod.AgentOptions = null,
    auth: AuthOptions = null,
    aws: AWSOptions = null,
    baseUrl: String = null,
    body: js.Any = null,
    ca: String | Buffer | (js.Array[Buffer | String]) = null,
    callback: (/* error */ js.Any, /* response */ Response, /* body */ js.Any) => Unit = null,
    cert: Buffer = null,
    encoding: String = null,
    family: `4` | `6` = null,
    followAllRedirects: js.UndefOr[Boolean] = js.undefined,
    followOriginalHttpMethod: js.UndefOr[Boolean] = js.undefined,
    followRedirect: Boolean | (js.Function1[/* response */ IncomingMessage, Boolean]) = null,
    forever: js.Any = null,
    form: StringDictionary[js.Any] | String = null,
    formData: StringDictionary[js.Any] = null,
    gzip: js.UndefOr[Boolean] = js.undefined,
    har: HttpArchiveRequest = null,
    hawk: HawkOptions = null,
    headers: Headers = null,
    host: String = null,
    jar: CookieJar | Boolean = null,
    json: js.Any = null,
    jsonReplacer: (/* key */ String, /* value */ js.Any) => _ = null,
    jsonReviver: (/* key */ String, /* value */ js.Any) => _ = null,
    key: Buffer = null,
    localAddress: String = null,
    maxRedirects: Int | Double = null,
    method: String = null,
    multipart: js.Array[RequestPart] | Multipart = null,
    oauth: OAuthOptions = null,
    passphrase: String = null,
    pool: js.Any = null,
    port: Int | Double = null,
    postambleCRLF: js.UndefOr[Boolean] = js.undefined,
    preambleCRLF: js.UndefOr[Boolean] = js.undefined,
    proxy: js.Any = null,
    qs: js.Any = null,
    qsParseOptions: js.Any = null,
    qsStringifyOptions: js.Any = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
    removeRefererHeader: js.UndefOr[Boolean] = js.undefined,
    strictSSL: js.UndefOr[Boolean] = js.undefined,
    time: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    tunnel: js.UndefOr[Boolean] = js.undefined,
    useQuerystring: js.UndefOr[Boolean] = js.undefined,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): CoreOptions = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (agentClass != null) __obj.updateDynamic("agentClass")(agentClass.asInstanceOf[js.Any])
    if (agentOptions != null) __obj.updateDynamic("agentOptions")(agentOptions.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (aws != null) __obj.updateDynamic("aws")(aws.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction3(callback))
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (!js.isUndefined(followAllRedirects)) __obj.updateDynamic("followAllRedirects")(followAllRedirects.asInstanceOf[js.Any])
    if (!js.isUndefined(followOriginalHttpMethod)) __obj.updateDynamic("followOriginalHttpMethod")(followOriginalHttpMethod.asInstanceOf[js.Any])
    if (followRedirect != null) __obj.updateDynamic("followRedirect")(followRedirect.asInstanceOf[js.Any])
    if (forever != null) __obj.updateDynamic("forever")(forever.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (formData != null) __obj.updateDynamic("formData")(formData.asInstanceOf[js.Any])
    if (!js.isUndefined(gzip)) __obj.updateDynamic("gzip")(gzip.asInstanceOf[js.Any])
    if (har != null) __obj.updateDynamic("har")(har.asInstanceOf[js.Any])
    if (hawk != null) __obj.updateDynamic("hawk")(hawk.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (jar != null) __obj.updateDynamic("jar")(jar.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (jsonReplacer != null) __obj.updateDynamic("jsonReplacer")(js.Any.fromFunction2(jsonReplacer))
    if (jsonReviver != null) __obj.updateDynamic("jsonReviver")(js.Any.fromFunction2(jsonReviver))
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress.asInstanceOf[js.Any])
    if (maxRedirects != null) __obj.updateDynamic("maxRedirects")(maxRedirects.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (multipart != null) __obj.updateDynamic("multipart")(multipart.asInstanceOf[js.Any])
    if (oauth != null) __obj.updateDynamic("oauth")(oauth.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase.asInstanceOf[js.Any])
    if (pool != null) __obj.updateDynamic("pool")(pool.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(postambleCRLF)) __obj.updateDynamic("postambleCRLF")(postambleCRLF.asInstanceOf[js.Any])
    if (!js.isUndefined(preambleCRLF)) __obj.updateDynamic("preambleCRLF")(preambleCRLF.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (qs != null) __obj.updateDynamic("qs")(qs.asInstanceOf[js.Any])
    if (qsParseOptions != null) __obj.updateDynamic("qsParseOptions")(qsParseOptions.asInstanceOf[js.Any])
    if (qsStringifyOptions != null) __obj.updateDynamic("qsStringifyOptions")(qsStringifyOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized.asInstanceOf[js.Any])
    if (!js.isUndefined(removeRefererHeader)) __obj.updateDynamic("removeRefererHeader")(removeRefererHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(strictSSL)) __obj.updateDynamic("strictSSL")(strictSSL.asInstanceOf[js.Any])
    if (!js.isUndefined(time)) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(tunnel)) __obj.updateDynamic("tunnel")(tunnel.asInstanceOf[js.Any])
    if (!js.isUndefined(useQuerystring)) __obj.updateDynamic("useQuerystring")(useQuerystring.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreOptions]
  }
}

