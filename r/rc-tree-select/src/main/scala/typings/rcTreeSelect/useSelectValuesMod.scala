package typings.rcTreeSelect

import typings.rcSelect.generatorMod.DefaultValueType
import typings.rcTree.interfaceMod.DataEntity
import typings.rcTreeSelect.interfaceMod.DataNode
import typings.rcTreeSelect.interfaceMod.FlattenDataNode
import typings.rcTreeSelect.interfaceMod.Key
import typings.rcTreeSelect.interfaceMod.LabelValueType
import typings.rcTreeSelect.interfaceMod.RawValueType
import typings.rcTreeSelect.strategyUtilMod.CheckedStrategy
import typings.rcTreeSelect.useKeyValueMappingMod.SkipType
import typings.react.mod.ReactNode
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-tree-select/es/hooks/useSelectValues", JSImport.Namespace)
@js.native
object useSelectValuesMod extends js.Object {
  
  def default(
    rawValues: js.Array[RawValueType],
    hasValueGetEntityByValueGetEntityByKeyTreeConductionShowCheckedStrategyConductKeyEntitiesGetLabelProp: Config
  ): js.Array[LabelValueType] = js.native
  
  @js.native
  trait Config extends js.Object {
    
    var conductKeyEntities: Record[Key, DataEntity] = js.native
    
    def getEntityByKey(key: Key): FlattenDataNode = js.native
    def getEntityByKey(key: Key, skipType: js.UndefOr[SkipType], ignoreDisabledCheck: Boolean): FlattenDataNode = js.native
    def getEntityByKey(key: Key, skipType: SkipType): FlattenDataNode = js.native
    
    def getEntityByValue(value: RawValueType): FlattenDataNode = js.native
    def getEntityByValue(value: RawValueType, skipType: js.UndefOr[SkipType], ignoreDisabledCheck: Boolean): FlattenDataNode = js.native
    def getEntityByValue(value: RawValueType, skipType: SkipType): FlattenDataNode = js.native
    
    def getLabelProp(node: DataNode): ReactNode = js.native
    
    var showCheckedStrategy: CheckedStrategy = js.native
    
    var treeConduction: Boolean = js.native
    
    /** Current `value` of TreeSelect */
    var value: DefaultValueType = js.native
  }
}
