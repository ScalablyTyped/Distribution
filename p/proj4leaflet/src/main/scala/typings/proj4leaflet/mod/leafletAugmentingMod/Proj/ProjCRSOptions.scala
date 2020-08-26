package typings.proj4leaflet.mod.leafletAugmentingMod.Proj

import typings.leaflet.mod.Bounds_
import typings.leaflet.mod.Transformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjCRSOptions extends js.Object {
  var bounds: js.UndefOr[Bounds_] = js.native
  var origin: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var resolutions: js.UndefOr[js.Array[Double]] = js.native
  var scales: js.UndefOr[js.Array[Double]] = js.native
  var transformation: js.UndefOr[Transformation] = js.native
}

object ProjCRSOptions {
  @scala.inline
  def apply(): ProjCRSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjCRSOptions]
  }
  @scala.inline
  implicit class ProjCRSOptionsOps[Self <: ProjCRSOptions] (val x: Self) extends AnyVal {
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
    def setBounds(value: Bounds_): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    @scala.inline
    def setOrigin(value: js.Tuple2[Double, Double]): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    @scala.inline
    def setResolutionsVarargs(value: Double*): Self = this.set("resolutions", js.Array(value :_*))
    @scala.inline
    def setResolutions(value: js.Array[Double]): Self = this.set("resolutions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolutions: Self = this.set("resolutions", js.undefined)
    @scala.inline
    def setScalesVarargs(value: Double*): Self = this.set("scales", js.Array(value :_*))
    @scala.inline
    def setScales(value: js.Array[Double]): Self = this.set("scales", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScales: Self = this.set("scales", js.undefined)
    @scala.inline
    def setTransformation(value: Transformation): Self = this.set("transformation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransformation: Self = this.set("transformation", js.undefined)
  }
  
}

