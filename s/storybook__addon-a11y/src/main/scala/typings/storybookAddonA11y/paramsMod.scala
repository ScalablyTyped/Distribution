package typings.storybookAddonA11y

import typings.axeCore.mod.ElementContext
import typings.axeCore.mod.RunOptions
import typings.axeCore.mod.Spec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paramsMod {
  
  trait A11yParameters extends StObject {
    
    var config: js.UndefOr[Spec] = js.undefined
    
    var element: js.UndefOr[ElementContext] = js.undefined
    
    var manual: js.UndefOr[Boolean] = js.undefined
    
    var options: js.UndefOr[RunOptions] = js.undefined
  }
  object A11yParameters {
    
    @scala.inline
    def apply(): A11yParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[A11yParameters]
    }
    
    @scala.inline
    implicit class A11yParametersMutableBuilder[Self <: A11yParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: Spec): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setElement(value: ElementContext): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setManual(value: Boolean): Self = StObject.set(x, "manual", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManualUndefined: Self = StObject.set(x, "manual", js.undefined)
      
      @scala.inline
      def setOptions(value: RunOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  trait Setup extends StObject {
    
    var config: Spec
    
    var element: js.UndefOr[ElementContext] = js.undefined
    
    var options: RunOptions
  }
  object Setup {
    
    @scala.inline
    def apply(config: Spec, options: RunOptions): Setup = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[Setup]
    }
    
    @scala.inline
    implicit class SetupMutableBuilder[Self <: Setup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: Spec): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElement(value: ElementContext): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setOptions(value: RunOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
}
