package typings
package reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputContainerPropsSingle[T /* <: TypeaheadModel */] extends js.Object {
  var `aria-activedescendant`: java.lang.String
  var `aria-autocomplete`: reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.list | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.both
  var `aria-expanded`: scala.Boolean | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.`true` | reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.`false`
  var `aria-haspopup`: reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.listbox
  var `aria-owns`: java.lang.String
  var autoComplete: java.lang.String
  var disabled: scala.Boolean
  var inputRef: reactLib.reactMod.ReactNs.LegacyRef[reactLib.HTMLInputElement]
  var placeholder: java.lang.String | scala.Null
  var role: reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.combobox
  var value: java.lang.String
  def onBlur(e: reactLib.Event): scala.Unit
  def onChange(selected: js.Array[T]): scala.Unit
  def onClick(e: reactLib.Event): scala.Unit
  def onFocus(e: reactLib.Event): scala.Unit
  def onKeyDown(e: reactLib.Event): scala.Unit
}

