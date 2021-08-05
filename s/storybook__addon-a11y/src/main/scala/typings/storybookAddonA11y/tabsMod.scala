package typings.storybookAddonA11y

import typings.react.mod.FC
import typings.storybookAddonA11y.anon.Items
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsMod {
  
  @JSImport("@storybook/addon-a11y/dist/components/Tabs", "Tabs")
  @js.native
  val Tabs: FC[TabsProps] = js.native
  
  trait TabsProps extends StObject {
    
    var tabs: js.Array[Items]
  }
  object TabsProps {
    
    inline def apply(tabs: js.Array[Items]): TabsProps = {
      val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabsProps]
    }
    
    extension [Self <: TabsProps](x: Self) {
      
      inline def setTabs(value: js.Array[Items]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      inline def setTabsVarargs(value: Items*): Self = StObject.set(x, "tabs", js.Array(value :_*))
    }
  }
}
