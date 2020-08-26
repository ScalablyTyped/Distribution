package typings.prosemirrorTables.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseDeprecatedLogic extends js.Object {
  var useDeprecatedLogic: js.UndefOr[Boolean] = js.native
}

object UseDeprecatedLogic {
  @scala.inline
  def apply(): UseDeprecatedLogic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseDeprecatedLogic]
  }
  @scala.inline
  implicit class UseDeprecatedLogicOps[Self <: UseDeprecatedLogic] (val x: Self) extends AnyVal {
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
    def setUseDeprecatedLogic(value: Boolean): Self = this.set("useDeprecatedLogic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseDeprecatedLogic: Self = this.set("useDeprecatedLogic", js.undefined)
  }
  
}

