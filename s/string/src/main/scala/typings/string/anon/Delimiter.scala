package typings.string.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Delimiter extends js.Object {
  var delimiter: js.UndefOr[String] = js.native
  var encloseNumbers: js.UndefOr[Boolean] = js.native
  var escape: js.UndefOr[String] = js.native
  var keys: js.UndefOr[Boolean] = js.native
  var qualifier: js.UndefOr[String] = js.native
}

object Delimiter {
  @scala.inline
  def apply(): Delimiter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Delimiter]
  }
  @scala.inline
  implicit class DelimiterOps[Self <: Delimiter] (val x: Self) extends AnyVal {
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
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    @scala.inline
    def setEncloseNumbers(value: Boolean): Self = this.set("encloseNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncloseNumbers: Self = this.set("encloseNumbers", js.undefined)
    @scala.inline
    def setEscape(value: String): Self = this.set("escape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEscape: Self = this.set("escape", js.undefined)
    @scala.inline
    def setKeys(value: Boolean): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
    @scala.inline
    def setQualifier(value: String): Self = this.set("qualifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQualifier: Self = this.set("qualifier", js.undefined)
  }
  
}

