package typings.reactNoSsr.anon

import typings.react.mod.ReactChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnSSR extends js.Object {
  var onSSR: js.UndefOr[ReactChild] = js.native
}

object OnSSR {
  @scala.inline
  def apply(): OnSSR = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnSSR]
  }
  @scala.inline
  implicit class OnSSROps[Self <: OnSSR] (val x: Self) extends AnyVal {
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
    def setOnSSR(value: ReactChild): Self = this.set("onSSR", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnSSR: Self = this.set("onSSR", js.undefined)
  }
  
}

