package typings.reactLoader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoaderOptions extends js.Object {
  var color: js.UndefOr[String] = js.native
  var corners: js.UndefOr[Double] = js.native
  var direction: js.UndefOr[Double] = js.native
  var fps: js.UndefOr[Double] = js.native
  var hwaccel: js.UndefOr[Boolean] = js.native
  var left: js.UndefOr[String] = js.native
  var length: js.UndefOr[Double] = js.native
  var lines: js.UndefOr[Double] = js.native
  var loadedClassName: js.UndefOr[String] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var position: js.UndefOr[String] = js.native
  var radius: js.UndefOr[Double] = js.native
  var rotate: js.UndefOr[Double] = js.native
  var scale: js.UndefOr[Double] = js.native
  var shadow: js.UndefOr[Boolean] = js.native
  var speed: js.UndefOr[Double] = js.native
  var top: js.UndefOr[String] = js.native
  var trail: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object LoaderOptions {
  @scala.inline
  def apply(): LoaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoaderOptions]
  }
  @scala.inline
  implicit class LoaderOptionsOps[Self <: LoaderOptions] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setCorners(value: Double): Self = this.set("corners", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCorners: Self = this.set("corners", js.undefined)
    @scala.inline
    def setDirection(value: Double): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setFps(value: Double): Self = this.set("fps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFps: Self = this.set("fps", js.undefined)
    @scala.inline
    def setHwaccel(value: Boolean): Self = this.set("hwaccel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHwaccel: Self = this.set("hwaccel", js.undefined)
    @scala.inline
    def setLeft(value: String): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setLines(value: Double): Self = this.set("lines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLines: Self = this.set("lines", js.undefined)
    @scala.inline
    def setLoadedClassName(value: String): Self = this.set("loadedClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadedClassName: Self = this.set("loadedClassName", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    @scala.inline
    def setRotate(value: Double): Self = this.set("rotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setShadow(value: Boolean): Self = this.set("shadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadow: Self = this.set("shadow", js.undefined)
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
    @scala.inline
    def setTop(value: String): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setTrail(value: Double): Self = this.set("trail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrail: Self = this.set("trail", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

