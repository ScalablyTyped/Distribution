package typings
package sipDotJsLib.libCoreUserDashAgentDashCoreUserDashAgentDashCoreDashConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserAgentCoreConfiguration extends js.Object {
  /**
    * Address-of-Record (AOR).
    * @remarks
    * https://tools.ietf.org/html/rfc3261#section-6
    */
  var aor: sipDotJsLib.libCoreMessagesMod.URI
  /**
    * Contact.
    * @remarks
    * https://tools.ietf.org/html/rfc3261#section-8.1.1.8
    */
  var contact: Contact
  /**
    * From header display name.
    */
  var displayName: java.lang.String
  /**
    * Force Via header field transport to TCP.
    */
  var hackViaTcp: scala.Boolean
  /**
    * Logger factory.
    */
  var loggerFactory: sipDotJsLib.libCoreLogMod.LoggerFactory
  /**
    * Preloaded route set.
    */
  var routeSet: js.Array[java.lang.String]
  /**
    * Unique instance id.
    */
  var sipjsId: java.lang.String
  /**
    * Option tags of supported SIP extenstions.
    */
  var supportedOptionTags: js.Array[java.lang.String]
  /**
    * Option tags of supported SIP extenstions.
    * Used in resposnes.
    * @remarks
    * FIXME: Make this go away.
    */
  var supportedOptionTagsResponse: js.Array[java.lang.String]
  /**
    * User-Agent header field value.
    * @remarks
    * https://tools.ietf.org/html/rfc3261#section-20.41
    */
  var userAgentHeaderFieldValue: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Force use of "rport" Via header field parameter.
    * @remarks
    * https://www.ietf.org/rfc/rfc3581.txt
    */
  var viaForceRport: scala.Boolean
  /**
    * Via header field host name or network address.
    * @remarks
    * The Via header field indicates the path taken by the request so far
    * and indicates the path that should be followed in routing responses.
    */
  var viaHost: java.lang.String
  /**
    * DEPRECATED
    * Authentication factory function.
    */
  def authenticationFactory(): js.UndefOr[sipDotJsLib.libCoreMessagesMod.DigestAuthentication]
  /**
    * DEPRECATED: This is a hack to get around `Transport`
    * requiring the `UA` to start for construction.
    */
  def transportAccessor(): js.UndefOr[sipDotJsLib.libCoreTransportMod.Transport]
}

object UserAgentCoreConfiguration {
  @scala.inline
  def apply(
    aor: sipDotJsLib.libCoreMessagesMod.URI,
    authenticationFactory: () => js.UndefOr[sipDotJsLib.libCoreMessagesMod.DigestAuthentication],
    contact: Contact,
    displayName: java.lang.String,
    hackViaTcp: scala.Boolean,
    loggerFactory: sipDotJsLib.libCoreLogMod.LoggerFactory,
    routeSet: js.Array[java.lang.String],
    sipjsId: java.lang.String,
    supportedOptionTags: js.Array[java.lang.String],
    supportedOptionTagsResponse: js.Array[java.lang.String],
    transportAccessor: () => js.UndefOr[sipDotJsLib.libCoreTransportMod.Transport],
    viaForceRport: scala.Boolean,
    viaHost: java.lang.String,
    userAgentHeaderFieldValue: java.lang.String = null
  ): UserAgentCoreConfiguration = {
    val __obj = js.Dynamic.literal(aor = aor, authenticationFactory = js.Any.fromFunction0(authenticationFactory), contact = contact, displayName = displayName, hackViaTcp = hackViaTcp, loggerFactory = loggerFactory, routeSet = routeSet, sipjsId = sipjsId, supportedOptionTags = supportedOptionTags, supportedOptionTagsResponse = supportedOptionTagsResponse, transportAccessor = js.Any.fromFunction0(transportAccessor), viaForceRport = viaForceRport, viaHost = viaHost)
    if (userAgentHeaderFieldValue != null) __obj.updateDynamic("userAgentHeaderFieldValue")(userAgentHeaderFieldValue)
    __obj.asInstanceOf[UserAgentCoreConfiguration]
  }
}

