package typings.rbx.paginationStepMod

import typings.rbx.rbxStrings.next
import typings.rbx.rbxStrings.previous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined rbx.rbx/types.Prefer<rbx.rbx/components/pagination/pagination-step.PaginationStepVariablesOverrides, rbx.rbx/components/pagination/pagination-step.PaginationStepVariablesDefaults> */
trait PaginationStepVariables extends js.Object {
  var alignments: next | previous
}

object PaginationStepVariables {
  @scala.inline
  def apply(alignments: next | previous): PaginationStepVariables = {
    val __obj = js.Dynamic.literal(alignments = alignments.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationStepVariables]
  }
}

