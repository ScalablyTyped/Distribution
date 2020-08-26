package typings.rcTabs

import typings.rcTabs.anon.Height
import typings.rcTabs.anon.Width
import typings.rcTabs.anon.tabsArrayTabTabNavListPro
import typings.rcTabs.interfaceMod.TabOffsetMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-tabs/es/hooks/useVisibleRange", JSImport.Namespace)
@js.native
object useVisibleRangeMod extends js.Object {
  def default(
    tabOffsets: TabOffsetMap,
    containerSize: Height,
    tabContentNodeSize: Width,
    addNodeSize: Width,
    hasTabsTabPositionRtl: tabsArrayTabTabNavListPro
  ): js.Tuple2[Double, Double] = js.native
}

