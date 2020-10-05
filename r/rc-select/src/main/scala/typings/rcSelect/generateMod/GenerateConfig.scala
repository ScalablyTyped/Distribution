package typings.rcSelect.generateMod

import typings.rcSelect.anon.FilterOption
import typings.rcSelect.anon.LabelInValue
import typings.rcSelect.anon.OptionList
import typings.rcSelect.generatorMod.DefaultValueType
import typings.rcSelect.generatorMod.FilterOptions
import typings.rcSelect.generatorMod.FlattenOptionsType
import typings.rcSelect.generatorMod.GetLabeledValue
import typings.rcSelect.generatorMod.LabelValueType
import typings.rcSelect.generatorMod.RawValueType
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateConfig[OptionsType /* <: js.Array[js.Object] */] extends js.Object {
  var components: OptionList[OptionsType] = js.native
  var fillOptionsWithMissingValue: js.UndefOr[
    js.Function4[
      /* options */ OptionsType, 
      /* value */ DefaultValueType, 
      /* optionLabelProp */ String, 
      /* labelInValue */ Boolean, 
      OptionsType
    ]
  ] = js.native
  var filterOptions: FilterOptions[OptionsType] = js.native
  /** Convert single raw value into { label, value } format. Will be called by each value */
  var getLabeledValue: GetLabeledValue[FlattenOptionsType[OptionsType]] = js.native
  var omitDOMProps: js.UndefOr[js.Function1[/* props */ js.Object, js.Object]] = js.native
  var prefixCls: String = js.native
  var warningProps: js.UndefOr[js.Function1[/* props */ js.Any, Unit]] = js.native
  /** Convert jsx tree into `OptionsType` */
  def convertChildrenToData(children: ReactNode): OptionsType = js.native
  def findValueOption(values: js.Array[RawValueType], options: FlattenOptionsType[OptionsType]): OptionsType = js.native
  /** Flatten nest options into raw option list */
  def flattenOptions(options: OptionsType, props: js.Any): FlattenOptionsType[OptionsType] = js.native
  /** Check if a value is disabled */
  def isValueDisabled(value: RawValueType, options: FlattenOptionsType[OptionsType]): Boolean = js.native
}

object GenerateConfig {
  @scala.inline
  def apply[/* <: js.Array[js.Object] */ OptionsType](
    components: OptionList[OptionsType],
    convertChildrenToData: ReactNode => OptionsType,
    filterOptions: (/* searchValue */ String, OptionsType, /* config */ FilterOption[OptionsType]) => OptionsType,
    findValueOption: (js.Array[RawValueType], FlattenOptionsType[OptionsType]) => OptionsType,
    flattenOptions: (OptionsType, js.Any) => FlattenOptionsType[OptionsType],
    getLabeledValue: (/* value */ RawValueType, /* config */ LabelInValue[FlattenOptionsType[OptionsType]]) => LabelValueType,
    isValueDisabled: (RawValueType, FlattenOptionsType[OptionsType]) => Boolean,
    prefixCls: String
  ): GenerateConfig[OptionsType] = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], convertChildrenToData = js.Any.fromFunction1(convertChildrenToData), filterOptions = js.Any.fromFunction3(filterOptions), findValueOption = js.Any.fromFunction2(findValueOption), flattenOptions = js.Any.fromFunction2(flattenOptions), getLabeledValue = js.Any.fromFunction2(getLabeledValue), isValueDisabled = js.Any.fromFunction2(isValueDisabled), prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateConfig[OptionsType]]
  }
  @scala.inline
  implicit class GenerateConfigOps[Self <: GenerateConfig[_], /* <: js.Array[js.Object] */ OptionsType] (val x: Self with GenerateConfig[OptionsType]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setComponents(value: OptionList[OptionsType]): Self = this.set("components", value.asInstanceOf[js.Any])
    @scala.inline
    def setConvertChildrenToData(value: ReactNode => OptionsType): Self = this.set("convertChildrenToData", js.Any.fromFunction1(value))
    @scala.inline
    def setFilterOptions(
      value: (/* searchValue */ String, OptionsType, /* config */ FilterOption[OptionsType]) => OptionsType
    ): Self = this.set("filterOptions", js.Any.fromFunction3(value))
    @scala.inline
    def setFindValueOption(value: (js.Array[RawValueType], FlattenOptionsType[OptionsType]) => OptionsType): Self = this.set("findValueOption", js.Any.fromFunction2(value))
    @scala.inline
    def setFlattenOptions(value: (OptionsType, js.Any) => FlattenOptionsType[OptionsType]): Self = this.set("flattenOptions", js.Any.fromFunction2(value))
    @scala.inline
    def setGetLabeledValue(
      value: (/* value */ RawValueType, /* config */ LabelInValue[FlattenOptionsType[OptionsType]]) => LabelValueType
    ): Self = this.set("getLabeledValue", js.Any.fromFunction2(value))
    @scala.inline
    def setIsValueDisabled(value: (RawValueType, FlattenOptionsType[OptionsType]) => Boolean): Self = this.set("isValueDisabled", js.Any.fromFunction2(value))
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setFillOptionsWithMissingValue(
      value: (/* options */ OptionsType, /* value */ DefaultValueType, /* optionLabelProp */ String, /* labelInValue */ Boolean) => OptionsType
    ): Self = this.set("fillOptionsWithMissingValue", js.Any.fromFunction4(value))
    @scala.inline
    def deleteFillOptionsWithMissingValue: Self = this.set("fillOptionsWithMissingValue", js.undefined)
    @scala.inline
    def setOmitDOMProps(value: /* props */ js.Object => js.Object): Self = this.set("omitDOMProps", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOmitDOMProps: Self = this.set("omitDOMProps", js.undefined)
    @scala.inline
    def setWarningProps(value: /* props */ js.Any => Unit): Self = this.set("warningProps", js.Any.fromFunction1(value))
    @scala.inline
    def deleteWarningProps: Self = this.set("warningProps", js.undefined)
  }
  
}

