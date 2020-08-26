package typings.scBroker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExitData extends js.Object {
  var code: Double = js.native
  var id: String = js.native
  var pid: Double = js.native
  var signal: String = js.native
}

object ExitData {
  @scala.inline
  def apply(code: Double, id: String, pid: Double, signal: String): ExitData = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExitData]
  }
  @scala.inline
  implicit class ExitDataOps[Self <: ExitData] (val x: Self) extends AnyVal {
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
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPid(value: Double): Self = this.set("pid", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignal(value: String): Self = this.set("signal", value.asInstanceOf[js.Any])
  }
  
}

