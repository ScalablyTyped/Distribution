package typings.sipJs.anon

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.sipJs.libApiSessionDescriptionHandlerFactoryMod.SessionDescriptionHandlerFactory
import typings.sipJs.libApiSessionDescriptionHandlerMod.SessionDescriptionHandler
import typings.sipJs.libApiSessionMod.Session
import typings.sipJs.libApiTransportMod.Transport
import typings.sipJs.libApiUserAgentDelegateMod.UserAgentDelegate
import typings.sipJs.libApiUserAgentOptionsMod.LogConnector
import typings.sipJs.libApiUserAgentOptionsMod.LogLevel
import typings.sipJs.libApiUserAgentOptionsMod.SIPExtension
import typings.sipJs.libCoreMod.Logger
import typings.sipJs.libCoreMod.URI
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
  
  var contactName: js.UndefOr[String] = js.undefined
  
  var contactParams: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var delegate: js.UndefOr[UserAgentDelegate] = js.undefined
  
  var displayName: js.UndefOr[String] = js.undefined
  
  var forceRport: js.UndefOr[Boolean] = js.undefined
  
  var hackAllowUnregisteredOptionTags: js.UndefOr[Boolean] = js.undefined
  
  var hackIpInContact: js.UndefOr[Boolean | String] = js.undefined
  
  var hackViaTcp: js.UndefOr[Boolean] = js.undefined
  
  var logBuiltinEnabled: js.UndefOr[Boolean] = js.undefined
  
  var logConfiguration: js.UndefOr[Boolean] = js.undefined
  
  var logConnector: js.UndefOr[LogConnector] = js.undefined
  
  var logLevel: js.UndefOr[LogLevel] = js.undefined
  
  var noAnswerTimeout: js.UndefOr[Double] = js.undefined
  
  var preloadedRouteSet: js.UndefOr[js.Array[String]] = js.undefined
  
  var reconnectionAttempts: js.UndefOr[Double] = js.undefined
  
  var reconnectionDelay: js.UndefOr[Double] = js.undefined
  
  var sendInitialProvisionalResponse: js.UndefOr[Boolean] = js.undefined
  
  var sessionDescriptionHandlerFactory: js.UndefOr[SessionDescriptionHandlerFactory] = js.undefined
  
  var sessionDescriptionHandlerFactoryOptions: js.UndefOr[js.Object] = js.undefined
  
  var sipExtension100rel: js.UndefOr[SIPExtension] = js.undefined
  
  var sipExtensionExtraSupported: js.UndefOr[js.Array[String]] = js.undefined
  
  var sipExtensionReplaces: js.UndefOr[SIPExtension] = js.undefined
  
  var sipjsId: js.UndefOr[String] = js.undefined
  
  var transportConstructor: js.UndefOr[Instantiable2[/* logger */ Logger, /* options */ Any, Transport]] = js.undefined
  
  var transportOptions: js.UndefOr[Any] = js.undefined
  
  var uri: js.UndefOr[URI] = js.undefined
  
  var userAgentString: js.UndefOr[String] = js.undefined
  
  var viaHost: js.UndefOr[String] = js.undefined
}
object PartialUserAgentOptions {
  
