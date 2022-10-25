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
import typings.sipJs.libCoreLogLoggerMod.Logger
import typings.sipJs.libGrammarUriMod.URI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<sip.js.sip.js/lib/api/user-agent-options.UserAgentOptions> */
trait RequiredUserAgentOptions extends StObject {
  
  var allowLegacyNotifications: Boolean
  
  var authorizationHa1: String
  
  var authorizationPassword: String
  
  var authorizationUsername: String
  
  var contactName: String
  
  var contactParams: StringDictionary[String]
  
  var delegate: UserAgentDelegate
  
  var displayName: String
  
  var forceRport: Boolean
  
  var gracefulShutdown: Boolean
  
  var hackAllowUnregisteredOptionTags: Boolean
  
  var hackIpInContact: Boolean | String
  
  var hackViaTcp: Boolean
  
  var instanceId: String
  
  var instanceIdAlwaysAdded: Boolean
  
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
  
  var sendInitialProvisionalResponse: Boolean
  
  def sessionDescriptionHandlerFactory(session: Session): SessionDescriptionHandler
  def sessionDescriptionHandlerFactory(session: Session, options: js.Object): SessionDescriptionHandler
  
  var sessionDescriptionHandlerFactoryOptions: js.Object
  
  @JSName("sessionDescriptionHandlerFactory")
  var sessionDescriptionHandlerFactory_Original: SessionDescriptionHandlerFactory
  
  var sipExtension100rel: SIPExtension
  
  var sipExtensionExtraSupported: js.Array[String]
  
  var sipExtensionReplaces: SIPExtension
  
  var sipjsId: String
  
  var transportConstructor: Instantiable2[/* logger */ Logger, /* options */ Any, Transport]
  
  var transportOptions: Any
  
  var uri: URI
  
  var userAgentString: String
  
  var viaHost: String
}
object RequiredUserAgentOptions {
  
