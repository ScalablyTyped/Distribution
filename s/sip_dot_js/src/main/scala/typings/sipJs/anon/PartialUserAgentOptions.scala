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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<sip.js.sip.js/lib/api/user-agent-options.UserAgentOptions> */
trait PartialUserAgentOptions extends StObject {
  
  var allowLegacyNotifications: js.UndefOr[Boolean] = js.undefined
  
  var authorizationHa1: js.UndefOr[String] = js.undefined
  
  var authorizationPassword: js.UndefOr[String] = js.undefined
  
  var authorizationUsername: js.UndefOr[String] = js.undefined
  
  var autoStart: js.UndefOr[Boolean] = js.undefined
  
  var autoStop: js.UndefOr[Boolean] = js.undefined
  
  var delegate: js.UndefOr[UserAgentDelegate] = js.undefined
  
  var displayName: js.UndefOr[String] = js.undefined
  
  var forceRport: js.UndefOr[Boolean] = js.undefined
  
  var hackAllowUnregisteredOptionTags: js.UndefOr[Boolean] = js.undefined
  
  var hackIpInContact: js.UndefOr[Boolean | String] = js.undefined
  
  var hackViaTcp: js.UndefOr[Boolean] = js.undefined
  
  var hackWssInTransport: js.UndefOr[Boolean] = js.undefined
  
  var logBuiltinEnabled: js.UndefOr[Boolean] = js.undefined
  
  var logConfiguration: js.UndefOr[Boolean] = js.undefined
  
  var logConnector: js.UndefOr[LogConnector] = js.undefined
  
  var logLevel: js.UndefOr[LogLevel] = js.undefined
  
  var noAnswerTimeout: js.UndefOr[Double] = js.undefined
  
  var preloadedRouteSet: js.UndefOr[js.Array[String]] = js.undefined
  
  var reconnectionAttempts: js.UndefOr[Double] = js.undefined
  
  var reconnectionDelay: js.UndefOr[Double] = js.undefined
  
  var sessionDescriptionHandlerFactory: js.UndefOr[SessionDescriptionHandlerFactory] = js.undefined
  
  var sessionDescriptionHandlerFactoryOptions: js.UndefOr[js.Object] = js.undefined
  
  var sipExtension100rel: js.UndefOr[SIPExtension] = js.undefined
  
  var sipExtensionExtraSupported: js.UndefOr[js.Array[String]] = js.undefined
  
  var sipExtensionReplaces: js.UndefOr[SIPExtension] = js.undefined
  
  var sipjsId: js.UndefOr[String] = js.undefined
  
  var transportConstructor: js.UndefOr[Instantiable2[/* logger */ Logger, /* options */ js.Any, Transport]] = js.undefined
  
  var transportOptions: js.UndefOr[js.Any] = js.undefined
  
  var uri: js.UndefOr[URI] = js.undefined
  
  var userAgentString: js.UndefOr[String] = js.undefined
  
  var viaHost: js.UndefOr[String] = js.undefined
}
object PartialUserAgentOptions {
  
