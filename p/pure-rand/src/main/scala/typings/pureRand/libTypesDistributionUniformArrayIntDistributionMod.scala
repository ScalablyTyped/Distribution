package typings.pureRand

import typings.pureRand.libTypesDistributionDistributionMod.Distribution
import typings.pureRand.libTypesDistributionInternalsArrayIntMod.ArrayInt
import typings.pureRand.libTypesGeneratorRandomGeneratorMod.RandomGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesDistributionUniformArrayIntDistributionMod {
  
  @JSImport("pure-rand/lib/types/distribution/UniformArrayIntDistribution", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def uniformArrayIntDistribution(from: ArrayInt, to: ArrayInt): Distribution[ArrayInt] = (^.asInstanceOf[js.Dynamic].applyDynamic("uniformArrayIntDistribution")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Distribution[ArrayInt]]
  inline def uniformArrayIntDistribution(from: ArrayInt, to: ArrayInt, rng: RandomGenerator): js.Tuple2[ArrayInt, RandomGenerator] = (^.asInstanceOf[js.Dynamic].applyDynamic("uniformArrayIntDistribution")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], rng.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ArrayInt, RandomGenerator]]
}
