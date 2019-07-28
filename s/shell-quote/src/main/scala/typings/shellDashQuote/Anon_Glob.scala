package typings.shellDashQuote

import typings.shellDashQuote.shellDashQuoteMod._ParseEntry
import typings.shellDashQuote.shellDashQuoteStrings.glob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Glob extends _ParseEntry {
  var op: glob
  var pattern: String
}

object Anon_Glob {
  @scala.inline
  def apply(op: glob, pattern: String): Anon_Glob = {
    val __obj = js.Dynamic.literal(op = op, pattern = pattern)
  
    __obj.asInstanceOf[Anon_Glob]
  }
}

