package typings.rotJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("rot-js/lib/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def capitalize(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("capitalize")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def clamp(`val`: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(`val`.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def clamp(`val`: Double, min: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(`val`.asInstanceOf[js.Any], min.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def clamp(`val`: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(`val`.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def clamp(`val`: Double, min: Unit, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(`val`.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def format(template: String, args: js.Any*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(template.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def mod(x: Double, n: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("mod")(x.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Double]
}
