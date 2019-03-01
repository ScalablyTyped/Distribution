package typings
package requestDashPromiseLib.requestDashPromiseMod.requestPromiseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestPromiseOptions
  extends requestLib.requestMod.requestNs.CoreOptions {
  var resolveWithFullResponse: js.UndefOr[scala.Boolean] = js.undefined
  var simple: js.UndefOr[scala.Boolean] = js.undefined
  var transform: js.UndefOr[
    js.Function3[
      /* body */ js.Any, 
      /* response */ requestLib.requestMod.requestNs.Response, 
      /* resolveWithFullResponse */ js.UndefOr[scala.Boolean], 
      _
    ]
  ] = js.undefined
  var transform2xxOnly: js.UndefOr[scala.Boolean] = js.undefined
}

object RequestPromiseOptions {
  @scala.inline
  def apply(
    agent: nodeLib.httpMod.Agent | nodeLib.httpsMod.Agent = null,
    agentClass: js.Any = null,
    agentOptions: nodeLib.httpMod.AgentOptions | nodeLib.httpsMod.AgentOptions = null,
    auth: requestLib.requestMod.requestNs.AuthOptions = null,
    aws: requestLib.requestMod.requestNs.AWSOptions = null,
    baseUrl: java.lang.String = null,
    body: js.Any = null,
    ca: java.lang.String | nodeLib.Buffer | js.Array[java.lang.String] | js.Array[nodeLib.Buffer] = null,
    callback: requestLib.requestMod.requestNs.RequestCallback = null,
    cert: nodeLib.Buffer = null,
    encoding: java.lang.String = null,
    family: requestLib.requestLibNumbers.`4` | requestLib.requestLibNumbers.`6` = null,
    followAllRedirects: js.UndefOr[scala.Boolean] = js.undefined,
    followOriginalHttpMethod: js.UndefOr[scala.Boolean] = js.undefined,
    followRedirect: scala.Boolean | (js.Function1[/* response */ nodeLib.httpMod.IncomingMessage, scala.Boolean]) = null,
    forever: js.Any = null,
    form: org.scalablytyped.runtime.StringDictionary[js.Any] | java.lang.String = null,
    formData: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    gzip: js.UndefOr[scala.Boolean] = js.undefined,
    har: requestLib.requestMod.requestNs.HttpArchiveRequest = null,
    hawk: requestLib.requestMod.requestNs.HawkOptions = null,
    headers: requestLib.requestMod.requestNs.Headers = null,
    host: java.lang.String = null,
    jar: requestLib.requestMod.requestNs.CookieJar | scala.Boolean = null,
    json: js.Any = null,
    jsonReplacer: js.Function2[/* key */ java.lang.String, /* value */ js.Any, _] = null,
    jsonReviver: js.Function2[/* key */ java.lang.String, /* value */ js.Any, _] = null,
    key: nodeLib.Buffer = null,
    localAddress: java.lang.String = null,
    maxRedirects: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    multipart: js.Array[requestLib.requestMod.requestNs.RequestPart] | requestLib.requestMod.requestNs.Multipart = null,
    oauth: requestLib.requestMod.requestNs.OAuthOptions = null,
    passphrase: java.lang.String = null,
    pool: js.Any = null,
    port: scala.Int | scala.Double = null,
    postambleCRLF: js.UndefOr[scala.Boolean] = js.undefined,
    preambleCRLF: js.UndefOr[scala.Boolean] = js.undefined,
    proxy: js.Any = null,
    qs: js.Any = null,
    qsParseOptions: js.Any = null,
    qsStringifyOptions: js.Any = null,
    rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined,
    removeRefererHeader: js.UndefOr[scala.Boolean] = js.undefined,
    resolveWithFullResponse: js.UndefOr[scala.Boolean] = js.undefined,
    simple: js.UndefOr[scala.Boolean] = js.undefined,
    strictSSL: js.UndefOr[scala.Boolean] = js.undefined,
    time: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null,
    transform: js.Function3[
      /* body */ js.Any, 
      /* response */ requestLib.requestMod.requestNs.Response, 
      /* resolveWithFullResponse */ js.UndefOr[scala.Boolean], 
      _
    ] = null,
    transform2xxOnly: js.UndefOr[scala.Boolean] = js.undefined,
    tunnel: js.UndefOr[scala.Boolean] = js.undefined,
    useQuerystring: js.UndefOr[scala.Boolean] = js.undefined,
    withCredentials: js.UndefOr[scala.Boolean] = js.undefined
  ): RequestPromiseOptions = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (agentClass != null) __obj.updateDynamic("agentClass")(agentClass)
    if (agentOptions != null) __obj.updateDynamic("agentOptions")(agentOptions.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (aws != null) __obj.updateDynamic("aws")(aws)
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (body != null) __obj.updateDynamic("body")(body)
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (cert != null) __obj.updateDynamic("cert")(cert)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (!js.isUndefined(followAllRedirects)) __obj.updateDynamic("followAllRedirects")(followAllRedirects)
    if (!js.isUndefined(followOriginalHttpMethod)) __obj.updateDynamic("followOriginalHttpMethod")(followOriginalHttpMethod)
    if (followRedirect != null) __obj.updateDynamic("followRedirect")(followRedirect.asInstanceOf[js.Any])
    if (forever != null) __obj.updateDynamic("forever")(forever)
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (formData != null) __obj.updateDynamic("formData")(formData)
    if (!js.isUndefined(gzip)) __obj.updateDynamic("gzip")(gzip)
    if (har != null) __obj.updateDynamic("har")(har)
    if (hawk != null) __obj.updateDynamic("hawk")(hawk)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (host != null) __obj.updateDynamic("host")(host)
    if (jar != null) __obj.updateDynamic("jar")(jar.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json)
    if (jsonReplacer != null) __obj.updateDynamic("jsonReplacer")(jsonReplacer)
    if (jsonReviver != null) __obj.updateDynamic("jsonReviver")(jsonReviver)
    if (key != null) __obj.updateDynamic("key")(key)
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress)
    if (maxRedirects != null) __obj.updateDynamic("maxRedirects")(maxRedirects.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (multipart != null) __obj.updateDynamic("multipart")(multipart.asInstanceOf[js.Any])
    if (oauth != null) __obj.updateDynamic("oauth")(oauth)
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase)
    if (pool != null) __obj.updateDynamic("pool")(pool)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(postambleCRLF)) __obj.updateDynamic("postambleCRLF")(postambleCRLF)
    if (!js.isUndefined(preambleCRLF)) __obj.updateDynamic("preambleCRLF")(preambleCRLF)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (qs != null) __obj.updateDynamic("qs")(qs)
    if (qsParseOptions != null) __obj.updateDynamic("qsParseOptions")(qsParseOptions)
    if (qsStringifyOptions != null) __obj.updateDynamic("qsStringifyOptions")(qsStringifyOptions)
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    if (!js.isUndefined(removeRefererHeader)) __obj.updateDynamic("removeRefererHeader")(removeRefererHeader)
    if (!js.isUndefined(resolveWithFullResponse)) __obj.updateDynamic("resolveWithFullResponse")(resolveWithFullResponse)
    if (!js.isUndefined(simple)) __obj.updateDynamic("simple")(simple)
    if (!js.isUndefined(strictSSL)) __obj.updateDynamic("strictSSL")(strictSSL)
    if (!js.isUndefined(time)) __obj.updateDynamic("time")(time)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (!js.isUndefined(transform2xxOnly)) __obj.updateDynamic("transform2xxOnly")(transform2xxOnly)
    if (!js.isUndefined(tunnel)) __obj.updateDynamic("tunnel")(tunnel)
    if (!js.isUndefined(useQuerystring)) __obj.updateDynamic("useQuerystring")(useQuerystring)
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials)
    __obj.asInstanceOf[RequestPromiseOptions]
  }
}

