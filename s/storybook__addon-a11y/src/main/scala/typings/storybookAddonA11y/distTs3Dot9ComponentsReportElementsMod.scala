package typings.storybookAddonA11y

import typings.axeCore.mod.NodeResult
import typings.react.mod.FunctionComponent
import typings.storybookAddonA11y.distTs3Dot9ComponentsA11YPanelMod.RuleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ComponentsReportElementsMod {
  
  @JSImport("@storybook/addon-a11y/dist/ts3.9/components/Report/Elements", "Elements")
  @js.native
  val Elements: FunctionComponent[ElementsProps] = js.native
  
  trait ElementsProps extends StObject {
    
    var elements: js.Array[NodeResult]
    
    var `type`: RuleType
  }
  object ElementsProps {
    
    inline def apply(elements: js.Array[NodeResult], `type`: RuleType): ElementsProps = {
      val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElementsProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ElementsProps] (val x: Self) extends AnyVal {
      
      inline def setElements(value: js.Array[NodeResult]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      inline def setElementsVarargs(value: NodeResult*): Self = StObject.set(x, "elements", js.Array(value*))
      
      inline def setType(value: RuleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
