package typings.sipJs

import org.scalablytyped.runtime.Instantiable2
import typings.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandler
import typings.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandlerModifier
import typings.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandlerOptions
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Anonymous extends StObject {
    
    var anonymous: js.UndefOr[Boolean] = js.native
    
    var outbound: js.UndefOr[Boolean] = js.native
  }
  object Anonymous {
    
    @scala.inline
    def apply(): Anonymous = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Anonymous]
    }
    
    @scala.inline
    implicit class AnonymousMutableBuilder[Self <: Anonymous] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnonymous(value: Boolean): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnonymousUndefined: Self = StObject.set(x, "anonymous", js.undefined)
      
      @scala.inline
      def setOutbound(value: Boolean): Self = StObject.set(x, "outbound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutboundUndefined: Self = StObject.set(x, "outbound", js.undefined)
    }
  }
  
  @js.native
  trait Body extends StObject {
    
    var body: String = js.native
    
    var contentType: String = js.native
  }
  object Body {
    
    @scala.inline
    def apply(body: String, contentType: String): Body = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any])
      __obj.asInstanceOf[Body]
    }
    
    @scala.inline
    implicit class BodyMutableBuilder[Self <: Body] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Buffer extends StObject {
    
    var buffer: String = js.native
    
    var buflen: Double = js.native
    
    var length: Double = js.native
    
    var state: js.Array[Double] = js.native
  }
  object Buffer {
    
    @scala.inline
    def apply(buffer: String, buflen: Double, length: Double, state: js.Array[Double]): Buffer = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], buflen = buflen.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Buffer]
    }
    
    @scala.inline
    implicit class BufferMutableBuilder[Self <: Buffer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuffer(value: String): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuflen(value: Double): Self = StObject.set(x, "buflen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: js.Array[Double]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateVarargs(value: Double*): Self = StObject.set(x, "state", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Cseq extends StObject {
    
    var body: js.UndefOr[typings.sipJs.bodyMod.Body] = js.native
    
    var cseq: js.UndefOr[Double] = js.native
    
    var extraHeaders: js.UndefOr[js.Array[String]] = js.native
  }
  object Cseq {
    
    @scala.inline
    def apply(): Cseq = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cseq]
    }
    
    @scala.inline
    implicit class CseqMutableBuilder[Self <: Cseq] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: typings.sipJs.bodyMod.Body): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setCseq(value: Double): Self = StObject.set(x, "cseq", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCseqUndefined: Self = StObject.set(x, "cseq", js.undefined)
      
      @scala.inline
      def setExtraHeaders(value: js.Array[String]): Self = StObject.set(x, "extraHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraHeadersUndefined: Self = StObject.set(x, "extraHeaders", js.undefined)
      
      @scala.inline
      def setExtraHeadersVarargs(value: String*): Self = StObject.set(x, "extraHeaders", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Duration extends StObject {
    
    var duration: Double = js.native
    
    var interToneGap: Double = js.native
  }
  object Duration {
    
    @scala.inline
    def apply(duration: Double, interToneGap: Double): Duration = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], interToneGap = interToneGap.asInstanceOf[js.Any])
      __obj.asInstanceOf[Duration]
    }
    
    @scala.inline
    implicit class DurationMutableBuilder[Self <: Duration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterToneGap(value: Double): Self = StObject.set(x, "interToneGap", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Error extends StObject {
    
    var error: String = js.native
  }
  object Error {
    
    @scala.inline
    def apply(error: String): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FromDisplayName extends StObject {
    
    var fromDisplayName: js.UndefOr[String] = js.native
    
    var fromTag: js.UndefOr[String] = js.native
    
    var fromUri: js.UndefOr[String | URI] = js.native
    
    var toDisplayName: js.UndefOr[String] = js.native
    
    var toUri: js.UndefOr[String | URI] = js.native
  }
  object FromDisplayName {
    
    @scala.inline
    def apply(): FromDisplayName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FromDisplayName]
    }
    
    @scala.inline
    implicit class FromDisplayNameMutableBuilder[Self <: FromDisplayName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromDisplayName(value: String): Self = StObject.set(x, "fromDisplayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromDisplayNameUndefined: Self = StObject.set(x, "fromDisplayName", js.undefined)
      
      @scala.inline
      def setFromTag(value: String): Self = StObject.set(x, "fromTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromTagUndefined: Self = StObject.set(x, "fromTag", js.undefined)
      
      @scala.inline
      def setFromUri(value: String | URI): Self = StObject.set(x, "fromUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUriUndefined: Self = StObject.set(x, "fromUri", js.undefined)
      
      @scala.inline
      def setToDisplayName(value: String): Self = StObject.set(x, "toDisplayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToDisplayNameUndefined: Self = StObject.set(x, "toDisplayName", js.undefined)
      
      @scala.inline
      def setToUri(value: String | URI): Self = StObject.set(x, "toUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUriUndefined: Self = StObject.set(x, "toUri", js.undefined)
    }
  }
  
  @js.native
  trait FromTag extends StObject {
    
    var fromDisplayName: js.UndefOr[String] = js.native
    
    var fromTag: js.UndefOr[String] = js.native
    
    var fromUri: js.UndefOr[URI] = js.native
    
    var toDisplayName: js.UndefOr[String] = js.native
    
    var toUri: js.UndefOr[URI] = js.native
  }
  object FromTag {
    
    @scala.inline
    def apply(): FromTag = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FromTag]
    }
    
    @scala.inline
    implicit class FromTagMutableBuilder[Self <: FromTag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromDisplayName(value: String): Self = StObject.set(x, "fromDisplayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromDisplayNameUndefined: Self = StObject.set(x, "fromDisplayName", js.undefined)
      
      @scala.inline
      def setFromTag(value: String): Self = StObject.set(x, "fromTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromTagUndefined: Self = StObject.set(x, "fromTag", js.undefined)
      
      @scala.inline
      def setFromUri(value: URI): Self = StObject.set(x, "fromUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUriUndefined: Self = StObject.set(x, "fromUri", js.undefined)
      
      @scala.inline
      def setToDisplayName(value: String): Self = StObject.set(x, "toDisplayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToDisplayNameUndefined: Self = StObject.set(x, "toDisplayName", js.undefined)
      
      @scala.inline
      def setToUri(value: URI): Self = StObject.set(x, "toUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUriUndefined: Self = StObject.set(x, "toUri", js.undefined)
    }
  }
  
  @js.native
  trait Host extends StObject {
    
    var host: String = js.native
    
    var port: Double = js.native
  }
  object Host {
    
    @scala.inline
    def apply(host: String, port: Double): Host = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[Host]
    }
    
    @scala.inline
    implicit class HostMutableBuilder[Self <: Host] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Once extends StObject {
    
    var once: js.UndefOr[Boolean] = js.native
  }
  object Once {
    
    @scala.inline
    def apply(): Once = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Once]
    }
    
    @scala.inline
    implicit class OnceMutableBuilder[Self <: Once] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
    }
  }
  
  @js.native
  trait Parsed extends StObject {
    
    var parsed: js.UndefOr[js.Any] = js.native
    
    var raw: String = js.native
  }
  object Parsed {
    
    @scala.inline
    def apply(raw: String): Parsed = {
      val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[Parsed]
    }
    
    @scala.inline
    implicit class ParsedMutableBuilder[Self <: Parsed] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParsed(value: js.Any): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParsedUndefined: Self = StObject.set(x, "parsed", js.undefined)
      
      @scala.inline
      def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<sip.js.sip.js/lib/api/user-agent-options.UserAgentOptions> */
  @js.native
  trait PartialUserAgentOptions extends StObject {
    
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
  
  /* Inlined std.Required<sip.js.sip.js/lib/api/user-agent-options.UserAgentOptions> */
  @js.native
  trait RequiredUserAgentOptions extends StObject {
    
    var allowLegacyNotifications: Boolean = js.native
    
    var authorizationHa1: String = js.native
    
    var authorizationPassword: String = js.native
    
    var authorizationUsername: String = js.native
    
    var autoStart: Boolean = js.native
    
    var autoStop: Boolean = js.native
    
    var delegate: UserAgentDelegate = js.native
    
    var displayName: String = js.native
    
    var forceRport: Boolean = js.native
    
    var hackAllowUnregisteredOptionTags: Boolean = js.native
    
    var hackIpInContact: Boolean | String = js.native
    
    var hackViaTcp: Boolean = js.native
    
    var hackWssInTransport: Boolean = js.native
    
    var logBuiltinEnabled: Boolean = js.native
    
    var logConfiguration: Boolean = js.native
    
    def logConnector(level: LogLevel, category: String, label: js.UndefOr[scala.Nothing], content: String): Unit = js.native
    def logConnector(level: LogLevel, category: String, label: String, content: String): Unit = js.native
    @JSName("logConnector")
    var logConnector_Original: LogConnector = js.native
    
    var logLevel: LogLevel = js.native
    
    var noAnswerTimeout: Double = js.native
    
    var preloadedRouteSet: js.Array[String] = js.native
    
    var reconnectionAttempts: Double = js.native
    
    var reconnectionDelay: Double = js.native
    
    def sessionDescriptionHandlerFactory(session: Session): SessionDescriptionHandler = js.native
    def sessionDescriptionHandlerFactory(session: Session, options: js.Object): SessionDescriptionHandler = js.native
    
    var sessionDescriptionHandlerFactoryOptions: js.Object = js.native
    
    @JSName("sessionDescriptionHandlerFactory")
    var sessionDescriptionHandlerFactory_Original: SessionDescriptionHandlerFactory = js.native
    
    var sipExtension100rel: SIPExtension = js.native
    
    var sipExtensionExtraSupported: js.Array[String] = js.native
    
    var sipExtensionReplaces: SIPExtension = js.native
    
    var sipjsId: String = js.native
    
    var transportConstructor: Instantiable2[/* logger */ Logger, /* options */ js.Any, Transport] = js.native
    
    var transportOptions: js.Any = js.native
    
    var uri: URI = js.native
    
    var userAgentString: String = js.native
    
    var viaHost: String = js.native
  }
  
  @js.native
  trait SessionDescriptionHandlerModifiers extends StObject {
    
    var sessionDescriptionHandlerModifiers: js.UndefOr[js.Array[SessionDescriptionHandlerModifier]] = js.native
    
    var sessionDescriptionHandlerOptions: js.UndefOr[SessionDescriptionHandlerOptions] = js.native
  }
  object SessionDescriptionHandlerModifiers {
    
    @scala.inline
    def apply(): SessionDescriptionHandlerModifiers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SessionDescriptionHandlerModifiers]
    }
    
    @scala.inline
    implicit class SessionDescriptionHandlerModifiersMutableBuilder[Self <: SessionDescriptionHandlerModifiers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSessionDescriptionHandlerModifiers(value: js.Array[SessionDescriptionHandlerModifier]): Self = StObject.set(x, "sessionDescriptionHandlerModifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionDescriptionHandlerModifiersUndefined: Self = StObject.set(x, "sessionDescriptionHandlerModifiers", js.undefined)
      
      @scala.inline
      def setSessionDescriptionHandlerModifiersVarargs(value: SessionDescriptionHandlerModifier*): Self = StObject.set(x, "sessionDescriptionHandlerModifiers", js.Array(value :_*))
      
      @scala.inline
      def setSessionDescriptionHandlerOptions(value: SessionDescriptionHandlerOptions): Self = StObject.set(x, "sessionDescriptionHandlerOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionDescriptionHandlerOptionsUndefined: Self = StObject.set(x, "sessionDescriptionHandlerOptions", js.undefined)
    }
  }
}
