package typings.pulumiAws.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofAutoScalingPlans extends js.Object {
  
  val Types: this.type = js.native
}
object TypeofAutoScalingPlans {
  
  @scala.inline
  def apply(Types: TypeofAutoScalingPlans): TypeofAutoScalingPlans = {
    val __obj = js.Dynamic.literal(Types = Types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofAutoScalingPlans]
  }
  
  @scala.inline
  implicit class TypeofAutoScalingPlansOps[Self <: TypeofAutoScalingPlans] (val x: Self) extends AnyVal {
    
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
    def setTypes(value: TypeofAutoScalingPlans): Self = this.set("Types", value.asInstanceOf[js.Any])
  }
}
