package typings.pureRand

import typings.pureRand.libTypesGeneratorRandomGeneratorMod.RandomGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesGeneratorXorShiftMod {
  
  @JSImport("pure-rand/lib/types/generator/XorShift", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def xorshift128plus(seed: Double): RandomGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("xorshift128plus")(seed.asInstanceOf[js.Any]).asInstanceOf[RandomGenerator]
}
