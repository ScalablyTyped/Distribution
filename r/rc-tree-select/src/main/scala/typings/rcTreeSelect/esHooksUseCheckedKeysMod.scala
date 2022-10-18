package typings.rcTreeSelect

import typings.rcTree.esInterfaceMod.DataEntity
import typings.rcTree.esInterfaceMod.DataNode
import typings.rcTreeSelect.esTreeSelectMod.LabeledValueType
import typings.rcTreeSelect.esTreeSelectMod.RawValueType
import typings.react.mod.Key
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseCheckedKeysMod {
  
  @JSImport("rc-tree-select/es/hooks/useCheckedKeys", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    rawLabeledValues: js.Array[LabeledValueType],
    rawHalfCheckedValues: js.Array[LabeledValueType],
    treeConduction: Boolean,
    keyEntities: Record[Key, DataEntity[DataNode]]
  ): js.Array[js.Array[RawValueType]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(rawLabeledValues.asInstanceOf[js.Any], rawHalfCheckedValues.asInstanceOf[js.Any], treeConduction.asInstanceOf[js.Any], keyEntities.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[RawValueType]]]
}
