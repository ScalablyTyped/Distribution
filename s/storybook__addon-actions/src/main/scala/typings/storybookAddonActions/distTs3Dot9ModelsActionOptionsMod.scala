package typings.storybookAddonActions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ModelsActionOptionsMod {
  
  /* Inlined std.Partial<@storybook/addon-actions.@storybook/addon-actions/dist/ts3.9/models/ActionOptions.Options> & std.Partial<telejson.telejson.Options> */
  trait ActionOptions extends StObject {
    
    var allowClass: js.UndefOr[Boolean] = js.undefined
    
    var allowDate: js.UndefOr[Boolean] = js.undefined
    
    var allowFunction: js.UndefOr[Boolean] = js.undefined
    
    var allowRegExp: js.UndefOr[Boolean] = js.undefined
    
    var allowSymbol: js.UndefOr[Boolean] = js.undefined
    
    var allowUndefined: js.UndefOr[Boolean] = js.undefined
    
    var clearOnStoryChange: js.UndefOr[Boolean] = js.undefined
    
    var depth: js.UndefOr[Double] = js.undefined
    
    var lazyEval: js.UndefOr[Boolean] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var maxDepth: js.UndefOr[Double] = js.undefined
    
    var space: js.UndefOr[Double] = js.undefined
  }
  object ActionOptions {
    
    inline def apply(): ActionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActionOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowClass(value: Boolean): Self = StObject.set(x, "allowClass", value.asInstanceOf[js.Any])
      
      inline def setAllowClassUndefined: Self = StObject.set(x, "allowClass", js.undefined)
      
      inline def setAllowDate(value: Boolean): Self = StObject.set(x, "allowDate", value.asInstanceOf[js.Any])
      
      inline def setAllowDateUndefined: Self = StObject.set(x, "allowDate", js.undefined)
      
      inline def setAllowFunction(value: Boolean): Self = StObject.set(x, "allowFunction", value.asInstanceOf[js.Any])
      
      inline def setAllowFunctionUndefined: Self = StObject.set(x, "allowFunction", js.undefined)
      
      inline def setAllowRegExp(value: Boolean): Self = StObject.set(x, "allowRegExp", value.asInstanceOf[js.Any])
      
      inline def setAllowRegExpUndefined: Self = StObject.set(x, "allowRegExp", js.undefined)
      
      inline def setAllowSymbol(value: Boolean): Self = StObject.set(x, "allowSymbol", value.asInstanceOf[js.Any])
      
      inline def setAllowSymbolUndefined: Self = StObject.set(x, "allowSymbol", js.undefined)
      
      inline def setAllowUndefined(value: Boolean): Self = StObject.set(x, "allowUndefined", value.asInstanceOf[js.Any])
      
      inline def setAllowUndefinedUndefined: Self = StObject.set(x, "allowUndefined", js.undefined)
      
      inline def setClearOnStoryChange(value: Boolean): Self = StObject.set(x, "clearOnStoryChange", value.asInstanceOf[js.Any])
      
      inline def setClearOnStoryChangeUndefined: Self = StObject.set(x, "clearOnStoryChange", js.undefined)
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      inline def setLazyEval(value: Boolean): Self = StObject.set(x, "lazyEval", value.asInstanceOf[js.Any])
      
      inline def setLazyEvalUndefined: Self = StObject.set(x, "lazyEval", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
      
      inline def setMaxDepthUndefined: Self = StObject.set(x, "maxDepth", js.undefined)
      
      inline def setSpace(value: Double): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var clearOnStoryChange: Boolean
    
    var depth: Double
    
    var limit: Double
  }
  object Options {
    
    inline def apply(clearOnStoryChange: Boolean, depth: Double, limit: Double): Options = {
      val __obj = js.Dynamic.literal(clearOnStoryChange = clearOnStoryChange.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setClearOnStoryChange(value: Boolean): Self = StObject.set(x, "clearOnStoryChange", value.asInstanceOf[js.Any])
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    }
  }
}
