package typings.reactLeaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapComponentProps extends StObject {
  
  var leaflet: js.UndefOr[LeafletContext] = js.undefined
  
  var pane: js.UndefOr[String] = js.undefined
}
object MapComponentProps {
  
  inline def apply(): MapComponentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapComponentProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapComponentProps] (val x: Self) extends AnyVal {
    
    inline def setLeaflet(value: LeafletContext): Self = StObject.set(x, "leaflet", value.asInstanceOf[js.Any])
    
    inline def setLeafletUndefined: Self = StObject.set(x, "leaflet", js.undefined)
    
    inline def setPane(value: String): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
    
    inline def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
  }
}
