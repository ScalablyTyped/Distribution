package typings.sipDotJs.libUAMod

import org.scalablytyped.runtime.Instantiable2
import typings.sipDotJs.Anon_BuiltinEnabled
import typings.sipDotJs.libConstantsMod.CNs.supported
import typings.sipDotJs.libCoreMod.DigestAuthentication
import typings.sipDotJs.libCoreMod.Transport
import typings.sipDotJs.libCoreMod.URI
import typings.sipDotJs.libSessionDashDescriptionDashHandlerDashFactoryMod.SessionDescriptionHandlerFactory
import typings.sipDotJs.libSessionDashDescriptionDashHandlerDashFactoryMod.SessionDescriptionHandlerFactoryOptions
import typings.sipDotJs.libUAMod.UANs.DtmfType
import typings.sipDotJs.libUAMod.UANs.RegisterOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/UA", "UA")
@js.native
object UANs extends js.Object {
  @js.native
  sealed trait DtmfType extends js.Object
  
  trait Options extends js.Object {
    var allowLegacyNotifications: js.UndefOr[Boolean] = js.undefined
    var allowOutOfDialogRefers: js.UndefOr[Boolean] = js.undefined
    var authenticationFactory: js.UndefOr[js.Function1[/* ua */ UA, DigestAuthentication | _]] = js.undefined
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
  
  trait RegisterOptions extends js.Object {
    var expires: js.UndefOr[Double] = js.undefined
    var extraContactHeaderParams: js.UndefOr[js.Array[String]] = js.undefined
    var instanceId: js.UndefOr[String] = js.undefined
    var params: js.UndefOr[js.Any] = js.undefined
    var regId: js.UndefOr[Double] = js.undefined
    var registrar: js.UndefOr[String] = js.undefined
  }
  
  @js.native
  object DtmfType extends js.Object {
    @js.native
    sealed trait INFO extends DtmfType
    
    @js.native
    sealed trait RTP extends DtmfType
    
    /* "info" */ val INFO: typings.sipDotJs.libUAMod.UANs.DtmfType.INFO with String = js.native
    /* "rtp" */ val RTP: typings.sipDotJs.libUAMod.UANs.DtmfType.RTP with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[DtmfType with String] = js.native
  }
  
}

