package typings.sanitizeHtml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.sanitizeHtml.sanitizeHtmlStrings.discard
  - typings.sanitizeHtml.sanitizeHtmlStrings.escape
  - typings.sanitizeHtml.sanitizeHtmlStrings.recursiveEscape
*/
trait DisallowedTagsModes extends js.Object

object DisallowedTagsModes {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def discard: typings.sanitizeHtml.sanitizeHtmlStrings.discard = this.cast("discard")
  @scala.inline
  def escape: typings.sanitizeHtml.sanitizeHtmlStrings.escape = this.cast("escape")
  @scala.inline
  def recursiveEscape: typings.sanitizeHtml.sanitizeHtmlStrings.recursiveEscape = this.cast("recursiveEscape")
}

