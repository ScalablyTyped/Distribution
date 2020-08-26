package typings.qlikEngineapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QEndIndex extends js.Object {
  var qEndIndex: Double = js.native
  var qStartIndex: Double = js.native
}

object QEndIndex {
  @scala.inline
  def apply(qEndIndex: Double, qStartIndex: Double): QEndIndex = {
    val __obj = js.Dynamic.literal(qEndIndex = qEndIndex.asInstanceOf[js.Any], qStartIndex = qStartIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[QEndIndex]
  }
  @scala.inline
  implicit class QEndIndexOps[Self <: QEndIndex] (val x: Self) extends AnyVal {
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
    def setQEndIndex(value: Double): Self = this.set("qEndIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setQStartIndex(value: Double): Self = this.set("qStartIndex", value.asInstanceOf[js.Any])
  }
  
}

