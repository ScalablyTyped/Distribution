package typings.spellchecker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("spellchecker", "checkSpelling")
@js.native
object checkSpelling extends js.Object {
  
  def apply(corpus: String): js.Array[MisspelledLocation] = js.native
}
