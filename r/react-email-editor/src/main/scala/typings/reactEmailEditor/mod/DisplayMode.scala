package typings.reactEmailEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactEmailEditor.reactEmailEditorStrings.email
  - typings.reactEmailEditor.reactEmailEditorStrings.web
*/
trait DisplayMode extends js.Object

object DisplayMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def email: typings.reactEmailEditor.reactEmailEditorStrings.email = this.cast("email")
  @scala.inline
  def web: typings.reactEmailEditor.reactEmailEditorStrings.web = this.cast("web")
}

