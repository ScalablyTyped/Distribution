package typings.reactWeui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableMask extends StObject {
  
  var enableMask: Boolean
  
  var show: Boolean
}
object EnableMask {
  
  inline def apply(enableMask: Boolean, show: Boolean): EnableMask = {
    val __obj = js.Dynamic.literal(enableMask = enableMask.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableMask]
  }
  
  extension [Self <: EnableMask](x: Self) {
    
    inline def setEnableMask(value: Boolean): Self = StObject.set(x, "enableMask", value.asInstanceOf[js.Any])
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
  }
}
