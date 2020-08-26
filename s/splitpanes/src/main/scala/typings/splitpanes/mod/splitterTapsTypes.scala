package typings.splitpanes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait splitterTapsTypes extends js.Object {
  var splitter: Null | Double = js.native
  var timeoutId: Null | js.Object = js.native
}

object splitterTapsTypes {
  @scala.inline
  def apply(): splitterTapsTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[splitterTapsTypes]
  }
  @scala.inline
  implicit class splitterTapsTypesOps[Self <: splitterTapsTypes] (val x: Self) extends AnyVal {
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
    def setSplitter(value: Double): Self = this.set("splitter", value.asInstanceOf[js.Any])
    @scala.inline
    def setSplitterNull: Self = this.set("splitter", null)
    @scala.inline
    def setTimeoutId(value: js.Object): Self = this.set("timeoutId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeoutIdNull: Self = this.set("timeoutId", null)
  }
  
}

