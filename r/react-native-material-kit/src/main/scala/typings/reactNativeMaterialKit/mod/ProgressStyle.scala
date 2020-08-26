package typings.reactNativeMaterialKit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressStyle extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.native
  var bufferColor: js.UndefOr[String] = js.native
  var progressColor: js.UndefOr[String] = js.native
}

object ProgressStyle {
  @scala.inline
  def apply(): ProgressStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressStyle]
  }
  @scala.inline
  implicit class ProgressStyleOps[Self <: ProgressStyle] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBufferColor(value: String): Self = this.set("bufferColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBufferColor: Self = this.set("bufferColor", js.undefined)
    @scala.inline
    def setProgressColor(value: String): Self = this.set("progressColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressColor: Self = this.set("progressColor", js.undefined)
  }
  
}

