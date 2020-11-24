package typings.romans

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("romans", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val allChars: js.Array[String] = js.native
  
  val allNumerals: js.Array[Double] = js.native
  
  def deromanize(romanStr: String): Double = js.native
  
  def romanize(decimal: Double): String = js.native
}
