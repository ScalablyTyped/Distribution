package typings.rmcTabs

import typings.rmcTabs.anon.ActiveTextColor
import typings.rmcTabs.anon.BottomTabBarSplitLine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStylesDotnativeMod {
  
  object default {
    
    @JSImport("rmc-tabs/lib/Styles.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-tabs/lib/Styles.native", "default.TabBar")
    @js.native
    def TabBar: ActiveTextColor = js.native
    inline def TabBar_=(x: ActiveTextColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TabBar")(x.asInstanceOf[js.Any])
    
    @JSImport("rmc-tabs/lib/Styles.native", "default.Tabs")
    @js.native
    def Tabs: BottomTabBarSplitLine = js.native
    inline def Tabs_=(x: BottomTabBarSplitLine): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tabs")(x.asInstanceOf[js.Any])
  }
}
