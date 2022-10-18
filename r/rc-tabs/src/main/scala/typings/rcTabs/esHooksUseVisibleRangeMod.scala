package typings.rcTabs

import typings.rcTabs.anon.tabsArrayTabTabNavListPro
import typings.rcTabs.esInterfaceMod.SizeInfo
import typings.rcTabs.esInterfaceMod.TabOffsetMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseVisibleRangeMod {
  
  @JSImport("rc-tabs/es/hooks/useVisibleRange", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    tabOffsets: TabOffsetMap,
    containerSizeInfo: ContainerSizeInfo,
    tabContentNodeSizeInfo: SizeInfo,
    addNodeSizeInfo: SizeInfo,
    operationNodeSizeInfo: SizeInfo,
    hasTabsTabPositionRtl: tabsArrayTabTabNavListPro
  ): js.Tuple3[
    /* visibleStart */ Double, 
    /* visibleEnd */ Double, 
    /* visibleTabContentSize */ Double
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(tabOffsets.asInstanceOf[js.Any], containerSizeInfo.asInstanceOf[js.Any], tabContentNodeSizeInfo.asInstanceOf[js.Any], addNodeSizeInfo.asInstanceOf[js.Any], operationNodeSizeInfo.asInstanceOf[js.Any], hasTabsTabPositionRtl.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    /* visibleStart */ Double, 
    /* visibleEnd */ Double, 
    /* visibleTabContentSize */ Double
  ]]
  
  type ContainerSizeInfo = js.Tuple4[/* width */ Double, /* height */ Double, /* left */ Double, /* top */ Double]
}
