package typings.sipJs.userAgentOptionsMod

import org.scalablytyped.runtime.Instantiable2
import typings.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandler
import typings.sipJs.coreMod.URI
import typings.sipJs.sessionDescriptionHandlerFactoryMod.SessionDescriptionHandlerFactory
import typings.sipJs.sessionMod.Session
import typings.sipJs.transportMod.Transport
import typings.sipJs.userAgentDelegateMod.UserAgentDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserAgentOptions extends js.Object {
  /**
    * If `true`, the user agent will accept out of dialog NOTIFY.
    * @remarks
    * RFC 6665 obsoletes the use of out of dialog NOTIFY from RFC 3265.
    * @defaultValue `false`
    */
  var allowLegacyNotifications: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, the user agent will accept out of dialog REFER.
    * @defaultValue `false`
    */
  var allowOutOfDialogRefers: js.UndefOr[Boolean] = js.undefined
  /**
    * Authorization password.
    * @defaultValue `""`
    */
  var authorizationPassword: js.UndefOr[String] = js.undefined
  /**
    * Authorization username.
    * @defaultValue `""`
    */
  var authorizationUsername: js.UndefOr[String] = js.undefined
  /**
    * @deprecated
    * If `true`, the user agent calls the `start()` method in the constructor.
    * @defaultValue `false`
    * @remarks
    * The call to start() resolves when the user agent connects, so if this
    * option is set to `true` an alternative method of connection detection
    * must be used.
    */
  var autoStart: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, the user agent calls the `stop()` method on unload (if running in browser window).
    * @defaultValue `true`
    */
  var autoStop: js.UndefOr[Boolean] = js.undefined
  /**
    * Delegate for {@link UserAgent}.
    * @defaultValue `{}`
    */
  var delegate: js.UndefOr[UserAgentDelegate] = js.undefined
  /**
    * The display name associated with the user agent.
    * @remarks
    * Descriptive name to be shown to the called party when calling or sending IM messages
    * (the display name portion of the From header).
    * It must NOT be enclosed between double quotes even if the given name contains multi-byte symbols
    * (SIPjs will always enclose the `displayName` value between double quotes).
    * @defaultValue `""`
    */
  var displayName: js.UndefOr[String] = js.undefined
  /**
    * Force adding rport to Via header.
    * @defaultValue `false`
    */
  var forceRport: js.UndefOr[Boolean] = js.undefined
  /**
    * Hack
    * @deprecated TBD
    */
  var hackAllowUnregisteredOptionTags: js.UndefOr[Boolean] = js.undefined
  /**
    * Hack
    * @deprecated TBD
    */
  var hackIpInContact: js.UndefOr[Boolean | String] = js.undefined
  /**
    * Hack
    * @deprecated TBD
    */
  var hackViaTcp: js.UndefOr[Boolean] = js.undefined
  /**
    * Hack
    * @deprecated TBD
    */
  var hackWssInTransport: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether log messages should be written to the browser console.
    * @defaultValue `true`
    */
  var logBuiltinEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, constructor logs the user agent configuration.
    * @defaultValue `true`
    */
  var logConfiguration: js.UndefOr[Boolean] = js.undefined
  /**
    * A function which will be called every time a log is generated.
    * @defaultValue A noop
    */
  var logConnector: js.UndefOr[LogConnector] = js.undefined
  /**
    * Indicates the verbosity level of the log messages.
    * @defaultValue `"log"`
    */
  var logLevel: js.UndefOr[LogLevel] = js.undefined
  /**
    * Number of seconds after which an incoming call is rejected if not answered.
    * @defaultValue 60
    */
  var noAnswerTimeout: js.UndefOr[Double] = js.undefined
  /**
    * Adds a Route header(s) to outgoing requests.
    * @defaultValue `[]`
    */
  var preloadedRouteSet: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * @deprecated
    * Maximum number of times to attempt to reconnect when the transport connection drops.
    * @defaultValue 0
    */
  var reconnectionAttempts: js.UndefOr[Double] = js.undefined
  /**
    * @deprecated
    * Seconds to wait between reconnection attempts when the transport connection drops.
    * @defaultValue 4
    */
  var reconnectionDelay: js.UndefOr[Double] = js.undefined
  /**
    * A factory for generating `SessionDescriptionHandler` instances.
    * @remarks
    * The factory will be passed a `Session` object for the current session
    * and the `sessionDescriptionHandlerFactoryOptions` object.
    * @defaultValue `Web.SessionDescriptionHandler.defaultFactory`
    */
  var sessionDescriptionHandlerFactory: js.UndefOr[SessionDescriptionHandlerFactory] = js.undefined
  /**
    * Options to passed to `sessionDescriptionHandlerFactory`.
    * @remarks
    * See `Web.SessionDescriptionHandlerOptions` for details.
    * @defaultValue `{}`
    */
  var sessionDescriptionHandlerFactoryOptions: js.UndefOr[js.Object] = js.undefined
  /**
    * Reliable provisional responses.
    * https://tools.ietf.org/html/rfc3262
    * @defaultValue `SIPExtension.Unsupported`
    */
  var sipExtension100rel: js.UndefOr[SIPExtension] = js.undefined
  /**
    * Extra option tags to claim support for.
    * @remarks
    * Setting an extra option tag does not enable support for the associated extension
    * it simply adds the tag to the list of supported options.
    * See {@link UserAgentRegisteredOptionTags} for valid option tags.
    * @defaultValue `[]`
    */
  var sipExtensionExtraSupported: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Replaces header.
    * https://tools.ietf.org/html/rfc3891
    * @defaultValue `SIPExtension.Unsupported`
    */
  var sipExtensionReplaces: js.UndefOr[SIPExtension] = js.undefined
  /**
    * An id uniquely identify this user agent instance.
    * @defaultValue
    * A random id generated by default.
    */
  var sipjsId: js.UndefOr[String] = js.undefined
  /**
    * A constructor function for the user agent's `Transport`.
    * @remarks
    * For more information about creating your own transport see `Transport`.
    * @defaultValue `WebSocketTransport`
    */
  var transportConstructor: js.UndefOr[Instantiable2[/* logger */ js.Any, /* options */ js.Any, Transport]] = js.undefined
  /**
    * An options bucket object passed to `transportConstructor` when instantiated.
    * @remarks
    * See WebSocket Transport Configuration Parameters for the full list of options for the default transport.
    * @defaultValue `{}`
    */
  var transportOptions: js.UndefOr[js.Any] = js.undefined
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
  var uri: js.UndefOr[URI] = js.undefined
  /**
    * User agent string used in the UserAgent header.
    * @defaultValue
    * A reasonable value is utilized.
    */
  var userAgentString: js.UndefOr[String] = js.undefined
  /**
    * Hostname to use in Via header.
    * @defaultValue
    * A random hostname in the .invalid domain.
    */
  var viaHost: js.UndefOr[String] = js.undefined
}

