package typings.rbx.paginationStepMod

import typings.rbx.rbxStrings.next
import typings.rbx.rbxStrings.previous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginationStepVariablesDefaults extends js.Object {
  var alignments: next | previous = js.native
}

object PaginationStepVariablesDefaults {
  @scala.inline
  def apply(alignments: next | previous): PaginationStepVariablesDefaults = {
    val __obj = js.Dynamic.literal(alignments = alignments.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationStepVariablesDefaults]
  }
  @scala.inline
  implicit class PaginationStepVariablesDefaultsOps[Self <: PaginationStepVariablesDefaults] (val x: Self) extends AnyVal {
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
    def setAlignments(value: next | previous): Self = this.set("alignments", value.asInstanceOf[js.Any])
  }
  
}

