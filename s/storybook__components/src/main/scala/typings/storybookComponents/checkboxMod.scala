package typings.storybookComponents

import typings.react.mod.FC
import typings.storybookComponents.controlsTypesMod.ControlProps
import typings.storybookComponents.controlsTypesMod.NormalizedOptionsConfig
import typings.storybookComponents.controlsTypesMod.OptionsMultiSelection
import typings.storybookComponents.controlsTypesMod.OptionsObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxMod {
  
  @JSImport("@storybook/components/dist/controls/options/Checkbox", "CheckboxControl")
  @js.native
  val CheckboxControl: FC[CheckboxProps] = js.native
  
  trait CheckboxConfig
    extends StObject
       with NormalizedOptionsConfig {
    
    var isInline: Boolean
  }
  object CheckboxConfig {
    
    @scala.inline
    def apply(isInline: Boolean, options: OptionsObject): CheckboxConfig = {
      val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckboxConfig]
    }
    
    @scala.inline
    implicit class CheckboxConfigMutableBuilder[Self <: CheckboxConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsInline(value: Boolean): Self = StObject.set(x, "isInline", value.asInstanceOf[js.Any])
    }
  }
  
  type CheckboxProps = ControlProps[OptionsMultiSelection] & CheckboxConfig
}
