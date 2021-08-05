package typings.storybookComponents

import typings.react.mod.FC
import typings.storybookComponents.controlsTypesMod.ControlProps
import typings.storybookComponents.controlsTypesMod.NormalizedOptionsConfig
import typings.storybookComponents.controlsTypesMod.OptionsObject
import typings.storybookComponents.controlsTypesMod.OptionsSingleSelection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioMod {
  
  @JSImport("@storybook/components/dist/controls/options/Radio", "RadioControl")
  @js.native
  val RadioControl: FC[RadioProps] = js.native
  
  trait RadioConfig
    extends StObject
       with NormalizedOptionsConfig {
    
    var isInline: Boolean
  }
  object RadioConfig {
    
    inline def apply(isInline: Boolean, options: OptionsObject): RadioConfig = {
      val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioConfig]
    }
    
    extension [Self <: RadioConfig](x: Self) {
      
      inline def setIsInline(value: Boolean): Self = StObject.set(x, "isInline", value.asInstanceOf[js.Any])
    }
  }
  
  type RadioProps = ControlProps[OptionsSingleSelection] & RadioConfig
}
