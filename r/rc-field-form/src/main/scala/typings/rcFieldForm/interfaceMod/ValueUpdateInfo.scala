package typings.rcFieldForm.interfaceMod

import typings.rcFieldForm.rcFieldFormStrings.external
import typings.rcFieldForm.rcFieldFormStrings.internal
import typings.rcFieldForm.rcFieldFormStrings.valueUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueUpdateInfo extends NotifyInfo {
  var source: internal | external = js.native
  var `type`: valueUpdate = js.native
}

object ValueUpdateInfo {
  @scala.inline
  def apply(source: internal | external, `type`: valueUpdate): ValueUpdateInfo = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueUpdateInfo]
  }
  @scala.inline
  implicit class ValueUpdateInfoOps[Self <: ValueUpdateInfo] (val x: Self) extends AnyVal {
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
    def setSource(value: internal | external): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: valueUpdate): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

