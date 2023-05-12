package typings.pureRand

import typings.pureRand.libTypesGeneratorRandomGeneratorMod.RandomGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesGeneratorLinearCongruentialMod {
  
  @JSImport("pure-rand/lib/types/generator/LinearCongruential", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def congruential32(seed: Double): RandomGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("congruential32")(seed.asInstanceOf[js.Any]).asInstanceOf[RandomGenerator]
}
