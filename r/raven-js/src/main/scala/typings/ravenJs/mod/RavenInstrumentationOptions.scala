package typings.ravenJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RavenInstrumentationOptions extends js.Object {
  var tryCatch: js.UndefOr[Boolean] = js.native
}

object RavenInstrumentationOptions {
  @scala.inline
  def apply(): RavenInstrumentationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RavenInstrumentationOptions]
  }
  @scala.inline
  implicit class RavenInstrumentationOptionsOps[Self <: RavenInstrumentationOptions] (val x: Self) extends AnyVal {
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
    def setTryCatch(value: Boolean): Self = this.set("tryCatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTryCatch: Self = this.set("tryCatch", js.undefined)
  }
  
}

