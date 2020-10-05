package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestInit extends js.Object {
  /**
    * A BodyInit object or null to set request's body.
    */
  var body: js.UndefOr[BodyInit | Null] = js.native
  /**
    * A string indicating how the request will interact with the browser's cache to set request's cache.
    */
  var cache: js.UndefOr[RequestCache] = js.native
  /**
    * A string indicating whether credentials will be sent with the request always, never, or only when sent to a same-origin URL. Sets request's credentials.
    */
  var credentials: js.UndefOr[RequestCredentials] = js.native
  /**
    * A Headers object, an object literal, or an array of two-item arrays to set request's headers.
    */
  var headers: js.UndefOr[HeadersInit] = js.native
  /**
    * A cryptographic hash of the resource to be fetched by request. Sets request's integrity.
    */
  var integrity: js.UndefOr[java.lang.String] = js.native
  /**
    * A boolean to set request's keepalive.
    */
  var keepalive: js.UndefOr[scala.Boolean] = js.native
  /**
    * A string to set request's method.
    */
  var method: js.UndefOr[java.lang.String] = js.native
  /**
    * A string to indicate whether the request will use CORS, or will be restricted to same-origin URLs. Sets request's mode.
    */
  var mode: js.UndefOr[RequestMode] = js.native
  /**
    * A string indicating whether request follows redirects, results in an error upon encountering a redirect, or returns the redirect (in an opaque fashion). Sets request's redirect.
    */
  var redirect: js.UndefOr[RequestRedirect] = js.native
  /**
    * A string whose value is a same-origin URL, "about:client", or the empty string, to set request's referrer.
    */
  var referrer: js.UndefOr[java.lang.String] = js.native
  /**
    * A referrer policy to set request's referrerPolicy.
    */
  var referrerPolicy: js.UndefOr[ReferrerPolicy] = js.native
  /**
    * An AbortSignal to set request's signal.
    */
  var signal: js.UndefOr[AbortSignal | Null] = js.native
  /**
    * Can only be null. Used to disassociate request from any Window.
    */
  var window: js.UndefOr[js.Any] = js.native
}

object RequestInit {
  @scala.inline
  def apply(): RequestInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestInit]
  }
  @scala.inline
  implicit class RequestInitOps[Self <: RequestInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBody(value: BodyInit): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setBodyNull: Self = this.set("body", null)
    @scala.inline
    def setCache(value: RequestCache): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setCredentials(value: RequestCredentials): Self = this.set("credentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredentials: Self = this.set("credentials", js.undefined)
    @scala.inline
    def setHeadersVarargs(value: js.Array[java.lang.String]*): Self = this.set("headers", js.Array(value :_*))
    @scala.inline
    def setHeaders(value: HeadersInit): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setIntegrity(value: java.lang.String): Self = this.set("integrity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntegrity: Self = this.set("integrity", js.undefined)
    @scala.inline
    def setKeepalive(value: scala.Boolean): Self = this.set("keepalive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepalive: Self = this.set("keepalive", js.undefined)
    @scala.inline
    def setMethod(value: java.lang.String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setMode(value: RequestMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setRedirect(value: RequestRedirect): Self = this.set("redirect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirect: Self = this.set("redirect", js.undefined)
    @scala.inline
    def setReferrer(value: java.lang.String): Self = this.set("referrer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferrer: Self = this.set("referrer", js.undefined)
    @scala.inline
    def setReferrerPolicy(value: ReferrerPolicy): Self = this.set("referrerPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferrerPolicy: Self = this.set("referrerPolicy", js.undefined)
    @scala.inline
    def setSignal(value: AbortSignal): Self = this.set("signal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
    @scala.inline
    def setSignalNull: Self = this.set("signal", null)
    @scala.inline
    def setWindow(value: js.Any): Self = this.set("window", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindow: Self = this.set("window", js.undefined)
  }
  
}

