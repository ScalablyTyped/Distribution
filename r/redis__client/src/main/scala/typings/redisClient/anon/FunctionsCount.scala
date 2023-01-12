package typings.redisClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionsCount extends StObject {
  
  var functionsCount: Double
  
  var librariesCount: Double
}
object FunctionsCount {
  
  inline def apply(functionsCount: Double, librariesCount: Double): FunctionsCount = {
    val __obj = js.Dynamic.literal(functionsCount = functionsCount.asInstanceOf[js.Any], librariesCount = librariesCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionsCount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FunctionsCount] (val x: Self) extends AnyVal {
    
    inline def setFunctionsCount(value: Double): Self = StObject.set(x, "functionsCount", value.asInstanceOf[js.Any])
    
    inline def setLibrariesCount(value: Double): Self = StObject.set(x, "librariesCount", value.asInstanceOf[js.Any])
  }
}
