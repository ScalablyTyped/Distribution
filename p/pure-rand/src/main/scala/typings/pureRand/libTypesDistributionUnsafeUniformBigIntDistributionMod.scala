package typings.pureRand

import typings.pureRand.libTypesGeneratorRandomGeneratorMod.RandomGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesDistributionUnsafeUniformBigIntDistributionMod {
  
  @JSImport("pure-rand/lib/types/distribution/UnsafeUniformBigIntDistribution", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def unsafeUniformBigIntDistribution(from: js.BigInt, to: js.BigInt, rng: RandomGenerator): js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("unsafeUniformBigIntDistribution")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], rng.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]
}
