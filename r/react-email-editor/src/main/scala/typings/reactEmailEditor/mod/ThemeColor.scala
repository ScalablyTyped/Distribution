package typings.reactEmailEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactEmailEditor.reactEmailEditorStrings.light
  - typings.reactEmailEditor.reactEmailEditorStrings.dark
*/
trait ThemeColor extends js.Object

object ThemeColor {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dark: typings.reactEmailEditor.reactEmailEditorStrings.dark = this.cast("dark")
  @scala.inline
  def light: typings.reactEmailEditor.reactEmailEditorStrings.light = this.cast("light")
}

