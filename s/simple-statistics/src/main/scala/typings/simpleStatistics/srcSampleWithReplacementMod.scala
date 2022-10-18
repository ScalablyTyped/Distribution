package typings.simpleStatistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSampleWithReplacementMod {
  
  @JSImport("simple-statistics/src/sample_with_replacement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: Any */](x: js.Array[T], n: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(x.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def default[T /* <: Any */](x: js.Array[T], n: Double, randomSource: js.Function0[Double]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(x.asInstanceOf[js.Any], n.asInstanceOf[js.Any], randomSource.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
}
