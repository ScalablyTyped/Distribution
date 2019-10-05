package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.CustomerCreationSourceFilter.RuleEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CustomerCreationSourceFilter")
@js.native
class CustomerCreationSourceFilter () extends js.Object {
  /**
    * Indicates whether a customer profile matching the filter criteria should be included in the result or excluded
    * from the result. Default: `INCLUDE`.
    * See [CustomerInclusionExclusion](#type-customerinclusionexclusion) for possible values.
    */
  var rule: js.UndefOr[RuleEnum] = js.native
  /**
    * The list of creation sources used as filtering criteria.
    * See [CustomerCreationSource](#type-customercreationsource) for possible values.
    */
  var values: js.UndefOr[js.Array[CustomerSourceEnum]] = js.native
}

@JSImport("square-connect", "CustomerCreationSourceFilter")
@js.native
object CustomerCreationSourceFilter extends js.Object {
  @js.native
  sealed trait RuleEnum extends js.Object
  
  @js.native
  object RuleEnum extends js.Object {
    @js.native
    sealed trait EXCLUDE extends RuleEnum
    
    @js.native
    sealed trait INCLUDE extends RuleEnum
    
    /* "EXCLUDE" */ val EXCLUDE: typings.squareDashConnect.squareDashConnectMod.CustomerCreationSourceFilter.RuleEnum.EXCLUDE with String = js.native
    /* "INCLUDE" */ val INCLUDE: typings.squareDashConnect.squareDashConnectMod.CustomerCreationSourceFilter.RuleEnum.INCLUDE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[RuleEnum with String] = js.native
  }
  
}

