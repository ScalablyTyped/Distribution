package typings.random

import typings.random.distRandomMod.Random
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDistributionsBinomialMod {
  
  @JSImport("random/dist/distributions/binomial", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(random: Random): js.Function0[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(random.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Double]]
  inline def default(random: Random, n: Double): js.Function0[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(random.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Double]]
  inline def default(random: Random, n: Double, p: Double): js.Function0[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(random.asInstanceOf[js.Any], n.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Double]]
  inline def default(random: Random, n: Unit, p: Double): js.Function0[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(random.asInstanceOf[js.Any], n.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Double]]
}
