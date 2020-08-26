package typings.sinon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<sinon.sinon.SinonExposeOptions> */
@js.native
trait PartialSinonExposeOptions extends js.Object {
  var includeFail: js.UndefOr[Boolean] = js.native
  var prefix: js.UndefOr[String] = js.native
}

object PartialSinonExposeOptions {
  @scala.inline
  def apply(): PartialSinonExposeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSinonExposeOptions]
  }
  @scala.inline
  implicit class PartialSinonExposeOptionsOps[Self <: PartialSinonExposeOptions] (val x: Self) extends AnyVal {
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
    def deleteIncludeFail: Self = this.set("includeFail", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
  }
  
}

