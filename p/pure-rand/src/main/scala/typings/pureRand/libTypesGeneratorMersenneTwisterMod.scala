package typings.pureRand

import typings.pureRand.libTypesGeneratorRandomGeneratorMod.RandomGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesGeneratorMersenneTwisterMod {
  
  @JSImport("pure-rand/lib/types/generator/MersenneTwister", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(seed: Double): RandomGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(seed.asInstanceOf[js.Any]).asInstanceOf[RandomGenerator]
}
