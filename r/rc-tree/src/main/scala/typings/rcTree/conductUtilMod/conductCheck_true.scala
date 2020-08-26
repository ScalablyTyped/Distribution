package typings.rcTree.conductUtilMod

import typings.rcTree.interfaceMod.DataEntity
import typings.rcTree.interfaceMod.DataNode
import typings.rcTree.interfaceMod.GetCheckDisabled
import typings.rcTree.interfaceMod.Key
import typings.rcTree.rcTreeBooleans.`true`
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-tree/es/utils/conductUtil", "conductCheck")
@js.native
object conductCheck_true extends js.Object {
  def apply(keyList: js.Array[Key], checked: `true`, keyEntities: Record[Key, DataEntity]): ConductReturnType = js.native
  def apply(
    keyList: js.Array[Key],
    checked: `true`,
    keyEntities: Record[Key, DataEntity],
    getCheckDisabled: GetCheckDisabled[DataNode]
  ): ConductReturnType = js.native
}

