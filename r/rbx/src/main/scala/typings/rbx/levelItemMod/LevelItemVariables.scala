package typings.rbx.levelItemMod

import typings.rbx.rbxStrings.left
import typings.rbx.rbxStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined rbx.rbx/types.Prefer<rbx.rbx/components/level/level-item.LevelItemVariablesOverrides, rbx.rbx/components/level/level-item.LevelItemVariablesDefaults> */
@js.native
trait LevelItemVariables extends js.Object {
  var alignments: left | right = js.native
}

object LevelItemVariables {
  @scala.inline
  def apply(alignments: left | right): LevelItemVariables = {
    val __obj = js.Dynamic.literal(alignments = alignments.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelItemVariables]
  }
  @scala.inline
  implicit class LevelItemVariablesOps[Self <: LevelItemVariables] (val x: Self) extends AnyVal {
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
    def setAlignments(value: left | right): Self = this.set("alignments", value.asInstanceOf[js.Any])
  }
  
}

