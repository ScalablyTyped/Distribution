package typings.rcTreeSelect

import typings.rcTreeSelect.interfaceMod.ChangeEventExtra
import typings.rcTreeSelect.interfaceMod.DataNode
import typings.rcTreeSelect.interfaceMod.InnerDataNode
import typings.rcTreeSelect.interfaceMod.LegacyDataNode
import typings.rcTreeSelect.interfaceMod.RawValueType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object legacyUtilMod {
  
  @JSImport("rc-tree-select/es/utils/legacyUtil", "convertChildrenToData")
  @js.native
  def convertChildrenToData(nodes: ReactNode): js.Array[DataNode] = js.native
  
  @JSImport("rc-tree-select/es/utils/legacyUtil", "fillAdditionalInfo")
  @js.native
  def fillAdditionalInfo(
    extra: ChangeEventExtra,
    triggerValue: RawValueType,
    checkedValues: js.Array[RawValueType],
    treeData: js.Array[InnerDataNode],
    showPosition: Boolean
  ): Unit = js.native
  
  @JSImport("rc-tree-select/es/utils/legacyUtil", "fillLegacyProps")
  @js.native
  def fillLegacyProps(dataNode: DataNode): LegacyDataNode = js.native
}
