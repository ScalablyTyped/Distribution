package typings.shellQuote

import typings.shellQuote.mod._ParseEntry
import typings.shellQuote.shellQuoteStrings.glob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGlob extends _ParseEntry {
  var op: glob
  var pattern: String
}

object AnonGlob {
  @scala.inline
  def apply(op: glob, pattern: String): AnonGlob = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGlob]
  }
}

