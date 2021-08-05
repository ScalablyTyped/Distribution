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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valueUtilMod {
  
  @JSImport("rc-select/lib/utils/valueUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fillOptionsWithMissingValue(options: OptionsType, value: DefaultValueType, optionLabelProp: String, labelInValue: Boolean): OptionsType = (^.asInstanceOf[js.Dynamic].applyDynamic("fillOptionsWithMissingValue")(options.asInstanceOf[js.Any], value.asInstanceOf[js.Any], optionLabelProp.asInstanceOf[js.Any], labelInValue.asInstanceOf[js.Any])).asInstanceOf[OptionsType]
  
  inline def filterOptions(searchValue: String, options: OptionsType, hasOptionFilterPropFilterOption: OptionFilterProp): OptionsType = (^.asInstanceOf[js.Dynamic].applyDynamic("filterOptions")(searchValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hasOptionFilterPropFilterOption.asInstanceOf[js.Any])).asInstanceOf[OptionsType]
  
  inline def findValueOption(values: js.Array[RawValueType], options: js.Array[FlattenOptionData]): js.Array[OptionData] = (^.asInstanceOf[js.Dynamic].applyDynamic("findValueOption")(values.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[OptionData]]
  inline def findValueOption(values: js.Array[RawValueType], options: js.Array[FlattenOptionData], hasPrevValueOptions: `1`): js.Array[OptionData] = (^.asInstanceOf[js.Dynamic].applyDynamic("findValueOption")(values.asInstanceOf[js.Any], options.asInstanceOf[js.Any], hasPrevValueOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[OptionData]]
  
  inline def flattenOptions(options: OptionsType): js.Array[FlattenOptionData] = ^.asInstanceOf[js.Dynamic].applyDynamic("flattenOptions")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[FlattenOptionData]]
  
  @JSImport("rc-select/lib/utils/valueUtil", "getLabeledValue")
  @js.native
  val getLabeledValue: GetLabeledValue[js.Array[FlattenOptionData]] = js.native
  
  inline def getSeparatedContent(text: String, tokens: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSeparatedContent")(text.asInstanceOf[js.Any], tokens.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def isValueDisabled(value: RawValueType, options: js.Array[FlattenOptionData]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValueDisabled")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
