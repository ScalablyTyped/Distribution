package typings.pureRand

import typings.pureRand.libTypesDistributionDistributionMod.Distribution
import typings.pureRand.libTypesGeneratorRandomGeneratorMod.RandomGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesDistributionUniformBigIntDistributionMod {
  
  @JSImport("pure-rand/lib/types/distribution/UniformBigIntDistribution", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def uniformBigIntDistribution(from: js.BigInt, to: js.BigInt): Distribution[js.BigInt] = (^.asInstanceOf[js.Dynamic].applyDynamic("uniformBigIntDistribution")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Distribution[js.BigInt]]
  inline def uniformBigIntDistribution(from: js.BigInt, to: js.BigInt, rng: RandomGenerator): js.Tuple2[js.BigInt, RandomGenerator] = (^.asInstanceOf[js.Dynamic].applyDynamic("uniformBigIntDistribution")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], rng.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.BigInt, RandomGenerator]]
}
