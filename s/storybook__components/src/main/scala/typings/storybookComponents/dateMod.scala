package typings.storybookComponents

import typings.react.mod.FC
import typings.storybookComponents.controlsTypesMod.ControlProps
import typings.storybookComponents.controlsTypesMod.DateConfig
import typings.storybookComponents.controlsTypesMod.DateValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateMod {
  
  @JSImport("@storybook/components/dist/controls/Date", "DateControl")
  @js.native
  val DateControl: FC[DateProps] = js.native
  
  trait DateProps
    extends StObject
       with ControlProps[DateValue]
       with DateConfig
  object DateProps {
    
    inline def apply(name: String, onChange: DateValue => DateValue | Unit): DateProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
      __obj.asInstanceOf[DateProps]
    }
  }
}
