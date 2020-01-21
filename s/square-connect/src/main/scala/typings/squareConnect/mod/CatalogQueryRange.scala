package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CatalogQueryRange")
@js.native
class CatalogQueryRange () extends js.Object {
  /**
    * The desired maximum value for the search attribute (inclusive).
    */
  var attribute_max_value: js.UndefOr[Double] = js.native
  /**
    * The desired minimum value for the search attribute (inclusive).
    */
  var attribute_min_value: js.UndefOr[Double] = js.native
  /**
    * The name of the attribute to be searched.
    */
  var attribute_name: String = js.native
}

