package typings.pureRand

import typings.pureRand.libTypesGeneratorRandomGeneratorMod.RandomGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesDistributionInternalsUnsafeUniformIntDistributionInternalMod {
  
  @JSImport("pure-rand/lib/types/distribution/internals/UnsafeUniformIntDistributionInternal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def unsafeUniformIntDistributionInternal(rangeSize: Double, rng: RandomGenerator): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("unsafeUniformIntDistributionInternal")(rangeSize.asInstanceOf[js.Any], rng.asInstanceOf[js.Any])).asInstanceOf[Double]
}
