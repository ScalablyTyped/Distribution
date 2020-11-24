package typings.rbx.fieldMod

import typings.rbx.rbxStrings.addons
import typings.rbx.rbxStrings.centered
import typings.rbx.rbxStrings.group
import typings.rbx.rbxStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldVariablesDefaults extends js.Object {
  
  var alignments: centered | right = js.native
  
  var kinds: addons | group = js.native
}
object FieldVariablesDefaults {
  
  @scala.inline
  def apply(alignments: centered | right, kinds: addons | group): FieldVariablesDefaults = {
    val __obj = js.Dynamic.literal(alignments = alignments.asInstanceOf[js.Any], kinds = kinds.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldVariablesDefaults]
  }
  
  @scala.inline
  implicit class FieldVariablesDefaultsOps[Self <: FieldVariablesDefaults] (val x: Self) extends AnyVal {
    
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
    def setAlignments(value: centered | right): Self = this.set("alignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinds(value: addons | group): Self = this.set("kinds", value.asInstanceOf[js.Any])
  }
}
