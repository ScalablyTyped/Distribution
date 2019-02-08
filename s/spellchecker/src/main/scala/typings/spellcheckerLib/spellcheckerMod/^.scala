package typings
package spellcheckerLib.spellcheckerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("spellchecker", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def add(word: java.lang.String): scala.Unit = js.native
  def checkSpelling(corpus: java.lang.String): js.Array[spellcheckerLib.spellcheckerMod.MisspelledLocation] = js.native
  def checkSpellingAsync(corpus: java.lang.String): js.Promise[js.Array[spellcheckerLib.spellcheckerMod.MisspelledLocation]] = js.native
  def getCorrectionsForMisspelling(word: java.lang.String): js.Array[java.lang.String] = js.native
  def isMisspelled(word: java.lang.String): scala.Boolean = js.native
}

