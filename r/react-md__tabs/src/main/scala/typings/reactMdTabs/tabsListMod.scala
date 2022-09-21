package typings.reactMdTabs

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.reactMdTabs.typesMod.TabsConfig
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsListMod {
  
  @JSImport("@react-md/tabs/types/TabsList", "TabsList")
  @js.native
  val TabsList: ForwardRefExoticComponent[TabsListProps & RefAttributes[HTMLDivElement]] = js.native
  
  trait TabsListProps
    extends StObject
       with HTMLAttributes[HTMLDivElement]
       with TabsConfig {
    
    /**
      * The current active tab index to determine which tabs to animate in and out
      * of view.
      */
    var activeIndex: Double
    
    /**
      * Boolean if the indicator transition should be disabled while the active tab
      * index changes.
      *
      * @defaultValue `false`
      */
    var disableTransition: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A function to call when the `activeIndex` should change due to keyboard
      * movement or clicking on a tab.
      */
    def onActiveIndexChange(activeIndex: Double): Unit
  }
  object TabsListProps {
    
    inline def apply(activeIndex: Double, onActiveIndexChange: Double => Unit): TabsListProps = {
      val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], onActiveIndexChange = js.Any.fromFunction1(onActiveIndexChange))
      __obj.asInstanceOf[TabsListProps]
    }
    
    extension [Self <: TabsListProps](x: Self) {
      
      inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      inline def setDisableTransition(value: Boolean): Self = StObject.set(x, "disableTransition", value.asInstanceOf[js.Any])
      
      inline def setDisableTransitionUndefined: Self = StObject.set(x, "disableTransition", js.undefined)
      
      inline def setOnActiveIndexChange(value: Double => Unit): Self = StObject.set(x, "onActiveIndexChange", js.Any.fromFunction1(value))
    }
  }
}
