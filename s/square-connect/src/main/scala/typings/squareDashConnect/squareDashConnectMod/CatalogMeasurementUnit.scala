package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CatalogMeasurementUnit")
@js.native
class CatalogMeasurementUnit () extends js.Object {
  /**
    * Indicates the unit used to measure the quantity of a catalog item variation.
    */
  var measurement_unit: js.UndefOr[MeasurementUnit] = js.native
  /**
    * Represents the maximum number of positions allowed after the decimal in quantities measured with this unit.
    * For example, if the precision is 2, then an itemization’s quantity can be 0.01, 0.12, etc. Min: 0, Max: 5, Default: 3.
    */
  var precision: js.UndefOr[Double] = js.native
}

