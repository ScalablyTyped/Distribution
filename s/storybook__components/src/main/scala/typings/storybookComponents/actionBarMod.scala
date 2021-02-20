package typings.storybookComponents

import typings.emotionStyledBase.mod.StyledComponent
import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FunctionComponent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLButtonElement
import typings.storybookComponents.anon.Disabled
import typings.storybookTheming.typesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionBarMod {
  
  @JSImport("@storybook/components/dist/ActionBar/ActionBar", "ActionBar")
  @js.native
  val ActionBar: FunctionComponent[ActionBarProps] = js.native
  
  @JSImport("@storybook/components/dist/ActionBar/ActionBar", "ActionButton")
  @js.native
  val ActionButton: StyledComponent[
    DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement], 
    Disabled, 
    Theme
  ] = js.native
  
  @js.native
  trait ActionBarProps extends StObject {
    
    var actionItems: js.Array[ActionItem] = js.native
  }
  object ActionBarProps {
    
    @scala.inline
    def apply(actionItems: js.Array[ActionItem]): ActionBarProps = {
      val __obj = js.Dynamic.literal(actionItems = actionItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionBarProps]
    }
    
    @scala.inline
    implicit class ActionBarPropsMutableBuilder[Self <: ActionBarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionItems(value: js.Array[ActionItem]): Self = StObject.set(x, "actionItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionItemsVarargs(value: ActionItem*): Self = StObject.set(x, "actionItems", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ActionItem extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    def onClick(e: MouseEvent[HTMLButtonElement, NativeMouseEvent]): Unit = js.native
    
    var title: String | Element = js.native
  }
  object ActionItem {
    
    @scala.inline
    def apply(onClick: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit, title: String | Element): ActionItem = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionItem]
    }
    
    @scala.inline
    implicit class ActionItemMutableBuilder[Self <: ActionItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setOnClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTitle(value: String | Element): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
