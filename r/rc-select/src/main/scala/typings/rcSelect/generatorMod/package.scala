package typings.rcSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object generatorMod {
  type DefaultValueType = typings.rcSelect.generatorMod.RawValueType | (js.Array[
    typings.rcSelect.generatorMod.LabelValueType | typings.rcSelect.generatorMod.RawValueType
  ]) | typings.rcSelect.generatorMod.LabelValueType
  type FilterFunc[OptionType] = js.Function2[
    /* inputValue */ java.lang.String, 
    /* option */ js.UndefOr[OptionType], 
    scala.Boolean
  ]
  type FilterOptions[OptionsType /* <: js.Array[js.Object] */] = js.Function3[
    /* searchValue */ java.lang.String, 
    /* options */ OptionsType, 
    /* config */ typings.rcSelect.anon.FilterOption[OptionsType], 
    OptionsType
  ]
  type FlattenOptionsType[OptionsType /* <: js.Array[js.Object] */] = js.Array[typings.rcSelect.anon.Dictname[OptionsType]]
  type GetLabeledValue[FOT /* <: typings.rcSelect.generatorMod.FlattenOptionsType[js.Array[js.Object]] */] = js.Function2[
    /* value */ typings.rcSelect.generatorMod.RawValueType, 
    /* config */ typings.rcSelect.anon.LabelInValue[FOT], 
    typings.rcSelect.generatorMod.LabelValueType
  ]
  type Key = java.lang.String | scala.Double
  type OnClear = js.Function0[scala.Unit]
  type RawValueType = java.lang.String | scala.Double
  type SingleType[MixType] = MixType
}