  inline def apply(): PartialUserAgentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialUserAgentOptions]
  }
  
  extension [Self <: PartialUserAgentOptions](x: Self) {
    
    inline def setAllowLegacyNotifications(value: Boolean): Self = StObject.set(x, "allowLegacyNotifications", value.asInstanceOf[js.Any])
    
    inline def setAllowLegacyNotificationsUndefined: Self = StObject.set(x, "allowLegacyNotifications", js.undefined)
    
    inline def setAuthorizationHa1(value: String): Self = StObject.set(x, "authorizationHa1", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationHa1Undefined: Self = StObject.set(x, "authorizationHa1", js.undefined)
    
    inline def setAuthorizationPassword(value: String): Self = StObject.set(x, "authorizationPassword", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationPasswordUndefined: Self = StObject.set(x, "authorizationPassword", js.undefined)
    
    inline def setAuthorizationUsername(value: String): Self = StObject.set(x, "authorizationUsername", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationUsernameUndefined: Self = StObject.set(x, "authorizationUsername", js.undefined)
    
    inline def setAutoStart(value: Boolean): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
    
    inline def setAutoStartUndefined: Self = StObject.set(x, "autoStart", js.undefined)
    
    inline def setAutoStop(value: Boolean): Self = StObject.set(x, "autoStop", value.asInstanceOf[js.Any])
    
    inline def setAutoStopUndefined: Self = StObject.set(x, "autoStop", js.undefined)
    
    inline def setContactName(value: String): Self = StObject.set(x, "contactName", value.asInstanceOf[js.Any])
    
    inline def setContactNameUndefined: Self = StObject.set(x, "contactName", js.undefined)
    
    inline def setContactParams(value: StringDictionary[String]): Self = StObject.set(x, "contactParams", value.asInstanceOf[js.Any])
    
    inline def setContactParamsUndefined: Self = StObject.set(x, "contactParams", js.undefined)
    
    inline def setDelegate(value: UserAgentDelegate): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
    
    inline def setDelegateUndefined: Self = StObject.set(x, "delegate", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setForceRport(value: Boolean): Self = StObject.set(x, "forceRport", value.asInstanceOf[js.Any])
    
    inline def setForceRportUndefined: Self = StObject.set(x, "forceRport", js.undefined)
    
    inline def setHackAllowUnregisteredOptionTags(value: Boolean): Self = StObject.set(x, "hackAllowUnregisteredOptionTags", value.asInstanceOf[js.Any])
    
    inline def setHackAllowUnregisteredOptionTagsUndefined: Self = StObject.set(x, "hackAllowUnregisteredOptionTags", js.undefined)
    
    inline def setHackIpInContact(value: Boolean | String): Self = StObject.set(x, "hackIpInContact", value.asInstanceOf[js.Any])
    
    inline def setHackIpInContactUndefined: Self = StObject.set(x, "hackIpInContact", js.undefined)
    
    inline def setHackViaTcp(value: Boolean): Self = StObject.set(x, "hackViaTcp", value.asInstanceOf[js.Any])
    
    inline def setHackViaTcpUndefined: Self = StObject.set(x, "hackViaTcp", js.undefined)
    
    inline def setLogBuiltinEnabled(value: Boolean): Self = StObject.set(x, "logBuiltinEnabled", value.asInstanceOf[js.Any])
    
    inline def setLogBuiltinEnabledUndefined: Self = StObject.set(x, "logBuiltinEnabled", js.undefined)
    
    inline def setLogConfiguration(value: Boolean): Self = StObject.set(x, "logConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLogConfigurationUndefined: Self = StObject.set(x, "logConfiguration", js.undefined)
    
    inline def setLogConnector(
      value: (/* level */ LogLevel, /* category */ String, /* label */ js.UndefOr[String], /* content */ String) => Unit
    ): Self = StObject.set(x, "logConnector", js.Any.fromFunction4(value))
    
    inline def setLogConnectorUndefined: Self = StObject.set(x, "logConnector", js.undefined)
    
    inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    inline def setNoAnswerTimeout(value: Double): Self = StObject.set(x, "noAnswerTimeout", value.asInstanceOf[js.Any])
    
    inline def setNoAnswerTimeoutUndefined: Self = StObject.set(x, "noAnswerTimeout", js.undefined)
    
    inline def setPreloadedRouteSet(value: js.Array[String]): Self = StObject.set(x, "preloadedRouteSet", value.asInstanceOf[js.Any])
    
    inline def setPreloadedRouteSetUndefined: Self = StObject.set(x, "preloadedRouteSet", js.undefined)
    
    inline def setPreloadedRouteSetVarargs(value: String*): Self = StObject.set(x, "preloadedRouteSet", js.Array(value*))
    
    inline def setReconnectionAttempts(value: Double): Self = StObject.set(x, "reconnectionAttempts", value.asInstanceOf[js.Any])
    
    inline def setReconnectionAttemptsUndefined: Self = StObject.set(x, "reconnectionAttempts", js.undefined)
    
    inline def setReconnectionDelay(value: Double): Self = StObject.set(x, "reconnectionDelay", value.asInstanceOf[js.Any])
    
    inline def setReconnectionDelayUndefined: Self = StObject.set(x, "reconnectionDelay", js.undefined)
    
    inline def setSendInitialProvisionalResponse(value: Boolean): Self = StObject.set(x, "sendInitialProvisionalResponse", value.asInstanceOf[js.Any])
    
    inline def setSendInitialProvisionalResponseUndefined: Self = StObject.set(x, "sendInitialProvisionalResponse", js.undefined)
    
    inline def setSessionDescriptionHandlerFactory(value: (/* session */ Session, /* options */ js.UndefOr[js.Object]) => SessionDescriptionHandler): Self = StObject.set(x, "sessionDescriptionHandlerFactory", js.Any.fromFunction2(value))
    
    inline def setSessionDescriptionHandlerFactoryOptions(value: js.Object): Self = StObject.set(x, "sessionDescriptionHandlerFactoryOptions", value.asInstanceOf[js.Any])
    
    inline def setSessionDescriptionHandlerFactoryOptionsUndefined: Self = StObject.set(x, "sessionDescriptionHandlerFactoryOptions", js.undefined)
    
    inline def setSessionDescriptionHandlerFactoryUndefined: Self = StObject.set(x, "sessionDescriptionHandlerFactory", js.undefined)
    
    inline def setSipExtension100rel(value: SIPExtension): Self = StObject.set(x, "sipExtension100rel", value.asInstanceOf[js.Any])
    
    inline def setSipExtension100relUndefined: Self = StObject.set(x, "sipExtension100rel", js.undefined)
    
    inline def setSipExtensionExtraSupported(value: js.Array[String]): Self = StObject.set(x, "sipExtensionExtraSupported", value.asInstanceOf[js.Any])
    
    inline def setSipExtensionExtraSupportedUndefined: Self = StObject.set(x, "sipExtensionExtraSupported", js.undefined)
    
    inline def setSipExtensionExtraSupportedVarargs(value: String*): Self = StObject.set(x, "sipExtensionExtraSupported", js.Array(value*))
    
    inline def setSipExtensionReplaces(value: SIPExtension): Self = StObject.set(x, "sipExtensionReplaces", value.asInstanceOf[js.Any])
    
    inline def setSipExtensionReplacesUndefined: Self = StObject.set(x, "sipExtensionReplaces", js.undefined)
    
    inline def setSipjsId(value: String): Self = StObject.set(x, "sipjsId", value.asInstanceOf[js.Any])
    
    inline def setSipjsIdUndefined: Self = StObject.set(x, "sipjsId", js.undefined)
    
    inline def setTransportConstructor(value: Instantiable2[/* logger */ Logger, /* options */ Any, Transport]): Self = StObject.set(x, "transportConstructor", value.asInstanceOf[js.Any])
    
    inline def setTransportConstructorUndefined: Self = StObject.set(x, "transportConstructor", js.undefined)
    
    inline def setTransportOptions(value: Any): Self = StObject.set(x, "transportOptions", value.asInstanceOf[js.Any])
    
    inline def setTransportOptionsUndefined: Self = StObject.set(x, "transportOptions", js.undefined)
    
    inline def setUri(value: URI): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    inline def setUserAgentString(value: String): Self = StObject.set(x, "userAgentString", value.asInstanceOf[js.Any])
    
    inline def setUserAgentStringUndefined: Self = StObject.set(x, "userAgentString", js.undefined)
    
    inline def setViaHost(value: String): Self = StObject.set(x, "viaHost", value.asInstanceOf[js.Any])
    
    inline def setViaHostUndefined: Self = StObject.set(x, "viaHost", js.undefined)
  }
}
