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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonUtilMod {
  
  @JSImport("rc-select/lib/utils/commonUtil", "getUUID")
  @js.native
  def getUUID(): Double | String = js.native
  
  @JSImport("rc-select/lib/utils/commonUtil", "isBrowserClient")
  @js.native
  val isBrowserClient: HTMLElement = js.native
  
  @JSImport("rc-select/lib/utils/commonUtil", "isClient")
  @js.native
  val isClient: HTMLElement = js.native
  
  @JSImport("rc-select/lib/utils/commonUtil", "removeLastEnabledValue")
  @js.native
  def removeLastEnabledValue[T /* <: `0` */, P /* <: RawValueType | js.Object */](measureValues: js.Array[T], values: js.Array[P]): RemovedValue[P] = js.native
  
  @JSImport("rc-select/lib/utils/commonUtil", "toArray")
  @js.native
  def toArray[T](value: T): js.Array[T] = js.native
  @JSImport("rc-select/lib/utils/commonUtil", "toArray")
  @js.native
  def toArray[T](value: js.Array[T]): js.Array[T] = js.native
  
  @JSImport("rc-select/lib/utils/commonUtil", "toInnerValue")
  @js.native
  def toInnerValue(value: DefaultValueType, hasLabelInValueCombobox: Combobox): js.Array[RawValueType] = js.native
  
  @JSImport("rc-select/lib/utils/commonUtil", "toOuterValues")
  @js.native
  def toOuterValues[FOT /* <: FlattenOptionsType[js.Array[js.Object]] */](
    valueList: js.Array[RawValueType],
    hasOptionLabelPropLabelInValuePrevValueOptionsGetLabeledValue: GetLabeledValue[FOT]
  ): js.Array[LabelValueType | RawValueType] = js.native
}
