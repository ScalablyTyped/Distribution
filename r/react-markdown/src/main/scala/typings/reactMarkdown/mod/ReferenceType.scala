package typings.reactMarkdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactMarkdown.reactMarkdownStrings.shortcut
  - typings.reactMarkdown.reactMarkdownStrings.collapsed
  - typings.reactMarkdown.reactMarkdownStrings.full
*/
trait ReferenceType extends js.Object

object ReferenceType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def collapsed: typings.reactMarkdown.reactMarkdownStrings.collapsed = this.cast("collapsed")
  @scala.inline
  def full: typings.reactMarkdown.reactMarkdownStrings.full = this.cast("full")
  @scala.inline
  def shortcut: typings.reactMarkdown.reactMarkdownStrings.shortcut = this.cast("shortcut")
}

