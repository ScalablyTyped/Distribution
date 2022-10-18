package typings.random

import typings.random.distCjsRandomMod.Random
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsDistributionsNormalMod {
  
  @JSImport("random/dist/cjs/distributions/normal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(random: Random): js.Function0[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(random.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Double]]
  inline def default(random: Random, mu: Double): js.Function0[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(random.asInstanceOf[js.Any], mu.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Double]]
  inline def default(random: Random, mu: Double, sigma: Double): js.Function0[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(random.asInstanceOf[js.Any], mu.asInstanceOf[js.Any], sigma.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Double]]
  inline def default(random: Random, mu: Unit, sigma: Double): js.Function0[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(random.asInstanceOf[js.Any], mu.asInstanceOf[js.Any], sigma.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Double]]
}
