package typings.randomstring.Randomstring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateOptions extends js.Object {
  var capitalization: js.UndefOr[String] = js.native
  var charset: js.UndefOr[String] = js.native
  var length: js.UndefOr[Double] = js.native
  var readable: js.UndefOr[Boolean] = js.native
}

object GenerateOptions {
  @scala.inline
  def apply(): GenerateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateOptions]
  }
  @scala.inline
  implicit class GenerateOptionsOps[Self <: GenerateOptions] (val x: Self) extends AnyVal {
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
    def setCapitalization(value: String): Self = this.set("capitalization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapitalization: Self = this.set("capitalization", js.undefined)
    @scala.inline
    def setCharset(value: String): Self = this.set("charset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharset: Self = this.set("charset", js.undefined)
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setReadable(value: Boolean): Self = this.set("readable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadable: Self = this.set("readable", js.undefined)
  }
  
}

