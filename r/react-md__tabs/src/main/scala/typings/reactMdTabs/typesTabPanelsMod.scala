package typings.reactMdTabs

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTabPanelsMod {
  
  @JSImport("@react-md/tabs/types/TabPanels", "TabPanels")
  @js.native
  val TabPanels: ForwardRefExoticComponent[TabPanelsProps & RefAttributes[HTMLDivElement]] = js.native
  
  trait TabPanelsProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    /**
      * Boolean if this component should no longer automatically reset the scrolling
      * to the top when the panel changes.
      *
      * @defaultValue `false`
      */
    var disableScrollFix: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the swiping transition should be disabled. If you want to add
      * a custom transition, you'll need to wrap the `TabPanel`'s children in a
      * custom component that does appear and exit animations.
      *
      * @defaultValue `false`
      */
    var disableTransition: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the conditional rendering for the active tab panel only should
      * be disabled. This means that all the children will be visible in the DOM
      * instead of mounting and unmounting when their active state changes. The
      * panels will also be updated to ensure that inactive panels can not be
      * tab focusable.
      *
      * @defaultValue `false`
      */
    var persistent: js.UndefOr[Boolean] = js.undefined
  }
  object TabPanelsProps {
    
    inline def apply(): TabPanelsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabPanelsProps]
    }
    
    extension [Self <: TabPanelsProps](x: Self) {
      
      inline def setDisableScrollFix(value: Boolean): Self = StObject.set(x, "disableScrollFix", value.asInstanceOf[js.Any])
      
      inline def setDisableScrollFixUndefined: Self = StObject.set(x, "disableScrollFix", js.undefined)
      
      inline def setDisableTransition(value: Boolean): Self = StObject.set(x, "disableTransition", value.asInstanceOf[js.Any])
      
      inline def setDisableTransitionUndefined: Self = StObject.set(x, "disableTransition", js.undefined)
      
      inline def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
      
      inline def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
    }
  }
}
