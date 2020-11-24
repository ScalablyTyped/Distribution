package typings.starwarsNames

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("starwars-names", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val all: js.Array[String] = js.native
  
  def random(): String = js.native
  def random(number: Double): js.Array[String] = js.native
}
