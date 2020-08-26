package typings.reactResponsive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaQueryTypes extends js.Object {
  var all: js.UndefOr[Boolean] = js.native
  var aural: js.UndefOr[Boolean] = js.native
  var braille: js.UndefOr[Boolean] = js.native
  var embossed: js.UndefOr[Boolean] = js.native
  var grid: js.UndefOr[Boolean] = js.native
  var handheld: js.UndefOr[Boolean] = js.native
  var print: js.UndefOr[Boolean] = js.native
  var projection: js.UndefOr[Boolean] = js.native
  var screen: js.UndefOr[Boolean] = js.native
  var tty: js.UndefOr[Boolean] = js.native
  var tv: js.UndefOr[Boolean] = js.native
}

object MediaQueryTypes {
  @scala.inline
  def apply(): MediaQueryTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaQueryTypes]
  }
  @scala.inline
  implicit class MediaQueryTypesOps[Self <: MediaQueryTypes] (val x: Self) extends AnyVal {
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
    def setAural(value: Boolean): Self = this.set("aural", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAural: Self = this.set("aural", js.undefined)
    @scala.inline
    def setBraille(value: Boolean): Self = this.set("braille", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBraille: Self = this.set("braille", js.undefined)
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
    def setPrint(value: Boolean): Self = this.set("print", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrint: Self = this.set("print", js.undefined)
    @scala.inline
    def setProjection(value: Boolean): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
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
  }
  
}

