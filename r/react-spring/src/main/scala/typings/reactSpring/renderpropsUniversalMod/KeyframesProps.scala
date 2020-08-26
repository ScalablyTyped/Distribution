package typings.reactSpring.renderpropsUniversalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyframesProps[DS /* <: js.Object */] extends js.Object {
  var state: js.UndefOr[String] = js.native
}

object KeyframesProps {
  @scala.inline
  def apply[/* <: js.Object */ DS](): KeyframesProps[DS] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyframesProps[DS]]
  }
  @scala.inline
  implicit class KeyframesPropsOps[Self <: KeyframesProps[_], /* <: js.Object */ DS] (val x: Self with KeyframesProps[DS]) extends AnyVal {
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
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

