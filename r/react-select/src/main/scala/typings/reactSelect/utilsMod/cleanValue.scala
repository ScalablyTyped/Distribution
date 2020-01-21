package typings.reactSelect.utilsMod

import typings.reactSelect.typesMod.OptionTypeBase
import typings.reactSelect.typesMod.OptionsType
import typings.reactSelect.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/utils", "cleanValue")
@js.native
object cleanValue extends js.Object {
  def apply[OptionType /* <: OptionTypeBase */](value: ValueType[OptionType]): OptionsType[OptionType] = js.native
}

