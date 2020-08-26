package typings.segmentAnalytics.SegmentAnalytics

import typings.segmentAnalytics.anon.Key
import typings.segmentAnalytics.anon.KeyString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserOptions extends js.Object {
  var cookie: js.UndefOr[Key] = js.native
  var localStorage: js.UndefOr[KeyString] = js.native
  var persist: js.UndefOr[Boolean] = js.native
}

object UserOptions {
  @scala.inline
  def apply(): UserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserOptions]
  }
  @scala.inline
  implicit class UserOptionsOps[Self <: UserOptions] (val x: Self) extends AnyVal {
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
    def setCookie(value: Key): Self = this.set("cookie", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookie: Self = this.set("cookie", js.undefined)
    @scala.inline
    def setLocalStorage(value: KeyString): Self = this.set("localStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalStorage: Self = this.set("localStorage", js.undefined)
    @scala.inline
    def setPersist(value: Boolean): Self = this.set("persist", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersist: Self = this.set("persist", js.undefined)
  }
  
}

