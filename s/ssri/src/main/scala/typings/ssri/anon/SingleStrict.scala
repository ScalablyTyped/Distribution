package typings.ssri.anon

import typings.ssri.ssriBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SingleStrict extends js.Object {
  var single: js.UndefOr[`false`] = js.native
  var strict: js.UndefOr[Boolean] = js.native
}

object SingleStrict {
  @scala.inline
  def apply(): SingleStrict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SingleStrict]
  }
  @scala.inline
  implicit class SingleStrictOps[Self <: SingleStrict] (val x: Self) extends AnyVal {
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
    def setSingle(value: `false`): Self = this.set("single", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingle: Self = this.set("single", js.undefined)
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
  }
  
}

