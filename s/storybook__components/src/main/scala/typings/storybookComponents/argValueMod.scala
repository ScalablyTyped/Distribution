package typings.storybookComponents

import typings.react.mod.FC
import typings.storybookComponents.typesMod.PropSummaryValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object argValueMod {
  
  @JSImport("@storybook/components/dist/blocks/ArgsTable/ArgValue", "ArgValue")
  @js.native
  val ArgValue: FC[ArgValueProps] = js.native
  
  trait ArgValueProps extends StObject {
    
    var initialExpandedArgs: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[PropSummaryValue] = js.undefined
  }
  object ArgValueProps {
    
    inline def apply(): ArgValueProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArgValueProps]
    }
    
    extension [Self <: ArgValueProps](x: Self) {
      
      inline def setInitialExpandedArgs(value: Boolean): Self = StObject.set(x, "initialExpandedArgs", value.asInstanceOf[js.Any])
      
      inline def setInitialExpandedArgsUndefined: Self = StObject.set(x, "initialExpandedArgs", js.undefined)
      
      inline def setValue(value: PropSummaryValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
