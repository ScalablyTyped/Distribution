package typings.rmcDashTabs

import typings.rmcDashTabs.esDefaultTabBarMod.PropsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-tabs/es", JSImport.Namespace)
@js.native
object esMod extends js.Object {
  @js.native
  class DefaultTabBar protected ()
    extends typings.rmcDashTabs.esDefaultTabBarMod.DefaultTabBar {
    def this(props: PropsType) = this()
  }
  
  @js.native
  class Tabs protected ()
    extends typings.rmcDashTabs.esTabsMod.Tabs {
    def this(props: typings.rmcDashTabs.esTabsMod.PropsType) = this()
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
    var defaultProps: typings.rmcDashTabs.esTabsMod.PropsType = js.native
  }
  
}

