package typings.spellchecker.spellcheckerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("spellchecker", "checkSpellingAsync")
@js.native
object checkSpellingAsync extends js.Object {
  def apply(corpus: String): js.Promise[js.Array[MisspelledLocation]] = js.native
}

