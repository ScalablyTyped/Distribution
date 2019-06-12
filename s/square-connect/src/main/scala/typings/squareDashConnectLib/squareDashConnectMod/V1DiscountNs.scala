package typings
package squareDashConnectLib.squareDashConnectMod

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
    sealed trait A82ee5
      extends squareDashConnectLib.squareDashConnectMod.V1DiscountNs.ColorEnum
    
    @js.native
    sealed trait B21212
      extends squareDashConnectLib.squareDashConnectMod.V1DiscountNs.ColorEnum
    
    @js.native
    sealed trait E5457a
      extends squareDashConnectLib.squareDashConnectMod.V1DiscountNs.ColorEnum
    
    @js.native
    sealed trait E5BF00
      extends squareDashConnectLib.squareDashConnectMod.V1DiscountNs.ColorEnum
    
    @js.native
    sealed trait _0b8000
      extends squareDashConnectLib.squareDashConnectMod.V1DiscountNs.ColorEnum
    
    @js.native
    sealed trait _2952cc
      extends squareDashConnectLib.squareDashConnectMod.V1DiscountNs.ColorEnum
    
    @js.native
    sealed trait _4ab200
      extends squareDashConnectLib.squareDashConnectMod.V1DiscountNs.ColorEnum
    
    @js.native
    sealed trait _593c00
      extends squareDashConnectLib.squareDashConnectMod.V1DiscountNs.ColorEnum
    
    @js.native
    sealed trait _9da2a6
      extends squareDashConnectLib.squareDashConnectMod.V1DiscountNs.ColorEnum
    
    /* "a82ee5" */ val A82ee5: A82ee5 with java.lang.String = js.native
    /* "b21212" */ val B21212: B21212 with java.lang.String = js.native
    /* "e5457a" */ val E5457a: E5457a with java.lang.String = js.native
    /* "e5BF00" */ val E5BF00: E5BF00 with java.lang.String = js.native
    /* "0b8000" */ val _0b8000: _0b8000 with java.lang.String = js.native
    /* "2952cc" */ val _2952cc: _2952cc with java.lang.String = js.native
    /* "4ab200" */ val _4ab200: _4ab200 with java.lang.String = js.native
    /* "593c00" */ val _593c00: _593c00 with java.lang.String = js.native
    /* "9da2a6" */ val _9da2a6: _9da2a6 with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.V1DiscountNs.ColorEnum with java.lang.String
      ] = js.native
  }
  
  @js.native
  object DiscountTypeEnum extends js.Object {
    @js.native
    sealed trait FIXED
      extends squareDashConnectLib.squareDashConnectMod.V1DiscountNs.DiscountTypeEnum
    
    @js.native
    sealed trait VARIABLE_AMOUNT
      extends squareDashConnectLib.squareDashConnectMod.V1DiscountNs.DiscountTypeEnum
    
    @js.native
    sealed trait VARIABLE_PERCENTAGE
      extends squareDashConnectLib.squareDashConnectMod.V1DiscountNs.DiscountTypeEnum
    
    /* "FIXED" */ val FIXED: FIXED with java.lang.String = js.native
    /* "VARIABLE_AMOUNT" */ val VARIABLE_AMOUNT: VARIABLE_AMOUNT with java.lang.String = js.native
    /* "VARIABLE_PERCENTAGE" */ val VARIABLE_PERCENTAGE: VARIABLE_PERCENTAGE with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.V1DiscountNs.DiscountTypeEnum with java.lang.String
      ] = js.native
  }
  
}

