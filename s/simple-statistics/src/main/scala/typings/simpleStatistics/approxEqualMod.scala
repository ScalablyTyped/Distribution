package typings.simpleStatistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object approxEqualMod {
  
  @JSImport("simple-statistics/src/approx_equal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(actual: Double, expected: Double, tolerance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(actual.asInstanceOf[js.Any], expected.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
