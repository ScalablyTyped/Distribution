package typings.sentryTypes

import typings.sentryTypes.anon.Unit
import typings.std.Omit
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object measurementMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.sentryTypes.sentryTypesStrings.nanosecond
    - typings.sentryTypes.sentryTypesStrings.microsecond
    - typings.sentryTypes.sentryTypesStrings.millisecond
    - typings.sentryTypes.sentryTypesStrings.second
    - typings.sentryTypes.sentryTypesStrings.minute
    - typings.sentryTypes.sentryTypesStrings.hour
    - typings.sentryTypes.sentryTypesStrings.day
    - typings.sentryTypes.sentryTypesStrings.week
  */
  trait DurationUnit extends StObject
  object DurationUnit {
    
    inline def day: typings.sentryTypes.sentryTypesStrings.day = "day".asInstanceOf[typings.sentryTypes.sentryTypesStrings.day]
    
    inline def hour: typings.sentryTypes.sentryTypesStrings.hour = "hour".asInstanceOf[typings.sentryTypes.sentryTypesStrings.hour]
    
    inline def microsecond: typings.sentryTypes.sentryTypesStrings.microsecond = "microsecond".asInstanceOf[typings.sentryTypes.sentryTypesStrings.microsecond]
    
    inline def millisecond: typings.sentryTypes.sentryTypesStrings.millisecond = "millisecond".asInstanceOf[typings.sentryTypes.sentryTypesStrings.millisecond]
    
    inline def minute: typings.sentryTypes.sentryTypesStrings.minute = "minute".asInstanceOf[typings.sentryTypes.sentryTypesStrings.minute]
    
    inline def nanosecond: typings.sentryTypes.sentryTypesStrings.nanosecond = "nanosecond".asInstanceOf[typings.sentryTypes.sentryTypesStrings.nanosecond]
    
    inline def second: typings.sentryTypes.sentryTypesStrings.second = "second".asInstanceOf[typings.sentryTypes.sentryTypesStrings.second]
    
    inline def week: typings.sentryTypes.sentryTypesStrings.week = "week".asInstanceOf[typings.sentryTypes.sentryTypesStrings.week]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sentryTypes.sentryTypesStrings.ratio
    - typings.sentryTypes.sentryTypesStrings.percent
  */
  trait FractionUnit extends StObject
  object FractionUnit {
    
    inline def percent: typings.sentryTypes.sentryTypesStrings.percent = "percent".asInstanceOf[typings.sentryTypes.sentryTypesStrings.percent]
    
    inline def ratio: typings.sentryTypes.sentryTypesStrings.ratio = "ratio".asInstanceOf[typings.sentryTypes.sentryTypesStrings.ratio]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sentryTypes.sentryTypesStrings.bit
    - typings.sentryTypes.sentryTypesStrings.byte
    - typings.sentryTypes.sentryTypesStrings.kilobyte
    - typings.sentryTypes.sentryTypesStrings.kibibyte
    - typings.sentryTypes.sentryTypesStrings.megabyte
    - typings.sentryTypes.sentryTypesStrings.mebibyte
    - typings.sentryTypes.sentryTypesStrings.gigabyte
    - typings.sentryTypes.sentryTypesStrings.terabyte
    - typings.sentryTypes.sentryTypesStrings.tebibyte
    - typings.sentryTypes.sentryTypesStrings.petabyte
    - typings.sentryTypes.sentryTypesStrings.exabyte
    - typings.sentryTypes.sentryTypesStrings.exbibyte
  */
  trait InformationUnit extends StObject
  object InformationUnit {
    
    inline def bit: typings.sentryTypes.sentryTypesStrings.bit = "bit".asInstanceOf[typings.sentryTypes.sentryTypesStrings.bit]
    
    inline def byte: typings.sentryTypes.sentryTypesStrings.byte = "byte".asInstanceOf[typings.sentryTypes.sentryTypesStrings.byte]
    
    inline def exabyte: typings.sentryTypes.sentryTypesStrings.exabyte = "exabyte".asInstanceOf[typings.sentryTypes.sentryTypesStrings.exabyte]
    
    inline def exbibyte: typings.sentryTypes.sentryTypesStrings.exbibyte = "exbibyte".asInstanceOf[typings.sentryTypes.sentryTypesStrings.exbibyte]
    
    inline def gigabyte: typings.sentryTypes.sentryTypesStrings.gigabyte = "gigabyte".asInstanceOf[typings.sentryTypes.sentryTypesStrings.gigabyte]
    
    inline def kibibyte: typings.sentryTypes.sentryTypesStrings.kibibyte = "kibibyte".asInstanceOf[typings.sentryTypes.sentryTypesStrings.kibibyte]
    
    inline def kilobyte: typings.sentryTypes.sentryTypesStrings.kilobyte = "kilobyte".asInstanceOf[typings.sentryTypes.sentryTypesStrings.kilobyte]
    
    inline def mebibyte: typings.sentryTypes.sentryTypesStrings.mebibyte = "mebibyte".asInstanceOf[typings.sentryTypes.sentryTypesStrings.mebibyte]
    
    inline def megabyte: typings.sentryTypes.sentryTypesStrings.megabyte = "megabyte".asInstanceOf[typings.sentryTypes.sentryTypesStrings.megabyte]
    
    inline def petabyte: typings.sentryTypes.sentryTypesStrings.petabyte = "petabyte".asInstanceOf[typings.sentryTypes.sentryTypesStrings.petabyte]
    
    inline def tebibyte: typings.sentryTypes.sentryTypesStrings.tebibyte = "tebibyte".asInstanceOf[typings.sentryTypes.sentryTypesStrings.tebibyte]
    
    inline def terabyte: typings.sentryTypes.sentryTypesStrings.terabyte = "terabyte".asInstanceOf[typings.sentryTypes.sentryTypesStrings.terabyte]
  }
  
  type LiteralUnion[T /* <: String */] = T | (Omit[T, T])
  
  type MeasurementUnit = LiteralUnion[DurationUnit | InformationUnit | FractionUnit | NoneUnit]
  
  type Measurements = Record[String, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.sentryTypes.sentryTypesStrings._empty
    - typings.sentryTypes.sentryTypesStrings.none
  */
  trait NoneUnit extends StObject
  object NoneUnit {
    
    inline def _empty: typings.sentryTypes.sentryTypesStrings._empty = "".asInstanceOf[typings.sentryTypes.sentryTypesStrings._empty]
    
    inline def none: typings.sentryTypes.sentryTypesStrings.none = "none".asInstanceOf[typings.sentryTypes.sentryTypesStrings.none]
  }
}
