package typings.randomJs

import typings.randomJs.distTypesMod.Distribution
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDistributionDieMod {
  
  @JSImport("random-js/dist/distribution/die", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def die(sideCount: Double): Distribution[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("die")(sideCount.asInstanceOf[js.Any]).asInstanceOf[Distribution[Double]]
}
