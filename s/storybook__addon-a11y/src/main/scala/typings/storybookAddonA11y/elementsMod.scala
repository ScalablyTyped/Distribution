package typings.storybookAddonA11y

import typings.axeCore.mod.NodeResult
import typings.react.mod.FunctionComponent
import typings.storybookAddonA11y.a11YPanelMod.RuleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elementsMod {
  
  @JSImport("@storybook/addon-a11y/dist/components/Report/Elements", "Elements")
  @js.native
  val Elements: FunctionComponent[ElementsProps] = js.native
  
  trait ElementsProps extends StObject {
    
    var elements: js.Array[NodeResult]
    
    var `type`: RuleType
  }
  object ElementsProps {
    
    @scala.inline
    def apply(elements: js.Array[NodeResult], `type`: RuleType): ElementsProps = {
      val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElementsProps]
    }
    
    @scala.inline
    implicit class ElementsPropsMutableBuilder[Self <: ElementsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElements(value: js.Array[NodeResult]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementsVarargs(value: NodeResult*): Self = StObject.set(x, "elements", js.Array(value :_*))
      
      @scala.inline
      def setType(value: RuleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
