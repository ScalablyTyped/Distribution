package typings.sketchapp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchMSArtboards extends js.Object {
  var artboards: SketchMSArtboard = js.native
  var name: String = js.native
}

object SketchMSArtboards {
  @scala.inline
  def apply(artboards: SketchMSArtboard, name: String): SketchMSArtboards = {
    val __obj = js.Dynamic.literal(artboards = artboards.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSArtboards]
  }
  @scala.inline
  implicit class SketchMSArtboardsOps[Self <: SketchMSArtboards] (val x: Self) extends AnyVal {
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
    def setArtboards(value: SketchMSArtboard): Self = this.set("artboards", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

