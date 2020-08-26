package typings.semanticUiReact.ratingIconMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictRatingIconProps extends js.Object {
  /** Indicates activity of an icon. */
  var active: js.UndefOr[Boolean] = js.native
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  /** An index of icon inside Rating. */
  var index: js.UndefOr[Double] = js.native
  /**
    * Called on click.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props and proposed rating.
    */
  var onClick: js.UndefOr[
    js.Function2[
      /* event */ MouseEvent[HTMLElement, NativeMouseEvent], 
      /* data */ RatingIconProps, 
      Unit
    ]
  ] = js.native
  /**
    * Called on keyup.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props and proposed rating.
    */
  var onKeyUp: js.UndefOr[
    js.Function2[
      /* event */ MouseEvent[HTMLElement, NativeMouseEvent], 
      /* data */ RatingIconProps, 
      Unit
    ]
  ] = js.native
  /**
    * Called on mouseenter.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props and proposed rating.
    */
  var onMouseEnter: js.UndefOr[
    js.Function2[
      /* event */ MouseEvent[HTMLElement, NativeMouseEvent], 
      /* data */ RatingIconProps, 
      Unit
    ]
  ] = js.native
  /** Indicates selection of an icon. */
  var selected: js.UndefOr[Boolean] = js.native
}

object StrictRatingIconProps {
  @scala.inline
  def apply(): StrictRatingIconProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictRatingIconProps]
  }
  @scala.inline
  implicit class StrictRatingIconPropsOps[Self <: StrictRatingIconProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setOnClick(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ RatingIconProps) => Unit): Self = this.set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnKeyUp(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ RatingIconProps) => Unit): Self = this.set("onKeyUp", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnKeyUp: Self = this.set("onKeyUp", js.undefined)
    @scala.inline
    def setOnMouseEnter(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ RatingIconProps) => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
  }
  
}

