package typings.reactMdStates.useKeyboardClickPolyfillMod

import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[E /* <: HTMLElement */] extends js.Object {
  /**
    * Boolean if the element does not need the Enter key polyfilled. This should
    * normally be set to `true` for `<label>` elements.
    */
  var disableEnterClick: js.UndefOr[Boolean] = js.native
  /**
    * Boolean if the user should not be able to click the element with the space
    * key. This should normally only be set to `true` for link elements.
    */
  var disableSpacebarClick: js.UndefOr[Boolean] = js.native
  /**
    * Boolean if the keyboard click handler should be disabled. This will make it
    * so the return value is just the provided `onKeyDown` handler or undefined
    * if it was omitted
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * An optional onKeyDown event handler that should be merged with the keyboard
    * click polyfill
    */
  var onKeyDown: js.UndefOr[KeyboardEventHandler[E]] = js.native
}

object Options {
  @scala.inline
  def apply[/* <: typings.std.HTMLElement */ E](): Options[E] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[E]]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options[_], /* <: typings.std.HTMLElement */ E] (val x: Self with Options[E]) extends AnyVal {
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
    def setDisableEnterClick(value: Boolean): Self = this.set("disableEnterClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableEnterClick: Self = this.set("disableEnterClick", js.undefined)
    @scala.inline
    def setDisableSpacebarClick(value: Boolean): Self = this.set("disableSpacebarClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableSpacebarClick: Self = this.set("disableSpacebarClick", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setOnKeyDown(value: KeyboardEvent[E] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
  }
  
}

