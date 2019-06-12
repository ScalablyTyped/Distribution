package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "MeasurementUnit")
@js.native
class MeasurementUnit () extends js.Object {
  /**
    * Represents a standard area unit. See [MeasurementUnitArea](#type-measurementunitarea) for possible values.
    */
  var area_unit: js.UndefOr[squareDashConnectLib.squareDashConnectMod.MeasurementUnitNs.AreaUnitEnum] = js.native
  /**
    * A custom unit of measurement defined by the seller using the Point of Sale app or ad-hoc as an order line item.
    */
  var custom_unit: js.UndefOr[MeasurementUnitCustom] = js.native
  /**
    * Represents a standard length unit. See [MeasurementUnitLength](#type-measurementunitlength) for possible values.
    */
  var length_unit: js.UndefOr[squareDashConnectLib.squareDashConnectMod.MeasurementUnitNs.LengthUnitEnum] = js.native
  /**
    * Represents a standard volume unit. See [MeasurementUnitVolume](#type-measurementunitvolume) for possible values.
    */
  var volume_unit: js.UndefOr[squareDashConnectLib.squareDashConnectMod.MeasurementUnitNs.VolumeUnitEnum] = js.native
  /**
    * Represents a standard unit of weight or mass. See [MeasurementUnitWeight](#type-measurementunitweight) for possible values.
    */
  var weight_unit: js.UndefOr[squareDashConnectLib.squareDashConnectMod.MeasurementUnitNs.WeightUnitEnum] = js.native
}

