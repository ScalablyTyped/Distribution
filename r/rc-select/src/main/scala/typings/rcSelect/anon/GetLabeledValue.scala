package typings.rcSelect.anon

import typings.rcSelect.generatorMod.DefaultValueType
import typings.rcSelect.generatorMod.FlattenOptionsType
import typings.rcSelect.generatorMod.LabelValueType
import typings.rcSelect.generatorMod.RawValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLabeledValue[FOT /* <: FlattenOptionsType[js.Array[js.Object]] */] extends js.Object {
  var getLabeledValue: typings.rcSelect.generatorMod.GetLabeledValue[FOT] = js.native
  var labelInValue: Boolean = js.native
  var optionLabelProp: String = js.native
  var options: FOT = js.native
  var prevValue: DefaultValueType = js.native
}

object GetLabeledValue {
  @scala.inline
  def apply[/* <: typings.rcSelect.generatorMod.FlattenOptionsType[js.Array[js.Object]] */ FOT](
    getLabeledValue: (/* value */ RawValueType, /* config */ LabelInValue[FOT]) => LabelValueType,
    labelInValue: Boolean,
    optionLabelProp: String,
    options: FOT,
    prevValue: DefaultValueType
  ): GetLabeledValue[FOT] = {
    val __obj = js.Dynamic.literal(getLabeledValue = js.Any.fromFunction2(getLabeledValue), labelInValue = labelInValue.asInstanceOf[js.Any], optionLabelProp = optionLabelProp.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], prevValue = prevValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLabeledValue[FOT]]
  }
  @scala.inline
  implicit class GetLabeledValueOps[Self <: GetLabeledValue[_], /* <: typings.rcSelect.generatorMod.FlattenOptionsType[js.Array[js.Object]] */ FOT] (val x: Self with GetLabeledValue[FOT]) extends AnyVal {
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
    def setGetLabeledValue(value: (/* value */ RawValueType, /* config */ LabelInValue[FOT]) => LabelValueType): Self = this.set("getLabeledValue", js.Any.fromFunction2(value))
    @scala.inline
    def setLabelInValue(value: Boolean): Self = this.set("labelInValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionLabelProp(value: String): Self = this.set("optionLabelProp", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: FOT): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevValueVarargs(value: (LabelValueType | RawValueType)*): Self = this.set("prevValue", js.Array(value :_*))
    @scala.inline
    def setPrevValue(value: DefaultValueType): Self = this.set("prevValue", value.asInstanceOf[js.Any])
  }
  
}

