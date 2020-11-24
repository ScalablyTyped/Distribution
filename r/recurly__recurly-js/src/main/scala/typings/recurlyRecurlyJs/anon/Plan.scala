package typings.recurlyRecurlyJs.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Plan extends js.Object {
  
  var addons: StringDictionary[String] = js.native
  
  var plan: Setupfee = js.native
}
object Plan {
  
  @scala.inline
  def apply(addons: StringDictionary[String], plan: Setupfee): Plan = {
    val __obj = js.Dynamic.literal(addons = addons.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plan]
  }
  
  @scala.inline
  implicit class PlanOps[Self <: Plan] (val x: Self) extends AnyVal {
    
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
    def setAddons(value: StringDictionary[String]): Self = this.set("addons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlan(value: Setupfee): Self = this.set("plan", value.asInstanceOf[js.Any])
  }
}
