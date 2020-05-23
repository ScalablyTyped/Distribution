package typings.shellQuote.anon

import typings.shellQuote.mod._ParseEntry
import typings.shellQuote.shellQuoteStrings.glob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pattern extends _ParseEntry {
  var op: glob
  var pattern: String
}

object Pattern {
  @scala.inline
  def apply(op: glob, pattern: String): Pattern = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pattern]
  }
}

