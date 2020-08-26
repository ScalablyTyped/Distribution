package typings.reactEasyCrop.anon

import typings.reactEasyCrop.typesMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Crop extends js.Object {
  var crop: Point = js.native
  var zoom: Double = js.native
}

object Crop {
  @scala.inline
  def apply(crop: Point, zoom: Double): Crop = {
    val __obj = js.Dynamic.literal(crop = crop.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Crop]
  }
  @scala.inline
  implicit class CropOps[Self <: Crop] (val x: Self) extends AnyVal {
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
    def setCrop(value: Point): Self = this.set("crop", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
  }
  
}

