package typings
package sipDotJsLib.typesSIPMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/SIP", "C")
@js.native
object CNs extends js.Object {
  @js.native
  sealed trait DtmfType extends js.Object
  
  @js.native
  sealed trait supported extends js.Object
  
  @js.native
  object DtmfType extends js.Object {
    @js.native
    sealed trait INFO
      extends sipDotJsLib.typesSIPMod.CNs.DtmfType
    
    @js.native
    sealed trait RTP
      extends sipDotJsLib.typesSIPMod.CNs.DtmfType
    
    /* "info" */ val INFO: INFO with java.lang.String = js.native
    /* "rtp" */ val RTP: RTP with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[sipDotJsLib.typesSIPMod.CNs.DtmfType with java.lang.String] = js.native
  }
  
  @js.native
  object supported extends js.Object {
    @js.native
    sealed trait REQUIRED
      extends sipDotJsLib.typesSIPMod.CNs.supported
    
    @js.native
    sealed trait SUPPORTED
      extends sipDotJsLib.typesSIPMod.CNs.supported
    
    @js.native
    sealed trait UNSUPPORTED
      extends sipDotJsLib.typesSIPMod.CNs.supported
    
    /* "required" */ val REQUIRED: REQUIRED with java.lang.String = js.native
    /* "supported" */ val SUPPORTED: SUPPORTED with java.lang.String = js.native
    /* "none" */ val UNSUPPORTED: UNSUPPORTED with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[sipDotJsLib.typesSIPMod.CNs.supported with java.lang.String] = js.native
  }
  
}

