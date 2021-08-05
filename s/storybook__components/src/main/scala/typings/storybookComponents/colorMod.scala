package typings.storybookComponents

import typings.react.mod.FC
import typings.storybookComponents.controlsTypesMod.ColorConfig
import typings.storybookComponents.controlsTypesMod.ColorValue
import typings.storybookComponents.controlsTypesMod.ControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorMod {
  
  @JSImport("@storybook/components/dist/controls/Color", "ColorControl")
  @js.native
  val ColorControl: FC[ColorProps] = js.native
  
  trait ColorProps
    extends StObject
       with ControlProps[ColorValue]
       with ColorConfig
  object ColorProps {
    
    inline def apply(name: String, onChange: ColorValue => ColorValue | Unit): ColorProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[ColorProps]
    }
  }
}
