package typings.romans

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("romans", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("romans", "allChars")
  @js.native
  val allChars: js.Array[String] = js.native
  
  @JSImport("romans", "allNumerals")
  @js.native
  val allNumerals: js.Array[Double] = js.native
  
  @scala.inline
  def deromanize(romanStr: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("deromanize")(romanStr.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def romanize(decimal: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("romanize")(decimal.asInstanceOf[js.Any]).asInstanceOf[String]
}
