package typings.randomJs

import typings.randomJs.typesMod.Distribution
import typings.randomJs.typesMod.Engine
import typings.randomJs.typesMod.StringDistribution
import typings.std.ArrayLike
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("random-js", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  /**
    * MersenneTwister19937 should not be instantiated directly.
    * Instead, use the static methods `seed`, `seedWithArray`, or `autoSeed`.
    */
  class MersenneTwister19937 protected ()
    extends typings.randomJs.mersenneTwister19937Mod.MersenneTwister19937
  
  @js.native
  /**
    * Creates a new Random wrapper
    * @param engine The engine to use (defaults to a `Math.random`-based implementation)
    */
  class Random ()
    extends typings.randomJs.randomMod.Random {
    def this(engine: Engine) = this()
  }
  
  val browserCrypto: Engine = js.native
  val nativeMath: Engine = js.native
  val nodeCrypto: Engine = js.native
  def bool(): Distribution[Boolean] = js.native
  def bool(numerator: Double, denominator: Double): Distribution[Boolean] = js.native
  def bool(percentage: Double): Distribution[Boolean] = js.native
  def createEntropy(): js.Array[Double] = js.native
  def createEntropy(engine: js.UndefOr[scala.Nothing], length: Double): js.Array[Double] = js.native
  def createEntropy(engine: Engine): js.Array[Double] = js.native
  def createEntropy(engine: Engine, length: Double): js.Array[Double] = js.native
  def date(start: Date, end: Date): Distribution[Date] = js.native
  def dice(sideCount: Double, dieCount: Double): Distribution[js.Array[Double]] = js.native
  def die(sideCount: Double): Distribution[Double] = js.native
  def hex(): StringDistribution = js.native
  def hex(uppercase: Boolean): StringDistribution = js.native
  def int32(engine: Engine): Double = js.native
  def int53(engine: Engine): Double = js.native
  def int53Full(engine: Engine): Double = js.native
  def integer(min: Double, max: Double): Distribution[Double] = js.native
  def pick[T](engine: Engine, source: ArrayLike[T]): T = js.native
  def pick[T](engine: Engine, source: ArrayLike[T], begin: js.UndefOr[scala.Nothing], end: Double): T = js.native
  def pick[T](engine: Engine, source: ArrayLike[T], begin: Double): T = js.native
  def pick[T](engine: Engine, source: ArrayLike[T], begin: Double, end: Double): T = js.native
  def picker[T](source: ArrayLike[T]): Distribution[T] = js.native
  def picker[T](source: ArrayLike[T], begin: js.UndefOr[scala.Nothing], end: Double): Distribution[T] = js.native
  def picker[T](source: ArrayLike[T], begin: Double): Distribution[T] = js.native
  def picker[T](source: ArrayLike[T], begin: Double, end: Double): Distribution[T] = js.native
  def real(min: Double, max: Double): Distribution[Double] = js.native
  def real(min: Double, max: Double, inclusive: Boolean): Distribution[Double] = js.native
  def realZeroToOneExclusive(engine: Engine): Double = js.native
  def realZeroToOneInclusive(engine: Engine): Double = js.native
  def sample[T](engine: Engine, population: ArrayLike[T], sampleSize: Double): js.Array[T] = js.native
  def shuffle[T](engine: Engine, array: js.Array[T]): js.Array[T] = js.native
  def shuffle[T](engine: Engine, array: js.Array[T], downTo: Double): js.Array[T] = js.native
  def string(): StringDistribution = js.native
  def string(pool: String): StringDistribution = js.native
  def uint32(engine: Engine): Double = js.native
  def uint53(engine: Engine): Double = js.native
  def uint53Full(engine: Engine): Double = js.native
  def uuid4(engine: Engine): String = js.native
  /* static members */
  @js.native
  object MersenneTwister19937 extends js.Object {
    /**
      * Returns a MersenneTwister19937 seeded with the current time and
      * a series of natively-generated random values
      */
    def autoSeed(): typings.randomJs.mersenneTwister19937Mod.MersenneTwister19937 = js.native
    /**
      * Returns a MersenneTwister19937 seeded with an initial int32 value
      * @param initial the initial seed value
      */
    def seed(initial: Double): typings.randomJs.mersenneTwister19937Mod.MersenneTwister19937 = js.native
    /**
      * Returns a MersenneTwister19937 seeded with zero or more int32 values
      * @param source A series of int32 values
      */
    def seedWithArray(source: ArrayLike[Double]): typings.randomJs.mersenneTwister19937Mod.MersenneTwister19937 = js.native
  }
  
}

