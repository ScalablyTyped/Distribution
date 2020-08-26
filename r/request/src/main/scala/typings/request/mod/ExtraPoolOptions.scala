package typings.request.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtraPoolOptions extends PoolOptions {
  var maxSockets: js.UndefOr[Double] = js.native
}

object ExtraPoolOptions {
  @scala.inline
  def apply(): ExtraPoolOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtraPoolOptions]
  }
  @scala.inline
  implicit class ExtraPoolOptionsOps[Self <: ExtraPoolOptions] (val x: Self) extends AnyVal {
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
    def setMaxSockets(value: Double): Self = this.set("maxSockets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSockets: Self = this.set("maxSockets", js.undefined)
  }
  
}

