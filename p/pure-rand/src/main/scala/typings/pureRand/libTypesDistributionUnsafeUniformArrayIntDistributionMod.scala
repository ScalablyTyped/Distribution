package typings.pureRand

import typings.pureRand.libTypesDistributionInternalsArrayIntMod.ArrayInt
import typings.pureRand.libTypesGeneratorRandomGeneratorMod.RandomGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesDistributionUnsafeUniformArrayIntDistributionMod {
  
  @JSImport("pure-rand/lib/types/distribution/UnsafeUniformArrayIntDistribution", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def unsafeUniformArrayIntDistribution(from: ArrayInt, to: ArrayInt, rng: RandomGenerator): ArrayInt = (^.asInstanceOf[js.Dynamic].applyDynamic("unsafeUniformArrayIntDistribution")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], rng.asInstanceOf[js.Any])).asInstanceOf[ArrayInt]
}
