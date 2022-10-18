package typings.storybookAddonA11y

import typings.axeCore.mod.ElementContext
import typings.axeCore.mod.RunOptions
import typings.axeCore.mod.Spec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ParamsMod {
  
  trait A11yParameters extends StObject {
    
    var config: js.UndefOr[Spec] = js.undefined
    
    var element: js.UndefOr[ElementContext] = js.undefined
    
    var manual: js.UndefOr[Boolean] = js.undefined
    
    var options: js.UndefOr[RunOptions] = js.undefined
  }
  object A11yParameters {
    
    inline def apply(): A11yParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[A11yParameters]
    }
    
    extension [Self <: A11yParameters](x: Self) {
      
      inline def setConfig(value: Spec): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setElement(value: ElementContext): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setManual(value: Boolean): Self = StObject.set(x, "manual", value.asInstanceOf[js.Any])
      
      inline def setManualUndefined: Self = StObject.set(x, "manual", js.undefined)
      
      inline def setOptions(value: RunOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  trait Setup extends StObject {
    
    var config: Spec
    
    var element: js.UndefOr[ElementContext] = js.undefined
    
    var options: RunOptions
  }
  object Setup {
    
    inline def apply(config: Spec, options: RunOptions): Setup = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[Setup]
    }
    
    extension [Self <: Setup](x: Self) {
      
      inline def setConfig(value: Spec): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setElement(value: ElementContext): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setOptions(value: RunOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
}
