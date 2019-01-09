package typings
package reactDashNativeDashScrollableDashTabDashViewLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeDashScrollableDashTabDashViewMod {
  type RenderTabProperties = js.Function4[
    /* name */ java.lang.String, 
    /* pageIndex */ scala.Double, 
    /* isTabActive */ scala.Boolean, 
    /* goToPage */ js.Function1[/* pageNumber */ scala.Double, scala.Unit], 
    reactLib.reactMod.Global.JSXNs.Element
  ]
  type TabBarProps[T] = T with reactDashNativeDashScrollableDashTabDashViewLib.Anon_ActiveTab
  type TabProps[T] = T with reactDashNativeDashScrollableDashTabDashViewLib.Anon_TabLabel
}
