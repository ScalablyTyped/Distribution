package typings.storybookAddonA11y

import typings.axeCore.mod.Result
import typings.react.mod.global.JSX.Element
import typings.storybookAddonA11y.a11YPanelMod.RuleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BoxShadow extends StObject {
    
    var boxShadow: String
    
    var outline: String
    
    var outlineOffset: Double
  }
  object BoxShadow {
    
    @scala.inline
    def apply(boxShadow: String, outline: String, outlineOffset: Double): BoxShadow = {
      val __obj = js.Dynamic.literal(boxShadow = boxShadow.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], outlineOffset = outlineOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoxShadow]
    }
    
    @scala.inline
    implicit class BoxShadowMutableBuilder[Self <: BoxShadow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoxShadow(value: String): Self = StObject.set(x, "boxShadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutline(value: String): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutlineOffset(value: Double): Self = StObject.set(x, "outlineOffset", value.asInstanceOf[js.Any])
    }
  }
  
  trait Items extends StObject {
    
    var items: js.Array[Result]
    
    var label: Element
    
    var panel: Element
    
    var `type`: RuleType
  }
  object Items {
    
    @scala.inline
    def apply(items: js.Array[Result], label: Element, panel: Element, `type`: RuleType): Items = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Items]
    }
    
    @scala.inline
    implicit class ItemsMutableBuilder[Self <: Items] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItems(value: js.Array[Result]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: Result*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setLabel(value: Element): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanel(value: Element): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: RuleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
