package typings.simpleStatistics

import typings.simpleStatistics.anon.B
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linearRegressionMod {
  
  @JSImport("simple-statistics/src/linear_regression", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(data: js.Array[js.Array[Double]]): B = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any]).asInstanceOf[B]
}
