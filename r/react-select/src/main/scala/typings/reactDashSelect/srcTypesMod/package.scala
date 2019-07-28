package typings.reactDashSelect

import org.scalablytyped.runtime.StringDictionary
import typings.react.NativeMouseEvent
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.Ref
import typings.reactDashSelect.Anon_Data
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcTypesMod {
  type ClassNameList = js.Array[String]
  type ClassNamesState = js.UndefOr[StringDictionary[Boolean]]
  type FocusEventHandler = js.Function1[/* event */ FocusEvent[HTMLElement], Unit]
  type GroupedOptionsType[UnionOptionType] = js.Array[GroupType[UnionOptionType]]
  type InnerRef = Ref[js.Any]
  type KeyboardEventHandler = js.Function1[/* event */ KeyboardEvent[HTMLElement], Unit]
  type MouseEventHandler = js.Function1[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]
  type OptionProps = PropsWithInnerRef with Anon_Data
  type OptionsType[OptionType] = js.Array[OptionType]
  type ValueType[OptionType] = js.UndefOr[OptionType | OptionsType[OptionType] | Null]
}
