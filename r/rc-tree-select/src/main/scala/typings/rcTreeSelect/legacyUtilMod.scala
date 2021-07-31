package typings.rcTreeSelect

import typings.rcTreeSelect.interfaceMod.ChangeEventExtra
import typings.rcTreeSelect.interfaceMod.DataNode
import typings.rcTreeSelect.interfaceMod.InnerDataNode
import typings.rcTreeSelect.interfaceMod.LegacyDataNode
import typings.rcTreeSelect.interfaceMod.RawValueType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object legacyUtilMod {
  
  @JSImport("rc-tree-select/es/utils/legacyUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def convertChildrenToData(nodes: ReactNode): js.Array[DataNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertChildrenToData")(nodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[DataNode]]
  
  @scala.inline
  def fillAdditionalInfo(
    extra: ChangeEventExtra,
    triggerValue: RawValueType,
    checkedValues: js.Array[RawValueType],
    treeData: js.Array[InnerDataNode],
    showPosition: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fillAdditionalInfo")(extra.asInstanceOf[js.Any], triggerValue.asInstanceOf[js.Any], checkedValues.asInstanceOf[js.Any], treeData.asInstanceOf[js.Any], showPosition.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def fillLegacyProps(dataNode: DataNode): LegacyDataNode = ^.asInstanceOf[js.Dynamic].applyDynamic("fillLegacyProps")(dataNode.asInstanceOf[js.Any]).asInstanceOf[LegacyDataNode]
}
