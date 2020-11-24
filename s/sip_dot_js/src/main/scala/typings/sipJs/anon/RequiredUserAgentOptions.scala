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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<sip.js.sip.js/lib/api/user-agent-options.UserAgentOptions> */
@js.native
trait RequiredUserAgentOptions extends js.Object {
  
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
