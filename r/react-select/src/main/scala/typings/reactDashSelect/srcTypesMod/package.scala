package typings.reactDashSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcTypesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.react.reactMod.FocusEvent
  import typings.react.reactMod.KeyboardEvent
  import typings.react.reactMod.MouseEvent
  import typings.react.reactMod.NativeMouseEvent
  import typings.react.reactMod.Ref
  import typings.reactDashSelect.Anon_Data
  import typings.std.HTMLElement

  type ClassNameList = js.Array[String]
  type ClassNamesState = js.UndefOr[StringDictionary[Boolean]]
  type FocusEventHandler = js.Function1[/* event */ FocusEvent[HTMLElement], Unit]
  type GroupedOptionsType[OptionType /* <: OptionTypeBase */] = js.Array[GroupType[OptionType]]
  type InnerRef = Ref[js.Any]
  type KeyboardEventHandler = js.Function1[/* event */ KeyboardEvent[HTMLElement], Unit]
  type MouseEventHandler = js.Function1[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]
  type OptionProps = PropsWithInnerRef with Anon_Data
  type OptionTypeBase = StringDictionary[js.Any]
  type OptionsType[OptionType /* <: OptionTypeBase */] = js.Array[OptionType]
  type ValueType[OptionType /* <: OptionTypeBase */] = js.UndefOr[OptionType | OptionsType[OptionType] | Null]
}
