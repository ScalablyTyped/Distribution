package typings
package sipDotJsLib.typesUaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/ua", "UA")
@js.native
object UANs extends js.Object {
  @js.native
  sealed trait DtmfType extends js.Object
  
  trait Options extends js.Object {
    var allowLegacyNotifications: js.UndefOr[scala.Boolean] = js.undefined
    var allowOutOfDialogRefers: js.UndefOr[scala.Boolean] = js.undefined
    var authorizationUser: js.UndefOr[java.lang.String] = js.undefined
    var autostart: js.UndefOr[scala.Boolean] = js.undefined
    var displayName: js.UndefOr[java.lang.String] = js.undefined
    var dtmfType: js.UndefOr[DtmfType] = js.undefined
    var hackIpInContact: js.UndefOr[scala.Boolean] = js.undefined
    var hackViaTcp: js.UndefOr[scala.Boolean] = js.undefined
    var hackWssInTransport: js.UndefOr[scala.Boolean] = js.undefined
    var log: js.UndefOr[js.Any] = js.undefined
     // TODO
    var noAnswerTimeout: js.UndefOr[scala.Double] = js.undefined
    var password: js.UndefOr[java.lang.String] = js.undefined
    var register: js.UndefOr[scala.Boolean] = js.undefined
    var registerOptions: js.UndefOr[RegisterOptions] = js.undefined
    var rel100: js.UndefOr[sipDotJsLib.typesSIPMod.CNs.supported] = js.undefined
    var replaces: js.UndefOr[sipDotJsLib.typesSIPMod.CNs.supported] = js.undefined
    var sessionDescriptionHandlerFactory: js.UndefOr[
        sipDotJsLib.typesSessionDashDescriptionDashHandlerDashFactoryMod.SessionDescriptionHandlerFactory
      ] = js.undefined
    var sessionDescriptionHandlerFactoryOptions: js.UndefOr[
        sipDotJsLib.typesSessionDashDescriptionDashHandlerDashFactoryMod.SessionDescriptionHandlerFactoryOptions
      ] = js.undefined
    var transportConstructor: js.UndefOr[js.Function2[/* logger */ js.Any, /* options */ js.Any, _]] = js.undefined
     // TODO
    var transportOptions: js.UndefOr[js.Any] = js.undefined
    var uri: js.UndefOr[java.lang.String] = js.undefined
     // TODO
    var userAgentString: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait RegisterOptions extends js.Object {
    var expires: js.UndefOr[scala.Double] = js.undefined
    var extraContactHeaderParams: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    var instanceId: js.UndefOr[java.lang.String] = js.undefined
    var params: js.UndefOr[js.Any] = js.undefined
    var regId: js.UndefOr[scala.Double] = js.undefined
    var registrar: js.UndefOr[java.lang.String] = js.undefined
  }
  
  @js.native
  object DtmfType extends js.Object {
    @js.native
    sealed trait INFO
      extends sipDotJsLib.typesUaMod.UANs.DtmfType
    
    @js.native
    sealed trait RTP
      extends sipDotJsLib.typesUaMod.UANs.DtmfType
    
    /* "info" */ val INFO: INFO with java.lang.String = js.native
    /* "rtp" */ val RTP: RTP with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[sipDotJsLib.typesUaMod.UANs.DtmfType with java.lang.String] = js.native
  }
  
}

