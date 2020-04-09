package typings.squareConnect.mod

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
    * An integer between 0 and 5 that represents the maximum number of positions allowed after the decimal in quantities
    * measured with this unit. For example:
    *  - if the precision is 0, the quantity can be 1, 2, 3, etc.
    *  - if the precision is 1, the quantity can be 0.1, 0.2, etc.
    *  - if the precision is 2, the quantity can be 0.01, 0.12, etc.
    *  Default: 3
    */
  var precision: js.UndefOr[Double] = js.native
}

