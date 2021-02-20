package typings.rcTabs

import org.scalablytyped.runtime.Shortcut
import typings.rcTabs.tabPaneMod.TabPaneProps
import typings.rcTabs.tabsMod.ForwardTabsType
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rc-tabs", JSImport.Default)
  @js.native
  val default: ForwardTabsType = js.native
  
  @JSImport("rc-tabs", "TabPane")
  @js.native
  def TabPane(
    hasPrefixClsForceRenderClassNameStyleIdActiveAnimatedDestroyInactiveTabPaneTabKeyChildren: TabPaneProps
  ): Element = js.native
  
  type _To = ForwardTabsType
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ForwardTabsType = default
}
