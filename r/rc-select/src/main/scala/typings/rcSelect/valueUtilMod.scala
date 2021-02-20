package typings.rcSelect

import typings.rcSelect.anon.OptionFilterProp
import typings.rcSelect.anon.`1`
import typings.rcSelect.generatorMod.DefaultValueType
import typings.rcSelect.generatorMod.GetLabeledValue
import typings.rcSelect.generatorMod.RawValueType
import typings.rcSelect.interfaceMod.FlattenOptionData
import typings.rcSelect.interfaceMod.OptionData
import typings.rcSelect.interfaceMod.OptionsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valueUtilMod {
  
  @JSImport("rc-select/lib/utils/valueUtil", "fillOptionsWithMissingValue")
  @js.native
  def fillOptionsWithMissingValue(options: OptionsType, value: DefaultValueType, optionLabelProp: String, labelInValue: Boolean): OptionsType = js.native
  
  @JSImport("rc-select/lib/utils/valueUtil", "filterOptions")
  @js.native
  def filterOptions(searchValue: String, options: OptionsType, hasOptionFilterPropFilterOption: OptionFilterProp): OptionsType = js.native
  
  @JSImport("rc-select/lib/utils/valueUtil", "findValueOption")
  @js.native
  def findValueOption(values: js.Array[RawValueType], options: js.Array[FlattenOptionData]): js.Array[OptionData] = js.native
  @JSImport("rc-select/lib/utils/valueUtil", "findValueOption")
  @js.native
  def findValueOption(values: js.Array[RawValueType], options: js.Array[FlattenOptionData], hasPrevValueOptions: `1`): js.Array[OptionData] = js.native
  
  @JSImport("rc-select/lib/utils/valueUtil", "flattenOptions")
  @js.native
  def flattenOptions(options: OptionsType): js.Array[FlattenOptionData] = js.native
  
  @JSImport("rc-select/lib/utils/valueUtil", "getLabeledValue")
  @js.native
  val getLabeledValue: GetLabeledValue[js.Array[FlattenOptionData]] = js.native
  
  @JSImport("rc-select/lib/utils/valueUtil", "getSeparatedContent")
  @js.native
  def getSeparatedContent(text: String, tokens: js.Array[String]): js.Array[String] = js.native
  
  @JSImport("rc-select/lib/utils/valueUtil", "isValueDisabled")
  @js.native
  def isValueDisabled(value: RawValueType, options: js.Array[FlattenOptionData]): Boolean = js.native
}
