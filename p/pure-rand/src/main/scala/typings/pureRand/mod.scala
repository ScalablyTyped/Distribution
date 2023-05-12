package typings.pureRand

import typings.pureRand.libTypesDistributionDistributionMod.Distribution
import typings.pureRand.libTypesDistributionInternalsArrayIntMod.ArrayInt
import typings.pureRand.libTypesGeneratorRandomGeneratorMod.RandomGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pure-rand", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("pure-rand", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("pure-rand", "default.__commitHash")
    @js.native
    val commitHash: String = js.native
    
    inline def congruential32(seed: Double): RandomGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("congruential32")(seed.asInstanceOf[js.Any]).asInstanceOf[RandomGenerator]
    
    inline def generateN(rng: RandomGenerator, num: Double): js.Tuple2[js.Array[Double], RandomGenerator] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateN")(rng.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[Double], RandomGenerator]]
    
    inline def mersenne(seed: Double): RandomGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("mersenne")(seed.asInstanceOf[js.Any]).asInstanceOf[RandomGenerator]
    
    inline def skipN(rng: RandomGenerator, num: Double): RandomGenerator = (^.asInstanceOf[js.Dynamic].applyDynamic("skipN")(rng.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[RandomGenerator]
    
    @JSImport("pure-rand", "default.__type")
    @js.native
    val `type`: String = js.native
    
    inline def uniformArrayIntDistribution(from: ArrayInt, to: ArrayInt): Distribution[ArrayInt] = (^.asInstanceOf[js.Dynamic].applyDynamic("uniformArrayIntDistribution")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Distribution[ArrayInt]]
    inline def uniformArrayIntDistribution(from: ArrayInt, to: ArrayInt, rng: RandomGenerator): js.Tuple2[ArrayInt, RandomGenerator] = (^.asInstanceOf[js.Dynamic].applyDynamic("uniformArrayIntDistribution")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], rng.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ArrayInt, RandomGenerator]]
    
    inline def uniformBigIntDistribution(from: js.BigInt, to: js.BigInt): Distribution[js.BigInt] = (^.asInstanceOf[js.Dynamic].applyDynamic("uniformBigIntDistribution")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Distribution[js.BigInt]]
    inline def uniformBigIntDistribution(from: js.BigInt, to: js.BigInt, rng: RandomGenerator): js.Tuple2[js.BigInt, RandomGenerator] = (^.asInstanceOf[js.Dynamic].applyDynamic("uniformBigIntDistribution")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], rng.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.BigInt, RandomGenerator]]
    
    inline def uniformIntDistribution(from: Double, to: Double): Distribution[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("uniformIntDistribution")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Distribution[Double]]
    inline def uniformIntDistribution(from: Double, to: Double, rng: RandomGenerator): js.Tuple2[Double, RandomGenerator] = (^.asInstanceOf[js.Dynamic].applyDynamic("uniformIntDistribution")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], rng.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, RandomGenerator]]
    
    inline def unsafeGenerateN(rng: RandomGenerator, num: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("unsafeGenerateN")(rng.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    inline def unsafeSkipN(rng: RandomGenerator, num: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unsafeSkipN")(rng.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def unsafeUniformArrayIntDistribution(from: ArrayInt, to: ArrayInt, rng: RandomGenerator): ArrayInt = (^.asInstanceOf[js.Dynamic].applyDynamic("unsafeUniformArrayIntDistribution")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], rng.asInstanceOf[js.Any])).asInstanceOf[ArrayInt]
    
    inline def unsafeUniformBigIntDistribution(from: js.BigInt, to: js.BigInt, rng: RandomGenerator): js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("unsafeUniformBigIntDistribution")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], rng.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]
    
    inline def unsafeUniformIntDistribution(from: Double, to: Double, rng: RandomGenerator): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("unsafeUniformIntDistribution")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], rng.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @JSImport("pure-rand", "default.__version")
    @js.native
    val version: String = js.native
    
    inline def xoroshiro128plus(seed: Double): RandomGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("xoroshiro128plus")(seed.asInstanceOf[js.Any]).asInstanceOf[RandomGenerator]
    
    inline def xorshift128plus(seed: Double): RandomGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("xorshift128plus")(seed.asInstanceOf[js.Any]).asInstanceOf[RandomGenerator]
  }
  
  @JSImport("pure-rand", "__commitHash")
  @js.native
  val commitHash: String = js.native
  
  inline def congruential32(seed: Double): RandomGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("congruential32")(seed.asInstanceOf[js.Any]).asInstanceOf[RandomGenerator]
  
  inline def generateN(rng: RandomGenerator, num: Double): js.Tuple2[js.Array[Double], RandomGenerator] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateN")(rng.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[Double], RandomGenerator]]
  
  inline def mersenne(seed: Double): RandomGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("mersenne")(seed.asInstanceOf[js.Any]).asInstanceOf[RandomGenerator]
  
  inline def skipN(rng: RandomGenerator, num: Double): RandomGenerator = (^.asInstanceOf[js.Dynamic].applyDynamic("skipN")(rng.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[RandomGenerator]
  
  @JSImport("pure-rand", "__type")
  @js.native
  val `type`: String = js.native
  
  inline def uniformArrayIntDistribution(from: ArrayInt, to: ArrayInt): Distribution[ArrayInt] = (^.asInstanceOf[js.Dynamic].applyDynamic("uniformArrayIntDistribution")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Distribution[ArrayInt]]
  inline def uniformArrayIntDistribution(from: ArrayInt, to: ArrayInt, rng: RandomGenerator): js.Tuple2[ArrayInt, RandomGenerator] = (^.asInstanceOf[js.Dynamic].applyDynamic("uniformArrayIntDistribution")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], rng.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ArrayInt, RandomGenerator]]
  
  inline def uniformBigIntDistribution(from: js.BigInt, to: js.BigInt): Distribution[js.BigInt] = (^.asInstanceOf[js.Dynamic].applyDynamic("uniformBigIntDistribution")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Distribution[js.BigInt]]
  inline def uniformBigIntDistribution(from: js.BigInt, to: js.BigInt, rng: RandomGenerator): js.Tuple2[js.BigInt, RandomGenerator] = (^.asInstanceOf[js.Dynamic].applyDynamic("uniformBigIntDistribution")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], rng.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.BigInt, RandomGenerator]]
  
  inline def uniformIntDistribution(from: Double, to: Double): Distribution[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("uniformIntDistribution")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Distribution[Double]]
  inline def uniformIntDistribution(from: Double, to: Double, rng: RandomGenerator): js.Tuple2[Double, RandomGenerator] = (^.asInstanceOf[js.Dynamic].applyDynamic("uniformIntDistribution")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], rng.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, RandomGenerator]]
  
  inline def unsafeGenerateN(rng: RandomGenerator, num: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("unsafeGenerateN")(rng.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def unsafeSkipN(rng: RandomGenerator, num: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unsafeSkipN")(rng.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unsafeUniformArrayIntDistribution(from: ArrayInt, to: ArrayInt, rng: RandomGenerator): ArrayInt = (^.asInstanceOf[js.Dynamic].applyDynamic("unsafeUniformArrayIntDistribution")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], rng.asInstanceOf[js.Any])).asInstanceOf[ArrayInt]
  
  inline def unsafeUniformBigIntDistribution(from: js.BigInt, to: js.BigInt, rng: RandomGenerator): js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("unsafeUniformBigIntDistribution")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], rng.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]
  
  inline def unsafeUniformIntDistribution(from: Double, to: Double, rng: RandomGenerator): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("unsafeUniformIntDistribution")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], rng.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("pure-rand", "__version")
  @js.native
  val version: String = js.native
  
  inline def xoroshiro128plus(seed: Double): RandomGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("xoroshiro128plus")(seed.asInstanceOf[js.Any]).asInstanceOf[RandomGenerator]
  
  inline def xorshift128plus(seed: Double): RandomGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("xorshift128plus")(seed.asInstanceOf[js.Any]).asInstanceOf[RandomGenerator]
}
