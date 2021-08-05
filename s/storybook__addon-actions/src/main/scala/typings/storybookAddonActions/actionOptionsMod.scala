package typings.storybookAddonActions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionOptionsMod {
  
  trait ActionOptions extends StObject {
    
    var allowFunction: js.UndefOr[Boolean] = js.undefined
    
    var clearOnStoryChange: js.UndefOr[Boolean] = js.undefined
    
    var depth: js.UndefOr[Double] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
  }
  object ActionOptions {
    
    inline def apply(): ActionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionOptions]
    }
    
    extension [Self <: ActionOptions](x: Self) {
      
      inline def setAllowFunction(value: Boolean): Self = StObject.set(x, "allowFunction", value.asInstanceOf[js.Any])
      
      inline def setAllowFunctionUndefined: Self = StObject.set(x, "allowFunction", js.undefined)
      
      inline def setClearOnStoryChange(value: Boolean): Self = StObject.set(x, "clearOnStoryChange", value.asInstanceOf[js.Any])
      
      inline def setClearOnStoryChangeUndefined: Self = StObject.set(x, "clearOnStoryChange", js.undefined)
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    }
  }
}
