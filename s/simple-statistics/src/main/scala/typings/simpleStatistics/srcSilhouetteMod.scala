package typings.simpleStatistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSilhouetteMod {
  
  @JSImport("simple-statistics/src/silhouette", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(points: js.Array[js.Array[Double]], labels: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(points.asInstanceOf[js.Any], labels.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
