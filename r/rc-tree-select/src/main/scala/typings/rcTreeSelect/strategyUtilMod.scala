package typings.rcTreeSelect

import typings.rcTree.interfaceMod.DataEntity
import typings.rcTreeSelect.interfaceMod.Key
import typings.rcTreeSelect.interfaceMod.RawValueType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object strategyUtilMod {
  
  @JSImport("rc-tree-select/es/utils/strategyUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rc-tree-select/es/utils/strategyUtil", "SHOW_ALL")
  @js.native
  val SHOW_ALL: /* "SHOW_ALL" */ String = js.native
  
  @JSImport("rc-tree-select/es/utils/strategyUtil", "SHOW_CHILD")
  @js.native
  val SHOW_CHILD: /* "SHOW_CHILD" */ String = js.native
  
  @JSImport("rc-tree-select/es/utils/strategyUtil", "SHOW_PARENT")
  @js.native
  val SHOW_PARENT: /* "SHOW_PARENT" */ String = js.native
  
  inline def formatStrategyKeys(keys: js.Array[Key], strategy: CheckedStrategy, keyEntities: Record[Key, DataEntity]): js.Array[RawValueType] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatStrategyKeys")(keys.asInstanceOf[js.Any], strategy.asInstanceOf[js.Any], keyEntities.asInstanceOf[js.Any])).asInstanceOf[js.Array[RawValueType]]
  
  type CheckedStrategy = /* "SHOW_ALL" */ String
}
