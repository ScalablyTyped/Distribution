package typings.randomJs

import typings.randomJs.distTypesMod.Distribution
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDistributionIntegerMod {
  
  @JSImport("random-js/dist/distribution/integer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def integer(min: Double, max: Double): Distribution[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("integer")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Distribution[Double]]
}
