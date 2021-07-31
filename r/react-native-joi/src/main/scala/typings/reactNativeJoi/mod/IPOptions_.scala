package typings.reactNativeJoi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPOptions_ extends StObject {
  
  var cidr: js.UndefOr[String] = js.undefined
  
  var version: js.UndefOr[js.Array[String]] = js.undefined
}
object IPOptions_ {
  
  @scala.inline
  def apply(): IPOptions_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPOptions_]
  }
  
  @scala.inline
  implicit class IPOptions_MutableBuilder[Self <: IPOptions_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCidr(value: String): Self = StObject.set(x, "cidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrUndefined: Self = StObject.set(x, "cidr", js.undefined)
    
    @scala.inline
    def setVersion(value: js.Array[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def setVersionVarargs(value: String*): Self = StObject.set(x, "version", js.Array(value :_*))
  }
}
