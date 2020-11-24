package typings.pulumiPulumi.automationStackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in @pulumi/pulumi.@pulumi/pulumi/x/automation/stack.OpType ]: number} */
@js.native
trait OpMap extends js.Object {
  
  var create: Double = js.native
  
  var `create-replacement`: Double = js.native
  
  var delete: Double = js.native
  
  var `delete-replaced`: Double = js.native
  
  var replace: Double = js.native
  
  var same: Double = js.native
  
  var update: Double = js.native
}
object OpMap {
  
  @scala.inline
  def apply(
    create: Double,
    `create-replacement`: Double,
    delete: Double,
    `delete-replaced`: Double,
    replace: Double,
    same: Double,
    update: Double
  ): OpMap = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], replace = replace.asInstanceOf[js.Any], same = same.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.updateDynamic("create-replacement")(`create-replacement`.asInstanceOf[js.Any])
    __obj.updateDynamic("delete-replaced")(`delete-replaced`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpMap]
  }
  
  @scala.inline
  implicit class OpMapOps[Self <: OpMap] (val x: Self) extends AnyVal {
    
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
    def setCreate(value: Double): Self = this.set("create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCreate-replacement`(value: Double): Self = this.set("create-replacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: Double): Self = this.set("delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDelete-replaced`(value: Double): Self = this.set("delete-replaced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplace(value: Double): Self = this.set("replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSame(value: Double): Self = this.set("same", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: Double): Self = this.set("update", value.asInstanceOf[js.Any])
  }
}
