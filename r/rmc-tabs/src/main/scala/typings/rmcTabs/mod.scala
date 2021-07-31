package typings.rmcTabs

import typings.rmcTabs.anon.TypeofDefaultTabBar
import typings.rmcTabs.defaultTabBarMod.PropsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rmc-tabs", "DefaultTabBar")
  @js.native
  class DefaultTabBar protected ()
    extends typings.rmcTabs.defaultTabBarMod.DefaultTabBar {
    def this(props: PropsType) = this()
  }
  /* static members */
  object DefaultTabBar {
    
    @JSImport("rmc-tabs", "DefaultTabBar")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-tabs", "DefaultTabBar.defaultProps")
    @js.native
    def defaultProps: PropsType = js.native
    @scala.inline
    def defaultProps_=(x: PropsType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rmc-tabs", "Tabs")
  @js.native
  class Tabs protected ()
    extends typings.rmcTabs.tabsMod.Tabs {
    def this(props: typings.rmcTabs.tabsMod.PropsType) = this()
  }
  /* static members */
  object Tabs {
    
    @JSImport("rmc-tabs", "Tabs")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-tabs", "Tabs.DefaultTabBar")
    @js.native
    def DefaultTabBar: TypeofDefaultTabBar = js.native
    @scala.inline
    def DefaultTabBar_=(x: TypeofDefaultTabBar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultTabBar")(x.asInstanceOf[js.Any])
    
    @JSImport("rmc-tabs", "Tabs.defaultProps")
    @js.native
    def defaultProps: typings.rmcTabs.tabsMod.PropsType = js.native
    @scala.inline
    def defaultProps_=(x: typings.rmcTabs.tabsMod.PropsType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
