package typings.storybookAddonA11y

import typings.axeCore.mod.Result
import typings.react.mod.global.JSX.Element
import typings.storybookAddonA11y.a11YPanelMod.RuleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object itemMod {
  
  @JSImport("@storybook/addon-a11y/dist/components/Report/Item", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def Item(props: ItemProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Item")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ItemProps extends StObject {
    
    var item: Result
    
    var `type`: RuleType
  }
  object ItemProps {
    
    @scala.inline
    def apply(item: Result, `type`: RuleType): ItemProps = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemProps]
    }
    
    @scala.inline
    implicit class ItemPropsMutableBuilder[Self <: ItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItem(value: Result): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: RuleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
