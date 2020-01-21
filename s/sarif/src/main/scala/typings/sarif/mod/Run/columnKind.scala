package typings.sarif.mod.Run

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.sarif.sarifStrings.utf16CodeUnits
  - typings.sarif.sarifStrings.unicodeCodePoints
*/
trait columnKind extends js.Object

object columnKind {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def unicodeCodePoints: typings.sarif.sarifStrings.unicodeCodePoints = this.cast("unicodeCodePoints")
  @scala.inline
  def utf16CodeUnits: typings.sarif.sarifStrings.utf16CodeUnits = this.cast("utf16CodeUnits")
}

