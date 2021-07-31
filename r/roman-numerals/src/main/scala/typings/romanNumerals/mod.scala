package typings.romanNumerals

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("roman-numerals", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def toArabic(roman: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toArabic")(roman.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def toRoman(arabic: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toRoman")(arabic.asInstanceOf[js.Any]).asInstanceOf[String]
}
