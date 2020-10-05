package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PannerOptions extends AudioNodeOptions {
  var coneInnerAngle: js.UndefOr[Double] = js.native
  var coneOuterAngle: js.UndefOr[Double] = js.native
  var coneOuterGain: js.UndefOr[Double] = js.native
  var distanceModel: js.UndefOr[DistanceModelType] = js.native
  var maxDistance: js.UndefOr[Double] = js.native
  var orientationX: js.UndefOr[Double] = js.native
  var orientationY: js.UndefOr[Double] = js.native
  var orientationZ: js.UndefOr[Double] = js.native
  var panningModel: js.UndefOr[PanningModelType] = js.native
  var positionX: js.UndefOr[Double] = js.native
  var positionY: js.UndefOr[Double] = js.native
  var positionZ: js.UndefOr[Double] = js.native
  var refDistance: js.UndefOr[Double] = js.native
  var rolloffFactor: js.UndefOr[Double] = js.native
}

object PannerOptions {
  @scala.inline
  def apply(): PannerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PannerOptions]
  }
  @scala.inline
  implicit class PannerOptionsOps[Self <: PannerOptions] (val x: Self) extends AnyVal {
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
    def setConeInnerAngle(value: Double): Self = this.set("coneInnerAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConeInnerAngle: Self = this.set("coneInnerAngle", js.undefined)
    @scala.inline
    def setConeOuterAngle(value: Double): Self = this.set("coneOuterAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConeOuterAngle: Self = this.set("coneOuterAngle", js.undefined)
    @scala.inline
    def setConeOuterGain(value: Double): Self = this.set("coneOuterGain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConeOuterGain: Self = this.set("coneOuterGain", js.undefined)
    @scala.inline
    def setDistanceModel(value: DistanceModelType): Self = this.set("distanceModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistanceModel: Self = this.set("distanceModel", js.undefined)
    @scala.inline
    def setMaxDistance(value: Double): Self = this.set("maxDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDistance: Self = this.set("maxDistance", js.undefined)
    @scala.inline
    def setOrientationX(value: Double): Self = this.set("orientationX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientationX: Self = this.set("orientationX", js.undefined)
    @scala.inline
    def setOrientationY(value: Double): Self = this.set("orientationY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientationY: Self = this.set("orientationY", js.undefined)
    @scala.inline
    def setOrientationZ(value: Double): Self = this.set("orientationZ", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientationZ: Self = this.set("orientationZ", js.undefined)
    @scala.inline
    def setPanningModel(value: PanningModelType): Self = this.set("panningModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanningModel: Self = this.set("panningModel", js.undefined)
    @scala.inline
    def setPositionX(value: Double): Self = this.set("positionX", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositionX: Self = this.set("positionX", js.undefined)
    @scala.inline
    def setPositionY(value: Double): Self = this.set("positionY", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositionY: Self = this.set("positionY", js.undefined)
    @scala.inline
    def setPositionZ(value: Double): Self = this.set("positionZ", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositionZ: Self = this.set("positionZ", js.undefined)
    @scala.inline
    def setRefDistance(value: Double): Self = this.set("refDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefDistance: Self = this.set("refDistance", js.undefined)
    @scala.inline
    def setRolloffFactor(value: Double): Self = this.set("rolloffFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRolloffFactor: Self = this.set("rolloffFactor", js.undefined)
  }
  
}

