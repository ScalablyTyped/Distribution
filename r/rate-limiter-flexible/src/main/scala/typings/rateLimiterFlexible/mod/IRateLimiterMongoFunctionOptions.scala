package typings.rateLimiterFlexible.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRateLimiterMongoFunctionOptions extends StObject {
  
  var attrs: StringDictionary[Any]
}
object IRateLimiterMongoFunctionOptions {
  
  inline def apply(attrs: StringDictionary[Any]): IRateLimiterMongoFunctionOptions = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRateLimiterMongoFunctionOptions]
  }
  
  extension [Self <: IRateLimiterMongoFunctionOptions](x: Self) {
    
    inline def setAttrs(value: StringDictionary[Any]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
  }
}