  inline def apply(
    allowLegacyNotifications: Boolean,
    authorizationHa1: String,
    authorizationPassword: String,
    authorizationUsername: String,
    contactName: String,
    contactParams: StringDictionary[String],
    delegate: UserAgentDelegate,
    displayName: String,
    forceRport: Boolean,
    gracefulShutdown: Boolean,
    hackAllowUnregisteredOptionTags: Boolean,
    hackIpInContact: Boolean | String,
    hackViaTcp: Boolean,
    instanceId: String,
    instanceIdAlwaysAdded: Boolean,
    logBuiltinEnabled: Boolean,
    logConfiguration: Boolean,
    logConnector: (/* level */ LogLevel, /* category */ String, /* label */ js.UndefOr[String], /* content */ String) => Unit,
    logLevel: LogLevel,
    noAnswerTimeout: Double,
    preloadedRouteSet: js.Array[String],
    reconnectionAttempts: Double,
    reconnectionDelay: Double,
    sendInitialProvisionalResponse: Boolean,
    sessionDescriptionHandlerFactory: (/* session */ Session, /* options */ js.UndefOr[js.Object]) => SessionDescriptionHandler,
    sessionDescriptionHandlerFactoryOptions: js.Object,
    sipExtension100rel: SIPExtension,
    sipExtensionExtraSupported: js.Array[String],
    sipExtensionReplaces: SIPExtension,
    sipjsId: String,
    transportConstructor: Instantiable2[/* logger */ Logger, /* options */ Any, Transport],
    transportOptions: Any,
    uri: URI,
    userAgentString: String,
    viaHost: String
  ): RequiredUserAgentOptions = {
    val __obj = js.Dynamic.literal(allowLegacyNotifications = allowLegacyNotifications.asInstanceOf[js.Any], authorizationHa1 = authorizationHa1.asInstanceOf[js.Any], authorizationPassword = authorizationPassword.asInstanceOf[js.Any], authorizationUsername = authorizationUsername.asInstanceOf[js.Any], contactName = contactName.asInstanceOf[js.Any], contactParams = contactParams.asInstanceOf[js.Any], delegate = delegate.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], forceRport = forceRport.asInstanceOf[js.Any], gracefulShutdown = gracefulShutdown.asInstanceOf[js.Any], hackAllowUnregisteredOptionTags = hackAllowUnregisteredOptionTags.asInstanceOf[js.Any], hackIpInContact = hackIpInContact.asInstanceOf[js.Any], hackViaTcp = hackViaTcp.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], instanceIdAlwaysAdded = instanceIdAlwaysAdded.asInstanceOf[js.Any], logBuiltinEnabled = logBuiltinEnabled.asInstanceOf[js.Any], logConfiguration = logConfiguration.asInstanceOf[js.Any], logConnector = js.Any.fromFunction4(logConnector), logLevel = logLevel.asInstanceOf[js.Any], noAnswerTimeout = noAnswerTimeout.asInstanceOf[js.Any], preloadedRouteSet = preloadedRouteSet.asInstanceOf[js.Any], reconnectionAttempts = reconnectionAttempts.asInstanceOf[js.Any], reconnectionDelay = reconnectionDelay.asInstanceOf[js.Any], sendInitialProvisionalResponse = sendInitialProvisionalResponse.asInstanceOf[js.Any], sessionDescriptionHandlerFactory = js.Any.fromFunction2(sessionDescriptionHandlerFactory), sessionDescriptionHandlerFactoryOptions = sessionDescriptionHandlerFactoryOptions.asInstanceOf[js.Any], sipExtension100rel = sipExtension100rel.asInstanceOf[js.Any], sipExtensionExtraSupported = sipExtensionExtraSupported.asInstanceOf[js.Any], sipExtensionReplaces = sipExtensionReplaces.asInstanceOf[js.Any], sipjsId = sipjsId.asInstanceOf[js.Any], transportConstructor = transportConstructor.asInstanceOf[js.Any], transportOptions = transportOptions.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], userAgentString = userAgentString.asInstanceOf[js.Any], viaHost = viaHost.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredUserAgentOptions]
  }
  
  extension [Self <: RequiredUserAgentOptions](x: Self) {
    
    inline def setAllowLegacyNotifications(value: Boolean): Self = StObject.set(x, "allowLegacyNotifications", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationHa1(value: String): Self = StObject.set(x, "authorizationHa1", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationPassword(value: String): Self = StObject.set(x, "authorizationPassword", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationUsername(value: String): Self = StObject.set(x, "authorizationUsername", value.asInstanceOf[js.Any])
    
    inline def setContactName(value: String): Self = StObject.set(x, "contactName", value.asInstanceOf[js.Any])
    
    inline def setContactParams(value: StringDictionary[String]): Self = StObject.set(x, "contactParams", value.asInstanceOf[js.Any])
    
    inline def setDelegate(value: UserAgentDelegate): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setForceRport(value: Boolean): Self = StObject.set(x, "forceRport", value.asInstanceOf[js.Any])
    
    inline def setGracefulShutdown(value: Boolean): Self = StObject.set(x, "gracefulShutdown", value.asInstanceOf[js.Any])
    
    inline def setHackAllowUnregisteredOptionTags(value: Boolean): Self = StObject.set(x, "hackAllowUnregisteredOptionTags", value.asInstanceOf[js.Any])
    
    inline def setHackIpInContact(value: Boolean | String): Self = StObject.set(x, "hackIpInContact", value.asInstanceOf[js.Any])
    
    inline def setHackViaTcp(value: Boolean): Self = StObject.set(x, "hackViaTcp", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdAlwaysAdded(value: Boolean): Self = StObject.set(x, "instanceIdAlwaysAdded", value.asInstanceOf[js.Any])
    
    inline def setLogBuiltinEnabled(value: Boolean): Self = StObject.set(x, "logBuiltinEnabled", value.asInstanceOf[js.Any])
    
    inline def setLogConfiguration(value: Boolean): Self = StObject.set(x, "logConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLogConnector(
      value: (/* level */ LogLevel, /* category */ String, /* label */ js.UndefOr[String], /* content */ String) => Unit
    ): Self = StObject.set(x, "logConnector", js.Any.fromFunction4(value))
    
    inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setNoAnswerTimeout(value: Double): Self = StObject.set(x, "noAnswerTimeout", value.asInstanceOf[js.Any])
    
    inline def setPreloadedRouteSet(value: js.Array[String]): Self = StObject.set(x, "preloadedRouteSet", value.asInstanceOf[js.Any])
    
    inline def setPreloadedRouteSetVarargs(value: String*): Self = StObject.set(x, "preloadedRouteSet", js.Array(value*))
    
    inline def setReconnectionAttempts(value: Double): Self = StObject.set(x, "reconnectionAttempts", value.asInstanceOf[js.Any])
    
    inline def setReconnectionDelay(value: Double): Self = StObject.set(x, "reconnectionDelay", value.asInstanceOf[js.Any])
    
    inline def setSendInitialProvisionalResponse(value: Boolean): Self = StObject.set(x, "sendInitialProvisionalResponse", value.asInstanceOf[js.Any])
    
    inline def setSessionDescriptionHandlerFactory(value: (/* session */ Session, /* options */ js.UndefOr[js.Object]) => SessionDescriptionHandler): Self = StObject.set(x, "sessionDescriptionHandlerFactory", js.Any.fromFunction2(value))
    
    inline def setSessionDescriptionHandlerFactoryOptions(value: js.Object): Self = StObject.set(x, "sessionDescriptionHandlerFactoryOptions", value.asInstanceOf[js.Any])
    
    inline def setSipExtension100rel(value: SIPExtension): Self = StObject.set(x, "sipExtension100rel", value.asInstanceOf[js.Any])
    
    inline def setSipExtensionExtraSupported(value: js.Array[String]): Self = StObject.set(x, "sipExtensionExtraSupported", value.asInstanceOf[js.Any])
    
    inline def setSipExtensionExtraSupportedVarargs(value: String*): Self = StObject.set(x, "sipExtensionExtraSupported", js.Array(value*))
    
    inline def setSipExtensionReplaces(value: SIPExtension): Self = StObject.set(x, "sipExtensionReplaces", value.asInstanceOf[js.Any])
    
    inline def setSipjsId(value: String): Self = StObject.set(x, "sipjsId", value.asInstanceOf[js.Any])
    
    inline def setTransportConstructor(value: Instantiable2[/* logger */ Logger, /* options */ Any, Transport]): Self = StObject.set(x, "transportConstructor", value.asInstanceOf[js.Any])
    
    inline def setTransportOptions(value: Any): Self = StObject.set(x, "transportOptions", value.asInstanceOf[js.Any])
    
    inline def setUri(value: URI): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUserAgentString(value: String): Self = StObject.set(x, "userAgentString", value.asInstanceOf[js.Any])
    
    inline def setViaHost(value: String): Self = StObject.set(x, "viaHost", value.asInstanceOf[js.Any])
  }
}
