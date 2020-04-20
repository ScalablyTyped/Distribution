package typings.rbx.paginationStepMod

import typings.rbx.rbxStrings.next
import typings.rbx.rbxStrings.previous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationStepVariablesDefaults extends js.Object {
  var alignments: next | previous
}

object PaginationStepVariablesDefaults {
  @scala.inline
  def apply(alignments: next | previous): PaginationStepVariablesDefaults = {
    val __obj = js.Dynamic.literal(alignments = alignments.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationStepVariablesDefaults]
  }
}

