package typings.reactResponsive.anon

import typings.reactResponsive.mod.MediaQueryType
import typings.reactResponsive.reactResponsiveStrings.interlace
import typings.reactResponsive.reactResponsiveStrings.landscape
import typings.reactResponsive.reactResponsiveStrings.portrait
import typings.reactResponsive.reactResponsiveStrings.progressive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-responsive.react-responsive.MediaQueryAllQueryable> */
@js.native
trait PartialMediaQueryAllQuery extends js.Object {
  var all: js.UndefOr[Boolean] = js.native
  var aspectRatio: js.UndefOr[String] = js.native
  var aural: js.UndefOr[Boolean] = js.native
  var braille: js.UndefOr[Boolean] = js.native
  var color: js.UndefOr[Boolean] = js.native
  var colorIndex: js.UndefOr[Boolean] = js.native
  var deviceAspectRatio: js.UndefOr[String] = js.native
  var deviceHeight: js.UndefOr[Double | String] = js.native
  var deviceWidth: js.UndefOr[Double | String] = js.native
  var embossed: js.UndefOr[Boolean] = js.native
  var grid: js.UndefOr[Boolean] = js.native
  var handheld: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double | String] = js.native
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
  var monochrome: js.UndefOr[Boolean] = js.native
  var orientation: js.UndefOr[portrait | landscape] = js.native
  var print: js.UndefOr[Boolean] = js.native
  var projection: js.UndefOr[Boolean] = js.native
  var resolution: js.UndefOr[Double | String] = js.native
  var scan: js.UndefOr[progressive | interlace] = js.native
  var screen: js.UndefOr[Boolean] = js.native
  var tty: js.UndefOr[Boolean] = js.native
  var tv: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[MediaQueryType] = js.native
  var width: js.UndefOr[Double | String] = js.native
}

object PartialMediaQueryAllQuery {
  @scala.inline
  def apply(): PartialMediaQueryAllQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMediaQueryAllQuery]
  }
  @scala.inline
  implicit class PartialMediaQueryAllQueryOps[Self <: PartialMediaQueryAllQuery] (val x: Self) extends AnyVal {
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
    def setAll(value: Boolean): Self = this.set("all", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAll: Self = this.set("all", js.undefined)
    @scala.inline
    def setAspectRatio(value: String): Self = this.set("aspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAspectRatio: Self = this.set("aspectRatio", js.undefined)
    @scala.inline
    def setAural(value: Boolean): Self = this.set("aural", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAural: Self = this.set("aural", js.undefined)
    @scala.inline
    def setBraille(value: Boolean): Self = this.set("braille", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBraille: Self = this.set("braille", js.undefined)
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
    def setEmbossed(value: Boolean): Self = this.set("embossed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmbossed: Self = this.set("embossed", js.undefined)
    @scala.inline
    def setGrid(value: Boolean): Self = this.set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    @scala.inline
    def setHandheld(value: Boolean): Self = this.set("handheld", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandheld: Self = this.set("handheld", js.undefined)
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
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
    @scala.inline
    def setMonochrome(value: Boolean): Self = this.set("monochrome", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonochrome: Self = this.set("monochrome", js.undefined)
    @scala.inline
    def setOrientation(value: portrait | landscape): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setPrint(value: Boolean): Self = this.set("print", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrint: Self = this.set("print", js.undefined)
    @scala.inline
    def setProjection(value: Boolean): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    @scala.inline
    def setResolution(value: Double | String): Self = this.set("resolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolution: Self = this.set("resolution", js.undefined)
    @scala.inline
    def setScan(value: progressive | interlace): Self = this.set("scan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScan: Self = this.set("scan", js.undefined)
    @scala.inline
    def setScreen(value: Boolean): Self = this.set("screen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreen: Self = this.set("screen", js.undefined)
    @scala.inline
    def setTty(value: Boolean): Self = this.set("tty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTty: Self = this.set("tty", js.undefined)
    @scala.inline
    def setTv(value: Boolean): Self = this.set("tv", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTv: Self = this.set("tv", js.undefined)
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

