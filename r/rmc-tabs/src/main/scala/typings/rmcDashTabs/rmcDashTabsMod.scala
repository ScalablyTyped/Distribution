package typings.rmcDashTabs

import typings.rmcDashTabs.libDefaultTabBarMod.PropsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-tabs", JSImport.Namespace)
@js.native
object rmcDashTabsMod extends js.Object {
  @js.native
  class DefaultTabBar protected ()
    extends typings.rmcDashTabs.libDefaultTabBarMod.DefaultTabBar {
    def this(props: PropsType) = this()
  }
  
  @js.native
  class Tabs protected ()
    extends typings.rmcDashTabs.libTabsMod.Tabs {
    def this(props: typings.rmcDashTabs.libTabsMod.PropsType) = this()
  }
  
  /* static members */
  @js.native
  object DefaultTabBar extends js.Object {
    var defaultProps: PropsType = js.native
  }
  
  /* static members */
  @js.native
  object Tabs extends js.Object {
    var DefaultTabBar: TypeofClassDefaultTabBar = js.native
    var defaultProps: typings.rmcDashTabs.libTabsMod.PropsType = js.native
  }
  
}

