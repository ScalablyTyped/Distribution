package typings.reactResponsive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaQueryFeatures extends MediaQueryMatchers {
  var maxAspectRatio: js.UndefOr[String] = js.native
  var maxColor: js.UndefOr[Double] = js.native
  var maxColorIndex: js.UndefOr[Double] = js.native
  var maxDeviceAspectRatio: js.UndefOr[String] = js.native
  var maxDeviceHeight: js.UndefOr[Double | String] = js.native
  var maxDeviceWidth: js.UndefOr[Double | String] = js.native
  var maxHeight: js.UndefOr[Double | String] = js.native
  var maxMonochrome: js.UndefOr[Double] = js.native
  var maxResolution: js.UndefOr[Double | String] = js.native
  var maxWidth: js.UndefOr[Double | String] = js.native
  var minAspectRatio: js.UndefOr[String] = js.native
  var minColor: js.UndefOr[Double] = js.native
  var minColorIndex: js.UndefOr[Double] = js.native
  var minDeviceAspectRatio: js.UndefOr[String] = js.native
  var minDeviceHeight: js.UndefOr[Double | String] = js.native
  var minDeviceWidth: js.UndefOr[Double | String] = js.native
  var minHeight: js.UndefOr[Double | String] = js.native
  var minMonochrome: js.UndefOr[Double] = js.native
  var minResolution: js.UndefOr[Double | String] = js.native
  var minWidth: js.UndefOr[Double | String] = js.native
}

object MediaQueryFeatures {
  @scala.inline
  def apply(): MediaQueryFeatures = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaQueryFeatures]
  }
  @scala.inline
  implicit class MediaQueryFeaturesOps[Self <: MediaQueryFeatures] (val x: Self) extends AnyVal {
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
    def setMaxAspectRatio(value: String): Self = this.set("maxAspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAspectRatio: Self = this.set("maxAspectRatio", js.undefined)
    @scala.inline
    def setMaxColor(value: Double): Self = this.set("maxColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxColor: Self = this.set("maxColor", js.undefined)
    @scala.inline
    def setMaxColorIndex(value: Double): Self = this.set("maxColorIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxColorIndex: Self = this.set("maxColorIndex", js.undefined)
    @scala.inline
    def setMaxDeviceAspectRatio(value: String): Self = this.set("maxDeviceAspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDeviceAspectRatio: Self = this.set("maxDeviceAspectRatio", js.undefined)
    @scala.inline
    def setMaxDeviceHeight(value: Double | String): Self = this.set("maxDeviceHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDeviceHeight: Self = this.set("maxDeviceHeight", js.undefined)
    @scala.inline
    def setMaxDeviceWidth(value: Double | String): Self = this.set("maxDeviceWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDeviceWidth: Self = this.set("maxDeviceWidth", js.undefined)
    @scala.inline
    def setMaxHeight(value: Double | String): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    @scala.inline
    def setMaxMonochrome(value: Double): Self = this.set("maxMonochrome", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxMonochrome: Self = this.set("maxMonochrome", js.undefined)
    @scala.inline
    def setMaxResolution(value: Double | String): Self = this.set("maxResolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResolution: Self = this.set("maxResolution", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double | String): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMinAspectRatio(value: String): Self = this.set("minAspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinAspectRatio: Self = this.set("minAspectRatio", js.undefined)
    @scala.inline
    def setMinColor(value: Double): Self = this.set("minColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinColor: Self = this.set("minColor", js.undefined)
    @scala.inline
    def setMinColorIndex(value: Double): Self = this.set("minColorIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinColorIndex: Self = this.set("minColorIndex", js.undefined)
    @scala.inline
    def setMinDeviceAspectRatio(value: String): Self = this.set("minDeviceAspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDeviceAspectRatio: Self = this.set("minDeviceAspectRatio", js.undefined)
    @scala.inline
    def setMinDeviceHeight(value: Double | String): Self = this.set("minDeviceHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDeviceHeight: Self = this.set("minDeviceHeight", js.undefined)
    @scala.inline
    def setMinDeviceWidth(value: Double | String): Self = this.set("minDeviceWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDeviceWidth: Self = this.set("minDeviceWidth", js.undefined)
    @scala.inline
    def setMinHeight(value: Double | String): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    @scala.inline
    def setMinMonochrome(value: Double): Self = this.set("minMonochrome", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinMonochrome: Self = this.set("minMonochrome", js.undefined)
    @scala.inline
    def setMinResolution(value: Double | String): Self = this.set("minResolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinResolution: Self = this.set("minResolution", js.undefined)
    @scala.inline
    def setMinWidth(value: Double | String): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
  }
  
}

