package typings.requestretry.requestretryMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.httpMod.Agent
import typings.node.httpMod.AgentOptions
import typings.node.httpMod.IncomingMessage
import typings.request.requestMod.AWSOptions
import typings.request.requestMod.AuthOptions
import typings.request.requestMod.CookieJar
import typings.request.requestMod.CoreOptions
import typings.request.requestMod.HawkOptions
import typings.request.requestMod.Headers
import typings.request.requestMod.HttpArchiveRequest
import typings.request.requestMod.Multipart
import typings.request.requestMod.OAuthOptions
import typings.request.requestMod.RequestPart
import typings.request.requestMod.Response
import typings.request.requestNumbers.`4`
import typings.request.requestNumbers.`6`
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestRetryOptions extends CoreOptions {
  var fullResponse: js.UndefOr[Boolean] = js.undefined
  var maxAttempts: js.UndefOr[Double] = js.undefined
  var promiseFactory: js.UndefOr[js.Function1[/* resolver */ js.Any, _]] = js.undefined
  var retryDelay: js.UndefOr[Double] = js.undefined
  var retryStrategy: js.UndefOr[RetryStrategy] = js.undefined
}

object RequestRetryOptions {
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
    fullResponse: js.UndefOr[Boolean] = js.undefined,
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
    maxAttempts: Int | Double = null,
    maxRedirects: Int | Double = null,
    method: String = null,
    multipart: js.Array[RequestPart] | Multipart = null,
    oauth: OAuthOptions = null,
    passphrase: String = null,
    pool: js.Any = null,
    port: Int | Double = null,
    postambleCRLF: js.UndefOr[Boolean] = js.undefined,
    preambleCRLF: js.UndefOr[Boolean] = js.undefined,
    promiseFactory: /* resolver */ js.Any => _ = null,
    proxy: js.Any = null,
    qs: js.Any = null,
    qsParseOptions: js.Any = null,
    qsStringifyOptions: js.Any = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
    removeRefererHeader: js.UndefOr[Boolean] = js.undefined,
    retryDelay: Int | Double = null,
    retryStrategy: (/* err */ Error, /* response */ IncomingMessage, /* body */ js.Any) => Boolean = null,
    strictSSL: js.UndefOr[Boolean] = js.undefined,
    time: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    tunnel: js.UndefOr[Boolean] = js.undefined,
    useQuerystring: js.UndefOr[Boolean] = js.undefined,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): RequestRetryOptions = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (agentClass != null) __obj.updateDynamic("agentClass")(agentClass)
    if (agentOptions != null) __obj.updateDynamic("agentOptions")(agentOptions.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (aws != null) __obj.updateDynamic("aws")(aws)
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (body != null) __obj.updateDynamic("body")(body)
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction3(callback))
    if (cert != null) __obj.updateDynamic("cert")(cert)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (!js.isUndefined(followAllRedirects)) __obj.updateDynamic("followAllRedirects")(followAllRedirects)
    if (!js.isUndefined(followOriginalHttpMethod)) __obj.updateDynamic("followOriginalHttpMethod")(followOriginalHttpMethod)
    if (followRedirect != null) __obj.updateDynamic("followRedirect")(followRedirect.asInstanceOf[js.Any])
    if (forever != null) __obj.updateDynamic("forever")(forever)
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (formData != null) __obj.updateDynamic("formData")(formData)
    if (!js.isUndefined(fullResponse)) __obj.updateDynamic("fullResponse")(fullResponse)
    if (!js.isUndefined(gzip)) __obj.updateDynamic("gzip")(gzip)
    if (har != null) __obj.updateDynamic("har")(har)
    if (hawk != null) __obj.updateDynamic("hawk")(hawk)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (host != null) __obj.updateDynamic("host")(host)
    if (jar != null) __obj.updateDynamic("jar")(jar.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json)
    if (jsonReplacer != null) __obj.updateDynamic("jsonReplacer")(js.Any.fromFunction2(jsonReplacer))
    if (jsonReviver != null) __obj.updateDynamic("jsonReviver")(js.Any.fromFunction2(jsonReviver))
    if (key != null) __obj.updateDynamic("key")(key)
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress)
    if (maxAttempts != null) __obj.updateDynamic("maxAttempts")(maxAttempts.asInstanceOf[js.Any])
    if (maxRedirects != null) __obj.updateDynamic("maxRedirects")(maxRedirects.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (multipart != null) __obj.updateDynamic("multipart")(multipart.asInstanceOf[js.Any])
    if (oauth != null) __obj.updateDynamic("oauth")(oauth)
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase)
    if (pool != null) __obj.updateDynamic("pool")(pool)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(postambleCRLF)) __obj.updateDynamic("postambleCRLF")(postambleCRLF)
    if (!js.isUndefined(preambleCRLF)) __obj.updateDynamic("preambleCRLF")(preambleCRLF)
    if (promiseFactory != null) __obj.updateDynamic("promiseFactory")(js.Any.fromFunction1(promiseFactory))
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (qs != null) __obj.updateDynamic("qs")(qs)
    if (qsParseOptions != null) __obj.updateDynamic("qsParseOptions")(qsParseOptions)
    if (qsStringifyOptions != null) __obj.updateDynamic("qsStringifyOptions")(qsStringifyOptions)
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    if (!js.isUndefined(removeRefererHeader)) __obj.updateDynamic("removeRefererHeader")(removeRefererHeader)
    if (retryDelay != null) __obj.updateDynamic("retryDelay")(retryDelay.asInstanceOf[js.Any])
    if (retryStrategy != null) __obj.updateDynamic("retryStrategy")(js.Any.fromFunction3(retryStrategy))
    if (!js.isUndefined(strictSSL)) __obj.updateDynamic("strictSSL")(strictSSL)
    if (!js.isUndefined(time)) __obj.updateDynamic("time")(time)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(tunnel)) __obj.updateDynamic("tunnel")(tunnel)
    if (!js.isUndefined(useQuerystring)) __obj.updateDynamic("useQuerystring")(useQuerystring)
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials)
    __obj.asInstanceOf[RequestRetryOptions]
  }
}

