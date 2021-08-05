package typings.reactNativeNavigation.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactTag extends StObject {
  
  var reactTag: Double | Null
}
object ReactTag {
  
  inline def apply(): ReactTag = {
    val __obj = js.Dynamic.literal(reactTag = null)
    __obj.asInstanceOf[ReactTag]
  }
  
  extension [Self <: ReactTag](x: Self) {
    
    inline def setReactTag(value: Double): Self = StObject.set(x, "reactTag", value.asInstanceOf[js.Any])
    
    inline def setReactTagNull: Self = StObject.set(x, "reactTag", null)
  }
}
