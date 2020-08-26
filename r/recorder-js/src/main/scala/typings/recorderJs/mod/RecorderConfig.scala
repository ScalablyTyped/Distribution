package typings.recorderJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecorderConfig extends js.Object {
  var onAnalysed: js.UndefOr[OnAnalysedHandler] = js.native
}

object RecorderConfig {
  @scala.inline
  def apply(): RecorderConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecorderConfig]
  }
  @scala.inline
  implicit class RecorderConfigOps[Self <: RecorderConfig] (val x: Self) extends AnyVal {
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
    def setOnAnalysed(value: (/* data */ js.Array[Double], /* lastNonZero */ Double) => Unit): Self = this.set("onAnalysed", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnAnalysed: Self = this.set("onAnalysed", js.undefined)
  }
  
}

