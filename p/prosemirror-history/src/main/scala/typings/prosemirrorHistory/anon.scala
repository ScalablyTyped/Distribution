package typings.prosemirrorHistory

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Depth extends StObject {
    
    var depth: js.UndefOr[Double | Null] = js.undefined
    
    var newGroupDelay: js.UndefOr[Double | Null] = js.undefined
  }
  object Depth {
    
    inline def apply(): Depth = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Depth]
    }
    
    extension [Self <: Depth](x: Self) {
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthNull: Self = StObject.set(x, "depth", null)
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      inline def setNewGroupDelay(value: Double): Self = StObject.set(x, "newGroupDelay", value.asInstanceOf[js.Any])
      
      inline def setNewGroupDelayNull: Self = StObject.set(x, "newGroupDelay", null)
      
      inline def setNewGroupDelayUndefined: Self = StObject.set(x, "newGroupDelay", js.undefined)
    }
  }
}
