package typings.semanticUiReact.dimmerInnerMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.semanticUiReactStrings.bottom
import typings.semanticUiReact.semanticUiReactStrings.top
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictDimmerInnerProps extends js.Object {
  /** An active dimmer will dim its parent container. */
  var active: js.UndefOr[Boolean] = js.native
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.native
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.native
  /** A disabled dimmer cannot be activated */
  var disabled: js.UndefOr[Boolean] = js.native
  /** A dimmer can be formatted to have its colors inverted. */
  var inverted: js.UndefOr[Boolean] = js.native
  /**
    * Called when the dimmer is clicked.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onClick: js.UndefOr[
    js.Function2[
      /* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], 
      /* data */ DimmerInnerProps, 
      Unit
    ]
  ] = js.native
  /**
    * Handles click outside Dimmer's content, but inside Dimmer area.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onClickOutside: js.UndefOr[
    js.Function2[
      /* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], 
      /* data */ DimmerInnerProps, 
      Unit
    ]
  ] = js.native
  /** A dimmer can be formatted to be fixed to the page. */
  var page: js.UndefOr[Boolean] = js.native
  /** A dimmer can be controlled with simple prop. */
  var simple: js.UndefOr[Boolean] = js.native
  /** A dimmer can have its content top or bottom aligned. */
  var verticalAlign: js.UndefOr[bottom | top] = js.native
}

object StrictDimmerInnerProps {
  @scala.inline
  def apply(): StrictDimmerInnerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictDimmerInnerProps]
  }
  @scala.inline
  implicit class StrictDimmerInnerPropsOps[Self <: StrictDimmerInnerProps] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setInverted(value: Boolean): Self = this.set("inverted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInverted: Self = this.set("inverted", js.undefined)
    @scala.inline
    def setOnClick(
      value: (/* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* data */ DimmerInnerProps) => Unit
    ): Self = this.set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnClickOutside(
      value: (/* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* data */ DimmerInnerProps) => Unit
    ): Self = this.set("onClickOutside", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnClickOutside: Self = this.set("onClickOutside", js.undefined)
    @scala.inline
    def setPage(value: Boolean): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    @scala.inline
    def setSimple(value: Boolean): Self = this.set("simple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSimple: Self = this.set("simple", js.undefined)
    @scala.inline
    def setVerticalAlign(value: bottom | top): Self = this.set("verticalAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlign: Self = this.set("verticalAlign", js.undefined)
  }
  
}

