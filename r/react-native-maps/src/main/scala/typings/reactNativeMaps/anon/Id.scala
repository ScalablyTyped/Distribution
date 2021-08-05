package typings.reactNativeMaps.anon

import typings.reactNativeMaps.reactNativeMapsStrings.`marker-select`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id extends StObject {
  
  var action: `marker-select`
  
  var id: String
}
object Id {
  
  inline def apply(id: String): Id = {
    val __obj = js.Dynamic.literal(action = "marker-select", id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  extension [Self <: Id](x: Self) {
    
    inline def setAction(value: `marker-select`): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
