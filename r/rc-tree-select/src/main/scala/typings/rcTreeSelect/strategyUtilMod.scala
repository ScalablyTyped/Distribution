package typings.rcTreeSelect

import typings.rcTree.interfaceMod.DataEntity
import typings.rcTreeSelect.interfaceMod.Key
import typings.rcTreeSelect.interfaceMod.RawValueType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object strategyUtilMod {
  
  @JSImport("rc-tree-select/es/utils/strategyUtil", "SHOW_ALL")
  @js.native
  val SHOW_ALL: /* "SHOW_ALL" */ String = js.native
  
  @JSImport("rc-tree-select/es/utils/strategyUtil", "SHOW_CHILD")
  @js.native
  val SHOW_CHILD: /* "SHOW_CHILD" */ String = js.native
  
  @JSImport("rc-tree-select/es/utils/strategyUtil", "SHOW_PARENT")
  @js.native
  val SHOW_PARENT: /* "SHOW_PARENT" */ String = js.native
  
  @JSImport("rc-tree-select/es/utils/strategyUtil", "formatStrategyKeys")
  @js.native
  def formatStrategyKeys(keys: js.Array[Key], strategy: CheckedStrategy, keyEntities: Record[Key, DataEntity]): js.Array[RawValueType] = js.native
  
  type CheckedStrategy = /* "SHOW_ALL" */ String
}
