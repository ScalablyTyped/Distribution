package typings.rcTreeSelect

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
import scala.scalajs.js.annotation._

@JSImport("rc-tree-select/lib/hooks/useSelectValues", JSImport.Namespace)
@js.native
object useSelectValuesMod extends js.Object {
  @js.native
  trait Config extends js.Object {
    var conductKeyEntities: Record[
        Key, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataEntity */ _
      ] = js.native
    var showCheckedStrategy: CheckedStrategy = js.native
    var treeConduction: Boolean = js.native
    /** Current `value` of TreeSelect */
    var value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DefaultValueType */ js.Any = js.native
    def getEntityByKey(key: Key): FlattenDataNode = js.native
    def getEntityByKey(key: Key, skipType: SkipType): FlattenDataNode = js.native
    def getEntityByKey(key: Key, skipType: SkipType, ignoreDisabledCheck: Boolean): FlattenDataNode = js.native
    def getEntityByValue(value: RawValueType): FlattenDataNode = js.native
    def getEntityByValue(value: RawValueType, skipType: SkipType): FlattenDataNode = js.native
    def getEntityByValue(value: RawValueType, skipType: SkipType, ignoreDisabledCheck: Boolean): FlattenDataNode = js.native
    def getLabelProp(node: DataNode): ReactNode = js.native
  }
  
  def default(
    rawValues: js.Array[RawValueType],
    hasValueGetEntityByValueGetEntityByKeyTreeConductionShowCheckedStrategyConductKeyEntitiesGetLabelProp: Config
  ): js.Array[LabelValueType] = js.native
}

