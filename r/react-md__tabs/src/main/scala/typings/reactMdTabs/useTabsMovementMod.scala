package typings.reactMdTabs

import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.reactMdUtils.useKeyboardMovementMod.ItemRef
import typings.reactMdUtils.useKeyboardMovementMod.ItemRefList
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useTabsMovementMod {
  
  @JSImport("@react-md/tabs/types/useTabsMovement", "useTabsMovement")
  @js.native
  def useTabsMovement(hasOnClickOnKeyDownChildrenAutomaticHorizontalActiveIndexOnActiveIndexChange: Options): ReturnValue = js.native
  
  @js.native
  trait Options extends StObject {
    
    var activeIndex: Double = js.native
    
    var automatic: Boolean = js.native
    
    var children: ReactNode = js.native
    
    var horizontal: Boolean = js.native
    
    def onActiveIndexChange(activeIndex: Double): Unit = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(activeIndex: Double, automatic: Boolean, horizontal: Boolean, onActiveIndexChange: Double => Unit): Options = {
      val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], automatic = automatic.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], onActiveIndexChange = js.Any.fromFunction1(onActiveIndexChange))
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutomatic(value: Boolean): Self = StObject.set(x, "automatic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnActiveIndexChange(value: Double => Unit): Self = StObject.set(x, "onActiveIndexChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: KeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    }
  }
  
  @js.native
  trait ReturnValue extends StObject {
    
    var handleClick: MouseEventHandler[HTMLDivElement] = js.native
    
    var handleKeyDown: KeyboardEventHandler[HTMLDivElement] = js.native
    
    var itemRefs: ItemRefList[HTMLElement] = js.native
    
    var tabs: js.Array[ReactNode] = js.native
  }
  object ReturnValue {
    
    @scala.inline
    def apply(
      handleClick: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit,
      handleKeyDown: KeyboardEvent[HTMLDivElement] => Unit,
      itemRefs: ItemRefList[HTMLElement],
      tabs: js.Array[ReactNode]
    ): ReturnValue = {
      val __obj = js.Dynamic.literal(handleClick = js.Any.fromFunction1(handleClick), handleKeyDown = js.Any.fromFunction1(handleKeyDown), itemRefs = itemRefs.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReturnValue]
    }
    
    @scala.inline
    implicit class ReturnValueMutableBuilder[Self <: ReturnValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandleClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "handleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleKeyDown(value: KeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "handleKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setItemRefs(value: ItemRefList[HTMLElement]): Self = StObject.set(x, "itemRefs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemRefsVarargs(value: ItemRef[HTMLElement]*): Self = StObject.set(x, "itemRefs", js.Array(value :_*))
      
      @scala.inline
      def setTabs(value: js.Array[ReactNode]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabsVarargs(value: ReactNode*): Self = StObject.set(x, "tabs", js.Array(value :_*))
    }
  }
}
