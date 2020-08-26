package typings.rmcTabs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MozTransform extends js.Object {
  var MozTransform: js.Any = js.native
  var WebkitTransform: js.Any = js.native
  var transform: js.Any = js.native
}

object MozTransform {
  @scala.inline
  def apply(MozTransform: js.Any, WebkitTransform: js.Any, transform: js.Any): MozTransform = {
    val __obj = js.Dynamic.literal(MozTransform = MozTransform.asInstanceOf[js.Any], WebkitTransform = WebkitTransform.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[MozTransform]
  }
  @scala.inline
  implicit class MozTransformOps[Self <: MozTransform] (val x: Self) extends AnyVal {
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
    def setMozTransform(value: js.Any): Self = this.set("MozTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebkitTransform(value: js.Any): Self = this.set("WebkitTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransform(value: js.Any): Self = this.set("transform", value.asInstanceOf[js.Any])
  }
  
}

