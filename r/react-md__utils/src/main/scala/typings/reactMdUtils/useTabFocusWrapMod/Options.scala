package typings.reactMdUtils.useTabFocusWrapMod

import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options[E /* <: HTMLElement */] extends js.Object {
  
  /**
    * Boolean if the list of focusable elements should not be cached after the
    * first tab key press. This should only be set to `true` if you have a lot of
    * dynamic content whin your element and the first and last elements change.
    */
  var disableFocusCache: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean if the focus wrap behavior should be disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * An optional keydown event handler to merge with the focus wrap behavior.
    */
  var onKeyDown: js.UndefOr[KeyboardEventHandler[E]] = js.native
}
object Options {
  
  @scala.inline
  def apply[E /* <: HTMLElement */](): Options[E] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[E]]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options[_], E /* <: HTMLElement */] (val x: Self with Options[E]) extends AnyVal {
    
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
    def setDisableFocusCache(value: Boolean): Self = this.set("disableFocusCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableFocusCache: Self = this.set("disableFocusCache", js.undefined)
    
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
