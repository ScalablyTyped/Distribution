package typings
package sipDotJsLib.libCoreUserDashAgentDashCoreUserDashAgentDashCoreDashConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserAgentCoreConfiguration extends js.Object {
  /**
    * Address-of-Record (AOR).
    * https://tools.ietf.org/html/rfc3261#section-6
    */
  var aor: sipDotJsLib.libURIMod.URI = js.native
  /**
    * Contact.
    * https://tools.ietf.org/html/rfc3261#section-8.1.1.8
    */
  var contact: Contact = js.native
  /**
    * Logger factory.
    */
  var loggerFactory: sipDotJsLib.libLoggerFactoryMod.LoggerFactory = js.native
  /**
    * User-Agent header field value.
    * https://tools.ietf.org/html/rfc3261#section-20.41
    */
  var userAgentHeaderFieldValue: js.UndefOr[java.lang.String] = js.native
  /**
    * DEPRECATED
    * Authentication factory function.
    */
  def authenticationFactory(): js.UndefOr[sipDotJsLib.libDigestAuthenticationMod.DigestAuthentication] = js.native
  /**
    * DEPRECATED: This is a hack to get around `IncomingResponseMessage`
    * requiring a `UA` for construction. Hopefully that will go away soon.
    * Meanwhile, this method is here to avoid leaking `UA` further than it
    * needs to be. Please remove this when no longer needed here.
    *
    * Returns a "fake" 408 (Request Timeout) response.
    */
  def onRequestTimeoutResponseMessageFactory(): sipDotJsLib.libSIPMessageMod.IncomingResponse = js.native
  /**
    * DEPRECATED: This is a hack to get around `IncomingResponseMessage`
    * requiring a `UA` for construction. Hopefully that will go away soon.
    * Meanwhile, this method is here to avoid leaking `UA` further than it
    * needs to be. Please remove this when no longer needed here.
    *
    * Returns a "fake" 503 (Service Unavailable) response.
    */
  def onTransportErrorResponseMessageFactory(): sipDotJsLib.libSIPMessageMod.IncomingResponse = js.native
  /**
    * DEPRECATED: This is a hack to get around `OutgoingRequestMessage`
    * requiring a `UA` for construction. Hopefully that will go away soon.
    * Meanwhile, this method is here to avoid leaking `UA` further than it
    * needs to be. Please remove this when no longer needed here.
    * It's simply a cover function for OutgoingRequestMessage constructor
    *
    * Outgoing request message factory function.
    * @param method Method.
    * @param ruri Request-URI.
    * @param params Various parameters.
    * @param extraHeaders Extra headers to add.
    * @param body Message body.
    */
  def outgoingRequestMessageFactory(method: java.lang.String, ruri: java.lang.String, params: sipDotJsLib.Anon_CallId): sipDotJsLib.libSIPMessageMod.OutgoingRequest = js.native
  def outgoingRequestMessageFactory(
    method: java.lang.String,
    ruri: java.lang.String,
    params: sipDotJsLib.Anon_CallId,
    extraHeaders: js.Array[java.lang.String]
  ): sipDotJsLib.libSIPMessageMod.OutgoingRequest = js.native
  def outgoingRequestMessageFactory(
    method: java.lang.String,
    ruri: java.lang.String,
    params: sipDotJsLib.Anon_CallId,
    extraHeaders: js.Array[java.lang.String],
    body: java.lang.String
  ): sipDotJsLib.libSIPMessageMod.OutgoingRequest = js.native
  def outgoingRequestMessageFactory(
    method: java.lang.String,
    ruri: java.lang.String,
    params: sipDotJsLib.Anon_CallId,
    extraHeaders: js.Array[java.lang.String],
    body: sipDotJsLib.Anon_BodyContentType
  ): sipDotJsLib.libSIPMessageMod.OutgoingRequest = js.native
  def outgoingRequestMessageFactory(method: java.lang.String, ruri: sipDotJsLib.libURIMod.URI, params: sipDotJsLib.Anon_CallId): sipDotJsLib.libSIPMessageMod.OutgoingRequest = js.native
  def outgoingRequestMessageFactory(
    method: java.lang.String,
    ruri: sipDotJsLib.libURIMod.URI,
    params: sipDotJsLib.Anon_CallId,
    extraHeaders: js.Array[java.lang.String]
  ): sipDotJsLib.libSIPMessageMod.OutgoingRequest = js.native
  def outgoingRequestMessageFactory(
    method: java.lang.String,
    ruri: sipDotJsLib.libURIMod.URI,
    params: sipDotJsLib.Anon_CallId,
    extraHeaders: js.Array[java.lang.String],
    body: java.lang.String
  ): sipDotJsLib.libSIPMessageMod.OutgoingRequest = js.native
  def outgoingRequestMessageFactory(
    method: java.lang.String,
    ruri: sipDotJsLib.libURIMod.URI,
    params: sipDotJsLib.Anon_CallId,
    extraHeaders: js.Array[java.lang.String],
    body: sipDotJsLib.Anon_BodyContentType
  ): sipDotJsLib.libSIPMessageMod.OutgoingRequest = js.native
  /**
    * DEPRECATED: This is a hack to get around `Transport`
    * requiring the `UA` to start for construction.
    */
  def transportAccessor(): js.UndefOr[sipDotJsLib.libTransportMod.Transport] = js.native
}

