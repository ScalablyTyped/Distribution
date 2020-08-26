package typings.reactEasyCrop.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaSize extends js.Object {
  var height: Double = js.native
  var naturalHeight: Double = js.native
  var naturalWidth: Double = js.native
  var width: Double = js.native
}

object MediaSize {
  @scala.inline
  def apply(height: Double, naturalHeight: Double, naturalWidth: Double, width: Double): MediaSize = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], naturalHeight = naturalHeight.asInstanceOf[js.Any], naturalWidth = naturalWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaSize]
  }
  @scala.inline
  implicit class MediaSizeOps[Self <: MediaSize] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setNaturalHeight(value: Double): Self = this.set("naturalHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setNaturalWidth(value: Double): Self = this.set("naturalWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

