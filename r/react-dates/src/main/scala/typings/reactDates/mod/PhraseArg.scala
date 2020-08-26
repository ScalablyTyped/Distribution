package typings.reactDates.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// PHRASES
@js.native
trait PhraseArg extends js.Object {
  var date: String = js.native
}

object PhraseArg {
  @scala.inline
  def apply(date: String): PhraseArg = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhraseArg]
  }
  @scala.inline
  implicit class PhraseArgOps[Self <: PhraseArg] (val x: Self) extends AnyVal {
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
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
  }
  
}

