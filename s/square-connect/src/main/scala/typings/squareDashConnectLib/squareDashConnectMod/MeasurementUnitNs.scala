package typings
package squareDashConnectLib.squareDashConnectMod

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
    sealed trait IMPERIAL_ACRE
      extends squareDashConnectLib.squareDashConnectMod.MeasurementUnitNs.AreaUnitEnum
    
    @js.native
    sealed trait IMPERIAL_SQUARE_FOOT
      extends squareDashConnectLib.squareDashConnectMod.MeasurementUnitNs.AreaUnitEnum
    
    @js.native
    sealed trait IMPERIAL_SQUARE_INCH
      extends squareDashConnectLib.squareDashConnectMod.MeasurementUnitNs.AreaUnitEnum
    
    @js.native
    sealed trait IMPERIAL_SQUARE_MILE
      extends squareDashConnectLib.squareDashConnectMod.MeasurementUnitNs.AreaUnitEnum
    
    @js.native
    sealed trait IMPERIAL_SQUARE_YARD
      extends squareDashConnectLib.squareDashConnectMod.MeasurementUnitNs.AreaUnitEnum
    
    @js.native
    sealed trait METRIC_SQUARE_CENTIMETER
      extends squareDashConnectLib.squareDashConnectMod.MeasurementUnitNs.AreaUnitEnum
    
    @js.native
    sealed trait METRIC_SQUARE_KILOMETER
      extends squareDashConnectLib.squareDashConnectMod.MeasurementUnitNs.AreaUnitEnum
    
    @js.native
    sealed trait METRIC_SQUARE_METER
      extends squareDashConnectLib.squareDashConnectMod.MeasurementUnitNs.AreaUnitEnum
    
    /* "IMPERIAL_ACRE" */ val IMPERIAL_ACRE: IMPERIAL_ACRE with java.lang.String = js.native
    /* "IMPERIAL_SQUARE_FOOT" */ val IMPERIAL_SQUARE_FOOT: IMPERIAL_SQUARE_FOOT with java.lang.String = js.native
    /* "IMPERIAL_SQUARE_INCH" */ val IMPERIAL_SQUARE_INCH: IMPERIAL_SQUARE_INCH with java.lang.String = js.native
    /* "IMPERIAL_SQUARE_MILE" */ val IMPERIAL_SQUARE_MILE: IMPERIAL_SQUARE_MILE with java.lang.String = js.native
    /* "IMPERIAL_SQUARE_YARD" */ val IMPERIAL_SQUARE_YARD: IMPERIAL_SQUARE_YARD with java.lang.String = js.native
    /* "METRIC_SQUARE_CENTIMETER" */ val METRIC_SQUARE_CENTIMETER: METRIC_SQUARE_CENTIMETER with java.lang.String = js.native
    /* "METRIC_SQUARE_KILOMETER" */ val METRIC_SQUARE_KILOMETER: METRIC_SQUARE_KILOMETER with java.lang.String = js.native
    /* "METRIC_SQUARE_METER" */ val METRIC_SQUARE_METER: METRIC_SQUARE_METER with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.MeasurementUnitNs.AreaUnitEnum with java.lang.String
      ] = js.native
  }
  
  @js.native
  object LengthUnitEnum extends js.Object {
    @js.native
    sealed trait IMPERIAL_FOOT
      extends squareDashConnectLib.squareDashConnectMod.MeasurementUnitNs.LengthUnitEnum
    
    @js.native
    sealed trait IMPERIAL_INCH
      extends squareDashConnectLib.squareDashConnectMod.MeasurementUnitNs.LengthUnitEnum
    
    @js.native
    sealed trait IMPERIAL_MILE
      extends squareDashConnectLib.squareDashConnectMod.MeasurementUnitNs.LengthUnitEnum
    
    @js.native
    sealed trait IMPERIAL_YARD
      extends squareDashConnectLib.squareDashConnectMod.MeasurementUnitNs.LengthUnitEnum
    
    @js.native
    sealed trait METRIC_CENTIMETER
      extends squareDashConnectLib.squareDashConnectMod.MeasurementUnitNs.LengthUnitEnum
    
    @js.native
    sealed trait METRIC_KILOMETER
      extends squareDashConnectLib.squareDashConnectMod.MeasurementUnitNs.LengthUnitEnum
    
    @js.native
    sealed trait METRIC_METER
      extends squareDashConnectLib.squareDashConnectMod.MeasurementUnitNs.LengthUnitEnum
    
    @js.native
    sealed trait METRIC_MILLIMETER
      extends squareDashConnectLib.squareDashConnectMod.MeasurementUnitNs.LengthUnitEnum
    
    /* "IMPERIAL_FOOT" */ val IMPERIAL_FOOT: IMPERIAL_FOOT with java.lang.String = js.native
    /* "IMPERIAL_INCH" */ val IMPERIAL_INCH: IMPERIAL_INCH with java.lang.String = js.native
    /* "IMPERIAL_MILE" */ val IMPERIAL_MILE: IMPERIAL_MILE with java.lang.String = js.native
    /* "IMPERIAL_YARD" */ val IMPERIAL_YARD: IMPERIAL_YARD with java.lang.String = js.native
    /* "METRIC_CENTIMETER" */ val METRIC_CENTIMETER: METRIC_CENTIMETER with java.lang.String = js.native
    /* "METRIC_KILOMETER" */ val METRIC_KILOMETER: METRIC_KILOMETER with java.lang.String = js.native
    /* "METRIC_METER" */ val METRIC_METER: METRIC_METER with java.lang.String = js.native
    /* "METRIC_MILLIMETER" */ val METRIC_MILLIMETER: METRIC_MILLIMETER with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.MeasurementUnitNs.LengthUnitEnum with java.lang.String
      ] = js.native
  }
  
  @js.native
  object VolumeUnitEnum extends js.Object {
    @js.native
    sealed trait GENERIC_CUP
      extends squareDashConnectLib.squareDashConnectMod.MeasurementUnitNs.VolumeUnitEnum
    
    @js.native
    sealed trait GENERIC_FLUID_OUNCE
      extends squareDashConnectLib.squareDashConnectMod.MeasurementUnitNs.VolumeUnitEnum
    
    @js.native
    sealed trait GENERIC_GALLON
      extends squareDashConnectLib.squareDashConnectMod.MeasurementUnitNs.VolumeUnitEnum
    
    @js.native
    sealed trait GENERIC_PINT
      extends squareDashConnectLib.squareDashConnectMod.MeasurementUnitNs.VolumeUnitEnum
    
    @js.native
    sealed trait GENERIC_QUART
      extends squareDashConnectLib.squareDashConnectMod.MeasurementUnitNs.VolumeUnitEnum
    
    @js.native
    sealed trait GENERIC_SHOT
      extends squareDashConnectLib.squareDashConnectMod.MeasurementUnitNs.VolumeUnitEnum
    
    @js.native
    sealed trait IMPERIAL_CUBIC_FOOT
      extends squareDashConnectLib.squareDashConnectMod.MeasurementUnitNs.VolumeUnitEnum
    
    @js.native
    sealed trait IMPERIAL_CUBIC_INCH
      extends squareDashConnectLib.squareDashConnectMod.MeasurementUnitNs.VolumeUnitEnum
    
    @js.native
    sealed trait IMPERIAL_CUBIC_YARD
      extends squareDashConnectLib.squareDashConnectMod.MeasurementUnitNs.VolumeUnitEnum
    
    @js.native
    sealed trait METRIC_LITER
      extends squareDashConnectLib.squareDashConnectMod.MeasurementUnitNs.VolumeUnitEnum
    
    @js.native
    sealed trait METRIC_MILLILITER
      extends squareDashConnectLib.squareDashConnectMod.MeasurementUnitNs.VolumeUnitEnum
    
    /* "GENERIC_CUP" */ val GENERIC_CUP: GENERIC_CUP with java.lang.String = js.native
    /* "GENERIC_FLUID_OUNCE" */ val GENERIC_FLUID_OUNCE: GENERIC_FLUID_OUNCE with java.lang.String = js.native
    /* "GENERIC_GALLON" */ val GENERIC_GALLON: GENERIC_GALLON with java.lang.String = js.native
    /* "GENERIC_PINT" */ val GENERIC_PINT: GENERIC_PINT with java.lang.String = js.native
    /* "GENERIC_QUART" */ val GENERIC_QUART: GENERIC_QUART with java.lang.String = js.native
    /* "GENERIC_SHOT" */ val GENERIC_SHOT: GENERIC_SHOT with java.lang.String = js.native
    /* "IMPERIAL_CUBIC_FOOT" */ val IMPERIAL_CUBIC_FOOT: IMPERIAL_CUBIC_FOOT with java.lang.String = js.native
    /* "IMPERIAL_CUBIC_INCH" */ val IMPERIAL_CUBIC_INCH: IMPERIAL_CUBIC_INCH with java.lang.String = js.native
    /* "IMPERIAL_CUBIC_YARD" */ val IMPERIAL_CUBIC_YARD: IMPERIAL_CUBIC_YARD with java.lang.String = js.native
    /* "METRIC_LITER" */ val METRIC_LITER: METRIC_LITER with java.lang.String = js.native
    /* "METRIC_MILLILITER" */ val METRIC_MILLILITER: METRIC_MILLILITER with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.MeasurementUnitNs.VolumeUnitEnum with java.lang.String
      ] = js.native
  }
  
  @js.native
  object WeightUnitEnum extends js.Object {
    @js.native
    sealed trait IMPERIAL_POUND
      extends squareDashConnectLib.squareDashConnectMod.MeasurementUnitNs.WeightUnitEnum
    
    @js.native
    sealed trait IMPERIAL_STONE
      extends squareDashConnectLib.squareDashConnectMod.MeasurementUnitNs.WeightUnitEnum
    
    @js.native
    sealed trait IMPERIAL_WEIGHT_OUNCE
      extends squareDashConnectLib.squareDashConnectMod.MeasurementUnitNs.WeightUnitEnum
    
    @js.native
    sealed trait METRIC_GRAM
      extends squareDashConnectLib.squareDashConnectMod.MeasurementUnitNs.WeightUnitEnum
    
    @js.native
    sealed trait METRIC_KILOGRAM
      extends squareDashConnectLib.squareDashConnectMod.MeasurementUnitNs.WeightUnitEnum
    
    @js.native
    sealed trait METRIC_MILLIGRAM
      extends squareDashConnectLib.squareDashConnectMod.MeasurementUnitNs.WeightUnitEnum
    
    /* "IMPERIAL_POUND" */ val IMPERIAL_POUND: IMPERIAL_POUND with java.lang.String = js.native
    /* "IMPERIAL_STONE" */ val IMPERIAL_STONE: IMPERIAL_STONE with java.lang.String = js.native
    /* "IMPERIAL_WEIGHT_OUNCE" */ val IMPERIAL_WEIGHT_OUNCE: IMPERIAL_WEIGHT_OUNCE with java.lang.String = js.native
    /* "METRIC_GRAM" */ val METRIC_GRAM: METRIC_GRAM with java.lang.String = js.native
    /* "METRIC_KILOGRAM" */ val METRIC_KILOGRAM: METRIC_KILOGRAM with java.lang.String = js.native
    /* "METRIC_MILLIGRAM" */ val METRIC_MILLIGRAM: METRIC_MILLIGRAM with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.MeasurementUnitNs.WeightUnitEnum with java.lang.String
      ] = js.native
  }
  
}

