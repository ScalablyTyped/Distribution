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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valueUtilMod {
  
  @JSImport("rc-tree-select/es/utils/valueUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addValue(rawValues: js.Array[RawValueType], value: RawValueType): js.Array[String | Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("addValue")(rawValues.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | Double]]
  
  @scala.inline
  def filterOptions(searchValue: String, options: js.Array[DataNode], hasOptionFilterPropFilterOption: FilterOption): js.Array[DataNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOptions")(searchValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hasOptionFilterPropFilterOption.asInstanceOf[js.Any])).asInstanceOf[js.Array[DataNode]]
  
  @scala.inline
  def findValueOption(values: js.Array[RawValueType], options: js.Array[FlattenDataNode]): js.Array[DataNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("findValueOption")(values.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[DataNode]]
  
  @scala.inline
  def flattenOptions(options: js.Array[DataNode]): js.Array[FlattenDataNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("flattenOptions")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[FlattenDataNode]]
  
  @scala.inline
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
  ): js.Array[LabelValueType] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRawValueLabeled")(values.asInstanceOf[js.Any], prevValue.asInstanceOf[js.Any], getEntityByValue.asInstanceOf[js.Any], getLabelProp.asInstanceOf[js.Any])).asInstanceOf[js.Array[LabelValueType]]
  
  @scala.inline
  def isCheckDisabled(node: DataNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCheckDisabled")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isValueDisabled(value: RawValueType, options: js.Array[FlattenDataNode]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValueDisabled")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def removeValue(rawValues: js.Array[RawValueType], value: RawValueType): js.Array[String | Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeValue")(rawValues.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | Double]]
  
  @scala.inline
  def toArray[T](value: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  @scala.inline
  def toArray[T](value: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
}
