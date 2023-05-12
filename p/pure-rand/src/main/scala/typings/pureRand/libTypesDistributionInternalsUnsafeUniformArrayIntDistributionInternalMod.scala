package typings.pureRand

import typings.pureRand.libTypesGeneratorRandomGeneratorMod.RandomGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesDistributionInternalsUnsafeUniformArrayIntDistributionInternalMod {
  
  @JSImport("pure-rand/lib/types/distribution/internals/UnsafeUniformArrayIntDistributionInternal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def unsafeUniformArrayIntDistributionInternal(out: js.Array[Double], rangeSize: js.Array[Double], rng: RandomGenerator): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("unsafeUniformArrayIntDistributionInternal")(out.asInstanceOf[js.Any], rangeSize.asInstanceOf[js.Any], rng.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
