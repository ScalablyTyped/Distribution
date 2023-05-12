package typings.pureRand

import typings.pureRand.libTypesGeneratorRandomGeneratorMod.RandomGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesDistributionUnsafeUniformIntDistributionMod {
  
  @JSImport("pure-rand/lib/types/distribution/UnsafeUniformIntDistribution", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def unsafeUniformIntDistribution(from: Double, to: Double, rng: RandomGenerator): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("unsafeUniformIntDistribution")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], rng.asInstanceOf[js.Any])).asInstanceOf[Double]
}
