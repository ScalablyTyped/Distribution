package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.CustomerCreationSourceFilterNs.RuleEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CustomerCreationSourceFilter")
@js.native
object CustomerCreationSourceFilterNs extends js.Object {
  @js.native
  sealed trait RuleEnum extends js.Object
  
  @js.native
  object RuleEnum extends js.Object {
    @js.native
    sealed trait EXCLUDE extends RuleEnum
    
    @js.native
    sealed trait INCLUDE extends RuleEnum
    
    /* "EXCLUDE" */ val EXCLUDE: typings.squareDashConnect.squareDashConnectMod.CustomerCreationSourceFilterNs.RuleEnum.EXCLUDE with String = js.native
    /* "INCLUDE" */ val INCLUDE: typings.squareDashConnect.squareDashConnectMod.CustomerCreationSourceFilterNs.RuleEnum.INCLUDE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[RuleEnum with String] = js.native
  }
  
}

