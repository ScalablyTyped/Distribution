package typings.qlikEngineapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QPathSeparator extends js.Object {
  /**
    * Path Separator for the OS
    */
  var qPathSeparator: String = js.native
}

object QPathSeparator {
  @scala.inline
  def apply(qPathSeparator: String): QPathSeparator = {
    val __obj = js.Dynamic.literal(qPathSeparator = qPathSeparator.asInstanceOf[js.Any])
    __obj.asInstanceOf[QPathSeparator]
  }
  @scala.inline
  implicit class QPathSeparatorOps[Self <: QPathSeparator] (val x: Self) extends AnyVal {
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
    def setQPathSeparator(value: String): Self = this.set("qPathSeparator", value.asInstanceOf[js.Any])
  }
  
}

