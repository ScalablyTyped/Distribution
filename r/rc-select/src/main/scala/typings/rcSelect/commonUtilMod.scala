package typings.rcSelect

import typings.rcSelect.anon.Combobox
import typings.rcSelect.anon.GetLabeledValue
import typings.rcSelect.anon.RemovedValue
import typings.rcSelect.anon.`0`
import typings.rcSelect.generatorMod.DefaultValueType
import typings.rcSelect.generatorMod.FlattenOptionsType
import typings.rcSelect.generatorMod.LabelValueType
import typings.rcSelect.generatorMod.RawValueType
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonUtilMod {
  
  @JSImport("rc-select/lib/utils/commonUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getUUID(): Double | String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUUID")().asInstanceOf[Double | String]
  
  @JSImport("rc-select/lib/utils/commonUtil", "isBrowserClient")
  @js.native
  val isBrowserClient: HTMLElement = js.native
  
  @JSImport("rc-select/lib/utils/commonUtil", "isClient")
  @js.native
  val isClient: HTMLElement = js.native
  
  @scala.inline
  def removeLastEnabledValue[T /* <: `0` */, P /* <: RawValueType | js.Object */](measureValues: js.Array[T], values: js.Array[P]): RemovedValue[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeLastEnabledValue")(measureValues.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[RemovedValue[P]]
  
  @scala.inline
  def toArray[T](value: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  @scala.inline
  def toArray[T](value: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def toInnerValue(value: DefaultValueType, hasLabelInValueCombobox: Combobox): js.Array[RawValueType] = (^.asInstanceOf[js.Dynamic].applyDynamic("toInnerValue")(value.asInstanceOf[js.Any], hasLabelInValueCombobox.asInstanceOf[js.Any])).asInstanceOf[js.Array[RawValueType]]
  
  @scala.inline
  def toOuterValues[FOT /* <: FlattenOptionsType[js.Array[js.Object]] */](
    valueList: js.Array[RawValueType],
    hasOptionLabelPropLabelInValuePrevValueOptionsGetLabeledValue: GetLabeledValue[FOT]
  ): js.Array[LabelValueType | RawValueType] = (^.asInstanceOf[js.Dynamic].applyDynamic("toOuterValues")(valueList.asInstanceOf[js.Any], hasOptionLabelPropLabelInValuePrevValueOptionsGetLabeledValue.asInstanceOf[js.Any])).asInstanceOf[js.Array[LabelValueType | RawValueType]]
}
