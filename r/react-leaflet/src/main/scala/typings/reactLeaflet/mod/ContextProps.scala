package typings.reactLeaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextProps extends StObject {
  
  var leaflet: js.UndefOr[LeafletContext] = js.undefined
}
object ContextProps {
  
  inline def apply(): ContextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextProps]
  }
  
  extension [Self <: ContextProps](x: Self) {
    
    inline def setLeaflet(value: LeafletContext): Self = StObject.set(x, "leaflet", value.asInstanceOf[js.Any])
    
    inline def setLeafletUndefined: Self = StObject.set(x, "leaflet", js.undefined)
  }
}
