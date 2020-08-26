package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageProgressEventDataIOS extends js.Object {
  var loaded: Double = js.native
  var total: Double = js.native
}

object ImageProgressEventDataIOS {
  @scala.inline
  def apply(loaded: Double, total: Double): ImageProgressEventDataIOS = {
    val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageProgressEventDataIOS]
  }
  @scala.inline
  implicit class ImageProgressEventDataIOSOps[Self <: ImageProgressEventDataIOS] (val x: Self) extends AnyVal {
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
    def setLoaded(value: Double): Self = this.set("loaded", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
  }
  
}

