package typings.simpleStatistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shuffleMod {
  
  @JSImport("simple-statistics/src/shuffle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: js.Array[Any] */](x: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(x.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def default[T /* <: js.Array[Any] */](x: T, randomSource: js.Function0[Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(x.asInstanceOf[js.Any], randomSource.asInstanceOf[js.Any])).asInstanceOf[T]
}
