package typings.randomFloat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Double = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Double]
  inline def apply(maximumValue: Double): Double = ^.asInstanceOf[js.Dynamic].apply(maximumValue.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def apply(minimumValue: Double, maximumValue: Double): Double = (^.asInstanceOf[js.Dynamic].apply(minimumValue.asInstanceOf[js.Any], maximumValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("random-float", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
