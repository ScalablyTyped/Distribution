package typings.rcTreeSelect.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleModeConfig extends js.Object {
  var id: js.UndefOr[Key] = js.native
  var pId: js.UndefOr[Key] = js.native
  var rootPId: js.UndefOr[Key] = js.native
}

object SimpleModeConfig {
  @scala.inline
  def apply(): SimpleModeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleModeConfig]
  }
  @scala.inline
  implicit class SimpleModeConfigOps[Self <: SimpleModeConfig] (val x: Self) extends AnyVal {
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
    def setId(value: Key): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setPId(value: Key): Self = this.set("pId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePId: Self = this.set("pId", js.undefined)
    @scala.inline
    def setRootPId(value: Key): Self = this.set("rootPId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootPId: Self = this.set("rootPId", js.undefined)
  }
  
}

