package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StaticRangeInit extends js.Object {
  var endContainer: Node = js.native
  var endOffset: Double = js.native
  var startContainer: Node = js.native
  var startOffset: Double = js.native
}

object StaticRangeInit {
  @scala.inline
  def apply(endContainer: Node, endOffset: Double, startContainer: Node, startOffset: Double): StaticRangeInit = {
    val __obj = js.Dynamic.literal(endContainer = endContainer.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], startContainer = startContainer.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticRangeInit]
  }
  @scala.inline
  implicit class StaticRangeInitOps[Self <: StaticRangeInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEndContainer(value: Node): Self = this.set("endContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndOffset(value: Double): Self = this.set("endOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartContainer(value: Node): Self = this.set("startContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartOffset(value: Double): Self = this.set("startOffset", value.asInstanceOf[js.Any])
  }
  
}

