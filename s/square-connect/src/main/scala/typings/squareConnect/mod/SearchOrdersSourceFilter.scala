package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "SearchOrdersSourceFilter")
@js.native
class SearchOrdersSourceFilter () extends js.Object {
  /**
    * Filters by [Source](#type-ordersource) `name`.
    * Will return any orders with with a `source.name` that matches any of the listed source names. Max: 10 source names.
    */
  var source_names: js.UndefOr[js.Array[String]] = js.native
}

