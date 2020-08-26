package typings.reactVirtualized.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlignmentIndex extends js.Object {
  var alignment: js.UndefOr[typings.reactVirtualized.mod.Alignment] = js.native
  var index: js.UndefOr[Double] = js.native
}

object AlignmentIndex {
  @scala.inline
  def apply(): AlignmentIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignmentIndex]
  }
  @scala.inline
  implicit class AlignmentIndexOps[Self <: AlignmentIndex] (val x: Self) extends AnyVal {
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
    def setAlignment(value: typings.reactVirtualized.mod.Alignment): Self = this.set("alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
  }
  
}

