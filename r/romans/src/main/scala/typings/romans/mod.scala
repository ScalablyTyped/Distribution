package typings.romans

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("romans", "allChars")
  @js.native
  val allChars: js.Array[String] = js.native
  
  @JSImport("romans", "allNumerals")
  @js.native
  val allNumerals: js.Array[Double] = js.native
  
  @JSImport("romans", "deromanize")
  @js.native
  def deromanize(romanStr: String): Double = js.native
  
  @JSImport("romans", "romanize")
  @js.native
  def romanize(decimal: Double): String = js.native
}
