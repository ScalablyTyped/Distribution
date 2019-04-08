package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CatalogDiscount")
@js.native
object CatalogDiscountNs extends js.Object {
  @js.native
  sealed trait DiscountTypeEnum extends js.Object
  
  @js.native
  object DiscountTypeEnum extends js.Object {
    @js.native
    sealed trait FIXEDAMOUNT
      extends squareDashConnectLib.squareDashConnectMod.CatalogDiscountNs.DiscountTypeEnum
    
    @js.native
    sealed trait FIXEDPERCENTAGE
      extends squareDashConnectLib.squareDashConnectMod.CatalogDiscountNs.DiscountTypeEnum
    
    @js.native
    sealed trait VARIABLEAMOUNT
      extends squareDashConnectLib.squareDashConnectMod.CatalogDiscountNs.DiscountTypeEnum
    
    @js.native
    sealed trait VARIABLEPERCENTAGE
      extends squareDashConnectLib.squareDashConnectMod.CatalogDiscountNs.DiscountTypeEnum
    
    /* "FIXED_AMOUNT" */ val FIXEDAMOUNT: FIXEDAMOUNT with java.lang.String = js.native
    /* "FIXED_PERCENTAGE" */ val FIXEDPERCENTAGE: FIXEDPERCENTAGE with java.lang.String = js.native
    /* "VARIABLE_AMOUNT" */ val VARIABLEAMOUNT: VARIABLEAMOUNT with java.lang.String = js.native
    /* "VARIABLE_PERCENTAGE" */ val VARIABLEPERCENTAGE: VARIABLEPERCENTAGE with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.CatalogDiscountNs.DiscountTypeEnum with java.lang.String
      ] = js.native
  }
  
}

