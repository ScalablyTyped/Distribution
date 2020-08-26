package typings.reactNativeMaps.mod

import typings.reactNative.mod.ViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapUrlTileProps extends ViewProps {
  var maximumZ: js.UndefOr[Double] = js.native
  var tileSize: js.UndefOr[Double] = js.native
  var urlTemplate: String = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object MapUrlTileProps {
  @scala.inline
  def apply(urlTemplate: String): MapUrlTileProps = {
    val __obj = js.Dynamic.literal(urlTemplate = urlTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapUrlTileProps]
  }
  @scala.inline
  implicit class MapUrlTilePropsOps[Self <: MapUrlTileProps] (val x: Self) extends AnyVal {
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
    def setUrlTemplate(value: String): Self = this.set("urlTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaximumZ(value: Double): Self = this.set("maximumZ", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumZ: Self = this.set("maximumZ", js.undefined)
    @scala.inline
    def setTileSize(value: Double): Self = this.set("tileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileSize: Self = this.set("tileSize", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

