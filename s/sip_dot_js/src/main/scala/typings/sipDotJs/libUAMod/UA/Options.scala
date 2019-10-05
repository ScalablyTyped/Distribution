package typings.sipDotJs.libUAMod.UA

import org.scalablytyped.runtime.Instantiable2
import typings.sipDotJs.Anon_BuiltinEnabled
import typings.sipDotJs.libConstantsMod.C.supported
import typings.sipDotJs.libCoreMod.DigestAuthentication
import typings.sipDotJs.libCoreMod.Transport
import typings.sipDotJs.libCoreMod.URI
import typings.sipDotJs.libSessionDashDescriptionDashHandlerDashFactoryMod.SessionDescriptionHandlerFactory
import typings.sipDotJs.libSessionDashDescriptionDashHandlerDashFactoryMod.SessionDescriptionHandlerFactoryOptions
import typings.sipDotJs.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandler
import typings.sipDotJs.libSessionMod.InviteClientContext
import typings.sipDotJs.libSessionMod.InviteServerContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var allowLegacyNotifications: js.UndefOr[Boolean] = js.undefined
  var allowOutOfDialogRefers: js.UndefOr[Boolean] = js.undefined
  var authenticationFactory: js.UndefOr[js.Function1[/* ua */ typings.sipDotJs.libUAMod.UA, DigestAuthentication | _]] = js.undefined
  var authorizationUser: js.UndefOr[String] = js.undefined
  var autostart: js.UndefOr[Boolean] = js.undefined
  var autostop: js.UndefOr[Boolean] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
  var dtmfType: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DtmfType */ js.Any
  ] = js.undefined
  var experimentalFeatures: js.UndefOr[Boolean] = js.undefined
  var extraSupported: js.UndefOr[js.Array[String]] = js.undefined
  var forceRport: js.UndefOr[Boolean] = js.undefined
  var hackAllowUnregisteredOptionTags: js.UndefOr[Boolean] = js.undefined
  var hackIpInContact: js.UndefOr[Boolean] = js.undefined
  var hackViaTcp: js.UndefOr[Boolean] = js.undefined
  var hackWssInTransport: js.UndefOr[Boolean] = js.undefined
  var hostportParams: js.UndefOr[js.Any] = js.undefined
  var log: js.UndefOr[Anon_BuiltinEnabled] = js.undefined
  var noAnswerTimeout: js.UndefOr[Double] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var register: js.UndefOr[Boolean] = js.undefined
  var registerOptions: js.UndefOr[RegisterOptions] = js.undefined
  var rel100: js.UndefOr[supported] = js.undefined
  var replaces: js.UndefOr[supported] = js.undefined
  var sessionDescriptionHandlerFactory: js.UndefOr[SessionDescriptionHandlerFactory] = js.undefined
  var sessionDescriptionHandlerFactoryOptions: js.UndefOr[SessionDescriptionHandlerFactoryOptions] = js.undefined
  var sipjsId: js.UndefOr[String] = js.undefined
  var transportConstructor: js.UndefOr[Instantiable2[/* logger */ js.Any, /* options */ js.Any, Transport]] = js.undefined
  var transportOptions: js.UndefOr[js.Any] = js.undefined
  var uri: js.UndefOr[String | URI] = js.undefined
  var usePreloadedRoute: js.UndefOr[Boolean] = js.undefined
  var userAgentString: js.UndefOr[String] = js.undefined
  var viaHost: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowLegacyNotifications: js.UndefOr[Boolean] = js.undefined,
    allowOutOfDialogRefers: js.UndefOr[Boolean] = js.undefined,
    authenticationFactory: /* ua */ typings.sipDotJs.libUAMod.UA => DigestAuthentication | _ = null,
    authorizationUser: String = null,
    autostart: js.UndefOr[Boolean] = js.undefined,
    autostop: js.UndefOr[Boolean] = js.undefined,
    displayName: String = null,
    dtmfType: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DtmfType */ js.Any = null,
    experimentalFeatures: js.UndefOr[Boolean] = js.undefined,
    extraSupported: js.Array[String] = null,
    forceRport: js.UndefOr[Boolean] = js.undefined,
    hackAllowUnregisteredOptionTags: js.UndefOr[Boolean] = js.undefined,
    hackIpInContact: js.UndefOr[Boolean] = js.undefined,
    hackViaTcp: js.UndefOr[Boolean] = js.undefined,
    hackWssInTransport: js.UndefOr[Boolean] = js.undefined,
    hostportParams: js.Any = null,
    log: Anon_BuiltinEnabled = null,
    noAnswerTimeout: Int | Double = null,
    password: String = null,
    register: js.UndefOr[Boolean] = js.undefined,
    registerOptions: RegisterOptions = null,
    rel100: supported = null,
    replaces: supported = null,
    sessionDescriptionHandlerFactory: (/* session */ InviteClientContext | InviteServerContext, /* options */ js.UndefOr[SessionDescriptionHandlerFactoryOptions]) => SessionDescriptionHandler = null,
    sessionDescriptionHandlerFactoryOptions: SessionDescriptionHandlerFactoryOptions = null,
    sipjsId: String = null,
    transportConstructor: Instantiable2[/* logger */ js.Any, /* options */ js.Any, Transport] = null,
    transportOptions: js.Any = null,
    uri: String | URI = null,
    usePreloadedRoute: js.UndefOr[Boolean] = js.undefined,
    userAgentString: String = null,
    viaHost: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowLegacyNotifications)) __obj.updateDynamic("allowLegacyNotifications")(allowLegacyNotifications)
    if (!js.isUndefined(allowOutOfDialogRefers)) __obj.updateDynamic("allowOutOfDialogRefers")(allowOutOfDialogRefers)
    if (authenticationFactory != null) __obj.updateDynamic("authenticationFactory")(js.Any.fromFunction1(authenticationFactory))
    if (authorizationUser != null) __obj.updateDynamic("authorizationUser")(authorizationUser)
    if (!js.isUndefined(autostart)) __obj.updateDynamic("autostart")(autostart)
    if (!js.isUndefined(autostop)) __obj.updateDynamic("autostop")(autostop)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (dtmfType != null) __obj.updateDynamic("dtmfType")(dtmfType)
    if (!js.isUndefined(experimentalFeatures)) __obj.updateDynamic("experimentalFeatures")(experimentalFeatures)
    if (extraSupported != null) __obj.updateDynamic("extraSupported")(extraSupported)
    if (!js.isUndefined(forceRport)) __obj.updateDynamic("forceRport")(forceRport)
    if (!js.isUndefined(hackAllowUnregisteredOptionTags)) __obj.updateDynamic("hackAllowUnregisteredOptionTags")(hackAllowUnregisteredOptionTags)
    if (!js.isUndefined(hackIpInContact)) __obj.updateDynamic("hackIpInContact")(hackIpInContact)
    if (!js.isUndefined(hackViaTcp)) __obj.updateDynamic("hackViaTcp")(hackViaTcp)
    if (!js.isUndefined(hackWssInTransport)) __obj.updateDynamic("hackWssInTransport")(hackWssInTransport)
    if (hostportParams != null) __obj.updateDynamic("hostportParams")(hostportParams)
    if (log != null) __obj.updateDynamic("log")(log)
    if (noAnswerTimeout != null) __obj.updateDynamic("noAnswerTimeout")(noAnswerTimeout.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password)
    if (!js.isUndefined(register)) __obj.updateDynamic("register")(register)
    if (registerOptions != null) __obj.updateDynamic("registerOptions")(registerOptions)
    if (rel100 != null) __obj.updateDynamic("rel100")(rel100)
    if (replaces != null) __obj.updateDynamic("replaces")(replaces)
    if (sessionDescriptionHandlerFactory != null) __obj.updateDynamic("sessionDescriptionHandlerFactory")(js.Any.fromFunction2(sessionDescriptionHandlerFactory))
    if (sessionDescriptionHandlerFactoryOptions != null) __obj.updateDynamic("sessionDescriptionHandlerFactoryOptions")(sessionDescriptionHandlerFactoryOptions)
    if (sipjsId != null) __obj.updateDynamic("sipjsId")(sipjsId)
    if (transportConstructor != null) __obj.updateDynamic("transportConstructor")(transportConstructor)
    if (transportOptions != null) __obj.updateDynamic("transportOptions")(transportOptions)
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    if (!js.isUndefined(usePreloadedRoute)) __obj.updateDynamic("usePreloadedRoute")(usePreloadedRoute)
    if (userAgentString != null) __obj.updateDynamic("userAgentString")(userAgentString)
    if (viaHost != null) __obj.updateDynamic("viaHost")(viaHost)
    __obj.asInstanceOf[Options]
  }
}

