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

/* Inlined std.Required<sip.js.sip.js/lib/api/user-agent-options.UserAgentOptions> */
trait RequiredUserAgentOptions extends StObject {
  
  var allowLegacyNotifications: Boolean
  
  var authorizationHa1: String
  
  var authorizationPassword: String
  
  var authorizationUsername: String
  
  var autoStart: Boolean
  
  var autoStop: Boolean
  
  var delegate: UserAgentDelegate
  
  var displayName: String
  
  var forceRport: Boolean
  
  var hackAllowUnregisteredOptionTags: Boolean
  
  var hackIpInContact: Boolean | String
  
  var hackViaTcp: Boolean
  
  var hackWssInTransport: Boolean
  
  var logBuiltinEnabled: Boolean
  
  var logConfiguration: Boolean
  
  def logConnector(level: LogLevel, category: String, label: String, content: String): Unit
  def logConnector(level: LogLevel, category: String, label: Unit, content: String): Unit
  @JSName("logConnector")
  var logConnector_Original: LogConnector
  
  var logLevel: LogLevel
  
  var noAnswerTimeout: Double
  
  var preloadedRouteSet: js.Array[String]
  
  var reconnectionAttempts: Double
  
  var reconnectionDelay: Double
  
  def sessionDescriptionHandlerFactory(session: Session): SessionDescriptionHandler
  def sessionDescriptionHandlerFactory(session: Session, options: js.Object): SessionDescriptionHandler
  
  var sessionDescriptionHandlerFactoryOptions: js.Object
  
  @JSName("sessionDescriptionHandlerFactory")
  var sessionDescriptionHandlerFactory_Original: SessionDescriptionHandlerFactory
  
  var sipExtension100rel: SIPExtension
  
  var sipExtensionExtraSupported: js.Array[String]
  
  var sipExtensionReplaces: SIPExtension
  
  var sipjsId: String
  
  var transportConstructor: Instantiable2[/* logger */ Logger, /* options */ js.Any, Transport]
  
  var transportOptions: js.Any
  
  var uri: URI
  
  var userAgentString: String
  
  var viaHost: String
}
object RequiredUserAgentOptions {
  
