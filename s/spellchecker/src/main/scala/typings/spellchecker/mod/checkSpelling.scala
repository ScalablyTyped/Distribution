package typings.spellchecker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("spellchecker", "checkSpelling")
@js.native
object checkSpelling extends js.Object {
  def apply(corpus: String): js.Array[MisspelledLocation] = js.native
}

