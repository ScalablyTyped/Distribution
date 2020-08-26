package typings.reactAriaMenubutton.mod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrapperProps[T /* <: HTMLElement */]
  extends AllHTMLAttributes[T]
     with ClassAttributes[T] {
  /**
    * By default, it does automatically close.
    * If false, the menu will not automatically close when it
    * blurs. Default: `true`.
    */
  var closeOnBlur: js.UndefOr[Boolean] = js.native
  /**
    * By default, it does automatically close.
    * If false, the menu will not automatically close when a
    * selection is made. Default: `true`.
    */
  var closeOnSelection: js.UndefOr[Boolean] = js.native
  /**
    * A callback to run when the menu is opened or closed.
    */
  var onMenuToggle: js.UndefOr[js.Function1[/* obj */ WrapperState, _]] = js.native
  /**
    * A callback to run when the user makes a selection
    * (i.e. clicks or presses Enter or Space on a `MenuItem`).
    * It will be passed the value of the selected `MenuItem` and
    * the React `SyntheticEvent`.
    */
  var onSelection: js.UndefOr[js.Function2[/* value */ js.Any, /* event */ SyntheticEvent[T, Event], _]] = js.native
  var tag: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T['tagName'] */ js.Any
  ] = js.native
}

object WrapperProps {
  @scala.inline
  def apply[/* <: typings.std.HTMLElement */ T](): WrapperProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WrapperProps[T]]
  }
  @scala.inline
  implicit class WrapperPropsOps[Self <: WrapperProps[_], /* <: typings.std.HTMLElement */ T] (val x: Self with WrapperProps[T]) extends AnyVal {
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
    def setCloseOnBlur(value: Boolean): Self = this.set("closeOnBlur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOnBlur: Self = this.set("closeOnBlur", js.undefined)
    @scala.inline
    def setCloseOnSelection(value: Boolean): Self = this.set("closeOnSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOnSelection: Self = this.set("closeOnSelection", js.undefined)
    @scala.inline
    def setOnMenuToggle(value: /* obj */ WrapperState => _): Self = this.set("onMenuToggle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMenuToggle: Self = this.set("onMenuToggle", js.undefined)
    @scala.inline
    def setOnSelection(value: (/* value */ js.Any, /* event */ SyntheticEvent[T, Event]) => _): Self = this.set("onSelection", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnSelection: Self = this.set("onSelection", js.undefined)
    @scala.inline
    def setTag(value: /* import warning: importer.ImportType#apply Failed type conversion: T['tagName'] */ js.Any): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
  
}

