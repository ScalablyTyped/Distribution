package typings.rmcTabs

import typings.rmcTabs.anon.TypeofDefaultTabBar
import typings.rmcTabs.libDefaultTabBarMod.PropsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rmc-tabs", "DefaultTabBar")
  @js.native
  open class DefaultTabBar protected ()
    extends typings.rmcTabs.libDefaultTabBarMod.DefaultTabBar {
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
    inline def defaultProps_=(x: PropsType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rmc-tabs", "Tabs")
  @js.native
  open class Tabs protected ()
    extends typings.rmcTabs.libTabsMod.Tabs {
    def this(props: typings.rmcTabs.libTabsMod.PropsType) = this()
  }
  /* static members */
  object Tabs {
    
    @JSImport("rmc-tabs", "Tabs")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-tabs", "Tabs.DefaultTabBar")
    @js.native
    def DefaultTabBar: TypeofDefaultTabBar = js.native
    inline def DefaultTabBar_=(x: TypeofDefaultTabBar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultTabBar")(x.asInstanceOf[js.Any])
    
    @JSImport("rmc-tabs", "Tabs.defaultProps")
    @js.native
    def defaultProps: typings.rmcTabs.libTabsMod.PropsType = js.native
    inline def defaultProps_=(x: typings.rmcTabs.libTabsMod.PropsType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