object UserAgentOptions {
  @scala.inline
  def apply(
    allowLegacyNotifications: js.UndefOr[Boolean] = js.undefined,
    allowOutOfDialogRefers: js.UndefOr[Boolean] = js.undefined,
    authorizationPassword: String = null,
    authorizationUsername: String = null,
    autoStart: js.UndefOr[Boolean] = js.undefined,
    autoStop: js.UndefOr[Boolean] = js.undefined,
    delegate: UserAgentDelegate = null,
    displayName: String = null,
    forceRport: js.UndefOr[Boolean] = js.undefined,
    hackAllowUnregisteredOptionTags: js.UndefOr[Boolean] = js.undefined,
    hackIpInContact: Boolean | String = null,
    hackViaTcp: js.UndefOr[Boolean] = js.undefined,
    hackWssInTransport: js.UndefOr[Boolean] = js.undefined,
    logBuiltinEnabled: js.UndefOr[Boolean] = js.undefined,
    logConfiguration: js.UndefOr[Boolean] = js.undefined,
    logConnector: (/* level */ LogLevel, /* category */ String, /* label */ js.UndefOr[String], /* content */ String) => Unit = null,
    logLevel: LogLevel = null,
    noAnswerTimeout: Int | Double = null,
    preloadedRouteSet: js.Array[String] = null,
    reconnectionAttempts: Int | Double = null,
    reconnectionDelay: Int | Double = null,
    sessionDescriptionHandlerFactory: (/* session */ Session, /* options */ js.UndefOr[js.Object]) => SessionDescriptionHandler = null,
    sessionDescriptionHandlerFactoryOptions: js.Object = null,
    sipExtension100rel: SIPExtension = null,
    sipExtensionExtraSupported: js.Array[String] = null,
    sipExtensionReplaces: SIPExtension = null,
    sipjsId: String = null,
    transportConstructor: Instantiable2[/* logger */ js.Any, /* options */ js.Any, Transport] = null,
    transportOptions: js.Any = null,
    uri: URI = null,
    userAgentString: String = null,
    viaHost: String = null
  ): UserAgentOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowLegacyNotifications)) __obj.updateDynamic("allowLegacyNotifications")(allowLegacyNotifications.asInstanceOf[js.Any])
    if (!js.isUndefined(allowOutOfDialogRefers)) __obj.updateDynamic("allowOutOfDialogRefers")(allowOutOfDialogRefers.asInstanceOf[js.Any])
    if (authorizationPassword != null) __obj.updateDynamic("authorizationPassword")(authorizationPassword.asInstanceOf[js.Any])
    if (authorizationUsername != null) __obj.updateDynamic("authorizationUsername")(authorizationUsername.asInstanceOf[js.Any])
    if (!js.isUndefined(autoStart)) __obj.updateDynamic("autoStart")(autoStart.asInstanceOf[js.Any])
    if (!js.isUndefined(autoStop)) __obj.updateDynamic("autoStop")(autoStop.asInstanceOf[js.Any])
    if (delegate != null) __obj.updateDynamic("delegate")(delegate.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(forceRport)) __obj.updateDynamic("forceRport")(forceRport.asInstanceOf[js.Any])
    if (!js.isUndefined(hackAllowUnregisteredOptionTags)) __obj.updateDynamic("hackAllowUnregisteredOptionTags")(hackAllowUnregisteredOptionTags.asInstanceOf[js.Any])
    if (hackIpInContact != null) __obj.updateDynamic("hackIpInContact")(hackIpInContact.asInstanceOf[js.Any])
    if (!js.isUndefined(hackViaTcp)) __obj.updateDynamic("hackViaTcp")(hackViaTcp.asInstanceOf[js.Any])
    if (!js.isUndefined(hackWssInTransport)) __obj.updateDynamic("hackWssInTransport")(hackWssInTransport.asInstanceOf[js.Any])
    if (!js.isUndefined(logBuiltinEnabled)) __obj.updateDynamic("logBuiltinEnabled")(logBuiltinEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(logConfiguration)) __obj.updateDynamic("logConfiguration")(logConfiguration.asInstanceOf[js.Any])
    if (logConnector != null) __obj.updateDynamic("logConnector")(js.Any.fromFunction4(logConnector))
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (noAnswerTimeout != null) __obj.updateDynamic("noAnswerTimeout")(noAnswerTimeout.asInstanceOf[js.Any])
    if (preloadedRouteSet != null) __obj.updateDynamic("preloadedRouteSet")(preloadedRouteSet.asInstanceOf[js.Any])
    if (reconnectionAttempts != null) __obj.updateDynamic("reconnectionAttempts")(reconnectionAttempts.asInstanceOf[js.Any])
    if (reconnectionDelay != null) __obj.updateDynamic("reconnectionDelay")(reconnectionDelay.asInstanceOf[js.Any])
    if (sessionDescriptionHandlerFactory != null) __obj.updateDynamic("sessionDescriptionHandlerFactory")(js.Any.fromFunction2(sessionDescriptionHandlerFactory))
    if (sessionDescriptionHandlerFactoryOptions != null) __obj.updateDynamic("sessionDescriptionHandlerFactoryOptions")(sessionDescriptionHandlerFactoryOptions.asInstanceOf[js.Any])
    if (sipExtension100rel != null) __obj.updateDynamic("sipExtension100rel")(sipExtension100rel.asInstanceOf[js.Any])
    if (sipExtensionExtraSupported != null) __obj.updateDynamic("sipExtensionExtraSupported")(sipExtensionExtraSupported.asInstanceOf[js.Any])
    if (sipExtensionReplaces != null) __obj.updateDynamic("sipExtensionReplaces")(sipExtensionReplaces.asInstanceOf[js.Any])
    if (sipjsId != null) __obj.updateDynamic("sipjsId")(sipjsId.asInstanceOf[js.Any])
    if (transportConstructor != null) __obj.updateDynamic("transportConstructor")(transportConstructor.asInstanceOf[js.Any])
    if (transportOptions != null) __obj.updateDynamic("transportOptions")(transportOptions.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    if (userAgentString != null) __obj.updateDynamic("userAgentString")(userAgentString.asInstanceOf[js.Any])
    if (viaHost != null) __obj.updateDynamic("viaHost")(viaHost.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgentOptions]
  }
}

