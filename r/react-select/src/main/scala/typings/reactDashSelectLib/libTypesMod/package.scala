package typings
package reactDashSelectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesMod {
  type ActionTypes = reactDashSelectLib.reactDashSelectLibStrings.`select-option` | reactDashSelectLib.reactDashSelectLibStrings.`deselect-option` | reactDashSelectLib.reactDashSelectLibStrings.`remove-value` | reactDashSelectLib.reactDashSelectLibStrings.`pop-value` | reactDashSelectLib.reactDashSelectLibStrings.`set-value` | reactDashSelectLib.reactDashSelectLibStrings.clear | reactDashSelectLib.reactDashSelectLibStrings.`create-option`
  type ClassNameList = js.Array[java.lang.String]
  type ClassNamesState = js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Boolean]]
  type FocusDirection = reactDashSelectLib.reactDashSelectLibStrings.up | reactDashSelectLib.reactDashSelectLibStrings.down | reactDashSelectLib.reactDashSelectLibStrings.pageup | reactDashSelectLib.reactDashSelectLibStrings.pagedown | reactDashSelectLib.reactDashSelectLibStrings.first | reactDashSelectLib.reactDashSelectLibStrings.last
  type FocusEventHandler = js.Function1[/* event */ reactLib.reactMod.ReactNs.FocusEvent[reactLib.HTMLElement], scala.Unit]
  type GroupedOptionsType[UnionOptionType] = js.Array[GroupType[UnionOptionType]]
  type InnerRef = reactLib.reactMod.ReactNs.Ref[js.Any]
  type InputActionTypes = reactDashSelectLib.reactDashSelectLibStrings.`set-value` | reactDashSelectLib.reactDashSelectLibStrings.`input-change` | reactDashSelectLib.reactDashSelectLibStrings.`input-blur` | reactDashSelectLib.reactDashSelectLibStrings.`menu-close`
  type KeyboardEventHandler = js.Function1[
    /* event */ reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLElement], 
    scala.Unit
  ]
  type MenuPlacement = reactDashSelectLib.reactDashSelectLibStrings.auto | reactDashSelectLib.reactDashSelectLibStrings.bottom | reactDashSelectLib.reactDashSelectLibStrings.top
  type MenuPosition = reactDashSelectLib.reactDashSelectLibStrings.absolute | reactDashSelectLib.reactDashSelectLibStrings.fixed
  type MouseEventHandler = js.Function1[
    /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
    scala.Unit
  ]
  type OptionProps = PropsWithInnerRef with reactDashSelectLib.Anon_Data
  type OptionsType[OptionType] = js.Array[OptionType]
  type ValueType[OptionType] = js.UndefOr[OptionType | OptionsType[OptionType] | scala.Null]
}
