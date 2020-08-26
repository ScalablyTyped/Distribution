package typings.storybookReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsUIVisible extends js.Object {
  var isUIVisible: Boolean = js.native
}

object IsUIVisible {
  @scala.inline
  def apply(isUIVisible: Boolean): IsUIVisible = {
    val __obj = js.Dynamic.literal(isUIVisible = isUIVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsUIVisible]
  }
  @scala.inline
  implicit class IsUIVisibleOps[Self <: IsUIVisible] (val x: Self) extends AnyVal {
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
    def setIsUIVisible(value: Boolean): Self = this.set("isUIVisible", value.asInstanceOf[js.Any])
  }
  
}

