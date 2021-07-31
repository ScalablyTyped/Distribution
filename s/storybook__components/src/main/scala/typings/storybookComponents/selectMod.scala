package typings.storybookComponents

import typings.react.mod.FC
import typings.storybookComponents.controlsTypesMod.ControlProps
import typings.storybookComponents.controlsTypesMod.NormalizedOptionsConfig
import typings.storybookComponents.controlsTypesMod.OptionsObject
import typings.storybookComponents.controlsTypesMod.OptionsSelection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectMod {
  
  @JSImport("@storybook/components/dist/controls/options/Select", "SelectControl")
  @js.native
  val SelectControl: FC[SelectProps] = js.native
  
  trait SelectConfig
    extends StObject
       with NormalizedOptionsConfig {
    
    var isMulti: Boolean
  }
  object SelectConfig {
    
    @scala.inline
    def apply(isMulti: Boolean, options: OptionsObject): SelectConfig = {
      val __obj = js.Dynamic.literal(isMulti = isMulti.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectConfig]
    }
    
    @scala.inline
    implicit class SelectConfigMutableBuilder[Self <: SelectConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsMulti(value: Boolean): Self = StObject.set(x, "isMulti", value.asInstanceOf[js.Any])
    }
  }
  
  type SelectProps = ControlProps[OptionsSelection] & SelectConfig
}
