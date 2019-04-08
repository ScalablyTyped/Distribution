package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CustomerCreationSourceFilter")
@js.native
class CustomerCreationSourceFilter () extends js.Object {
  /**
    * Indicates whether a customer profile matching the filter criteria should be included in the result or excluded
    * from the result. Default: `INCLUDE`. See [CustomerInclusionExclusion](#type-customerinclusionexclusion) for
    * possible values.
    */
  var rule: js.UndefOr[
    squareDashConnectLib.squareDashConnectMod.CustomerCreationSourceFilterNs.RuleEnum
  ] = js.native
  /**
    * The list of creation sources used as filtering criteria. See
    * [CustomerCreationSource](#type-customercreationsource) for possible values.
    */
  var values: js.UndefOr[
    js.Array[
      squareDashConnectLib.squareDashConnectMod.CustomerCreationSourceFilterNs.ValuesEnum
    ]
  ] = js.native
}

