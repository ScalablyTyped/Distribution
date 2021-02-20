package typings.rcTreeSelect

import typings.rcTreeSelect.anon.FilterOption
import typings.rcTreeSelect.interfaceMod.DataNode
import typings.rcTreeSelect.interfaceMod.DefaultValueType
import typings.rcTreeSelect.interfaceMod.FlattenDataNode
import typings.rcTreeSelect.interfaceMod.LabelValueType
import typings.rcTreeSelect.interfaceMod.RawValueType
import typings.rcTreeSelect.useKeyValueMappingMod.SkipType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valueUtilMod {
  
  @JSImport("rc-tree-select/es/utils/valueUtil", "addValue")
  @js.native
  def addValue(rawValues: js.Array[RawValueType], value: RawValueType): js.Array[String | Double] = js.native
  
  @JSImport("rc-tree-select/es/utils/valueUtil", "filterOptions")
  @js.native
  def filterOptions(searchValue: String, options: js.Array[DataNode], hasOptionFilterPropFilterOption: FilterOption): js.Array[DataNode] = js.native
  
  @JSImport("rc-tree-select/es/utils/valueUtil", "findValueOption")
  @js.native
  def findValueOption(values: js.Array[RawValueType], options: js.Array[FlattenDataNode]): js.Array[DataNode] = js.native
  
  @JSImport("rc-tree-select/es/utils/valueUtil", "flattenOptions")
  @js.native
  def flattenOptions(options: js.Array[DataNode]): js.Array[FlattenDataNode] = js.native
  
  @JSImport("rc-tree-select/es/utils/valueUtil", "getRawValueLabeled")
  @js.native
  def getRawValueLabeled(
    values: js.Array[RawValueType],
    prevValue: DefaultValueType,
    getEntityByValue: js.Function3[
      /* value */ RawValueType, 
      /* skipType */ js.UndefOr[SkipType], 
      /* ignoreDisabledCheck */ js.UndefOr[Boolean], 
      FlattenDataNode
    ],
    getLabelProp: js.Function1[/* node */ DataNode, ReactNode]
  ): js.Array[LabelValueType] = js.native
  
  @JSImport("rc-tree-select/es/utils/valueUtil", "isCheckDisabled")
  @js.native
  def isCheckDisabled(node: DataNode): Boolean = js.native
  
  @JSImport("rc-tree-select/es/utils/valueUtil", "isValueDisabled")
  @js.native
  def isValueDisabled(value: RawValueType, options: js.Array[FlattenDataNode]): Boolean = js.native
  
  @JSImport("rc-tree-select/es/utils/valueUtil", "removeValue")
  @js.native
  def removeValue(rawValues: js.Array[RawValueType], value: RawValueType): js.Array[String | Double] = js.native
  
  @JSImport("rc-tree-select/es/utils/valueUtil", "toArray")
  @js.native
  def toArray[T](value: T): js.Array[T] = js.native
  @JSImport("rc-tree-select/es/utils/valueUtil", "toArray")
  @js.native
  def toArray[T](value: js.Array[T]): js.Array[T] = js.native
}
