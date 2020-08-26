package typings.sha1.mod

import typings.sha1.sha1Booleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sha1AsStringOptions extends Sha1Options {
  var asBytes: js.UndefOr[`false`] = js.native
  var asString: js.UndefOr[Boolean] = js.native
}

object Sha1AsStringOptions {
  @scala.inline
  def apply(): Sha1AsStringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sha1AsStringOptions]
  }
  @scala.inline
  implicit class Sha1AsStringOptionsOps[Self <: Sha1AsStringOptions] (val x: Self) extends AnyVal {
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
    def setAsBytes(value: `false`): Self = this.set("asBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsBytes: Self = this.set("asBytes", js.undefined)
    @scala.inline
    def setAsString(value: Boolean): Self = this.set("asString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsString: Self = this.set("asString", js.undefined)
  }
  
}

