package typings.sassEmbedded

import typings.sassEmbedded.anon.DenominatorUnits
import typings.sassEmbedded.valueMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numberMod {
  
  @JSImport("sass-embedded/dist/types/value/number", "SassNumber")
  @js.native
  open class SassNumber protected () extends Value {
    /**
      * Creates a new number with more complex units than just a single numerator.
      *
      * Upon construction, any compatible numerator and denominator units are
      * simplified away according to the conversion factor between them.
      *
      * @param value - The number's numeric value.
      *
      * @param unit - If this is a string, it's used as the single numerator unit
      * for the number.
      *
      * @param unit.numeratorUnits - If passed, these are the numerator units to
      * use for the number. This may be either a plain JavaScript array or an
      * immutable [[List]] from the [`immutable`
      * package](https://immutable-js.com/).
      *
      * @param unit.denominatorUnits - If passed, these are the denominator units
      * to use for the number. This may be either a plain JavaScript array or an
      * immutable [[List]] from the [`immutable`
      * package](https://immutable-js.com/).
      */
    def this(value: Double) = this()
    def this(value: Double, unit: String) = this()
    def this(value: Double, unit: DenominatorUnits) = this()
    
    /**
      * If [[value]] is an integer according to [[isInt]], returns [[value]]
      * rounded to that integer. If it's not an integer, returns `null`.
      */
    def asInt: Double | Null = js.native
    
    /**
      * Returns [[value]] if it's within `min` and `max`. If [[value]] is equal to
      * `min` or `max` according to Sass's equality, returns `min` or `max`
      * respectively. Otherwise, throws an error.
      *
      * @param name - The name of the function argument `this` came from (without
      * the `$`) if it came from an argument. Used for error reporting.
      */
    def assertInRange(min: Double, max: Double): Double = js.native
    def assertInRange(min: Double, max: Double, name: String): Double = js.native
    
    /**
      * If [[value]] is an integer according to [[isInt]], returns it rounded to
      * that integer. Otherwise, throws an error.
      *
      * @param name - The name of the function argument `this` came from (without
      * the `$`) if it came from an argument. Used for error reporting.
      */
    def assertInt(): Double = js.native
    def assertInt(name: String): Double = js.native
    
    /**
      * If this number has no units, returns it. Otherwise, throws an error.
      *
      * @param name - The name of the function argument `this` came from (without
      * the `$`) if it came from an argument. Used for error reporting.
      */
    def assertNoUnits(): SassNumber = js.native
    def assertNoUnits(name: String): SassNumber = js.native
    
    /**
      * If this number has `unit` as its only unit (and as a numerator), returns
      * this number. Otherwise, throws an error.
      *
      * @param name - The name of the function argument `this` came from (without
      * the `$`) if it came from an argument. Used for error reporting.
      */
    def assertUnit(unit: String): SassNumber = js.native
    def assertUnit(unit: String, name: String): SassNumber = js.native
    
    /**
      * Returns a copy of this number, converted to the units represented by
      * `newNumerators` and `newDenominators`.
      *
      * Unlike [[convert]] this does *not* throw an error if this number is
      * unitless and either `newNumerators` or `newDenominators` are not empty, or
      * vice-versa. Instead, it treats all unitless numbers as convertible to and
      * from all units without changing the value.
      *
      * @throws `Error` if this number's units are incompatible with
      * `newNumerators` and `newDenominators`.
      *
      * @param newNumerators - The numerator units to convert this number to. This
      * may be either a plain JavaScript array or an immutable [[List]] from the
      * [`immutable` package](https://immutable-js.com/).
      *
      * @param newDenominators - The denominator units to convert this number to.
      * This may be either a plain JavaScript array or an immutable [[List]] from
      * the [`immutable` package](https://immutable-js.com/).
      *
      * @param name - The name of the function argument `this` came from (without
      * the `$`) if it came from an argument. Used for error reporting.
      */
    def coerce(newNumerators: js.Array[String], newDenominators: js.Array[String]): SassNumber = js.native
    def coerce(newNumerators: js.Array[String], newDenominators: js.Array[String], name: String): SassNumber = js.native
    def coerce(newNumerators: js.Array[String], newDenominators: typings.immutable.mod.List[String]): SassNumber = js.native
    def coerce(newNumerators: js.Array[String], newDenominators: typings.immutable.mod.List[String], name: String): SassNumber = js.native
    def coerce(newNumerators: typings.immutable.mod.List[String], newDenominators: js.Array[String]): SassNumber = js.native
    def coerce(newNumerators: typings.immutable.mod.List[String], newDenominators: js.Array[String], name: String): SassNumber = js.native
    def coerce(
      newNumerators: typings.immutable.mod.List[String],
      newDenominators: typings.immutable.mod.List[String]
    ): SassNumber = js.native
    def coerce(
      newNumerators: typings.immutable.mod.List[String],
      newDenominators: typings.immutable.mod.List[String],
      name: String
    ): SassNumber = js.native
    
    /**
      * Returns a copy of this number, converted to the units represented by
      * `newNumerators` and `newDenominators`.
      *
      * Unlike [[convertToMatch]] this does *not* throw an error if this number is
      * unitless and either `newNumerators` or `newDenominators` are not empty, or
      * vice-versa. Instead, it treats all unitless numbers as convertible to and
      * from all units without changing the value.
      *
      * @throws `Error` if this number's units are incompatible with `other`'s
      * units.
      *
      * @param name - The name of the function argument `this` came from (without
      * the `$`) if it came from an argument. Used for error reporting.
      *
      * @param otherName - The name of the function argument `other` came from
      * (without the `$`) if it came from an argument. Used for error reporting.
      */
    def coerceToMatch(other: SassNumber): SassNumber = js.native
    def coerceToMatch(other: SassNumber, name: String): SassNumber = js.native
    def coerceToMatch(other: SassNumber, name: String, otherName: String): SassNumber = js.native
    def coerceToMatch(other: SassNumber, name: Unit, otherName: String): SassNumber = js.native
    
    /**
      * Returns [[value]], converted to the units represented by `newNumerators` and
      * `newDenominators`.
      *
      * Unlike [[convertValue]] this does *not* throw an error if this number is
      * unitless and either `newNumerators` or `newDenominators` are not empty, or
      * vice-versa. Instead, it treats all unitless numbers as convertible to and
      * from all units without changing the value.
      *
      * @throws `Error` if this number's units are incompatible with
      * `newNumerators` and `newDenominators`.
      *
      * @param newNumerators - The numerator units to convert [[value]] to. This
      * may be either a plain JavaScript array or an immutable [[List]] from the
      * [`immutable` package](https://immutable-js.com/).
      *
      * @param newDenominators - The denominator units to convert [[value]] to.
      * This may be either a plain JavaScript array or an immutable [[List]] from
      * the [`immutable` package](https://immutable-js.com/).
      *
      * @param name - The name of the function argument `this` came from (without
      * the `$`) if it came from an argument. Used for error reporting.
      */
    def coerceValue(newNumerators: js.Array[String], newDenominators: js.Array[String]): Double = js.native
    def coerceValue(newNumerators: js.Array[String], newDenominators: js.Array[String], name: String): Double = js.native
    def coerceValue(newNumerators: js.Array[String], newDenominators: typings.immutable.mod.List[String]): Double = js.native
    def coerceValue(newNumerators: js.Array[String], newDenominators: typings.immutable.mod.List[String], name: String): Double = js.native
    def coerceValue(newNumerators: typings.immutable.mod.List[String], newDenominators: js.Array[String]): Double = js.native
    def coerceValue(newNumerators: typings.immutable.mod.List[String], newDenominators: js.Array[String], name: String): Double = js.native
    def coerceValue(
      newNumerators: typings.immutable.mod.List[String],
      newDenominators: typings.immutable.mod.List[String]
    ): Double = js.native
    def coerceValue(
      newNumerators: typings.immutable.mod.List[String],
      newDenominators: typings.immutable.mod.List[String],
      name: String
    ): Double = js.native
    
    /**
      * Returns [[value]], converted to the units represented by `newNumerators`
      * and `newDenominators`.
      *
      * Unlike [[convertValueToMatch]] this does *not* throw an error if this
      * number is unitless and either `newNumerators` or `newDenominators` are not
      * empty, or vice-versa. Instead, it treats all unitless numbers as
      * convertible to and from all units without changing the value.
      *
      * @throws `Error` if this number's units are incompatible with `other`'s
      * units.
      *
      * @param name - The name of the function argument `this` came from (without
      * the `$`) if it came from an argument. Used for error reporting.
      *
      * @param otherName - The name of the function argument `other` came from
      * (without the `$`) if it came from an argument. Used for error reporting.
      */
    def coerceValueToMatch(other: SassNumber): Double = js.native
    def coerceValueToMatch(other: SassNumber, name: String): Double = js.native
    def coerceValueToMatch(other: SassNumber, name: String, otherName: String): Double = js.native
    def coerceValueToMatch(other: SassNumber, name: Unit, otherName: String): Double = js.native
    
    /**
      * Whether this has exactly one numerator unit, and that unit is compatible
      * with `unit`.
      */
    def compatibleWithUnit(unit: String): Boolean = js.native
    
    /**
      * Returns a copy of this number, converted to the units represented by
      * `newNumerators` and `newDenominators`.
      *
      * @throws `Error` if this number's units are incompatible with
      * `newNumerators` and `newDenominators`; or if this number is unitless and
      * either `newNumerators` or `newDenominators` are not empty, or vice-versa.
      *
      * @param newNumerators - The numerator units to convert this number to. This
      * may be either a plain JavaScript array or an immutable [[List]] from the
      * [`immutable` package](https://immutable-js.com/).
      *
      * @param newDenominators - The denominator units to convert this number to.
      * This may be either a plain JavaScript array or an immutable [[List]] from
      * the [`immutable` package](https://immutable-js.com/).
      *
      * @param name - The name of the function argument `this` came from (without
      * the `$`) if it came from an argument. Used for error reporting.
      */
    def convert(newNumerators: js.Array[String], newDenominators: js.Array[String]): SassNumber = js.native
    def convert(newNumerators: js.Array[String], newDenominators: js.Array[String], name: String): SassNumber = js.native
    def convert(newNumerators: js.Array[String], newDenominators: typings.immutable.mod.List[String]): SassNumber = js.native
    def convert(newNumerators: js.Array[String], newDenominators: typings.immutable.mod.List[String], name: String): SassNumber = js.native
    def convert(newNumerators: typings.immutable.mod.List[String], newDenominators: js.Array[String]): SassNumber = js.native
    def convert(newNumerators: typings.immutable.mod.List[String], newDenominators: js.Array[String], name: String): SassNumber = js.native
    def convert(
      newNumerators: typings.immutable.mod.List[String],
      newDenominators: typings.immutable.mod.List[String]
    ): SassNumber = js.native
    def convert(
      newNumerators: typings.immutable.mod.List[String],
      newDenominators: typings.immutable.mod.List[String],
      name: String
    ): SassNumber = js.native
    
    /**
      * Returns a copy of this number, converted to the same units as `other`.
      *
      * @throws `Error` if this number's units are incompatible with `other`'s
      * units, or if either number is unitless but the other is not.
      *
      * @param name - The name of the function argument `this` came from (without
      * the `$`) if it came from an argument. Used for error reporting.
      *
      * @param otherName - The name of the function argument `other` came from
      * (without the `$`) if it came from an argument. Used for error reporting.
      */
    def convertToMatch(other: SassNumber): SassNumber = js.native
    def convertToMatch(other: SassNumber, name: String): SassNumber = js.native
    def convertToMatch(other: SassNumber, name: String, otherName: String): SassNumber = js.native
    def convertToMatch(other: SassNumber, name: Unit, otherName: String): SassNumber = js.native
    
    /**
      * Returns [[value]], converted to the units represented by `newNumerators`
      * and `newDenominators`.
      *
      * @throws `Error` if this number's units are incompatible with
      * `newNumerators` and `newDenominators`; or if this number is unitless and
      * either `newNumerators` or `newDenominators` are not empty, or vice-versa.
      *
      * @param newNumerators - The numerator units to convert [[value]] to. This
      * may be either a plain JavaScript array or an immutable [[List]] from the
      * [`immutable` package](https://immutable-js.com/).
      *
      * @param newDenominators - The denominator units to convert [[value]] to.
      * This may be either a plain JavaScript array or an immutable [[List]] from
      * the [`immutable` package](https://immutable-js.com/).
      *
      * @param name - The name of the function argument `this` came from (without
      * the `$`) if it came from an argument. Used for error reporting.
      */
    def convertValue(newNumerators: js.Array[String], newDenominators: js.Array[String]): Double = js.native
    def convertValue(newNumerators: js.Array[String], newDenominators: js.Array[String], name: String): Double = js.native
    def convertValue(newNumerators: js.Array[String], newDenominators: typings.immutable.mod.List[String]): Double = js.native
    def convertValue(newNumerators: js.Array[String], newDenominators: typings.immutable.mod.List[String], name: String): Double = js.native
    def convertValue(newNumerators: typings.immutable.mod.List[String], newDenominators: js.Array[String]): Double = js.native
    def convertValue(newNumerators: typings.immutable.mod.List[String], newDenominators: js.Array[String], name: String): Double = js.native
    def convertValue(
      newNumerators: typings.immutable.mod.List[String],
      newDenominators: typings.immutable.mod.List[String]
    ): Double = js.native
    def convertValue(
      newNumerators: typings.immutable.mod.List[String],
      newDenominators: typings.immutable.mod.List[String],
      name: String
    ): Double = js.native
    
    /**
      * Returns [[value]], converted to the same units as `other`.
      *
      * @throws `Error` if this number's units are incompatible with `other`'s
      * units, or if either number is unitless but the other is not.
      *
      * @param name - The name of the function argument `this` came from (without
      * the `$`) if it came from an argument. Used for error reporting.
      *
      * @param otherName - The name of the function argument `other` came from
      * (without the `$`) if it came from an argument. Used for error reporting.
      */
    def convertValueToMatch(other: SassNumber): Double = js.native
    def convertValueToMatch(other: SassNumber, name: String): Double = js.native
    def convertValueToMatch(other: SassNumber, name: String, otherName: String): Double = js.native
    def convertValueToMatch(other: SassNumber, name: Unit, otherName: String): Double = js.native
    
    /**
      * This number's denominator units as an immutable [[List]] from the
      * [`immutable` package](https://immutable-js.com/).
      */
    def denominatorUnits: typings.immutable.mod.List[String] = js.native
    
    /** Whether this number has `unit` as its only unit (and as a numerator). */
    def hasUnit(unit: String): Boolean = js.native
    
    /** Whether this number has any numerator or denominator units. */
    def hasUnits: Boolean = js.native
    
    /** Whether [[value]] is an integer according to Sass's equality logic. */
    def isInt: Boolean = js.native
    
    /**
      * This number's numerator units as an immutable [[List]] from the
      * [`immutable` package](https://immutable-js.com/).
      */
    def numeratorUnits: typings.immutable.mod.List[String] = js.native
    
    /** This number's numeric value. */
    def value: Double = js.native
  }
}
