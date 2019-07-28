package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.V1DiscountNs.ColorEnum
import typings.squareDashConnect.squareDashConnectMod.V1DiscountNs.DiscountTypeEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1Discount")
@js.native
object V1DiscountNs extends js.Object {
  @js.native
  sealed trait ColorEnum extends js.Object
  
  @js.native
  sealed trait DiscountTypeEnum extends js.Object
  
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
    
    /* "a82ee5" */ val A82ee5: typings.squareDashConnect.squareDashConnectMod.V1DiscountNs.ColorEnum.A82ee5 with String = js.native
    /* "b21212" */ val B21212: typings.squareDashConnect.squareDashConnectMod.V1DiscountNs.ColorEnum.B21212 with String = js.native
    /* "e5457a" */ val E5457a: typings.squareDashConnect.squareDashConnectMod.V1DiscountNs.ColorEnum.E5457a with String = js.native
    /* "e5BF00" */ val E5BF00: typings.squareDashConnect.squareDashConnectMod.V1DiscountNs.ColorEnum.E5BF00 with String = js.native
    /* "0b8000" */ val _0b8000: typings.squareDashConnect.squareDashConnectMod.V1DiscountNs.ColorEnum._0b8000 with String = js.native
    /* "2952cc" */ val _2952cc: typings.squareDashConnect.squareDashConnectMod.V1DiscountNs.ColorEnum._2952cc with String = js.native
    /* "4ab200" */ val _4ab200: typings.squareDashConnect.squareDashConnectMod.V1DiscountNs.ColorEnum._4ab200 with String = js.native
    /* "593c00" */ val _593c00: typings.squareDashConnect.squareDashConnectMod.V1DiscountNs.ColorEnum._593c00 with String = js.native
    /* "9da2a6" */ val _9da2a6: typings.squareDashConnect.squareDashConnectMod.V1DiscountNs.ColorEnum._9da2a6 with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ColorEnum with String] = js.native
  }
  
  @js.native
  object DiscountTypeEnum extends js.Object {
    @js.native
    sealed trait FIXED extends DiscountTypeEnum
    
    @js.native
    sealed trait VARIABLE_AMOUNT extends DiscountTypeEnum
    
    @js.native
    sealed trait VARIABLE_PERCENTAGE extends DiscountTypeEnum
    
    /* "FIXED" */ val FIXED: typings.squareDashConnect.squareDashConnectMod.V1DiscountNs.DiscountTypeEnum.FIXED with String = js.native
    /* "VARIABLE_AMOUNT" */ val VARIABLE_AMOUNT: typings.squareDashConnect.squareDashConnectMod.V1DiscountNs.DiscountTypeEnum.VARIABLE_AMOUNT with String = js.native
    /* "VARIABLE_PERCENTAGE" */ val VARIABLE_PERCENTAGE: typings.squareDashConnect.squareDashConnectMod.V1DiscountNs.DiscountTypeEnum.VARIABLE_PERCENTAGE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[DiscountTypeEnum with String] = js.native
  }
  
}

