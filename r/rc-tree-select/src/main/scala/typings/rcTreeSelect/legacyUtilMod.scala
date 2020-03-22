package typings.rcTreeSelect

import typings.rcTreeSelect.interfaceMod.ChangeEventExtra
import typings.rcTreeSelect.interfaceMod.DataNode
import typings.rcTreeSelect.interfaceMod.InnerDataNode
import typings.rcTreeSelect.interfaceMod.LegacyDataNode
import typings.rcTreeSelect.interfaceMod.RawValueType
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-tree-select/lib/utils/legacyUtil", JSImport.Namespace)
@js.native
object legacyUtilMod extends js.Object {
  def convertChildrenToData(nodes: ReactNode): js.Array[DataNode] = js.native
  def fillAdditionalInfo(
    extra: ChangeEventExtra,
    triggerValue: RawValueType,
    checkedValues: js.Array[RawValueType],
    treeData: js.Array[InnerDataNode],
    showPosition: Boolean
  ): Unit = js.native
  def fillLegacyProps(dataNode: DataNode): LegacyDataNode = js.native
}

