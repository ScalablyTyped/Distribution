package typings
package sipDotJsLib.sipDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ConfigurationParameters extends js.Object {
  var allowLegacyNotifications: js.UndefOr[scala.Boolean] = js.undefined
  var authenticationFactory: js.UndefOr[sipDotJsLib.sipDotJsMod.WebRTCNs.MediaHandlerFactory] = js.undefined
  var authorizationUser: js.UndefOr[java.lang.String] = js.undefined
  var autostart: js.UndefOr[scala.Boolean] = js.undefined
  var autostop: js.UndefOr[scala.Boolean] = js.undefined
  var connectionRecoveryMaxInterval: js.UndefOr[scala.Double] = js.undefined
  var connectionRecoveryMinInterval: js.UndefOr[scala.Double] = js.undefined
  var contactTransport: js.UndefOr[java.lang.String] = js.undefined
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  var extraSupported: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var forceRport: js.UndefOr[scala.Boolean] = js.undefined
  var hackAllowUnregisteredOptionTags: js.UndefOr[scala.Boolean] = js.undefined
  var hackCleanJitsiSdpImageattr: js.UndefOr[scala.Boolean] = js.undefined
  var hackIpInContact: js.UndefOr[scala.Boolean] = js.undefined
  var hackStripTcp: js.UndefOr[scala.Boolean] = js.undefined
  var hackViaTcp: js.UndefOr[scala.Boolean] = js.undefined
  var hackWssInTransport: js.UndefOr[scala.Boolean] = js.undefined
  var iceCheckingTimeout: js.UndefOr[scala.Double] = js.undefined
  var instanceId: js.UndefOr[java.lang.String] = js.undefined
  var keepAliveInterval: js.UndefOr[scala.Double] = js.undefined
  var log: js.UndefOr[sipDotJsLib.Anon_BuiltinEnabled] = js.undefined
  var mediaHandlerFactory: js.UndefOr[sipDotJsLib.sipDotJsMod.WebRTCNs.MediaHandlerFactory] = js.undefined
  var noAnswerTimeout: js.UndefOr[scala.Double] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var register: js.UndefOr[scala.Boolean] = js.undefined
  var registerExpires: js.UndefOr[scala.Double] = js.undefined
  var registrarServer: js.UndefOr[java.lang.String] = js.undefined
  var rel100: js.UndefOr[java.lang.String] = js.undefined
  var replaces: js.UndefOr[java.lang.String] = js.undefined
  var rtcpMuxPolicy: js.UndefOr[java.lang.String] = js.undefined
  var stunServers: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var traceSip: js.UndefOr[scala.Boolean] = js.undefined
  var turnServers: js.UndefOr[TurnServer | js.Array[TurnServer]] = js.undefined
  var uri: js.UndefOr[java.lang.String] = js.undefined
  var usePreloadedRoute: js.UndefOr[scala.Boolean] = js.undefined
  var userAgentString: js.UndefOr[java.lang.String] = js.undefined
  var wsServerMaxReconnection: js.UndefOr[scala.Double] = js.undefined
  var wsServerReconnectionTimeout: js.UndefOr[scala.Double] = js.undefined
  var wsServers: js.UndefOr[java.lang.String | (js.Array[java.lang.String | sipDotJsLib.Anon_Wsuri])] = js.undefined
}

