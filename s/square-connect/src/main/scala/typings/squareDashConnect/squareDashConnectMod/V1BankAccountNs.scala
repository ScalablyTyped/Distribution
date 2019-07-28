package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.V1BankAccountNs.TypeEnum
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
    sealed trait BUSINESS_CHECKING extends TypeEnum
    
    @js.native
    sealed trait CHECKING extends TypeEnum
    
    @js.native
    sealed trait INVESTMENT extends TypeEnum
    
    @js.native
    sealed trait LOAN extends TypeEnum
    
    @js.native
    sealed trait OTHER extends TypeEnum
    
    @js.native
    sealed trait SAVINGS extends TypeEnum
    
    /* "BUSINESS_CHECKING" */ val BUSINESS_CHECKING: typings.squareDashConnect.squareDashConnectMod.V1BankAccountNs.TypeEnum.BUSINESS_CHECKING with String = js.native
    /* "CHECKING" */ val CHECKING: typings.squareDashConnect.squareDashConnectMod.V1BankAccountNs.TypeEnum.CHECKING with String = js.native
    /* "INVESTMENT" */ val INVESTMENT: typings.squareDashConnect.squareDashConnectMod.V1BankAccountNs.TypeEnum.INVESTMENT with String = js.native
    /* "LOAN" */ val LOAN: typings.squareDashConnect.squareDashConnectMod.V1BankAccountNs.TypeEnum.LOAN with String = js.native
    /* "OTHER" */ val OTHER: typings.squareDashConnect.squareDashConnectMod.V1BankAccountNs.TypeEnum.OTHER with String = js.native
    /* "SAVINGS" */ val SAVINGS: typings.squareDashConnect.squareDashConnectMod.V1BankAccountNs.TypeEnum.SAVINGS with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TypeEnum with String] = js.native
  }
  
}

