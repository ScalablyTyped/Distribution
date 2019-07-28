package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.MeasurementUnitNs.AreaUnitEnum
import typings.squareDashConnect.squareDashConnectMod.MeasurementUnitNs.LengthUnitEnum
import typings.squareDashConnect.squareDashConnectMod.MeasurementUnitNs.VolumeUnitEnum
import typings.squareDashConnect.squareDashConnectMod.MeasurementUnitNs.WeightUnitEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "MeasurementUnit")
@js.native
object MeasurementUnitNs extends js.Object {
  @js.native
  sealed trait AreaUnitEnum extends js.Object
  
  @js.native
  sealed trait LengthUnitEnum extends js.Object
  
  @js.native
  sealed trait VolumeUnitEnum extends js.Object
  
  @js.native
  sealed trait WeightUnitEnum extends js.Object
  
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
    
    /* "IMPERIAL_ACRE" */ val IMPERIAL_ACRE: typings.squareDashConnect.squareDashConnectMod.MeasurementUnitNs.AreaUnitEnum.IMPERIAL_ACRE with String = js.native
    /* "IMPERIAL_SQUARE_FOOT" */ val IMPERIAL_SQUARE_FOOT: typings.squareDashConnect.squareDashConnectMod.MeasurementUnitNs.AreaUnitEnum.IMPERIAL_SQUARE_FOOT with String = js.native
    /* "IMPERIAL_SQUARE_INCH" */ val IMPERIAL_SQUARE_INCH: typings.squareDashConnect.squareDashConnectMod.MeasurementUnitNs.AreaUnitEnum.IMPERIAL_SQUARE_INCH with String = js.native
    /* "IMPERIAL_SQUARE_MILE" */ val IMPERIAL_SQUARE_MILE: typings.squareDashConnect.squareDashConnectMod.MeasurementUnitNs.AreaUnitEnum.IMPERIAL_SQUARE_MILE with String = js.native
    /* "IMPERIAL_SQUARE_YARD" */ val IMPERIAL_SQUARE_YARD: typings.squareDashConnect.squareDashConnectMod.MeasurementUnitNs.AreaUnitEnum.IMPERIAL_SQUARE_YARD with String = js.native
    /* "METRIC_SQUARE_CENTIMETER" */ val METRIC_SQUARE_CENTIMETER: typings.squareDashConnect.squareDashConnectMod.MeasurementUnitNs.AreaUnitEnum.METRIC_SQUARE_CENTIMETER with String = js.native
    /* "METRIC_SQUARE_KILOMETER" */ val METRIC_SQUARE_KILOMETER: typings.squareDashConnect.squareDashConnectMod.MeasurementUnitNs.AreaUnitEnum.METRIC_SQUARE_KILOMETER with String = js.native
    /* "METRIC_SQUARE_METER" */ val METRIC_SQUARE_METER: typings.squareDashConnect.squareDashConnectMod.MeasurementUnitNs.AreaUnitEnum.METRIC_SQUARE_METER with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AreaUnitEnum with String] = js.native
  }
  
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
    
    /* "IMPERIAL_FOOT" */ val IMPERIAL_FOOT: typings.squareDashConnect.squareDashConnectMod.MeasurementUnitNs.LengthUnitEnum.IMPERIAL_FOOT with String = js.native
    /* "IMPERIAL_INCH" */ val IMPERIAL_INCH: typings.squareDashConnect.squareDashConnectMod.MeasurementUnitNs.LengthUnitEnum.IMPERIAL_INCH with String = js.native
    /* "IMPERIAL_MILE" */ val IMPERIAL_MILE: typings.squareDashConnect.squareDashConnectMod.MeasurementUnitNs.LengthUnitEnum.IMPERIAL_MILE with String = js.native
    /* "IMPERIAL_YARD" */ val IMPERIAL_YARD: typings.squareDashConnect.squareDashConnectMod.MeasurementUnitNs.LengthUnitEnum.IMPERIAL_YARD with String = js.native
    /* "METRIC_CENTIMETER" */ val METRIC_CENTIMETER: typings.squareDashConnect.squareDashConnectMod.MeasurementUnitNs.LengthUnitEnum.METRIC_CENTIMETER with String = js.native
    /* "METRIC_KILOMETER" */ val METRIC_KILOMETER: typings.squareDashConnect.squareDashConnectMod.MeasurementUnitNs.LengthUnitEnum.METRIC_KILOMETER with String = js.native
    /* "METRIC_METER" */ val METRIC_METER: typings.squareDashConnect.squareDashConnectMod.MeasurementUnitNs.LengthUnitEnum.METRIC_METER with String = js.native
    /* "METRIC_MILLIMETER" */ val METRIC_MILLIMETER: typings.squareDashConnect.squareDashConnectMod.MeasurementUnitNs.LengthUnitEnum.METRIC_MILLIMETER with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[LengthUnitEnum with String] = js.native
  }
  
  @js.native
  object VolumeUnitEnum extends js.Object {
    @js.native
    sealed trait GENERIC_CUP extends VolumeUnitEnum
    
    @js.native
    sealed trait GENERIC_FLUID_OUNCE extends VolumeUnitEnum
    
    @js.native
    sealed trait GENERIC_GALLON extends VolumeUnitEnum
    
    @js.native
    sealed trait GENERIC_PINT extends VolumeUnitEnum
    
    @js.native
    sealed trait GENERIC_QUART extends VolumeUnitEnum
    
    @js.native
    sealed trait GENERIC_SHOT extends VolumeUnitEnum
    
    @js.native
    sealed trait IMPERIAL_CUBIC_FOOT extends VolumeUnitEnum
    
    @js.native
    sealed trait IMPERIAL_CUBIC_INCH extends VolumeUnitEnum
    
    @js.native
    sealed trait IMPERIAL_CUBIC_YARD extends VolumeUnitEnum
    
    @js.native
    sealed trait METRIC_LITER extends VolumeUnitEnum
    
    @js.native
    sealed trait METRIC_MILLILITER extends VolumeUnitEnum
    
    /* "GENERIC_CUP" */ val GENERIC_CUP: typings.squareDashConnect.squareDashConnectMod.MeasurementUnitNs.VolumeUnitEnum.GENERIC_CUP with String = js.native
    /* "GENERIC_FLUID_OUNCE" */ val GENERIC_FLUID_OUNCE: typings.squareDashConnect.squareDashConnectMod.MeasurementUnitNs.VolumeUnitEnum.GENERIC_FLUID_OUNCE with String = js.native
    /* "GENERIC_GALLON" */ val GENERIC_GALLON: typings.squareDashConnect.squareDashConnectMod.MeasurementUnitNs.VolumeUnitEnum.GENERIC_GALLON with String = js.native
    /* "GENERIC_PINT" */ val GENERIC_PINT: typings.squareDashConnect.squareDashConnectMod.MeasurementUnitNs.VolumeUnitEnum.GENERIC_PINT with String = js.native
    /* "GENERIC_QUART" */ val GENERIC_QUART: typings.squareDashConnect.squareDashConnectMod.MeasurementUnitNs.VolumeUnitEnum.GENERIC_QUART with String = js.native
    /* "GENERIC_SHOT" */ val GENERIC_SHOT: typings.squareDashConnect.squareDashConnectMod.MeasurementUnitNs.VolumeUnitEnum.GENERIC_SHOT with String = js.native
    /* "IMPERIAL_CUBIC_FOOT" */ val IMPERIAL_CUBIC_FOOT: typings.squareDashConnect.squareDashConnectMod.MeasurementUnitNs.VolumeUnitEnum.IMPERIAL_CUBIC_FOOT with String = js.native
    /* "IMPERIAL_CUBIC_INCH" */ val IMPERIAL_CUBIC_INCH: typings.squareDashConnect.squareDashConnectMod.MeasurementUnitNs.VolumeUnitEnum.IMPERIAL_CUBIC_INCH with String = js.native
    /* "IMPERIAL_CUBIC_YARD" */ val IMPERIAL_CUBIC_YARD: typings.squareDashConnect.squareDashConnectMod.MeasurementUnitNs.VolumeUnitEnum.IMPERIAL_CUBIC_YARD with String = js.native
    /* "METRIC_LITER" */ val METRIC_LITER: typings.squareDashConnect.squareDashConnectMod.MeasurementUnitNs.VolumeUnitEnum.METRIC_LITER with String = js.native
    /* "METRIC_MILLILITER" */ val METRIC_MILLILITER: typings.squareDashConnect.squareDashConnectMod.MeasurementUnitNs.VolumeUnitEnum.METRIC_MILLILITER with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[VolumeUnitEnum with String] = js.native
  }
  
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
    
    /* "IMPERIAL_POUND" */ val IMPERIAL_POUND: typings.squareDashConnect.squareDashConnectMod.MeasurementUnitNs.WeightUnitEnum.IMPERIAL_POUND with String = js.native
    /* "IMPERIAL_STONE" */ val IMPERIAL_STONE: typings.squareDashConnect.squareDashConnectMod.MeasurementUnitNs.WeightUnitEnum.IMPERIAL_STONE with String = js.native
    /* "IMPERIAL_WEIGHT_OUNCE" */ val IMPERIAL_WEIGHT_OUNCE: typings.squareDashConnect.squareDashConnectMod.MeasurementUnitNs.WeightUnitEnum.IMPERIAL_WEIGHT_OUNCE with String = js.native
    /* "METRIC_GRAM" */ val METRIC_GRAM: typings.squareDashConnect.squareDashConnectMod.MeasurementUnitNs.WeightUnitEnum.METRIC_GRAM with String = js.native
    /* "METRIC_KILOGRAM" */ val METRIC_KILOGRAM: typings.squareDashConnect.squareDashConnectMod.MeasurementUnitNs.WeightUnitEnum.METRIC_KILOGRAM with String = js.native
    /* "METRIC_MILLIGRAM" */ val METRIC_MILLIGRAM: typings.squareDashConnect.squareDashConnectMod.MeasurementUnitNs.WeightUnitEnum.METRIC_MILLIGRAM with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[WeightUnitEnum with String] = js.native
  }
  
}

