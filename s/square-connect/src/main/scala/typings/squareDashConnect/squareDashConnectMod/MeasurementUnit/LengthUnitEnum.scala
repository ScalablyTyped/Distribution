package typings.squareDashConnect.squareDashConnectMod.MeasurementUnit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LengthUnitEnum extends js.Object

@JSImport("square-connect", "MeasurementUnit.LengthUnitEnum")
@js.native
object LengthUnitEnum extends js.Object {
  @js.native
  sealed trait IMPERIAL_FOOT extends LengthUnitEnum
  
  @js.native
  sealed trait IMPERIAL_INCH extends LengthUnitEnum
  
  @js.native
  sealed trait IMPERIAL_MILE extends LengthUnitEnum
  
  @js.native
  sealed trait IMPERIAL_YARD extends LengthUnitEnum
  
  @js.native
  sealed trait METRIC_CENTIMETER extends LengthUnitEnum
  
  @js.native
  sealed trait METRIC_KILOMETER extends LengthUnitEnum
  
  @js.native
  sealed trait METRIC_METER extends LengthUnitEnum
  
  @js.native
  sealed trait METRIC_MILLIMETER extends LengthUnitEnum
  
  /* "IMPERIAL_FOOT" */ val IMPERIAL_FOOT: typings.squareDashConnect.squareDashConnectMod.MeasurementUnit.LengthUnitEnum.IMPERIAL_FOOT with String = js.native
  /* "IMPERIAL_INCH" */ val IMPERIAL_INCH: typings.squareDashConnect.squareDashConnectMod.MeasurementUnit.LengthUnitEnum.IMPERIAL_INCH with String = js.native
  /* "IMPERIAL_MILE" */ val IMPERIAL_MILE: typings.squareDashConnect.squareDashConnectMod.MeasurementUnit.LengthUnitEnum.IMPERIAL_MILE with String = js.native
  /* "IMPERIAL_YARD" */ val IMPERIAL_YARD: typings.squareDashConnect.squareDashConnectMod.MeasurementUnit.LengthUnitEnum.IMPERIAL_YARD with String = js.native
  /* "METRIC_CENTIMETER" */ val METRIC_CENTIMETER: typings.squareDashConnect.squareDashConnectMod.MeasurementUnit.LengthUnitEnum.METRIC_CENTIMETER with String = js.native
  /* "METRIC_KILOMETER" */ val METRIC_KILOMETER: typings.squareDashConnect.squareDashConnectMod.MeasurementUnit.LengthUnitEnum.METRIC_KILOMETER with String = js.native
  /* "METRIC_METER" */ val METRIC_METER: typings.squareDashConnect.squareDashConnectMod.MeasurementUnit.LengthUnitEnum.METRIC_METER with String = js.native
  /* "METRIC_MILLIMETER" */ val METRIC_MILLIMETER: typings.squareDashConnect.squareDashConnectMod.MeasurementUnit.LengthUnitEnum.METRIC_MILLIMETER with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LengthUnitEnum with String] = js.native
}

