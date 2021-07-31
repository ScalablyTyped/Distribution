package typings.storybookComponents

import typings.react.mod.FC
import typings.storybookComponents.controlsTypesMod.ControlProps
import typings.storybookComponents.controlsTypesMod.NumberConfig
import typings.storybookComponents.controlsTypesMod.NumberValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangeMod {
  
  @JSImport("@storybook/components/dist/controls/Range", "RangeControl")
  @js.native
  val RangeControl: FC[RangeProps] = js.native
  
  trait RangeProps
    extends StObject
       with ControlProps[NumberValue | Null]
       with NumberConfig
  object RangeProps {
    
    @scala.inline
    def apply(name: String, onChange: NumberValue | Null => (NumberValue | Null) | Unit): RangeProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[RangeProps]
    }
  }
}
