package typings.reactMdUtils.useCloseOnOutsideClickMod

import typings.react.mod.MutableRefObject
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloseOnOutsideClickOptions[E /* <: HTMLElement */] extends js.Object {
  /**
    * The element that should not trigger the onOutsideClick callback when it or
    * a child has been clicked.
    */
  var element: E | Null | (MutableRefObject[E | Null]) = js.native
  /**
    * Boolean if the behavior is enabled.
    */
  var enabled: Boolean = js.native
  /**
    * A callback function when an element outside has been clicked. This is
    * normally something that closes temporary elements.
    */
  var onOutsideClick: OnOutsideClick[E] = js.native
}

object CloseOnOutsideClickOptions {
  @scala.inline
  def apply[/* <: typings.std.HTMLElement */ E](
    enabled: Boolean,
    onOutsideClick: (/* element */ E | Null, /* target */ HTMLElement | Null, /* contains */ Contains) => Unit
  ): CloseOnOutsideClickOptions[E] = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], onOutsideClick = js.Any.fromFunction3(onOutsideClick))
    __obj.asInstanceOf[CloseOnOutsideClickOptions[E]]
  }
  @scala.inline
  implicit class CloseOnOutsideClickOptionsOps[Self <: CloseOnOutsideClickOptions[_], /* <: typings.std.HTMLElement */ E] (val x: Self with CloseOnOutsideClickOptions[E]) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnOutsideClick(value: (/* element */ E | Null, /* target */ HTMLElement | Null, /* contains */ Contains) => Unit): Self = this.set("onOutsideClick", js.Any.fromFunction3(value))
    @scala.inline
    def setElement(value: E | (MutableRefObject[E | Null])): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def setElementNull: Self = this.set("element", null)
  }
  
}

