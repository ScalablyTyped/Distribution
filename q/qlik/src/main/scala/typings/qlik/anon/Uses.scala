package typings.qlik.anon

import typings.qlik.qlikStrings.data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Uses extends js.Object {
  var uses: data = js.native
}

object Uses {
  @scala.inline
  def apply(uses: data): Uses = {
    val __obj = js.Dynamic.literal(uses = uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Uses]
  }
  @scala.inline
  implicit class UsesOps[Self <: Uses] (val x: Self) extends AnyVal {
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
    def setUses(value: data): Self = this.set("uses", value.asInstanceOf[js.Any])
  }
  
}

