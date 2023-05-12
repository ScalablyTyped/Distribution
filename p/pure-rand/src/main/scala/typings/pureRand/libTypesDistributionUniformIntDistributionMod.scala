package typings.pureRand

import typings.pureRand.libTypesDistributionDistributionMod.Distribution
import typings.pureRand.libTypesGeneratorRandomGeneratorMod.RandomGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesDistributionUniformIntDistributionMod {
  
  @JSImport("pure-rand/lib/types/distribution/UniformIntDistribution", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def uniformIntDistribution(from: Double, to: Double): Distribution[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("uniformIntDistribution")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Distribution[Double]]
  inline def uniformIntDistribution(from: Double, to: Double, rng: RandomGenerator): js.Tuple2[Double, RandomGenerator] = (^.asInstanceOf[js.Dynamic].applyDynamic("uniformIntDistribution")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], rng.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, RandomGenerator]]
}
