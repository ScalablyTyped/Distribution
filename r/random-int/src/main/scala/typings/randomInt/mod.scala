package typings.randomInt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Double = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Double]
  inline def apply(minimum: Double): Double = ^.asInstanceOf[js.Dynamic].apply(minimum.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def apply(minimum: Double, maximum: Double): Double = (^.asInstanceOf[js.Dynamic].apply(minimum.asInstanceOf[js.Any], maximum.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(minimum: Unit, maximum: Double): Double = (^.asInstanceOf[js.Dynamic].apply(minimum.asInstanceOf[js.Any], maximum.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("random-int", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
