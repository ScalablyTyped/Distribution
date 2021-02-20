package typings.recurlyRecurlyJs.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Plan extends StObject {
  
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
  implicit class PlanMutableBuilder[Self <: Plan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddons(value: StringDictionary[String]): Self = StObject.set(x, "addons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlan(value: Setupfee): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
  }
}
