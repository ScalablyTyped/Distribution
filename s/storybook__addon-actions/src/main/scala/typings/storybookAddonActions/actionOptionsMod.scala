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
    
    @scala.inline
    def apply(): ActionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionOptions]
    }
    
    @scala.inline
    implicit class ActionOptionsMutableBuilder[Self <: ActionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowFunction(value: Boolean): Self = StObject.set(x, "allowFunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowFunctionUndefined: Self = StObject.set(x, "allowFunction", js.undefined)
      
      @scala.inline
      def setClearOnStoryChange(value: Boolean): Self = StObject.set(x, "clearOnStoryChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearOnStoryChangeUndefined: Self = StObject.set(x, "clearOnStoryChange", js.undefined)
      
      @scala.inline
      def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    }
  }
}
