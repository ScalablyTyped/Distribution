package typings.reactMdAutocomplete.useAutoCompleteMod

import typings.react.mod.CSSProperties
import typings.react.mod.ChangeEventHandler
import typings.react.mod.FocusEventHandler
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEventHandler
import typings.react.mod.MutableRefObject
import typings.reactMdAutocomplete.anon.RequiredTransitionHooks
import typings.reactMdAutocomplete.typesMod.AutoCompleteData
import typings.reactMdList.listMod.ListElement
import typings.reactMdUtils.useKeyboardMovementMod.ItemRefList
import typings.std.HTMLInputElement
import typings.std.HTMLLIElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoCompleteReturnValue extends js.Object {
  var activeId: String = js.native
  var filteredData: js.Array[AutoCompleteData] = js.native
  var fixedStyle: js.UndefOr[CSSProperties] = js.native
  var handleBlur: FocusEventHandler[HTMLInputElement] = js.native
  var handleChange: ChangeEventHandler[HTMLInputElement] = js.native
  var handleClick: MouseEventHandler[HTMLInputElement] = js.native
  var handleFocus: FocusEventHandler[HTMLInputElement] = js.native
  var handleKeyDown: KeyboardEventHandler[HTMLInputElement] = js.native
  var itemRefs: ItemRefList[HTMLLIElement] = js.native
  var listboxRef: MutableRefObject[ListElement | Null] = js.native
  var `match`: String = js.native
  var transitionHooks: RequiredTransitionHooks = js.native
  var value: String = js.native
  var visible: Boolean = js.native
  def handleAutoComplete(index: Double): Unit = js.native
  def ref(): Unit = js.native
  def ref(instance: HTMLInputElement): Unit = js.native
}

