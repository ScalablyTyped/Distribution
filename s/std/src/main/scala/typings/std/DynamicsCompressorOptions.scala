package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamicsCompressorOptions extends AudioNodeOptions {
  var attack: js.UndefOr[Double] = js.native
  var knee: js.UndefOr[Double] = js.native
  var ratio: js.UndefOr[Double] = js.native
  var release: js.UndefOr[Double] = js.native
  var threshold: js.UndefOr[Double] = js.native
}

object DynamicsCompressorOptions {
  @scala.inline
  def apply(): DynamicsCompressorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamicsCompressorOptions]
  }
  @scala.inline
  implicit class DynamicsCompressorOptionsOps[Self <: DynamicsCompressorOptions] (val x: Self) extends AnyVal {
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
    def setAttack(value: Double): Self = this.set("attack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttack: Self = this.set("attack", js.undefined)
    @scala.inline
    def setKnee(value: Double): Self = this.set("knee", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKnee: Self = this.set("knee", js.undefined)
    @scala.inline
    def setRatio(value: Double): Self = this.set("ratio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRatio: Self = this.set("ratio", js.undefined)
    @scala.inline
    def setRelease(value: Double): Self = this.set("release", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelease: Self = this.set("release", js.undefined)
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
  }
  
}

