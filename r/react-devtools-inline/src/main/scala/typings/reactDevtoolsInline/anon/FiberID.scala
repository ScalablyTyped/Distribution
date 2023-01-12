package typings.reactDevtoolsInline.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FiberID extends StObject {
  
  var fiberID: Double
  
  var rootID: Double
}
object FiberID {
  
  inline def apply(fiberID: Double, rootID: Double): FiberID = {
    val __obj = js.Dynamic.literal(fiberID = fiberID.asInstanceOf[js.Any], rootID = rootID.asInstanceOf[js.Any])
    __obj.asInstanceOf[FiberID]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FiberID] (val x: Self) extends AnyVal {
    
    inline def setFiberID(value: Double): Self = StObject.set(x, "fiberID", value.asInstanceOf[js.Any])
    
    inline def setRootID(value: Double): Self = StObject.set(x, "rootID", value.asInstanceOf[js.Any])
  }
}
