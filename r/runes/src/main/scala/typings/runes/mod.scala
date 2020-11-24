package typings.runes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("runes", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(text: String): js.Array[String] = js.native
  
  def substr(text: String, start: Double): String = js.native
  def substr(text: String, start: Double, width: Double): String = js.native
}
