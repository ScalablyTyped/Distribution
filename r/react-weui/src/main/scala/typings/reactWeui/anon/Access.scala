package typings.reactWeui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Access extends StObject {
  
  var access: Boolean
}
object Access {
  
  inline def apply(access: Boolean): Access = {
    val __obj = js.Dynamic.literal(access = access.asInstanceOf[js.Any])
    __obj.asInstanceOf[Access]
  }
  
  extension [Self <: Access](x: Self) {
    
    inline def setAccess(value: Boolean): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
  }
}
