package typings
package requestLib.requestMod.requestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CoreOptions extends js.Object {
  var agent: js.UndefOr[nodeLib.httpMod.Agent | nodeLib.httpsMod.Agent] = js.undefined
  var agentClass: js.UndefOr[js.Any] = js.undefined
  var agentOptions: js.UndefOr[nodeLib.httpMod.AgentOptions | nodeLib.httpsMod.AgentOptions] = js.undefined
  var auth: js.UndefOr[AuthOptions] = js.undefined
  var aws: js.UndefOr[AWSOptions] = js.undefined
  var baseUrl: js.UndefOr[java.lang.String] = js.undefined
  var body: js.UndefOr[js.Any] = js.undefined
  var ca: js.UndefOr[
    java.lang.String | nodeLib.Buffer | js.Array[java.lang.String] | js.Array[nodeLib.Buffer]
  ] = js.undefined
  var callback: js.UndefOr[RequestCallback] = js.undefined
  var cert: js.UndefOr[nodeLib.Buffer] = js.undefined
  var encoding: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var family: js.UndefOr[requestLib.requestLibNumbers.`4` | requestLib.requestLibNumbers.`6`] = js.undefined
  var followAllRedirects: js.UndefOr[scala.Boolean] = js.undefined
  var followOriginalHttpMethod: js.UndefOr[scala.Boolean] = js.undefined
  var followRedirect: js.UndefOr[
    scala.Boolean | (js.Function1[/* response */ nodeLib.httpMod.IncomingMessage, scala.Boolean])
  ] = js.undefined
  var forever: js.UndefOr[js.Any] = js.undefined
  var form: js.UndefOr[ScalablyTyped.runtime.StringDictionary[js.Any] | java.lang.String] = js.undefined
  var formData: js.UndefOr[ScalablyTyped.runtime.StringDictionary[js.Any]] = js.undefined
  var gzip: js.UndefOr[scala.Boolean] = js.undefined
  var har: js.UndefOr[HttpArchiveRequest] = js.undefined
  var hawk: js.UndefOr[HawkOptions] = js.undefined
  var headers: js.UndefOr[Headers] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var jar: js.UndefOr[CookieJar | scala.Boolean] = js.undefined
  var json: js.UndefOr[js.Any] = js.undefined
  var jsonReplacer: js.UndefOr[js.Function2[/* key */ java.lang.String, /* value */ js.Any, _]] = js.undefined
  var jsonReviver: js.UndefOr[js.Function2[/* key */ java.lang.String, /* value */ js.Any, _]] = js.undefined
  var key: js.UndefOr[nodeLib.Buffer] = js.undefined
  var localAddress: js.UndefOr[java.lang.String] = js.undefined
  var maxRedirects: js.UndefOr[scala.Double] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var multipart: js.UndefOr[js.Array[RequestPart] | Multipart] = js.undefined
  var oauth: js.UndefOr[OAuthOptions] = js.undefined
  var passphrase: js.UndefOr[java.lang.String] = js.undefined
  var pool: js.UndefOr[js.Any] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var postambleCRLF: js.UndefOr[scala.Boolean] = js.undefined
  var preambleCRLF: js.UndefOr[scala.Boolean] = js.undefined
  var proxy: js.UndefOr[js.Any] = js.undefined
  var qs: js.UndefOr[js.Any] = js.undefined
  var qsParseOptions: js.UndefOr[js.Any] = js.undefined
  var qsStringifyOptions: js.UndefOr[js.Any] = js.undefined
  var rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined
  var removeRefererHeader: js.UndefOr[scala.Boolean] = js.undefined
  var strictSSL: js.UndefOr[scala.Boolean] = js.undefined
  var time: js.UndefOr[scala.Boolean] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var tunnel: js.UndefOr[scala.Boolean] = js.undefined
  var useQuerystring: js.UndefOr[scala.Boolean] = js.undefined
  var withCredentials: js.UndefOr[scala.Boolean] = js.undefined
}

