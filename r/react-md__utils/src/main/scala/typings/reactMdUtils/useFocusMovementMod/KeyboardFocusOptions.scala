package typings.reactMdUtils.useFocusMovementMod

import typings.reactMdUtils.movementTypesMod.IncrementMovementKey
import typings.reactMdUtils.movementTypesMod.JumpMovementKey
import typings.reactMdUtils.useKeyboardMovementMod.BaseKeyboardMovementOptions
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyboardFocusOptions[D, CE /* <: HTMLElement */, IE /* <: HTMLElement */] extends BaseKeyboardMovementOptions[D, CE, IE] {
  /**
    * The index that should be focused by default.
    */
  var defaultFocusedIndex: js.UndefOr[Double] = js.native
}

object KeyboardFocusOptions {
  @scala.inline
  def apply[D, /* <: typings.std.HTMLElement */ CE, /* <: typings.std.HTMLElement */ IE](
    decrementKeys: js.Array[IncrementMovementKey],
    incrementKeys: js.Array[IncrementMovementKey],
    items: js.Array[D],
    jumpToFirstKeys: js.Array[JumpMovementKey],
    jumpToLastKeys: js.Array[JumpMovementKey]
  ): KeyboardFocusOptions[D, CE, IE] = {
    val __obj = js.Dynamic.literal(decrementKeys = decrementKeys.asInstanceOf[js.Any], incrementKeys = incrementKeys.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], jumpToFirstKeys = jumpToFirstKeys.asInstanceOf[js.Any], jumpToLastKeys = jumpToLastKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardFocusOptions[D, CE, IE]]
  }
  @scala.inline
  implicit class KeyboardFocusOptionsOps[Self <: KeyboardFocusOptions[_, _, _], D, /* <: typings.std.HTMLElement */ CE, /* <: typings.std.HTMLElement */ IE] (val x: Self with (KeyboardFocusOptions[D, CE, IE])) extends AnyVal {
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
    def setDefaultFocusedIndex(value: Double): Self = this.set("defaultFocusedIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultFocusedIndex: Self = this.set("defaultFocusedIndex", js.undefined)
  }
  
}

