package typings.recurlyRecurlyJs.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Plan extends StObject {
  
  var addons: StringDictionary[String]
  
  var plan: Setupfee
}
object Plan {
  
  inline def apply(addons: StringDictionary[String], plan: Setupfee): Plan = {
    val __obj = js.Dynamic.literal(addons = addons.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plan]
  }
  
  extension [Self <: Plan](x: Self) {
    
    inline def setAddons(value: StringDictionary[String]): Self = StObject.set(x, "addons", value.asInstanceOf[js.Any])
    
    inline def setPlan(value: Setupfee): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
  }
}
