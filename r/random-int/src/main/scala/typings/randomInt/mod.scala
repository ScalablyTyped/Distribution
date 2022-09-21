package typings.randomInt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("random-int", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Double]
  inline def default(minimum: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(minimum.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def default(minimum: Double, maximum: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(minimum.asInstanceOf[js.Any], maximum.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def default(minimum: Unit, maximum: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(minimum.asInstanceOf[js.Any], maximum.asInstanceOf[js.Any])).asInstanceOf[Double]
}
