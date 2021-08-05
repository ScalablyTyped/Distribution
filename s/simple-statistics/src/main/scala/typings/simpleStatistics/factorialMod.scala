package typings.simpleStatistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factorialMod {
  
  @JSImport("simple-statistics/src/factorial", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(n: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
}
