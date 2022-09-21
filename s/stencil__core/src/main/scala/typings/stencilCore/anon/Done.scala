package typings.stencilCore.anon

import typings.stencilCore.stencilPrivateMod.SerializedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Done extends StObject {
  
  var done: Boolean
  
  var value: SerializedEvent
}
object Done {
  
  inline def apply(done: Boolean, value: SerializedEvent): Done = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Done]
  }
  
  extension [Self <: Done](x: Self) {
    
    inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setValue(value: SerializedEvent): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
