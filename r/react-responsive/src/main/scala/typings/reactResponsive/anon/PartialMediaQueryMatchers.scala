package typings.reactResponsive.anon

import typings.reactResponsive.mod.MediaQueryType
import typings.reactResponsive.reactResponsiveStrings.interlace
import typings.reactResponsive.reactResponsiveStrings.landscape
import typings.reactResponsive.reactResponsiveStrings.portrait
import typings.reactResponsive.reactResponsiveStrings.progressive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-responsive.react-responsive.MediaQueryMatchers> */
@js.native
trait PartialMediaQueryMatchers extends js.Object {
  var aspectRatio: js.UndefOr[String] = js.native
  var color: js.UndefOr[Boolean] = js.native
  var colorIndex: js.UndefOr[Boolean] = js.native
  var deviceAspectRatio: js.UndefOr[String] = js.native
  var deviceHeight: js.UndefOr[Double | String] = js.native
  var deviceWidth: js.UndefOr[Double | String] = js.native
  var height: js.UndefOr[Double | String] = js.native
  var monochrome: js.UndefOr[Boolean] = js.native
  var orientation: js.UndefOr[portrait | landscape] = js.native
  var resolution: js.UndefOr[Double | String] = js.native
  var scan: js.UndefOr[progressive | interlace] = js.native
  var `type`: js.UndefOr[MediaQueryType] = js.native
  var width: js.UndefOr[Double | String] = js.native
}

object PartialMediaQueryMatchers {
  @scala.inline
  def apply(): PartialMediaQueryMatchers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMediaQueryMatchers]
  }
  @scala.inline
  implicit class PartialMediaQueryMatchersOps[Self <: PartialMediaQueryMatchers] (val x: Self) extends AnyVal {
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
    def setAspectRatio(value: String): Self = this.set("aspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAspectRatio: Self = this.set("aspectRatio", js.undefined)
    @scala.inline
    def setColor(value: Boolean): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setColorIndex(value: Boolean): Self = this.set("colorIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorIndex: Self = this.set("colorIndex", js.undefined)
    @scala.inline
    def setDeviceAspectRatio(value: String): Self = this.set("deviceAspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceAspectRatio: Self = this.set("deviceAspectRatio", js.undefined)
    @scala.inline
    def setDeviceHeight(value: Double | String): Self = this.set("deviceHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceHeight: Self = this.set("deviceHeight", js.undefined)
    @scala.inline
    def setDeviceWidth(value: Double | String): Self = this.set("deviceWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceWidth: Self = this.set("deviceWidth", js.undefined)
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setMonochrome(value: Boolean): Self = this.set("monochrome", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonochrome: Self = this.set("monochrome", js.undefined)
    @scala.inline
    def setOrientation(value: portrait | landscape): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setResolution(value: Double | String): Self = this.set("resolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolution: Self = this.set("resolution", js.undefined)
    @scala.inline
    def setScan(value: progressive | interlace): Self = this.set("scan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScan: Self = this.set("scan", js.undefined)
    @scala.inline
    def setType(value: MediaQueryType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

