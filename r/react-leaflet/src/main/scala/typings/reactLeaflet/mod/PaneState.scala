package typings.reactLeaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaneState extends StObject {
  
  var context: js.UndefOr[LeafletContext | Null] = js.undefined
  
  var name: js.UndefOr[String | Null] = js.undefined
}
object PaneState {
  
  inline def apply(): PaneState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaneState]
  }
  
  extension [Self <: PaneState](x: Self) {
    
    inline def setContext(value: LeafletContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextNull: Self = StObject.set(x, "context", null)
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
