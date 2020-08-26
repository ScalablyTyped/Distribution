package typings.ssUtils.ssutils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEventSourceInit extends js.Object {
  var withCredentials: js.UndefOr[Boolean] = js.native
}

object IEventSourceInit {
  @scala.inline
  def apply(): IEventSourceInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEventSourceInit]
  }
  @scala.inline
  implicit class IEventSourceInitOps[Self <: IEventSourceInit] (val x: Self) extends AnyVal {
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
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithCredentials: Self = this.set("withCredentials", js.undefined)
  }
  
}

