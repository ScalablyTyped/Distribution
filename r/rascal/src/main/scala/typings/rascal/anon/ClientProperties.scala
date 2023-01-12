package typings.rascal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientProperties extends StObject {
  
  var clientProperties: js.UndefOr[Connectionname] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object ClientProperties {
  
  inline def apply(): ClientProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientProperties] (val x: Self) extends AnyVal {
    
    inline def setClientProperties(value: Connectionname): Self = StObject.set(x, "clientProperties", value.asInstanceOf[js.Any])
    
    inline def setClientPropertiesUndefined: Self = StObject.set(x, "clientProperties", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
