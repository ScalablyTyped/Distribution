package typings.reactSelect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exited extends StObject {
  
  var exited: js.Any
  
  var exiting: js.Any
}
object Exited {
  
  inline def apply(exited: js.Any, exiting: js.Any): Exited = {
    val __obj = js.Dynamic.literal(exited = exited.asInstanceOf[js.Any], exiting = exiting.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exited]
  }
  
  extension [Self <: Exited](x: Self) {
    
    inline def setExited(value: js.Any): Self = StObject.set(x, "exited", value.asInstanceOf[js.Any])
    
    inline def setExiting(value: js.Any): Self = StObject.set(x, "exiting", value.asInstanceOf[js.Any])
  }
}
