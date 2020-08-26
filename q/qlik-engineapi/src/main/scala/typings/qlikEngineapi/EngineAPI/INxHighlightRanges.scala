package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxHighlightRanges...
  */
@js.native
trait INxHighlightRanges extends js.Object {
  /**
    * Ranges of highlighted values
    */
  var qRanges: js.Array[ICharRange] = js.native
}

object INxHighlightRanges {
  @scala.inline
  def apply(qRanges: js.Array[ICharRange]): INxHighlightRanges = {
    val __obj = js.Dynamic.literal(qRanges = qRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxHighlightRanges]
  }
  @scala.inline
  implicit class INxHighlightRangesOps[Self <: INxHighlightRanges] (val x: Self) extends AnyVal {
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
    def setQRangesVarargs(value: ICharRange*): Self = this.set("qRanges", js.Array(value :_*))
    @scala.inline
    def setQRanges(value: js.Array[ICharRange]): Self = this.set("qRanges", value.asInstanceOf[js.Any])
  }
  
}

