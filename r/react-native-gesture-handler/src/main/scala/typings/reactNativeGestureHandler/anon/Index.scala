package typings.reactNativeGestureHandler.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Index extends js.Object {
  var animated: js.UndefOr[Boolean] = js.native
  var index: Double = js.native
  var viewOffset: js.UndefOr[Double] = js.native
  var viewPosition: js.UndefOr[Double] = js.native
}

object Index {
  @scala.inline
  def apply(index: Double): Index = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
  @scala.inline
  implicit class IndexOps[Self <: Index] (val x: Self) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    @scala.inline
    def setViewOffset(value: Double): Self = this.set("viewOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewOffset: Self = this.set("viewOffset", js.undefined)
    @scala.inline
    def setViewPosition(value: Double): Self = this.set("viewPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewPosition: Self = this.set("viewPosition", js.undefined)
  }
  
}

