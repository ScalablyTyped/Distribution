package typings.siesta.Siesta.Test.Action

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Role {
  
  /**
    * @mixin
    */
  trait IHasTarget extends StObject {
    
    var el: js.UndefOr[js.Any] = js.undefined
    
    var passTargetToNext: js.UndefOr[Boolean] = js.undefined
    
    var target: js.UndefOr[js.Any] = js.undefined
  }
  object IHasTarget {
    
    inline def apply(): IHasTarget = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHasTarget]
    }
    
    extension [Self <: IHasTarget](x: Self) {
      
      inline def setEl(value: js.Any): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setElUndefined: Self = StObject.set(x, "el", js.undefined)
      
      inline def setPassTargetToNext(value: Boolean): Self = StObject.set(x, "passTargetToNext", value.asInstanceOf[js.Any])
      
      inline def setPassTargetToNextUndefined: Self = StObject.set(x, "passTargetToNext", js.undefined)
      
      inline def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
