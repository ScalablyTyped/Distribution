package typings.reservedDashWords.reservedDashWordsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("reserved-words", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val KEYWORDS: Keywords = js.native
  def check(word: String): Boolean = js.native
  def check(word: String, dialect: Dialect): Boolean = js.native
  def check(word: String, dialect: Dialect, strict: Boolean): Boolean = js.native
}

