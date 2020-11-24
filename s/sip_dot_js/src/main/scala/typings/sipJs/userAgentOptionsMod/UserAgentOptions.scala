package typings.sipJs.userAgentOptionsMod

import org.scalablytyped.runtime.Instantiable2
import typings.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandler
import typings.sipJs.coreMod.Logger
import typings.sipJs.coreMod.URI
import typings.sipJs.sessionDescriptionHandlerFactoryMod.SessionDescriptionHandlerFactory
import typings.sipJs.sessionMod.Session
import typings.sipJs.transportMod.Transport
import typings.sipJs.userAgentDelegateMod.UserAgentDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserAgentOptions extends js.Object {
  
  /**
    * If `true`, the user agent will accept out of dialog NOTIFY.
    * @remarks
    * RFC 6665 obsoletes the use of out of dialog NOTIFY from RFC 3265.
    * @defaultValue `false`
    */
  var allowLegacyNotifications: js.UndefOr[Boolean] = js.native
  
  /**
    * Authorization ha1.
    * @defaultValue `""`
    */
  var authorizationHa1: js.UndefOr[String] = js.native
  
  /**
    * Authorization password.
    * @defaultValue `""`
    */
  var authorizationPassword: js.UndefOr[String] = js.native
  
  /**
    * Authorization username.
    * @defaultValue `""`
    */
  var authorizationUsername: js.UndefOr[String] = js.native
  
  /**
    * @deprecated
    * If `true`, the user agent calls the `start()` method in the constructor.
    * @defaultValue `false`
    * @remarks
    * The call to start() resolves when the user agent connects, so if this
    * option is set to `true` an alternative method of connection detection
    * must be used.
    */
  var autoStart: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, the user agent calls the `stop()` method on unload (if running in browser window).
    * @defaultValue `true`
    */
  var autoStop: js.UndefOr[Boolean] = js.native
  
  /**
    * Delegate for {@link UserAgent}.
    * @defaultValue `{}`
    */
  var delegate: js.UndefOr[UserAgentDelegate] = js.native
  
  /**
    * The display name associated with the user agent.
    * @remarks
    * Descriptive name to be shown to the called party when calling or sending IM messages
    * (the display name portion of the From header).
    * It must NOT be enclosed between double quotes even if the given name contains multi-byte symbols
    * (SIPjs will always enclose the `displayName` value between double quotes).
    * @defaultValue `""`
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * Force adding rport to Via header.
    * @defaultValue `false`
    */
  var forceRport: js.UndefOr[Boolean] = js.native
  
  /**
    * Hack
    * @deprecated TBD
    */
  var hackAllowUnregisteredOptionTags: js.UndefOr[Boolean] = js.native
  
  /**
    * Hack
    * @deprecated TBD
    */
  var hackIpInContact: js.UndefOr[Boolean | String] = js.native
  
  /**
    * Hack
    * @deprecated TBD
    */
  var hackViaTcp: js.UndefOr[Boolean] = js.native
  
  /**
    * Hack
    * @deprecated TBD
    */
  var hackWssInTransport: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether log messages should be written to the browser console.
    * @defaultValue `true`
    */
  var logBuiltinEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, constructor logs the user agent configuration.
    * @defaultValue `true`
    */
  var logConfiguration: js.UndefOr[Boolean] = js.native
  
  /**
    * A function which will be called every time a log is generated.
    * @defaultValue A noop
    */
  var logConnector: js.UndefOr[LogConnector] = js.native
  
  /**
    * Indicates the verbosity level of the log messages.
    * @defaultValue `"log"`
    */
  var logLevel: js.UndefOr[LogLevel] = js.native
  
  /**
    * Number of seconds after which an incoming call is rejected if not answered.
    * @defaultValue 60
    */
  var noAnswerTimeout: js.UndefOr[Double] = js.native
  
  /**
    * Adds a Route header(s) to outgoing requests.
    * @defaultValue `[]`
    */
  var preloadedRouteSet: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * @deprecated
    * Maximum number of times to attempt to reconnect when the transport connection drops.
    * @defaultValue 0
    */
  var reconnectionAttempts: js.UndefOr[Double] = js.native
  
  /**
    * @deprecated
    * Seconds to wait between reconnection attempts when the transport connection drops.
    * @defaultValue 4
    */
  var reconnectionDelay: js.UndefOr[Double] = js.native
  
  /**
    * A factory for generating `SessionDescriptionHandler` instances.
    * @remarks
    * The factory will be passed a `Session` object for the current session
    * and the `sessionDescriptionHandlerFactoryOptions` object.
    * @defaultValue `Web.SessionDescriptionHandler.defaultFactory`
    */
  var sessionDescriptionHandlerFactory: js.UndefOr[SessionDescriptionHandlerFactory] = js.native
  
  /**
    * Options to passed to `sessionDescriptionHandlerFactory`.
    * @remarks
    * See `Web.SessionDescriptionHandlerOptions` for details.
    * @defaultValue `{}`
    */
  var sessionDescriptionHandlerFactoryOptions: js.UndefOr[js.Object] = js.native
  
  /**
    * Reliable provisional responses.
    * https://tools.ietf.org/html/rfc3262
    * @defaultValue `SIPExtension.Unsupported`
    */
  var sipExtension100rel: js.UndefOr[SIPExtension] = js.native
  
  /**
    * Extra option tags to claim support for.
    * @remarks
    * Setting an extra option tag does not enable support for the associated extension
    * it simply adds the tag to the list of supported options.
    * See {@link UserAgentRegisteredOptionTags} for valid option tags.
    * @defaultValue `[]`
    */
  var sipExtensionExtraSupported: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Replaces header.
    * https://tools.ietf.org/html/rfc3891
    * @defaultValue `SIPExtension.Unsupported`
    */
  var sipExtensionReplaces: js.UndefOr[SIPExtension] = js.native
  
  /**
    * An id uniquely identify this user agent instance.
    * @defaultValue
    * A random id generated by default.
    */
  var sipjsId: js.UndefOr[String] = js.native
  
  /**
    * A constructor function for the user agent's `Transport`.
    * @remarks
    * For more information about creating your own transport see `Transport`.
    * @defaultValue `WebSocketTransport`
    */
  var transportConstructor: js.UndefOr[Instantiable2[/* logger */ Logger, /* options */ js.Any, Transport]] = js.native
  
  /**
    * An options bucket object passed to `transportConstructor` when instantiated.
    * @remarks
    * See WebSocket Transport Configuration Parameters for the full list of options for the default transport.
    * @defaultValue `{}`
    */
  var transportOptions: js.UndefOr[js.Any] = js.native
  
  /**
    * SIP Addresses-of-Record URI associated with the user agent.
    * @remarks
    * This is a SIP address given to you by your provider.
    * If the user agent registers, it is the address-of-record which the user agent registers a contact for.
    * An address-of-record represents an identity of the user, generally a long-term identity,
    * and it does not have a dependency on any device; users can move between devices or even
    * be associated with multiple devices at one time while retaining the same address-of-record.
    * A simple URI, generally of the form `sip:egdar@example.com`, is used for an address-of-record.
    * @defaultValue
    * By default, URI is set to `sip:anonymous.X@anonymous.invalid`, where X is a random token generated for each UA.
    */
  var uri: js.UndefOr[URI] = js.native
  
  /**
    * User agent string used in the UserAgent header.
    * @defaultValue
    * A reasonable value is utilized.
    */
  var userAgentString: js.UndefOr[String] = js.native
  
  /**
    * Hostname to use in Via header.
    * @defaultValue
    * A random hostname in the .invalid domain.
    */
  var viaHost: js.UndefOr[String] = js.native
}
object UserAgentOptions {
  
  @scala.inline
  def apply(): UserAgentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserAgentOptions]
  }
  
  @scala.inline
  implicit class UserAgentOptionsOps[Self <: UserAgentOptions] (val x: Self) extends AnyVal {
    
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
