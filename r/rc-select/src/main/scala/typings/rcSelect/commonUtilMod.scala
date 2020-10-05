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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-select/lib/utils/commonUtil", JSImport.Namespace)
@js.native
object commonUtilMod extends js.Object {
  val isBrowserClient: HTMLElement = js.native
  val isClient: HTMLElement = js.native
  def getUUID(): Double | String = js.native
  def removeLastEnabledValue[T /* <: `0` */, P /* <: RawValueType | js.Object */](measureValues: js.Array[T], values: js.Array[P]): RemovedValue[P] = js.native
  def toArray[T](value: T): js.Array[T] = js.native
  def toArray[T](value: js.Array[T]): js.Array[T] = js.native
  def toInnerValue(value: DefaultValueType, hasLabelInValueCombobox: Combobox): js.Array[RawValueType] = js.native
  def toOuterValues[FOT /* <: FlattenOptionsType[js.Array[js.Object]] */](
    valueList: js.Array[RawValueType],
    hasOptionLabelPropLabelInValuePrevValueOptionsGetLabeledValue: GetLabeledValue[FOT]
  ): js.Array[LabelValueType | RawValueType] = js.native
}

