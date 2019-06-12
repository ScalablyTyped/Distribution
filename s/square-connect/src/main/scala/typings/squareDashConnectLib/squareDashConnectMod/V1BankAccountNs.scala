package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1BankAccount")
@js.native
object V1BankAccountNs extends js.Object {
  @js.native
  sealed trait TypeEnum extends js.Object
  
  @js.native
  object TypeEnum extends js.Object {
    @js.native
    sealed trait BUSINESS_CHECKING
      extends squareDashConnectLib.squareDashConnectMod.V1BankAccountNs.TypeEnum
    
    @js.native
    sealed trait CHECKING
      extends squareDashConnectLib.squareDashConnectMod.V1BankAccountNs.TypeEnum
    
    @js.native
    sealed trait INVESTMENT
      extends squareDashConnectLib.squareDashConnectMod.V1BankAccountNs.TypeEnum
    
    @js.native
    sealed trait LOAN
      extends squareDashConnectLib.squareDashConnectMod.V1BankAccountNs.TypeEnum
    
    @js.native
    sealed trait OTHER
      extends squareDashConnectLib.squareDashConnectMod.V1BankAccountNs.TypeEnum
    
    @js.native
    sealed trait SAVINGS
      extends squareDashConnectLib.squareDashConnectMod.V1BankAccountNs.TypeEnum
    
    /* "BUSINESS_CHECKING" */ val BUSINESS_CHECKING: BUSINESS_CHECKING with java.lang.String = js.native
    /* "CHECKING" */ val CHECKING: CHECKING with java.lang.String = js.native
    /* "INVESTMENT" */ val INVESTMENT: INVESTMENT with java.lang.String = js.native
    /* "LOAN" */ val LOAN: LOAN with java.lang.String = js.native
    /* "OTHER" */ val OTHER: OTHER with java.lang.String = js.native
    /* "SAVINGS" */ val SAVINGS: SAVINGS with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.V1BankAccountNs.TypeEnum with java.lang.String
      ] = js.native
  }
  
}

