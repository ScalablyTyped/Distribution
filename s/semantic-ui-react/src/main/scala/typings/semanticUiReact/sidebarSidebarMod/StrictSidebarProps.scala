package typings.semanticUiReact.sidebarSidebarMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.semanticUiReactStrings.`scale down`
import typings.semanticUiReact.semanticUiReactStrings.`slide along`
import typings.semanticUiReact.semanticUiReactStrings.`slide out`
import typings.semanticUiReact.semanticUiReactStrings.`very thin`
import typings.semanticUiReact.semanticUiReactStrings.`very wide`
import typings.semanticUiReact.semanticUiReactStrings.bottom
import typings.semanticUiReact.semanticUiReactStrings.left
import typings.semanticUiReact.semanticUiReactStrings.overlay
import typings.semanticUiReact.semanticUiReactStrings.push
import typings.semanticUiReact.semanticUiReactStrings.right
import typings.semanticUiReact.semanticUiReactStrings.thin
import typings.semanticUiReact.semanticUiReactStrings.top
import typings.semanticUiReact.semanticUiReactStrings.uncover
import typings.semanticUiReact.semanticUiReactStrings.wide
import typings.std.Document
import typings.std.HTMLElement
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictSidebarProps extends js.Object {
  /** Animation style. */
  var animation: js.UndefOr[overlay | push | (`scale down`) | uncover | (`slide out`) | (`slide along`)] = js.native
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.native
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.native
  /** Direction the sidebar should appear on. */
  var direction: js.UndefOr[top | right | bottom | left] = js.native
  /**
    * Called after a sidebar has finished animating out.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onHidden: js.UndefOr[
    js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ SidebarProps, Unit]
  ] = js.native
  /**
    * Called before a sidebar begins to animate out.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onHide: js.UndefOr[
    js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ SidebarProps, Unit]
  ] = js.native
  /**
    * Called when a sidebar has finished animating in.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onShow: js.UndefOr[
    js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ SidebarProps, Unit]
  ] = js.native
  /**
    * Called when a sidebar begins animating in.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onVisible: js.UndefOr[
    js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ SidebarProps, Unit]
  ] = js.native
  /** A sidebar can handle clicks on the passed element. */
  var target: js.UndefOr[Document | Window | HTMLElement | RefObject[HTMLElement]] = js.native
  /** Controls whether or not the sidebar is visible on the page. */
  var visible: js.UndefOr[Boolean] = js.native
  /** Sidebar width. */
  var width: js.UndefOr[(`very thin`) | thin | wide | (`very wide`)] = js.native
}

object StrictSidebarProps {
  @scala.inline
  def apply(): StrictSidebarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictSidebarProps]
  }
  @scala.inline
  implicit class StrictSidebarPropsOps[Self <: StrictSidebarProps] (val x: Self) extends AnyVal {
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
    def setAnimation(value: overlay | push | (`scale down`) | uncover | (`slide out`) | (`slide along`)): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setAs(value: js.Any): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setContent(value: SemanticShorthandContent): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setDirection(value: top | right | bottom | left): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setOnHidden(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ SidebarProps) => Unit): Self = this.set("onHidden", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnHidden: Self = this.set("onHidden", js.undefined)
    @scala.inline
    def setOnHide(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ SidebarProps) => Unit): Self = this.set("onHide", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    @scala.inline
    def setOnShow(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ SidebarProps) => Unit): Self = this.set("onShow", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    @scala.inline
    def setOnVisible(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ SidebarProps) => Unit): Self = this.set("onVisible", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnVisible: Self = this.set("onVisible", js.undefined)
    @scala.inline
    def setTarget(value: Document | Window | HTMLElement | RefObject[HTMLElement]): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setWidth(value: (`very thin`) | thin | wide | (`very wide`)): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

