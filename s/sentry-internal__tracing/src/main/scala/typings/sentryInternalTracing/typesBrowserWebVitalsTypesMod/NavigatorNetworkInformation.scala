package typings.sentryInternalTracing.typesBrowserWebVitalsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigatorNetworkInformation extends StObject {
  
  val connection: js.UndefOr[NetworkInformation] = js.undefined
}
object NavigatorNetworkInformation {
  
  inline def apply(): NavigatorNetworkInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigatorNetworkInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigatorNetworkInformation] (val x: Self) extends AnyVal {
    
    inline def setConnection(value: NetworkInformation): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
  }
}
