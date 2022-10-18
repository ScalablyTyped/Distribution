package typings.snyk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudConfigResultsArray extends StObject {
  
  var cloudConfigResults: js.Array[Any]
}
object CloudConfigResultsArray {
  
  inline def apply(cloudConfigResults: js.Array[Any]): CloudConfigResultsArray = {
    val __obj = js.Dynamic.literal(cloudConfigResults = cloudConfigResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudConfigResultsArray]
  }
  
  extension [Self <: CloudConfigResultsArray](x: Self) {
    
    inline def setCloudConfigResults(value: js.Array[Any]): Self = StObject.set(x, "cloudConfigResults", value.asInstanceOf[js.Any])
    
    inline def setCloudConfigResultsVarargs(value: Any*): Self = StObject.set(x, "cloudConfigResults", js.Array(value*))
  }
}
