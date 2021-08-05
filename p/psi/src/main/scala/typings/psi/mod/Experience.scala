package typings.psi.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Experience extends StObject {
  
  var id: String
  
  var initial_url: String
  
  var metrics: StringDictionary[typings.psi.anon.Category]
  
  var overall_category: String
}
object Experience {
  
  inline def apply(
    id: String,
    initial_url: String,
    metrics: StringDictionary[typings.psi.anon.Category],
    overall_category: String
  ): Experience = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], initial_url = initial_url.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any], overall_category = overall_category.asInstanceOf[js.Any])
    __obj.asInstanceOf[Experience]
  }
  
  extension [Self <: Experience](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInitial_url(value: String): Self = StObject.set(x, "initial_url", value.asInstanceOf[js.Any])
    
    inline def setMetrics(value: StringDictionary[typings.psi.anon.Category]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setOverall_category(value: String): Self = StObject.set(x, "overall_category", value.asInstanceOf[js.Any])
  }
}
