package typings.rmcTabs

import typings.rmcTabs.anon.TypeofDefaultTabBar
import typings.rmcTabs.defaultTabBarNativeMod.PropsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rmc-tabs/lib/index.native", JSImport.Namespace)
@js.native
object indexNativeMod extends js.Object {
  
  @js.native
  class DefaultTabBar protected ()
    extends typings.rmcTabs.defaultTabBarNativeMod.DefaultTabBar {
    def this(props: PropsType) = this()
  }
  /* static members */
  @js.native
  object DefaultTabBar extends js.Object {
    
    var defaultProps: PropsType = js.native
  }
  
  @js.native
  class Tabs protected ()
    extends typings.rmcTabs.tabsNativeMod.Tabs {
    def this(props: typings.rmcTabs.tabsNativeMod.PropsType) = this()
  }
  /* static members */
  @js.native
  object Tabs extends js.Object {
    
    var DefaultTabBar: TypeofDefaultTabBar = js.native
    
    var defaultProps: typings.rmcTabs.tabsNativeMod.PropsType = js.native
  }
}
