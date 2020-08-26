package typings.stellarBase.mod.Operation

import typings.node.Buffer
import typings.stellarBase.mod.OperationType.ManageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManageData_ extends BaseOperation[ManageData] {
  var name: String = js.native
  var value: Buffer = js.native
}

object ManageData_ {
  @scala.inline
  def apply(name: String, `type`: ManageData, value: Buffer): ManageData_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManageData_]
  }
  @scala.inline
  implicit class ManageData_Ops[Self <: ManageData_] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Buffer): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

