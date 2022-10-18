package typings.rcTabs

import typings.rcTabs.esInterfaceMod.Tab
import typings.rcTabs.esInterfaceMod.TabOffsetMap
import typings.rcTabs.esInterfaceMod.TabSizeMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseOffsetsMod {
  
  @JSImport("rc-tabs/es/hooks/useOffsets", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(tabs: js.Array[Tab], tabSizes: TabSizeMap, holderScrollWidth: Double): TabOffsetMap = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(tabs.asInstanceOf[js.Any], tabSizes.asInstanceOf[js.Any], holderScrollWidth.asInstanceOf[js.Any])).asInstanceOf[TabOffsetMap]
}
