package typings.spellchecker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("spellchecker", "checkSpellingAsync")
@js.native
object checkSpellingAsync extends js.Object {
  
  def apply(corpus: String): js.Promise[js.Array[MisspelledLocation]] = js.native
}
