package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.V1ItemNs.ColorEnum
import typings.squareDashConnect.squareDashConnectMod.V1ItemNs.TypeEnum
import typings.squareDashConnect.squareDashConnectMod.V1ItemNs.VisibilityEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1Item")
@js.native
object V1ItemNs extends js.Object {
  @js.native
  sealed trait ColorEnum extends js.Object
  
  @js.native
  sealed trait TypeEnum extends js.Object
  
  @js.native
  sealed trait VisibilityEnum extends js.Object
  
  @js.native
  object ColorEnum extends js.Object {
    @js.native
    sealed trait A82ee5 extends ColorEnum
    
    @js.native
    sealed trait B21212 extends ColorEnum
    
    @js.native
    sealed trait E5457a extends ColorEnum
    
    @js.native
    sealed trait E5BF00 extends ColorEnum
    
    @js.native
    sealed trait _0b8000 extends ColorEnum
    
    @js.native
    sealed trait _2952cc extends ColorEnum
    
    @js.native
    sealed trait _4ab200 extends ColorEnum
    
    @js.native
    sealed trait _593c00 extends ColorEnum
    
    @js.native
    sealed trait _9da2a6 extends ColorEnum
    
    /* "a82ee5" */ val A82ee5: typings.squareDashConnect.squareDashConnectMod.V1ItemNs.ColorEnum.A82ee5 with String = js.native
    /* "b21212" */ val B21212: typings.squareDashConnect.squareDashConnectMod.V1ItemNs.ColorEnum.B21212 with String = js.native
    /* "e5457a" */ val E5457a: typings.squareDashConnect.squareDashConnectMod.V1ItemNs.ColorEnum.E5457a with String = js.native
    /* "e5BF00" */ val E5BF00: typings.squareDashConnect.squareDashConnectMod.V1ItemNs.ColorEnum.E5BF00 with String = js.native
    /* "0b8000" */ val _0b8000: typings.squareDashConnect.squareDashConnectMod.V1ItemNs.ColorEnum._0b8000 with String = js.native
    /* "2952cc" */ val _2952cc: typings.squareDashConnect.squareDashConnectMod.V1ItemNs.ColorEnum._2952cc with String = js.native
    /* "4ab200" */ val _4ab200: typings.squareDashConnect.squareDashConnectMod.V1ItemNs.ColorEnum._4ab200 with String = js.native
    /* "593c00" */ val _593c00: typings.squareDashConnect.squareDashConnectMod.V1ItemNs.ColorEnum._593c00 with String = js.native
    /* "9da2a6" */ val _9da2a6: typings.squareDashConnect.squareDashConnectMod.V1ItemNs.ColorEnum._9da2a6 with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ColorEnum with String] = js.native
  }
  
  @js.native
  object TypeEnum extends js.Object {
    @js.native
    sealed trait GIFT_CARD extends TypeEnum
    
    @js.native
    sealed trait NORMAL extends TypeEnum
    
    @js.native
    sealed trait OTHER extends TypeEnum
    
    /* "GIFT_CARD" */ val GIFT_CARD: typings.squareDashConnect.squareDashConnectMod.V1ItemNs.TypeEnum.GIFT_CARD with String = js.native
    /* "NORMAL" */ val NORMAL: typings.squareDashConnect.squareDashConnectMod.V1ItemNs.TypeEnum.NORMAL with String = js.native
    /* "OTHER" */ val OTHER: typings.squareDashConnect.squareDashConnectMod.V1ItemNs.TypeEnum.OTHER with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TypeEnum with String] = js.native
  }
  
  @js.native
  object VisibilityEnum extends js.Object {
    @js.native
    sealed trait PRIVATE extends VisibilityEnum
    
    @js.native
    sealed trait PUBLIC extends VisibilityEnum
    
    /* "PRIVATE" */ val PRIVATE: typings.squareDashConnect.squareDashConnectMod.V1ItemNs.VisibilityEnum.PRIVATE with String = js.native
    /* "PUBLIC" */ val PUBLIC: typings.squareDashConnect.squareDashConnectMod.V1ItemNs.VisibilityEnum.PUBLIC with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[VisibilityEnum with String] = js.native
  }
  
}

