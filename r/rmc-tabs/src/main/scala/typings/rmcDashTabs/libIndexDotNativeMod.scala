package typings.rmcDashTabs

import typings.rmcDashTabs.libDefaultTabBarDotNativeMod.PropsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-tabs/lib/index.native", JSImport.Namespace)
@js.native
object libIndexDotNativeMod extends js.Object {
  @js.native
  class DefaultTabBar protected ()
    extends typings.rmcDashTabs.libDefaultTabBarDotNativeMod.DefaultTabBar {
    def this(props: PropsType) = this()
  }
  
  @js.native
  class Tabs protected ()
    extends typings.rmcDashTabs.libTabsDotNativeMod.Tabs {
    def this(props: typings.rmcDashTabs.libTabsDotNativeMod.PropsType) = this()
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
    var defaultProps: typings.rmcDashTabs.libTabsDotNativeMod.PropsType = js.native
  }
  
}

