package typings.reactNativeJoi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPOptions_ extends StObject {
  
  var cidr: js.UndefOr[String] = js.undefined
  
  var version: js.UndefOr[js.Array[String]] = js.undefined
}
object IPOptions_ {
  
  inline def apply(): IPOptions_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPOptions_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPOptions_] (val x: Self) extends AnyVal {
    
    inline def setCidr(value: String): Self = StObject.set(x, "cidr", value.asInstanceOf[js.Any])
    
    inline def setCidrUndefined: Self = StObject.set(x, "cidr", js.undefined)
    
    inline def setVersion(value: js.Array[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVersionVarargs(value: String*): Self = StObject.set(x, "version", js.Array(value*))
  }
}
