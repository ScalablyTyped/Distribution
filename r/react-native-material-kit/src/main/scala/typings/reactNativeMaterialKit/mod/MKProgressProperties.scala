package typings.reactNativeMaterialKit.mod

import typings.reactNative.mod.ViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MKProgressProperties extends ViewProps {
  var buffer: js.UndefOr[Double] = js.native
  var bufferAniDuration: js.UndefOr[Double] = js.native
  var bufferColor: js.UndefOr[String] = js.native
  var progress: js.UndefOr[Double] = js.native
  var progressAniDuration: js.UndefOr[Double] = js.native
  var progressColor: js.UndefOr[String] = js.native
}

object MKProgressProperties {
  @scala.inline
  def apply(): MKProgressProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MKProgressProperties]
  }
  @scala.inline
  implicit class MKProgressPropertiesOps[Self <: MKProgressProperties] (val x: Self) extends AnyVal {
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
    def setBuffer(value: Double): Self = this.set("buffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuffer: Self = this.set("buffer", js.undefined)
    @scala.inline
    def setBufferAniDuration(value: Double): Self = this.set("bufferAniDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBufferAniDuration: Self = this.set("bufferAniDuration", js.undefined)
    @scala.inline
    def setBufferColor(value: String): Self = this.set("bufferColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBufferColor: Self = this.set("bufferColor", js.undefined)
    @scala.inline
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    @scala.inline
    def setProgressAniDuration(value: Double): Self = this.set("progressAniDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressAniDuration: Self = this.set("progressAniDuration", js.undefined)
    @scala.inline
    def setProgressColor(value: String): Self = this.set("progressColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressColor: Self = this.set("progressColor", js.undefined)
  }
  
}

