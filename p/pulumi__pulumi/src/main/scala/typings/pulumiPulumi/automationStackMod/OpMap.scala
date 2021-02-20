package typings.pulumiPulumi.automationStackMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in @pulumi/pulumi.@pulumi/pulumi/x/automation/stack.OpType ]: number} */
@js.native
trait OpMap extends StObject {
  
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
  implicit class OpMapMutableBuilder[Self <: OpMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: Double): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCreate-replacement`(value: Double): Self = StObject.set(x, "create-replacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: Double): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDelete-replaced`(value: Double): Self = StObject.set(x, "delete-replaced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplace(value: Double): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSame(value: Double): Self = StObject.set(x, "same", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: Double): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
  }
}
