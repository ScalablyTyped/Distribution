package typings.reactMailchimpSubscribe.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props[FormFields] extends js.Object {
  var render: js.UndefOr[js.Function1[/* hooks */ FormHooks[FormFields], ReactNode]] = js.native
  var url: String = js.native
}

object Props {
  @scala.inline
  def apply[FormFields](url: String): Props[FormFields] = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[FormFields]]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props[_], FormFields] (val x: Self with Props[FormFields]) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setRender(value: /* hooks */ FormHooks[FormFields] => ReactNode): Self = this.set("render", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
  }
  
}

