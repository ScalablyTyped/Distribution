package typings.reactNative.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictoptionName
  extends StObject
     with //anything else
/* key */ StringDictionary[Any] {
  
  var headers: StringDictionary[String]
}
object DictoptionName {
  
  inline def apply(headers: StringDictionary[String]): DictoptionName = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictoptionName]
  }
  
  extension [Self <: DictoptionName](x: Self) {
    
    inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
