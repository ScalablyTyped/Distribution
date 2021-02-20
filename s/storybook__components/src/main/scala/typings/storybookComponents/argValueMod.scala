package typings.storybookComponents

import typings.react.mod.FC
import typings.storybookComponents.typesMod.PropSummaryValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object argValueMod {
  
  @JSImport("@storybook/components/dist/blocks/ArgsTable/ArgValue", "ArgValue")
  @js.native
  val ArgValue: FC[ArgValueProps] = js.native
  
  @js.native
  trait ArgValueProps extends StObject {
    
    var initialExpandedArgs: js.UndefOr[Boolean] = js.native
    
    var value: js.UndefOr[PropSummaryValue] = js.native
  }
  object ArgValueProps {
    
    @scala.inline
    def apply(): ArgValueProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArgValueProps]
    }
    
    @scala.inline
    implicit class ArgValuePropsMutableBuilder[Self <: ArgValueProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitialExpandedArgs(value: Boolean): Self = StObject.set(x, "initialExpandedArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialExpandedArgsUndefined: Self = StObject.set(x, "initialExpandedArgs", js.undefined)
      
      @scala.inline
      def setValue(value: PropSummaryValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
