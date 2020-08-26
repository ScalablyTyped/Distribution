package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressEventInit extends EventInit {
  var lengthComputable: js.UndefOr[scala.Boolean] = js.native
  var loaded: js.UndefOr[Double] = js.native
  var total: js.UndefOr[Double] = js.native
}

object ProgressEventInit {
  @scala.inline
  def apply(): ProgressEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressEventInit]
  }
  @scala.inline
  implicit class ProgressEventInitOps[Self <: ProgressEventInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLengthComputable(value: scala.Boolean): Self = this.set("lengthComputable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLengthComputable: Self = this.set("lengthComputable", js.undefined)
    @scala.inline
    def setLoaded(value: Double): Self = this.set("loaded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoaded: Self = this.set("loaded", js.undefined)
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
  }
  
}

