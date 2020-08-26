package typings.reachMenuButton.anon

import typings.reachMenuButton.mod.ResolvedMenuLinkComponent
import typings.reachMenuButton.mod.State
import typings.reachMenuButton.mod.SupportedMenuLinkComponent
import typings.react.mod.CSSProperties
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait As[T /* <: SupportedMenuLinkComponent */] extends js.Object {
  var _ref: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
  var as: js.UndefOr[String] = js.native
  var component: js.UndefOr[ResolvedMenuLinkComponent[T]] = js.native
  var index: js.UndefOr[Double] = js.native
  var onClick: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]] = js.native
  var onKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent[HTMLElement], Unit]] = js.native
  var setState: js.UndefOr[js.Function1[/* s */ State, PartialState]] = js.native
  var state: js.UndefOr[State] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var to: js.UndefOr[String] = js.native
}

object As {
  @scala.inline
  def apply[/* <: typings.reachMenuButton.mod.SupportedMenuLinkComponent */ T](): As[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[As[T]]
  }
  @scala.inline
  implicit class AsOps[Self <: As[_], /* <: typings.reachMenuButton.mod.SupportedMenuLinkComponent */ T] (val x: Self with As[T]) extends AnyVal {
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
    def set_ref(value: /* node */ HTMLElement => Unit): Self = this.set("_ref", js.Any.fromFunction1(value))
    @scala.inline
    def delete_ref: Self = this.set("_ref", js.undefined)
    @scala.inline
    def setAs(value: String): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setComponent(value: ResolvedMenuLinkComponent[T]): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setOnClick(value: /* e */ MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnKeyDown(value: /* e */ KeyboardEvent[HTMLElement] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    @scala.inline
    def setSetState(value: /* s */ State => PartialState): Self = this.set("setState", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetState: Self = this.set("setState", js.undefined)
    @scala.inline
    def setState(value: State): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
  
}

