package typings.reachTabs

import typings.reachTabs.srcMod.TabsContextValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@reach/tabs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Tab
    *
    * The interactive element that changes the selected panel.
    *
    * @see Docs https://reach.tech/tabs#tab
    */
  @JSImport("@reach/tabs", "Tab")
  @js.native
  val Tab: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'button', TabProps> */ Any = js.native
  
  @JSImport("@reach/tabs", "TabList")
  @js.native
  val TabList: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.MemoComponent<'div', TabListProps> */ Any = js.native
  
  /**
    * TabPanel
    *
    * The panel that displays when it's corresponding tab is active.
    *
    * @see Docs https://reach.tech/tabs#tabpanel
    */
  @JSImport("@reach/tabs", "TabPanel")
  @js.native
  val TabPanel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', TabPanelProps> */ Any = js.native
  
  @JSImport("@reach/tabs", "TabPanels")
  @js.native
  val TabPanels: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.MemoComponent<'div', TabPanelsProps> */ Any = js.native
  
  /**
    * Tabs
    *
    * The parent component of the tab interface.
    *
    * @see Docs https://reach.tech/tabs#tabs
    */
  @JSImport("@reach/tabs", "Tabs")
  @js.native
  val Tabs: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', TabsProps> */ Any = js.native
  
  @JSImport("@reach/tabs", "TabsKeyboardActivation")
  @js.native
  object TabsKeyboardActivation extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.reachTabs.srcMod.TabsKeyboardActivation & String] = js.native
    
    /* "auto" */ val Auto: typings.reachTabs.srcMod.TabsKeyboardActivation.Auto & String = js.native
    
    /* "manual" */ val Manual: typings.reachTabs.srcMod.TabsKeyboardActivation.Manual & String = js.native
  }
  
  @JSImport("@reach/tabs", "TabsOrientation")
  @js.native
  object TabsOrientation extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.reachTabs.srcMod.TabsOrientation & String] = js.native
    
    /* "horizontal" */ val Horizontal: typings.reachTabs.srcMod.TabsOrientation.Horizontal & String = js.native
    
    /* "vertical" */ val Vertical: typings.reachTabs.srcMod.TabsOrientation.Vertical & String = js.native
  }
  
  /**
    * A hook that exposes data for a given `Tabs` component to its descendants.
    *
    * @see Docs https://reach.tech/tabs#usetabscontext
    */
  inline def useTabsContext(): TabsContextValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useTabsContext")().asInstanceOf[TabsContextValue]
}
