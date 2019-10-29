package typings.randomDashJs

import typings.randomDashJs.distTypesMod.Engine
import typings.std.ArrayLike
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("random-js/dist/Random", JSImport.Namespace)
@js.native
object distRandomMod extends js.Object {
  @js.native
  /**
    * Creates a new Random wrapper
    * @param engine The engine to use (defaults to a `Math.random`-based implementation)
    */
  class Random () extends js.Object {
    def this(engine: Engine) = this()
    val engine: js.Any = js.native
    /**
      * Returns a boolean with 50% probability of being true or false
      */
    def bool(): Boolean = js.native
    /**
      * Returns a boolean with a probability of `numerator`/`denominator` of being true
      * @param numerator The numerator of the probability
      * @param denominator The denominator of the probability
      */
    def bool(numerator: Double, denominator: Double): Boolean = js.native
    /**
      * Returns a boolean with the provided `percentage` of being true
      * @param percentage A number within [0, 1] of how often the result should be `true`
      */
    def bool(percentage: Double): Boolean = js.native
    /**
      * Returns a random `Date` within the inclusive range of [`start`, `end`].
      * @param start The minimum `Date`
      * @param end The maximum `Date`
      */
    def date(start: Date, end: Date): Date = js.native
    /**
      * Returns an array of length `dieCount` of values within [1, sideCount]
      * @param sideCount The number of sides of each die
      * @param dieCount The number of dice
      */
    def dice(sideCount: Double, dieCount: Double): js.Array[Double] = js.native
    /**
      * Returns a value within [1, sideCount]
      * @param sideCount The number of sides of the die
      */
    def die(sideCount: Double): Double = js.native
    /**
      * Returns a random string comprised of numbers or the characters `abcdef`
      * (or `ABCDEF`) of length `length`.
      * @param length Length of the result string
      * @param uppercase Whether the string should use `ABCDEF` instead of `abcdef`
      */
    def hex(length: Double): String = js.native
    def hex(length: Double, uppercase: Boolean): String = js.native
    /**
      * Returns a value within [-0x80000000, 0x7fffffff]
      */
    def int32(): Double = js.native
    /**
      * Returns a value within [-0x20000000000000, 0x1fffffffffffff]
      */
    def int53(): Double = js.native
    /**
      * Returns a value within [-0x20000000000000, 0x20000000000000]
      */
    def int53Full(): Double = js.native
    /**
      * Returns a value within [min, max]
      * @param min The minimum integer value, inclusive. No less than -0x20000000000000.
      * @param max The maximum integer value, inclusive. No greater than 0x20000000000000.
      */
    def integer(min: Double, max: Double): Double = js.native
    /**
      * Return a random value within the provided `source` within the sliced
      * bounds of `begin` and `end`.
      * @param source an array of items to pick from
      * @param begin the beginning slice index (defaults to `0`)
      * @param end the ending slice index (defaults to `source.length`)
      */
    def pick[T](source: ArrayLike[T]): T = js.native
    def pick[T](source: ArrayLike[T], begin: Double): T = js.native
    def pick[T](source: ArrayLike[T], begin: Double, end: Double): T = js.native
    /**
      * Returns a floating-point value within [min, max) or [min, max]
      * @param min The minimum floating-point value, inclusive.
      * @param max The maximum floating-point value.
      * @param inclusive If true, `max` will be inclusive.
      */
    def real(min: Double, max: Double): Double = js.native
    def real(min: Double, max: Double, inclusive: Boolean): Double = js.native
    /**
      * Returns a floating-point value within [0.0, 1.0)
      */
    def realZeroToOneExclusive(): Double = js.native
    /**
      * Returns a floating-point value within [0.0, 1.0]
      */
    def realZeroToOneInclusive(): Double = js.native
    /**
      * From the population array, returns an array with sampleSize elements that
      * are randomly chosen without repeats.
      * @param population An array that has items to choose a sample from
      * @param sampleSize The size of the result array
      */
    def sample[T](population: ArrayLike[T], sampleSize: Double): js.Array[T] = js.native
    /**
      * Shuffles an array in-place
      * @param array The array to shuffle
      */
    def shuffle[T](array: js.Array[T]): js.Array[T] = js.native
    /**
      * Returns a random string using numbers, uppercase and lowercase letters,
      * `_`, and `-` of length `length`.
      * @param length Length of the result string
      */
    def string(length: Double): String = js.native
    /**
      * Returns a random string using the provided string pool as the possible
      * characters to choose from of length `length`.
      * @param length Length of the result string
      */
    def string(length: Double, pool: String): String = js.native
    /**
      * Returns a value within [0, 0xffffffff]
      */
    def uint32(): Double = js.native
    /**
      * Returns a value within [0, 0x1fffffffffffff]
      */
    def uint53(): Double = js.native
    /**
      * Returns a value within [0, 0x20000000000000]
      */
    def uint53Full(): Double = js.native
    /**
      * Returns a Universally Unique Identifier Version 4.
      *
      * See http://en.wikipedia.org/wiki/Universally_unique_identifier
      */
    def uuid4(): String = js.native
  }
  
}

