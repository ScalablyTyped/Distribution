package typings.shellQuote.mod

import typings.shellQuote.shellQuoteStrings.glob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ParseEntry extends js.Object

object _ParseEntry {
  @scala.inline
  def Op(op: ControlOperator): _ParseEntry = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ParseEntry]
  }
  @scala.inline
  def Pattern(op: glob, pattern: String): _ParseEntry = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ParseEntry]
  }
  @scala.inline
  def Comment(comment: String): _ParseEntry = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ParseEntry]
  }
}

