package typings.randomJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsToIntegerMod {
  
  @JSImport("random-js/dist/utils/toInteger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toInteger(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toInteger")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
}
