package typings.storybookComponents

import typings.react.mod.FC
import typings.storybookComponents.controlsTypesMod.ControlProps
import typings.storybookComponents.controlsTypesMod.Options
import typings.storybookComponents.controlsTypesMod.OptionsConfig
import typings.storybookComponents.controlsTypesMod.OptionsControlType
import typings.storybookComponents.controlsTypesMod.OptionsSelection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsOptionsMod {
  
  @JSImport("@storybook/components/dist/controls/options/Options", "OptionsControl")
  @js.native
  val OptionsControl: FC[OptionsProps] = js.native
  
  trait OptionsProps
    extends StObject
       with ControlProps[OptionsSelection]
       with OptionsConfig
  object OptionsProps {
    
    inline def apply(
      name: String,
      onChange: OptionsSelection => OptionsSelection | Unit,
      options: Options,
      `type`: OptionsControlType
    ): OptionsProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), options = options.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsProps]
    }
  }
}
