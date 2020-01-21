package typings.reactSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type ClassNameList = js.Array[java.lang.String]
  type ClassNamesState = js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Boolean]]
  type FocusEventHandler = js.Function1[/* event */ typings.react.mod.FocusEvent[typings.std.HTMLElement], scala.Unit]
  type GroupedOptionsType[OptionType /* <: typings.reactSelect.typesMod.OptionTypeBase */] = js.Array[typings.reactSelect.typesMod.GroupType[OptionType]]
  type InnerRef = typings.react.mod.Ref[js.Any]
  type KeyboardEventHandler = js.Function1[/* event */ typings.react.mod.KeyboardEvent[typings.std.HTMLElement], scala.Unit]
  type MouseEventHandler = js.Function1[
    /* event */ typings.react.mod.MouseEvent[typings.std.HTMLElement, typings.react.mod.NativeMouseEvent], 
    scala.Unit
  ]
  type OptionTypeBase = org.scalablytyped.runtime.StringDictionary[js.Any]
  type OptionsType[OptionType /* <: typings.reactSelect.typesMod.OptionTypeBase */] = js.Array[OptionType]
  type ValueType[OptionType /* <: typings.reactSelect.typesMod.OptionTypeBase */] = js.UndefOr[OptionType | typings.reactSelect.typesMod.OptionsType[OptionType] | scala.Null]
}
