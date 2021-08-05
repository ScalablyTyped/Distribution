package typings.simpleStatistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object probitMod {
  
  @JSImport("simple-statistics/src/probit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(p: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(p.asInstanceOf[js.Any]).asInstanceOf[Double]
}
