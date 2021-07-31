package typings.rcTabs

import typings.rcTabs.anon.Height
import typings.rcTabs.anon.Width
import typings.rcTabs.anon.tabsArrayTabTabNavListPro
import typings.rcTabs.interfaceMod.TabOffsetMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useVisibleRangeMod {
  
  @JSImport("rc-tabs/es/hooks/useVisibleRange", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(
    tabOffsets: TabOffsetMap,
    containerSize: Height,
    tabContentNodeSize: Width,
    addNodeSize: Width,
    hasTabsTabPositionRtl: tabsArrayTabTabNavListPro
  ): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(tabOffsets.asInstanceOf[js.Any], containerSize.asInstanceOf[js.Any], tabContentNodeSize.asInstanceOf[js.Any], addNodeSize.asInstanceOf[js.Any], hasTabsTabPositionRtl.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
}
