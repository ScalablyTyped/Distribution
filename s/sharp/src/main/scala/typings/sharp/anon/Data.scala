package typings.sharp.anon

import typings.sharp.mod.OutputInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data extends js.Object {
  var data: typings.node.Buffer = js.native
  var info: OutputInfo = js.native
}

object Data {
  @scala.inline
  def apply(data: typings.node.Buffer, info: OutputInfo): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  @scala.inline
  implicit class DataOps[Self <: Data] (val x: Self) extends AnyVal {
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
    def setData(value: typings.node.Buffer): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfo(value: OutputInfo): Self = this.set("info", value.asInstanceOf[js.Any])
  }
  
}

