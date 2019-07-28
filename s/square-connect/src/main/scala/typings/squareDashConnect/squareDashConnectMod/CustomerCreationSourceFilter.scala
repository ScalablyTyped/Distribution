package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.CustomerCreationSourceFilterNs.RuleEnum
import typings.squareDashConnect.squareDashConnectMod.CustomerCreationSourceFilterNs.ValuesEnum
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
  var values: js.UndefOr[js.Array[ValuesEnum]] = js.native
}

