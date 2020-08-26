package typings.sipJs.anon

import org.scalablytyped.runtime.Instantiable2
import typings.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandler
import typings.sipJs.coreMod.Logger
import typings.sipJs.coreMod.URI
import typings.sipJs.sessionDescriptionHandlerFactoryMod.SessionDescriptionHandlerFactory
import typings.sipJs.sessionMod.Session
import typings.sipJs.transportMod.Transport
import typings.sipJs.userAgentDelegateMod.UserAgentDelegate
import typings.sipJs.userAgentOptionsMod.LogConnector
import typings.sipJs.userAgentOptionsMod.LogLevel
import typings.sipJs.userAgentOptionsMod.SIPExtension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<sip.js.sip.js/lib/api/user-agent-options.UserAgentOptions> */
@js.native
trait PartialUserAgentOptions extends js.Object {
  var allowLegacyNotifications: js.UndefOr[Boolean] = js.native
  var authorizationHa1: js.UndefOr[String] = js.native
  var authorizationPassword: js.UndefOr[String] = js.native
  var authorizationUsername: js.UndefOr[String] = js.native
  var autoStart: js.UndefOr[Boolean] = js.native
  var autoStop: js.UndefOr[Boolean] = js.native
  var delegate: js.UndefOr[UserAgentDelegate] = js.native
  var displayName: js.UndefOr[String] = js.native
  var forceRport: js.UndefOr[Boolean] = js.native
  var hackAllowUnregisteredOptionTags: js.UndefOr[Boolean] = js.native
  var hackIpInContact: js.UndefOr[Boolean | String] = js.native
  var hackViaTcp: js.UndefOr[Boolean] = js.native
  var hackWssInTransport: js.UndefOr[Boolean] = js.native
  var logBuiltinEnabled: js.UndefOr[Boolean] = js.native
  var logConfiguration: js.UndefOr[Boolean] = js.native
  var logConnector: js.UndefOr[LogConnector] = js.native
  var logLevel: js.UndefOr[LogLevel] = js.native
  var noAnswerTimeout: js.UndefOr[Double] = js.native
  var preloadedRouteSet: js.UndefOr[js.Array[String]] = js.native
  var reconnectionAttempts: js.UndefOr[Double] = js.native
  var reconnectionDelay: js.UndefOr[Double] = js.native
  var sessionDescriptionHandlerFactory: js.UndefOr[SessionDescriptionHandlerFactory] = js.native
  var sessionDescriptionHandlerFactoryOptions: js.UndefOr[js.Object] = js.native
  var sipExtension100rel: js.UndefOr[SIPExtension] = js.native
  var sipExtensionExtraSupported: js.UndefOr[js.Array[String]] = js.native
  var sipExtensionReplaces: js.UndefOr[SIPExtension] = js.native
  var sipjsId: js.UndefOr[String] = js.native
  var transportConstructor: js.UndefOr[Instantiable2[/* logger */ Logger, /* options */ js.Any, Transport]] = js.native
  var transportOptions: js.UndefOr[js.Any] = js.native
  var uri: js.UndefOr[URI] = js.native
  var userAgentString: js.UndefOr[String] = js.native
  var viaHost: js.UndefOr[String] = js.native
}

