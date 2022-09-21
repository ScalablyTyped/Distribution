package typings.storybookAddonA11y

import typings.axeCore.mod.Result
import typings.react.mod.FunctionComponent
import typings.storybookAddonA11y.a11YPanelMod.RuleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reportMod {
  
  @JSImport("@storybook/addon-a11y/dist/ts3.9/components/Report", "Report")
  @js.native
  val Report: FunctionComponent[ReportProps] = js.native
  
  trait ReportProps extends StObject {
    
    var empty: String
    
    var items: js.Array[Result]
    
    var `type`: RuleType
  }
  object ReportProps {
    
    inline def apply(empty: String, items: js.Array[Result], `type`: RuleType): ReportProps = {
      val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReportProps]
    }
    
    extension [Self <: ReportProps](x: Self) {
      
      inline def setEmpty(value: String): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      inline def setItems(value: js.Array[Result]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: Result*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setType(value: RuleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
