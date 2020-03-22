package typings.rmcTabs

import typings.rmcTabs.defaultTabBarMod.PropsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-tabs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class DefaultTabBar protected ()
    extends typings.rmcTabs.defaultTabBarMod.DefaultTabBar {
    def this(props: PropsType) = this()
  }
  
  @js.native
  class Tabs protected ()
    extends typings.rmcTabs.tabsMod.Tabs {
    def this(props: typings.rmcTabs.tabsMod.PropsType) = this()
  }
  
  /* static members */
  @js.native
  object DefaultTabBar extends js.Object {
    var defaultProps: PropsType = js.native
  }
  
  /* static members */
  @js.native
  object Tabs extends js.Object {
    var DefaultTabBar: TypeofDefaultTabBar = js.native
    var defaultProps: typings.rmcTabs.tabsMod.PropsType = js.native
  }
  
}