object PartialUserAgentOptions {
  @scala.inline
  def apply(): PartialUserAgentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialUserAgentOptions]
  }
  @scala.inline
  implicit class PartialUserAgentOptionsOps[Self <: PartialUserAgentOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowLegacyNotifications(value: Boolean): Self = this.set("allowLegacyNotifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowLegacyNotifications: Self = this.set("allowLegacyNotifications", js.undefined)
    @scala.inline
    def setAuthorizationHa1(value: String): Self = this.set("authorizationHa1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorizationHa1: Self = this.set("authorizationHa1", js.undefined)
    @scala.inline
    def setAuthorizationPassword(value: String): Self = this.set("authorizationPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorizationPassword: Self = this.set("authorizationPassword", js.undefined)
    @scala.inline
    def setAuthorizationUsername(value: String): Self = this.set("authorizationUsername", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorizationUsername: Self = this.set("authorizationUsername", js.undefined)
    @scala.inline
    def setAutoStart(value: Boolean): Self = this.set("autoStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoStart: Self = this.set("autoStart", js.undefined)
    @scala.inline
    def setAutoStop(value: Boolean): Self = this.set("autoStop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoStop: Self = this.set("autoStop", js.undefined)
    @scala.inline
    def setDelegate(value: UserAgentDelegate): Self = this.set("delegate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelegate: Self = this.set("delegate", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setForceRport(value: Boolean): Self = this.set("forceRport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceRport: Self = this.set("forceRport", js.undefined)
    @scala.inline
    def setHackAllowUnregisteredOptionTags(value: Boolean): Self = this.set("hackAllowUnregisteredOptionTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHackAllowUnregisteredOptionTags: Self = this.set("hackAllowUnregisteredOptionTags", js.undefined)
    @scala.inline
    def setHackIpInContact(value: Boolean | String): Self = this.set("hackIpInContact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHackIpInContact: Self = this.set("hackIpInContact", js.undefined)
    @scala.inline
    def setHackViaTcp(value: Boolean): Self = this.set("hackViaTcp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHackViaTcp: Self = this.set("hackViaTcp", js.undefined)
    @scala.inline
    def setHackWssInTransport(value: Boolean): Self = this.set("hackWssInTransport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHackWssInTransport: Self = this.set("hackWssInTransport", js.undefined)
    @scala.inline
    def setLogBuiltinEnabled(value: Boolean): Self = this.set("logBuiltinEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogBuiltinEnabled: Self = this.set("logBuiltinEnabled", js.undefined)
    @scala.inline
    def setLogConfiguration(value: Boolean): Self = this.set("logConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogConfiguration: Self = this.set("logConfiguration", js.undefined)
    @scala.inline
    def setLogConnector(
      value: (/* level */ LogLevel, /* category */ String, /* label */ js.UndefOr[String], /* content */ String) => Unit
    ): Self = this.set("logConnector", js.Any.fromFunction4(value))
    @scala.inline
    def deleteLogConnector: Self = this.set("logConnector", js.undefined)
    @scala.inline
    def setLogLevel(value: LogLevel): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    @scala.inline
    def setNoAnswerTimeout(value: Double): Self = this.set("noAnswerTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoAnswerTimeout: Self = this.set("noAnswerTimeout", js.undefined)
    @scala.inline
    def setPreloadedRouteSetVarargs(value: String*): Self = this.set("preloadedRouteSet", js.Array(value :_*))
    @scala.inline
    def setPreloadedRouteSet(value: js.Array[String]): Self = this.set("preloadedRouteSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreloadedRouteSet: Self = this.set("preloadedRouteSet", js.undefined)
    @scala.inline
    def setReconnectionAttempts(value: Double): Self = this.set("reconnectionAttempts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReconnectionAttempts: Self = this.set("reconnectionAttempts", js.undefined)
    @scala.inline
    def setReconnectionDelay(value: Double): Self = this.set("reconnectionDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReconnectionDelay: Self = this.set("reconnectionDelay", js.undefined)
    @scala.inline
    def setSessionDescriptionHandlerFactory(value: (/* session */ Session, /* options */ js.UndefOr[js.Object]) => SessionDescriptionHandler): Self = this.set("sessionDescriptionHandlerFactory", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSessionDescriptionHandlerFactory: Self = this.set("sessionDescriptionHandlerFactory", js.undefined)
    @scala.inline
    def setSessionDescriptionHandlerFactoryOptions(value: js.Object): Self = this.set("sessionDescriptionHandlerFactoryOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionDescriptionHandlerFactoryOptions: Self = this.set("sessionDescriptionHandlerFactoryOptions", js.undefined)
    @scala.inline
    def setSipExtension100rel(value: SIPExtension): Self = this.set("sipExtension100rel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSipExtension100rel: Self = this.set("sipExtension100rel", js.undefined)
    @scala.inline
    def setSipExtensionExtraSupportedVarargs(value: String*): Self = this.set("sipExtensionExtraSupported", js.Array(value :_*))
    @scala.inline
    def setSipExtensionExtraSupported(value: js.Array[String]): Self = this.set("sipExtensionExtraSupported", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSipExtensionExtraSupported: Self = this.set("sipExtensionExtraSupported", js.undefined)
    @scala.inline
    def setSipExtensionReplaces(value: SIPExtension): Self = this.set("sipExtensionReplaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSipExtensionReplaces: Self = this.set("sipExtensionReplaces", js.undefined)
    @scala.inline
    def setSipjsId(value: String): Self = this.set("sipjsId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSipjsId: Self = this.set("sipjsId", js.undefined)
    @scala.inline
    def setTransportConstructor(value: Instantiable2[/* logger */ Logger, /* options */ js.Any, Transport]): Self = this.set("transportConstructor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransportConstructor: Self = this.set("transportConstructor", js.undefined)
    @scala.inline
    def setTransportOptions(value: js.Any): Self = this.set("transportOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransportOptions: Self = this.set("transportOptions", js.undefined)
    @scala.inline
    def setUri(value: URI): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
    @scala.inline
    def setUserAgentString(value: String): Self = this.set("userAgentString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserAgentString: Self = this.set("userAgentString", js.undefined)
    @scala.inline
    def setViaHost(value: String): Self = this.set("viaHost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViaHost: Self = this.set("viaHost", js.undefined)
  }
  
}

