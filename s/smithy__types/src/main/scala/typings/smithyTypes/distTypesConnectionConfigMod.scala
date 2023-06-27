package typings.smithyTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesConnectionConfigMod {
  
  trait ConnectConfiguration extends StObject {
    
    /**
      * The maximum time in milliseconds that the connection phase of a request
      * may take before the connection attempt is abandoned.
      */
    var requestTimeout: js.UndefOr[Double] = js.undefined
  }
  object ConnectConfiguration {
    
    inline def apply(): ConnectConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectConfiguration] (val x: Self) extends AnyVal {
      
      inline def setRequestTimeout(value: Double): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
      
      inline def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
    }
  }
}
