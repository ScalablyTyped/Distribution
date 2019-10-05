package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.MeasurementUnit.AreaUnitEnum
import typings.squareDashConnect.squareDashConnectMod.MeasurementUnit.LengthUnitEnum
import typings.squareDashConnect.squareDashConnectMod.MeasurementUnit.VolumeUnitEnum
import typings.squareDashConnect.squareDashConnectMod.MeasurementUnit.WeightUnitEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "MeasurementUnit")
@js.native
class MeasurementUnit_ () extends js.Object {
  /**
    * Represents a standard area unit. See [MeasurementUnitArea](#type-measurementunitarea) for possible values.
    */
  var area_unit: js.UndefOr[AreaUnitEnum] = js.native
  /**
    * A custom unit of measurement defined by the seller using the Point of Sale app or ad-hoc as an order line item.
    */
  var custom_unit: js.UndefOr[MeasurementUnitCustom] = js.native
  /**
    * Reserved for API integrations that lack the ability to specify a real measurement unit.
    * See [MeasurementUnitGeneric](#type-measurementunitgeneric) for possible values.
    */
  var generic_unit: js.UndefOr[String] = js.native
  /**
    * Represents a standard length unit. See [MeasurementUnitLength](#type-measurementunitlength) for possible values.
    */
  var length_unit: js.UndefOr[LengthUnitEnum] = js.native
  /**
    * Represents the type of the measurement unit.
    * See [MeasurementUnitUnitType](#type-measurementunitunittype) for possible values.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Represents a standard volume unit. See [MeasurementUnitVolume](#type-measurementunitvolume) for possible values.
    */
  var volume_unit: js.UndefOr[VolumeUnitEnum] = js.native
  /**
    * Represents a standard unit of weight or mass. See [MeasurementUnitWeight](#type-measurementunitweight) for possible values.
    */
  var weight_unit: js.UndefOr[WeightUnitEnum] = js.native
}

