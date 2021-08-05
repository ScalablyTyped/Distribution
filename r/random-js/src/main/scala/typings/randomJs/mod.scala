package typings.randomJs

import typings.randomJs.typesMod.Distribution
import typings.randomJs.typesMod.Engine
import typings.randomJs.typesMod.StringDistribution
import typings.std.ArrayLike
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("random-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("random-js", "MersenneTwister19937")
  @js.native
  /**
    * MersenneTwister19937 should not be instantiated directly.
    * Instead, use the static methods `seed`, `seedWithArray`, or `autoSeed`.
    */
  /* private */ class MersenneTwister19937 ()
    extends typings.randomJs.mersenneTwister19937Mod.MersenneTwister19937
  /* static members */
  object MersenneTwister19937 {
    
    @JSImport("random-js", "MersenneTwister19937")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a MersenneTwister19937 seeded with the current time and
      * a series of natively-generated random values
      */
    inline def autoSeed(): typings.randomJs.mersenneTwister19937Mod.MersenneTwister19937 = ^.asInstanceOf[js.Dynamic].applyDynamic("autoSeed")().asInstanceOf[typings.randomJs.mersenneTwister19937Mod.MersenneTwister19937]
    
    /**
      * Returns a MersenneTwister19937 seeded with an initial int32 value
      * @param initial the initial seed value
      */
    inline def seed(initial: Double): typings.randomJs.mersenneTwister19937Mod.MersenneTwister19937 = ^.asInstanceOf[js.Dynamic].applyDynamic("seed")(initial.asInstanceOf[js.Any]).asInstanceOf[typings.randomJs.mersenneTwister19937Mod.MersenneTwister19937]
    
    /**
      * Returns a MersenneTwister19937 seeded with zero or more int32 values
      * @param source A series of int32 values
      */
    inline def seedWithArray(source: ArrayLike[Double]): typings.randomJs.mersenneTwister19937Mod.MersenneTwister19937 = ^.asInstanceOf[js.Dynamic].applyDynamic("seedWithArray")(source.asInstanceOf[js.Any]).asInstanceOf[typings.randomJs.mersenneTwister19937Mod.MersenneTwister19937]
  }
  
  @JSImport("random-js", "Random")
  @js.native
  /**
    * Creates a new Random wrapper
    * @param engine The engine to use (defaults to a `Math.random`-based implementation)
    */
  class Random ()
    extends typings.randomJs.randomMod.Random {
    def this(engine: Engine) = this()
  }
  
  inline def bool(): Distribution[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("bool")().asInstanceOf[Distribution[Boolean]]
  inline def bool(numerator: Double, denominator: Double): Distribution[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("bool")(numerator.asInstanceOf[js.Any], denominator.asInstanceOf[js.Any])).asInstanceOf[Distribution[Boolean]]
  inline def bool(percentage: Double): Distribution[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("bool")(percentage.asInstanceOf[js.Any]).asInstanceOf[Distribution[Boolean]]
  
  @JSImport("random-js", "browserCrypto")
  @js.native
  val browserCrypto: Engine = js.native
  
  inline def createEntropy(): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEntropy")().asInstanceOf[js.Array[Double]]
  inline def createEntropy(engine: Unit, length: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("createEntropy")(engine.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def createEntropy(engine: Engine): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEntropy")(engine.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def createEntropy(engine: Engine, length: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("createEntropy")(engine.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def date(start: Date, end: Date): Distribution[Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("date")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Distribution[Date]]
  
  inline def dice(sideCount: Double, dieCount: Double): Distribution[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("dice")(sideCount.asInstanceOf[js.Any], dieCount.asInstanceOf[js.Any])).asInstanceOf[Distribution[js.Array[Double]]]
  
  inline def die(sideCount: Double): Distribution[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("die")(sideCount.asInstanceOf[js.Any]).asInstanceOf[Distribution[Double]]
  
  inline def hex(): StringDistribution = ^.asInstanceOf[js.Dynamic].applyDynamic("hex")().asInstanceOf[StringDistribution]
  inline def hex(uppercase: Boolean): StringDistribution = ^.asInstanceOf[js.Dynamic].applyDynamic("hex")(uppercase.asInstanceOf[js.Any]).asInstanceOf[StringDistribution]
  
  inline def int32(engine: Engine): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("int32")(engine.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def int53(engine: Engine): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("int53")(engine.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def int53Full(engine: Engine): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("int53Full")(engine.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def integer(min: Double, max: Double): Distribution[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("integer")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Distribution[Double]]
  
  @JSImport("random-js", "nativeMath")
  @js.native
  val nativeMath: Engine = js.native
  
  @JSImport("random-js", "nodeCrypto")
  @js.native
  val nodeCrypto: Engine = js.native
  
  inline def pick[T](engine: Engine, source: ArrayLike[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pick")(engine.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def pick[T](engine: Engine, source: ArrayLike[T], begin: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pick")(engine.asInstanceOf[js.Any], source.asInstanceOf[js.Any], begin.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def pick[T](engine: Engine, source: ArrayLike[T], begin: Double, end: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pick")(engine.asInstanceOf[js.Any], source.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def pick[T](engine: Engine, source: ArrayLike[T], begin: Unit, end: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pick")(engine.asInstanceOf[js.Any], source.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def picker[T](source: ArrayLike[T]): Distribution[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("picker")(source.asInstanceOf[js.Any]).asInstanceOf[Distribution[T]]
  inline def picker[T](source: ArrayLike[T], begin: Double): Distribution[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("picker")(source.asInstanceOf[js.Any], begin.asInstanceOf[js.Any])).asInstanceOf[Distribution[T]]
  inline def picker[T](source: ArrayLike[T], begin: Double, end: Double): Distribution[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("picker")(source.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Distribution[T]]
  inline def picker[T](source: ArrayLike[T], begin: Unit, end: Double): Distribution[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("picker")(source.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Distribution[T]]
  
  inline def real(min: Double, max: Double): Distribution[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("real")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Distribution[Double]]
  inline def real(min: Double, max: Double, inclusive: Boolean): Distribution[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("real")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], inclusive.asInstanceOf[js.Any])).asInstanceOf[Distribution[Double]]
  
  inline def realZeroToOneExclusive(engine: Engine): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("realZeroToOneExclusive")(engine.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def realZeroToOneInclusive(engine: Engine): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("realZeroToOneInclusive")(engine.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def sample[T](engine: Engine, population: ArrayLike[T], sampleSize: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("sample")(engine.asInstanceOf[js.Any], population.asInstanceOf[js.Any], sampleSize.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def shuffle[T](engine: Engine, array: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(engine.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def shuffle[T](engine: Engine, array: js.Array[T], downTo: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(engine.asInstanceOf[js.Any], array.asInstanceOf[js.Any], downTo.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def string(): StringDistribution = ^.asInstanceOf[js.Dynamic].applyDynamic("string")().asInstanceOf[StringDistribution]
  inline def string(pool: String): StringDistribution = ^.asInstanceOf[js.Dynamic].applyDynamic("string")(pool.asInstanceOf[js.Any]).asInstanceOf[StringDistribution]
  
  inline def uint32(engine: Engine): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("uint32")(engine.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def uint53(engine: Engine): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("uint53")(engine.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def uint53Full(engine: Engine): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("uint53Full")(engine.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def uuid4(engine: Engine): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uuid4")(engine.asInstanceOf[js.Any]).asInstanceOf[String]
}