  @scala.inline
  def apply(
    allowLegacyNotifications: Boolean,
    authorizationHa1: String,
    authorizationPassword: String,
    authorizationUsername: String,
    autoStart: Boolean,
    autoStop: Boolean,
    delegate: UserAgentDelegate,
    displayName: String,
    forceRport: Boolean,
    hackAllowUnregisteredOptionTags: Boolean,
    hackIpInContact: Boolean | String,
    hackViaTcp: Boolean,
    hackWssInTransport: Boolean,
    logBuiltinEnabled: Boolean,
    logConfiguration: Boolean,
    logConnector: (/* level */ LogLevel, /* category */ String, /* label */ js.UndefOr[String], /* content */ String) => Unit,
    logLevel: LogLevel,
    noAnswerTimeout: Double,
    preloadedRouteSet: js.Array[String],
    reconnectionAttempts: Double,
    reconnectionDelay: Double,
    sessionDescriptionHandlerFactory: (/* session */ Session, /* options */ js.UndefOr[js.Object]) => SessionDescriptionHandler,
    sessionDescriptionHandlerFactoryOptions: js.Object,
    sipExtension100rel: SIPExtension,
    sipExtensionExtraSupported: js.Array[String],
    sipExtensionReplaces: SIPExtension,
    sipjsId: String,
    transportConstructor: Instantiable2[/* logger */ Logger, /* options */ js.Any, Transport],
    transportOptions: js.Any,
    uri: URI,
    userAgentString: String,
    viaHost: String
  ): RequiredUserAgentOptions = {
    val __obj = js.Dynamic.literal(allowLegacyNotifications = allowLegacyNotifications.asInstanceOf[js.Any], authorizationHa1 = authorizationHa1.asInstanceOf[js.Any], authorizationPassword = authorizationPassword.asInstanceOf[js.Any], authorizationUsername = authorizationUsername.asInstanceOf[js.Any], autoStart = autoStart.asInstanceOf[js.Any], autoStop = autoStop.asInstanceOf[js.Any], delegate = delegate.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], forceRport = forceRport.asInstanceOf[js.Any], hackAllowUnregisteredOptionTags = hackAllowUnregisteredOptionTags.asInstanceOf[js.Any], hackIpInContact = hackIpInContact.asInstanceOf[js.Any], hackViaTcp = hackViaTcp.asInstanceOf[js.Any], hackWssInTransport = hackWssInTransport.asInstanceOf[js.Any], logBuiltinEnabled = logBuiltinEnabled.asInstanceOf[js.Any], logConfiguration = logConfiguration.asInstanceOf[js.Any], logConnector = js.Any.fromFunction4(logConnector), logLevel = logLevel.asInstanceOf[js.Any], noAnswerTimeout = noAnswerTimeout.asInstanceOf[js.Any], preloadedRouteSet = preloadedRouteSet.asInstanceOf[js.Any], reconnectionAttempts = reconnectionAttempts.asInstanceOf[js.Any], reconnectionDelay = reconnectionDelay.asInstanceOf[js.Any], sessionDescriptionHandlerFactory = js.Any.fromFunction2(sessionDescriptionHandlerFactory), sessionDescriptionHandlerFactoryOptions = sessionDescriptionHandlerFactoryOptions.asInstanceOf[js.Any], sipExtension100rel = sipExtension100rel.asInstanceOf[js.Any], sipExtensionExtraSupported = sipExtensionExtraSupported.asInstanceOf[js.Any], sipExtensionReplaces = sipExtensionReplaces.asInstanceOf[js.Any], sipjsId = sipjsId.asInstanceOf[js.Any], transportConstructor = transportConstructor.asInstanceOf[js.Any], transportOptions = transportOptions.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], userAgentString = userAgentString.asInstanceOf[js.Any], viaHost = viaHost.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredUserAgentOptions]
  }
  
  @scala.inline
  implicit class RequiredUserAgentOptionsMutableBuilder[Self <: RequiredUserAgentOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowLegacyNotifications(value: Boolean): Self = StObject.set(x, "allowLegacyNotifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationHa1(value: String): Self = StObject.set(x, "authorizationHa1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationPassword(value: String): Self = StObject.set(x, "authorizationPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationUsername(value: String): Self = StObject.set(x, "authorizationUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoStart(value: Boolean): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoStop(value: Boolean): Self = StObject.set(x, "autoStop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelegate(value: UserAgentDelegate): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceRport(value: Boolean): Self = StObject.set(x, "forceRport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHackAllowUnregisteredOptionTags(value: Boolean): Self = StObject.set(x, "hackAllowUnregisteredOptionTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHackIpInContact(value: Boolean | String): Self = StObject.set(x, "hackIpInContact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHackViaTcp(value: Boolean): Self = StObject.set(x, "hackViaTcp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHackWssInTransport(value: Boolean): Self = StObject.set(x, "hackWssInTransport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogBuiltinEnabled(value: Boolean): Self = StObject.set(x, "logBuiltinEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogConfiguration(value: Boolean): Self = StObject.set(x, "logConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogConnector(
      value: (/* level */ LogLevel, /* category */ String, /* label */ js.UndefOr[String], /* content */ String) => Unit
    ): Self = StObject.set(x, "logConnector", js.Any.fromFunction4(value))
    
    @scala.inline
    def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoAnswerTimeout(value: Double): Self = StObject.set(x, "noAnswerTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreloadedRouteSet(value: js.Array[String]): Self = StObject.set(x, "preloadedRouteSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreloadedRouteSetVarargs(value: String*): Self = StObject.set(x, "preloadedRouteSet", js.Array(value :_*))
    
    @scala.inline
    def setReconnectionAttempts(value: Double): Self = StObject.set(x, "reconnectionAttempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReconnectionDelay(value: Double): Self = StObject.set(x, "reconnectionDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionDescriptionHandlerFactory(value: (/* session */ Session, /* options */ js.UndefOr[js.Object]) => SessionDescriptionHandler): Self = StObject.set(x, "sessionDescriptionHandlerFactory", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSessionDescriptionHandlerFactoryOptions(value: js.Object): Self = StObject.set(x, "sessionDescriptionHandlerFactoryOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSipExtension100rel(value: SIPExtension): Self = StObject.set(x, "sipExtension100rel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSipExtensionExtraSupported(value: js.Array[String]): Self = StObject.set(x, "sipExtensionExtraSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSipExtensionExtraSupportedVarargs(value: String*): Self = StObject.set(x, "sipExtensionExtraSupported", js.Array(value :_*))
    
    @scala.inline
    def setSipExtensionReplaces(value: SIPExtension): Self = StObject.set(x, "sipExtensionReplaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSipjsId(value: String): Self = StObject.set(x, "sipjsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportConstructor(value: Instantiable2[/* logger */ Logger, /* options */ js.Any, Transport]): Self = StObject.set(x, "transportConstructor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportOptions(value: js.Any): Self = StObject.set(x, "transportOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: URI): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAgentString(value: String): Self = StObject.set(x, "userAgentString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViaHost(value: String): Self = StObject.set(x, "viaHost", value.asInstanceOf[js.Any])
  }
}
