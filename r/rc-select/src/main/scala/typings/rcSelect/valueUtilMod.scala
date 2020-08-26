package typings.rcSelect

import typings.rcSelect.anon.OptionFilterProp
import typings.rcSelect.generatorMod.DefaultValueType
import typings.rcSelect.generatorMod.GetLabeledValue
import typings.rcSelect.generatorMod.RawValueType
import typings.rcSelect.interfaceMod.FlattenOptionData
import typings.rcSelect.interfaceMod.OptionData
import typings.rcSelect.interfaceMod.OptionsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-select/lib/utils/valueUtil", JSImport.Namespace)
@js.native
object valueUtilMod extends js.Object {
  val getLabeledValue: GetLabeledValue[js.Array[FlattenOptionData]] = js.native
  def fillOptionsWithMissingValue(options: OptionsType, value: DefaultValueType, optionLabelProp: String, labelInValue: Boolean): OptionsType = js.native
  def filterOptions(searchValue: String, options: OptionsType, hasOptionFilterPropFilterOption: OptionFilterProp): OptionsType = js.native
  def findValueOption(values: js.Array[RawValueType], options: js.Array[FlattenOptionData]): js.Array[OptionData] = js.native
  def flattenOptions(options: OptionsType): js.Array[FlattenOptionData] = js.native
  def getSeparatedContent(text: String, tokens: js.Array[String]): js.Array[String] = js.native
  def isValueDisabled(value: RawValueType, options: js.Array[FlattenOptionData]): Boolean = js.native
}

