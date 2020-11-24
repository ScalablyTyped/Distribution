package typings.reservedWords.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("reserved-words", "check")
@js.native
object check extends js.Object {
  
  def apply(word: String): Boolean = js.native
  def apply(word: String, dialect: js.UndefOr[scala.Nothing], strict: Boolean): Boolean = js.native
  def apply(word: String, dialect: Dialect): Boolean = js.native
  def apply(word: String, dialect: Dialect, strict: Boolean): Boolean = js.native
}
