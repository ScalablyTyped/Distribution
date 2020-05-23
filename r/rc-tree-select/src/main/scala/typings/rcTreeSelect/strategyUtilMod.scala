package typings.rcTreeSelect

import typings.rcTreeSelect.interfaceMod.Key
import typings.rcTreeSelect.interfaceMod.RawValueType
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-tree-select/lib/utils/strategyUtil", JSImport.Namespace)
@js.native
object strategyUtilMod extends js.Object {
  val SHOW_ALL: /* "SHOW_ALL" */ String = js.native
  val SHOW_CHILD: /* "SHOW_CHILD" */ String = js.native
  val SHOW_PARENT: /* "SHOW_PARENT" */ String = js.native
  def formatStrategyKeys(
    keys: js.Array[Key],
    strategy: CheckedStrategy,
    keyEntities: Record[
      Key, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataEntity */ _
    ]
  ): js.Array[RawValueType] = js.native
  type CheckedStrategy = /* "SHOW_ALL" */ String
}

