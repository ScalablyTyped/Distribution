package typings.rcTreeSelect

import typings.rcTree.interfaceMod.DataEntity
import typings.rcTreeSelect.interfaceMod.Key
import typings.rcTreeSelect.interfaceMod.RawValueType
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-tree-select/es/utils/strategyUtil", JSImport.Namespace)
@js.native
object strategyUtilMod extends js.Object {
  
  val SHOW_ALL: /* "SHOW_ALL" */ String = js.native
  
  val SHOW_CHILD: /* "SHOW_CHILD" */ String = js.native
  
  val SHOW_PARENT: /* "SHOW_PARENT" */ String = js.native
  
  def formatStrategyKeys(keys: js.Array[Key], strategy: CheckedStrategy, keyEntities: Record[Key, DataEntity]): js.Array[RawValueType] = js.native
  
  type CheckedStrategy = /* "SHOW_ALL" */ String
}
