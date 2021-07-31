package typings.rcTabs

import typings.rcTabs.tabPaneMod.TabPaneProps
import typings.rcTabs.tabsMod.ForwardTabsType
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-tabs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rc-tabs", JSImport.Default)
  @js.native
  val default: ForwardTabsType = js.native
  
  @scala.inline
  def TabPane(
    hasPrefixClsForceRenderClassNameStyleIdActiveAnimatedDestroyInactiveTabPaneTabKeyChildren: TabPaneProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TabPane")(hasPrefixClsForceRenderClassNameStyleIdActiveAnimatedDestroyInactiveTabPaneTabKeyChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
}
