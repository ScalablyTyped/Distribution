package typings.shellQuote.anon

import typings.shellQuote.mod._ParseEntry
import typings.shellQuote.shellQuoteStrings.glob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pattern extends _ParseEntry {
  var op: glob = js.native
  var pattern: String = js.native
}

object Pattern {
  @scala.inline
  def apply(op: glob, pattern: String): Pattern = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pattern]
  }
  @scala.inline
  implicit class PatternOps[Self <: Pattern] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOp(value: glob): Self = this.set("op", value.asInstanceOf[js.Any])
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
  }
  
}