  @scala.inline
  def apply(): PartialUserAgentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialUserAgentOptions]
  }
  
  @scala.inline
  implicit class PartialUserAgentOptionsMutableBuilder[Self <: PartialUserAgentOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowLegacyNotifications(value: Boolean): Self = StObject.set(x, "allowLegacyNotifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowLegacyNotificationsUndefined: Self = StObject.set(x, "allowLegacyNotifications", js.undefined)
    
    @scala.inline
    def setAuthorizationHa1(value: String): Self = StObject.set(x, "authorizationHa1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationHa1Undefined: Self = StObject.set(x, "authorizationHa1", js.undefined)
    
    @scala.inline
    def setAuthorizationPassword(value: String): Self = StObject.set(x, "authorizationPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationPasswordUndefined: Self = StObject.set(x, "authorizationPassword", js.undefined)
    
    @scala.inline
    def setAuthorizationUsername(value: String): Self = StObject.set(x, "authorizationUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationUsernameUndefined: Self = StObject.set(x, "authorizationUsername", js.undefined)
    
    @scala.inline
    def setAutoStart(value: Boolean): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoStartUndefined: Self = StObject.set(x, "autoStart", js.undefined)
    
    @scala.inline
    def setAutoStop(value: Boolean): Self = StObject.set(x, "autoStop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoStopUndefined: Self = StObject.set(x, "autoStop", js.undefined)
    
    @scala.inline
    def setDelegate(value: UserAgentDelegate): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelegateUndefined: Self = StObject.set(x, "delegate", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setForceRport(value: Boolean): Self = StObject.set(x, "forceRport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceRportUndefined: Self = StObject.set(x, "forceRport", js.undefined)
    
    @scala.inline
    def setHackAllowUnregisteredOptionTags(value: Boolean): Self = StObject.set(x, "hackAllowUnregisteredOptionTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHackAllowUnregisteredOptionTagsUndefined: Self = StObject.set(x, "hackAllowUnregisteredOptionTags", js.undefined)
    
    @scala.inline
    def setHackIpInContact(value: Boolean | String): Self = StObject.set(x, "hackIpInContact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHackIpInContactUndefined: Self = StObject.set(x, "hackIpInContact", js.undefined)
    
    @scala.inline
    def setHackViaTcp(value: Boolean): Self = StObject.set(x, "hackViaTcp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHackViaTcpUndefined: Self = StObject.set(x, "hackViaTcp", js.undefined)
    
    @scala.inline
    def setHackWssInTransport(value: Boolean): Self = StObject.set(x, "hackWssInTransport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHackWssInTransportUndefined: Self = StObject.set(x, "hackWssInTransport", js.undefined)
    
    @scala.inline
    def setLogBuiltinEnabled(value: Boolean): Self = StObject.set(x, "logBuiltinEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogBuiltinEnabledUndefined: Self = StObject.set(x, "logBuiltinEnabled", js.undefined)
    
    @scala.inline
    def setLogConfiguration(value: Boolean): Self = StObject.set(x, "logConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogConfigurationUndefined: Self = StObject.set(x, "logConfiguration", js.undefined)
    
    @scala.inline
    def setLogConnector(
      value: (/* level */ LogLevel, /* category */ String, /* label */ js.UndefOr[String], /* content */ String) => Unit
    ): Self = StObject.set(x, "logConnector", js.Any.fromFunction4(value))
    
    @scala.inline
    def setLogConnectorUndefined: Self = StObject.set(x, "logConnector", js.undefined)
    
    @scala.inline
    def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    @scala.inline
    def setNoAnswerTimeout(value: Double): Self = StObject.set(x, "noAnswerTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoAnswerTimeoutUndefined: Self = StObject.set(x, "noAnswerTimeout", js.undefined)
    
    @scala.inline
    def setPreloadedRouteSet(value: js.Array[String]): Self = StObject.set(x, "preloadedRouteSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreloadedRouteSetUndefined: Self = StObject.set(x, "preloadedRouteSet", js.undefined)
    
    @scala.inline
    def setPreloadedRouteSetVarargs(value: String*): Self = StObject.set(x, "preloadedRouteSet", js.Array(value :_*))
    
    @scala.inline
    def setReconnectionAttempts(value: Double): Self = StObject.set(x, "reconnectionAttempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReconnectionAttemptsUndefined: Self = StObject.set(x, "reconnectionAttempts", js.undefined)
    
    @scala.inline
    def setReconnectionDelay(value: Double): Self = StObject.set(x, "reconnectionDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReconnectionDelayUndefined: Self = StObject.set(x, "reconnectionDelay", js.undefined)
    
    @scala.inline
    def setSessionDescriptionHandlerFactory(value: (/* session */ Session, /* options */ js.UndefOr[js.Object]) => SessionDescriptionHandler): Self = StObject.set(x, "sessionDescriptionHandlerFactory", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSessionDescriptionHandlerFactoryOptions(value: js.Object): Self = StObject.set(x, "sessionDescriptionHandlerFactoryOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionDescriptionHandlerFactoryOptionsUndefined: Self = StObject.set(x, "sessionDescriptionHandlerFactoryOptions", js.undefined)
    
    @scala.inline
    def setSessionDescriptionHandlerFactoryUndefined: Self = StObject.set(x, "sessionDescriptionHandlerFactory", js.undefined)
    
    @scala.inline
    def setSipExtension100rel(value: SIPExtension): Self = StObject.set(x, "sipExtension100rel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSipExtension100relUndefined: Self = StObject.set(x, "sipExtension100rel", js.undefined)
    
    @scala.inline
    def setSipExtensionExtraSupported(value: js.Array[String]): Self = StObject.set(x, "sipExtensionExtraSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSipExtensionExtraSupportedUndefined: Self = StObject.set(x, "sipExtensionExtraSupported", js.undefined)
    
    @scala.inline
    def setSipExtensionExtraSupportedVarargs(value: String*): Self = StObject.set(x, "sipExtensionExtraSupported", js.Array(value :_*))
    
    @scala.inline
    def setSipExtensionReplaces(value: SIPExtension): Self = StObject.set(x, "sipExtensionReplaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSipExtensionReplacesUndefined: Self = StObject.set(x, "sipExtensionReplaces", js.undefined)
    
    @scala.inline
    def setSipjsId(value: String): Self = StObject.set(x, "sipjsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSipjsIdUndefined: Self = StObject.set(x, "sipjsId", js.undefined)
    
    @scala.inline
    def setTransportConstructor(value: Instantiable2[/* logger */ Logger, /* options */ js.Any, Transport]): Self = StObject.set(x, "transportConstructor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportConstructorUndefined: Self = StObject.set(x, "transportConstructor", js.undefined)
    
    @scala.inline
    def setTransportOptions(value: js.Any): Self = StObject.set(x, "transportOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportOptionsUndefined: Self = StObject.set(x, "transportOptions", js.undefined)
    
    @scala.inline
    def setUri(value: URI): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    @scala.inline
    def setUserAgentString(value: String): Self = StObject.set(x, "userAgentString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAgentStringUndefined: Self = StObject.set(x, "userAgentString", js.undefined)
    
    @scala.inline
    def setViaHost(value: String): Self = StObject.set(x, "viaHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViaHostUndefined: Self = StObject.set(x, "viaHost", js.undefined)
  }
}
