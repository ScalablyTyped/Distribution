package typings.reactMdTabs

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabPanelsMod {
  
  @JSImport("@react-md/tabs/types/TabPanels", "TabPanels")
  @js.native
  val TabPanels: ForwardRefExoticComponent[TabPanelsProps & RefAttributes[HTMLDivElement]] = js.native
  
  trait TabPanelsProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    /**
      * Boolean if this component should no longer automatically reset the scrolling
      * to the top when the panel changes.
      */
    var disableScrollFix: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the swiping transition should be disabled. If you want to add
      * a custom transition, you'll need to wrap the `TabPanel`'s children in a
      * custom component that does appear and exit animations.
      */
    var disableTransition: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the conditional rendering for the active tab panel only should
      * be disabled. This means that all the children will be visible in the DOM
      * instead of mounting and unmounting when their active state changes. The
      * panels will also be updated to ensure that inactive panels can not be
      * tab focusable.
      */
    var persistent: js.UndefOr[Boolean] = js.undefined
  }
  object TabPanelsProps {
    
    @scala.inline
    def apply(): TabPanelsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabPanelsProps]
    }
    
    @scala.inline
    implicit class TabPanelsPropsMutableBuilder[Self <: TabPanelsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableScrollFix(value: Boolean): Self = StObject.set(x, "disableScrollFix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableScrollFixUndefined: Self = StObject.set(x, "disableScrollFix", js.undefined)
      
      @scala.inline
      def setDisableTransition(value: Boolean): Self = StObject.set(x, "disableTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableTransitionUndefined: Self = StObject.set(x, "disableTransition", js.undefined)
      
      @scala.inline
      def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
    }
  }
}
