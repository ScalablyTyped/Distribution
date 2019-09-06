package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.LocationNs.CapabilitiesEnum
import typings.squareDashConnect.squareDashConnectMod.LocationNs.TypeEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "Location")
@js.native
object LocationNs extends js.Object {
  @js.native
  sealed trait CapabilitiesEnum extends js.Object
  
  @js.native
  sealed trait TypeEnum extends js.Object
  
  @js.native
  object CapabilitiesEnum extends js.Object {
    @js.native
    sealed trait CREDIT_CARD_PROCESSING extends CapabilitiesEnum
    
    /* "CREDIT_CARD_PROCESSING" */ val CREDIT_CARD_PROCESSING: typings.squareDashConnect.squareDashConnectMod.LocationNs.CapabilitiesEnum.CREDIT_CARD_PROCESSING with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CapabilitiesEnum with String] = js.native
  }
  
  @js.native
  object TypeEnum extends js.Object {
    @js.native
    sealed trait MOBILE extends TypeEnum
    
    @js.native
    sealed trait PHYSICAL extends TypeEnum
    
    /* "MOBILE" */ val MOBILE: typings.squareDashConnect.squareDashConnectMod.LocationNs.TypeEnum.MOBILE with String = js.native
    /* "PHYSICAL" */ val PHYSICAL: typings.squareDashConnect.squareDashConnectMod.LocationNs.TypeEnum.PHYSICAL with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TypeEnum with String] = js.native
  }
  
}

