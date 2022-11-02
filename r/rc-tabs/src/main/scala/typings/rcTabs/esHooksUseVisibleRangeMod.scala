package typings.rcTabs

import typings.rcTabs.anon.tabsArrayTabTabNavListPro
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
    visibleTabContentValue: Double,
    transform: Double,
    tabContentSizeValue: Double,
    addNodeSizeValue: Double,
    operationNodeSizeValue: Double,
    param6: tabsArrayTabTabNavListPro
  ): js.Tuple2[/* visibleStart */ Double, /* visibleEnd */ Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(tabOffsets.asInstanceOf[js.Any], visibleTabContentValue.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], tabContentSizeValue.asInstanceOf[js.Any], addNodeSizeValue.asInstanceOf[js.Any], operationNodeSizeValue.asInstanceOf[js.Any], param6.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[/* visibleStart */ Double, /* visibleEnd */ Double]]
  
  type ContainerSizeInfo = js.Tuple4[/* width */ Double, /* height */ Double, /* left */ Double, /* top */ Double]
}
