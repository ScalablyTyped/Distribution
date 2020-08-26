package typings.solidReact.anon

import typings.solidReact.solidReactStrings.Asterisk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subscribe extends js.Object {
  var subscribe: js.UndefOr[Asterisk | String | js.Array[String]] = js.native
}

object Subscribe {
  @scala.inline
  def apply(): Subscribe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subscribe]
  }
  @scala.inline
  implicit class SubscribeOps[Self <: Subscribe] (val x: Self) extends AnyVal {
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
    def setSubscribeVarargs(value: String*): Self = this.set("subscribe", js.Array(value :_*))
    @scala.inline
    def setSubscribe(value: Asterisk | String | js.Array[String]): Self = this.set("subscribe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscribe: Self = this.set("subscribe", js.undefined)
  }
  
}

