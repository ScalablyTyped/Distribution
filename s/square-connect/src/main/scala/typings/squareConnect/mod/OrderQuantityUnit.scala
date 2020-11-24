package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "OrderQuantityUnit")
@js.native
class OrderQuantityUnit () extends js.Object {
  
  /**
    * A `MeasurementUnit` that represents the unit of measure for the quantity.
    */
  var measurement_unit: js.UndefOr[MeasurementUnit] = js.native
  
  /**
    * For non-integer quantities, represents the number of digits after the decimal point that are recorded for this quantity.
    * For example, a precision of 1 allows quantities like "1.0" and "1.1", but not "1.01". Min: 0. Max: 5.
    */
  var precision: js.UndefOr[Double] = js.native
}
