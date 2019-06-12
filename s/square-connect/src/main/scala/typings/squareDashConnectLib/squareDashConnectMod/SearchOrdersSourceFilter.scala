package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "SearchOrdersSourceFilter")
@js.native
class SearchOrdersSourceFilter () extends js.Object {
  /**
    * Filters by [Source](#type-ordersource) `name`.
    * Will return any orders with with `source.name`s that match any of the listed source names.  Max: 10 `source_names`.
    */
  var source_names: js.UndefOr[js.Array[java.lang.String]] = js.native
}

