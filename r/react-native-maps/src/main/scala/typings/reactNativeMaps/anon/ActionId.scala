package typings.reactNativeMaps.anon

import typings.reactNativeMaps.reactNativeMapsStrings.`marker-deselect`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionId extends StObject {
  
  var action: `marker-deselect`
  
  var id: String
}
object ActionId {
  
  inline def apply(id: String): ActionId = {
    val __obj = js.Dynamic.literal(action = "marker-deselect", id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionId]
  }
  
  extension [Self <: ActionId](x: Self) {
    
    inline def setAction(value: `marker-deselect`): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
