package typings.rcTabs

import typings.rcTabs.interfaceMod.Tab
import typings.rcTabs.interfaceMod.TabOffsetMap
import typings.rcTabs.interfaceMod.TabSizeMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useOffsetsMod {
  
  @JSImport("rc-tabs/es/hooks/useOffsets", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(tabs: js.Array[Tab], tabSizes: TabSizeMap, holderScrollWidth: Double): TabOffsetMap = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(tabs.asInstanceOf[js.Any], tabSizes.asInstanceOf[js.Any], holderScrollWidth.asInstanceOf[js.Any])).asInstanceOf[TabOffsetMap]
}
