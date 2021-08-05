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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useSelectValuesMod {
  
  @JSImport("rc-tree-select/es/hooks/useSelectValues", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    rawValues: js.Array[RawValueType],
    hasValueGetEntityByValueGetEntityByKeyTreeConductionShowCheckedStrategyConductKeyEntitiesGetLabelProp: Config
  ): js.Array[LabelValueType] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(rawValues.asInstanceOf[js.Any], hasValueGetEntityByValueGetEntityByKeyTreeConductionShowCheckedStrategyConductKeyEntitiesGetLabelProp.asInstanceOf[js.Any])).asInstanceOf[js.Array[LabelValueType]]
  
  @js.native
  trait Config extends StObject {
    
    var conductKeyEntities: Record[Key, DataEntity] = js.native
    
    def getEntityByKey(key: Key): FlattenDataNode = js.native
    def getEntityByKey(key: Key, skipType: Unit, ignoreDisabledCheck: Boolean): FlattenDataNode = js.native
    def getEntityByKey(key: Key, skipType: SkipType): FlattenDataNode = js.native
    def getEntityByKey(key: Key, skipType: SkipType, ignoreDisabledCheck: Boolean): FlattenDataNode = js.native
    
    def getEntityByValue(value: RawValueType): FlattenDataNode = js.native
    def getEntityByValue(value: RawValueType, skipType: Unit, ignoreDisabledCheck: Boolean): FlattenDataNode = js.native
    def getEntityByValue(value: RawValueType, skipType: SkipType): FlattenDataNode = js.native
    def getEntityByValue(value: RawValueType, skipType: SkipType, ignoreDisabledCheck: Boolean): FlattenDataNode = js.native
    
    def getLabelProp(node: DataNode): ReactNode = js.native
    
    var showCheckedStrategy: CheckedStrategy = js.native
    
    var treeConduction: Boolean = js.native
    
    /** Current `value` of TreeSelect */
    var value: DefaultValueType = js.native
  }
}
