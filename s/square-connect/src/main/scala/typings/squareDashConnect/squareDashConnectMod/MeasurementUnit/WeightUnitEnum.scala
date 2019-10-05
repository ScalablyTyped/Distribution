package typings.squareDashConnect.squareDashConnectMod.MeasurementUnit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WeightUnitEnum extends js.Object

@JSImport("square-connect", "MeasurementUnit.WeightUnitEnum")
@js.native
object WeightUnitEnum extends js.Object {
  @js.native
  sealed trait IMPERIAL_POUND extends WeightUnitEnum
  
  @js.native
  sealed trait IMPERIAL_STONE extends WeightUnitEnum
  
  @js.native
  sealed trait IMPERIAL_WEIGHT_OUNCE extends WeightUnitEnum
  
  @js.native
  sealed trait METRIC_GRAM extends WeightUnitEnum
  
  @js.native
  sealed trait METRIC_KILOGRAM extends WeightUnitEnum
  
  @js.native
  sealed trait METRIC_MILLIGRAM extends WeightUnitEnum
  
  /* "IMPERIAL_POUND" */ val IMPERIAL_POUND: typings.squareDashConnect.squareDashConnectMod.MeasurementUnit.WeightUnitEnum.IMPERIAL_POUND with String = js.native
  /* "IMPERIAL_STONE" */ val IMPERIAL_STONE: typings.squareDashConnect.squareDashConnectMod.MeasurementUnit.WeightUnitEnum.IMPERIAL_STONE with String = js.native
  /* "IMPERIAL_WEIGHT_OUNCE" */ val IMPERIAL_WEIGHT_OUNCE: typings.squareDashConnect.squareDashConnectMod.MeasurementUnit.WeightUnitEnum.IMPERIAL_WEIGHT_OUNCE with String = js.native
  /* "METRIC_GRAM" */ val METRIC_GRAM: typings.squareDashConnect.squareDashConnectMod.MeasurementUnit.WeightUnitEnum.METRIC_GRAM with String = js.native
  /* "METRIC_KILOGRAM" */ val METRIC_KILOGRAM: typings.squareDashConnect.squareDashConnectMod.MeasurementUnit.WeightUnitEnum.METRIC_KILOGRAM with String = js.native
  /* "METRIC_MILLIGRAM" */ val METRIC_MILLIGRAM: typings.squareDashConnect.squareDashConnectMod.MeasurementUnit.WeightUnitEnum.METRIC_MILLIGRAM with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[WeightUnitEnum with String] = js.native
}

