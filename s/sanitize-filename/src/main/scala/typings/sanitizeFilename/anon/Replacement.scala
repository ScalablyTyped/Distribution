package typings.sanitizeFilename.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Replacement extends js.Object {
  var replacement: js.UndefOr[String | (js.Function1[/* substring */ String, String])] = js.native
}

object Replacement {
  @scala.inline
  def apply(): Replacement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Replacement]
  }
  @scala.inline
  implicit class ReplacementOps[Self <: Replacement] (val x: Self) extends AnyVal {
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
    def setReplacementFunction1(value: /* substring */ String => String): Self = this.set("replacement", js.Any.fromFunction1(value))
    @scala.inline
    def setReplacement(value: String | (js.Function1[/* substring */ String, String])): Self = this.set("replacement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplacement: Self = this.set("replacement", js.undefined)
  }
  
}

