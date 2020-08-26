package typings.sinon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SinonExposeOptions extends js.Object {
  var includeFail: Boolean = js.native
  var prefix: String = js.native
}

object SinonExposeOptions {
  @scala.inline
  def apply(includeFail: Boolean, prefix: String): SinonExposeOptions = {
    val __obj = js.Dynamic.literal(includeFail = includeFail.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[SinonExposeOptions]
  }
  @scala.inline
  implicit class SinonExposeOptionsOps[Self <: SinonExposeOptions] (val x: Self) extends AnyVal {
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
    def setIncludeFail(value: Boolean): Self = this.set("includeFail", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
  }
  
}

