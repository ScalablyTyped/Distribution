package typings.rmcTabs

import typings.rmcTabs.anon.TypeofDefaultTabBar
import typings.rmcTabs.defaultTabBarNativeMod.PropsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexNativeMod {
  
  @JSImport("rmc-tabs/lib/index.native", "DefaultTabBar")
  @js.native
  class DefaultTabBar protected ()
    extends typings.rmcTabs.defaultTabBarNativeMod.DefaultTabBar {
    def this(props: PropsType) = this()
  }
  /* static members */
  object DefaultTabBar {
    
    @JSImport("rmc-tabs/lib/index.native", "DefaultTabBar")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-tabs/lib/index.native", "DefaultTabBar.defaultProps")
    @js.native
    def defaultProps: PropsType = js.native
    @scala.inline
    def defaultProps_=(x: PropsType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rmc-tabs/lib/index.native", "Tabs")
  @js.native
  class Tabs protected ()
    extends typings.rmcTabs.tabsNativeMod.Tabs {
    def this(props: typings.rmcTabs.tabsNativeMod.PropsType) = this()
  }
  /* static members */
  object Tabs {
    
    @JSImport("rmc-tabs/lib/index.native", "Tabs")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-tabs/lib/index.native", "Tabs.DefaultTabBar")
    @js.native
    def DefaultTabBar: TypeofDefaultTabBar = js.native
    @scala.inline
    def DefaultTabBar_=(x: TypeofDefaultTabBar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultTabBar")(x.asInstanceOf[js.Any])
    
    @JSImport("rmc-tabs/lib/index.native", "Tabs.defaultProps")
    @js.native
    def defaultProps: typings.rmcTabs.tabsNativeMod.PropsType = js.native
    @scala.inline
    def defaultProps_=(x: typings.rmcTabs.tabsNativeMod.PropsType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
