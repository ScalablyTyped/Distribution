package typings.pureRand

import typings.pureRand.libTypesGeneratorRandomGeneratorMod.RandomGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesGeneratorXoroShiroMod {
  
  @JSImport("pure-rand/lib/types/generator/XoroShiro", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def xoroshiro128plus(seed: Double): RandomGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("xoroshiro128plus")(seed.asInstanceOf[js.Any]).asInstanceOf[RandomGenerator]
}
