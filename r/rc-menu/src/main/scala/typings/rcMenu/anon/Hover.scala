package typings.rcMenu.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hover extends StObject {
  
  var hover: Boolean
  
  var key: typings.react.mod.Key
}
object Hover {
  
  inline def apply(hover: Boolean, key: typings.react.mod.Key): Hover = {
    val __obj = js.Dynamic.literal(hover = hover.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hover]
  }
  
  extension [Self <: Hover](x: Self) {
    
    inline def setHover(value: Boolean): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setKey(value: typings.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
