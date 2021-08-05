package typings.storybookUi.anon

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hidden extends StObject {
  
  var hidden: Boolean
  
  var position: CSSProperties
}
object Hidden {
  
  inline def apply(hidden: Boolean, position: CSSProperties): Hidden = {
    val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hidden]
  }
  
  extension [Self <: Hidden](x: Self) {
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: CSSProperties): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
