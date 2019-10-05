package typings.squareDashConnect.squareDashConnectMod.MeasurementUnit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AreaUnitEnum extends js.Object

@JSImport("square-connect", "MeasurementUnit.AreaUnitEnum")
@js.native
object AreaUnitEnum extends js.Object {
  @js.native
  sealed trait IMPERIAL_ACRE extends AreaUnitEnum
  
  @js.native
  sealed trait IMPERIAL_SQUARE_FOOT extends AreaUnitEnum
  
  @js.native
  sealed trait IMPERIAL_SQUARE_INCH extends AreaUnitEnum
  
  @js.native
  sealed trait IMPERIAL_SQUARE_MILE extends AreaUnitEnum
  
  @js.native
  sealed trait IMPERIAL_SQUARE_YARD extends AreaUnitEnum
  
  @js.native
  sealed trait METRIC_SQUARE_CENTIMETER extends AreaUnitEnum
  
  @js.native
  sealed trait METRIC_SQUARE_KILOMETER extends AreaUnitEnum
  
  @js.native
  sealed trait METRIC_SQUARE_METER extends AreaUnitEnum
  
  /* "IMPERIAL_ACRE" */ val IMPERIAL_ACRE: typings.squareDashConnect.squareDashConnectMod.MeasurementUnit.AreaUnitEnum.IMPERIAL_ACRE with String = js.native
  /* "IMPERIAL_SQUARE_FOOT" */ val IMPERIAL_SQUARE_FOOT: typings.squareDashConnect.squareDashConnectMod.MeasurementUnit.AreaUnitEnum.IMPERIAL_SQUARE_FOOT with String = js.native
  /* "IMPERIAL_SQUARE_INCH" */ val IMPERIAL_SQUARE_INCH: typings.squareDashConnect.squareDashConnectMod.MeasurementUnit.AreaUnitEnum.IMPERIAL_SQUARE_INCH with String = js.native
  /* "IMPERIAL_SQUARE_MILE" */ val IMPERIAL_SQUARE_MILE: typings.squareDashConnect.squareDashConnectMod.MeasurementUnit.AreaUnitEnum.IMPERIAL_SQUARE_MILE with String = js.native
  /* "IMPERIAL_SQUARE_YARD" */ val IMPERIAL_SQUARE_YARD: typings.squareDashConnect.squareDashConnectMod.MeasurementUnit.AreaUnitEnum.IMPERIAL_SQUARE_YARD with String = js.native
  /* "METRIC_SQUARE_CENTIMETER" */ val METRIC_SQUARE_CENTIMETER: typings.squareDashConnect.squareDashConnectMod.MeasurementUnit.AreaUnitEnum.METRIC_SQUARE_CENTIMETER with String = js.native
  /* "METRIC_SQUARE_KILOMETER" */ val METRIC_SQUARE_KILOMETER: typings.squareDashConnect.squareDashConnectMod.MeasurementUnit.AreaUnitEnum.METRIC_SQUARE_KILOMETER with String = js.native
  /* "METRIC_SQUARE_METER" */ val METRIC_SQUARE_METER: typings.squareDashConnect.squareDashConnectMod.MeasurementUnit.AreaUnitEnum.METRIC_SQUARE_METER with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AreaUnitEnum with String] = js.native
}

