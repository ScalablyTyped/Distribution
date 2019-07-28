package typings.spellchecker.spellcheckerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("spellchecker", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def add(word: String): Unit = js.native
  def checkSpelling(corpus: String): js.Array[MisspelledLocation] = js.native
  def checkSpellingAsync(corpus: String): js.Promise[js.Array[MisspelledLocation]] = js.native
  def getCorrectionsForMisspelling(word: String): js.Array[String] = js.native
  def isMisspelled(word: String): Boolean = js.native
}

