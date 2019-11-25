package typings.semanticDashUiDashReact.distCommonjsModulesRatingRatingIconMod

import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictRatingIconProps extends js.Object {
  /** Indicates activity of an icon. */
  var active: js.UndefOr[Boolean] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** An index of icon inside Rating. */
  var index: js.UndefOr[Double] = js.undefined
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
  ] = js.undefined
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
  ] = js.undefined
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
  ] = js.undefined
  /** Indicates selection of an icon. */
  var selected: js.UndefOr[Boolean] = js.undefined
}

object StrictRatingIconProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    as: js.Any = null,
    className: String = null,
    index: Int | Double = null,
    onClick: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ RatingIconProps) => Unit = null,
    onKeyUp: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ RatingIconProps) => Unit = null,
    onMouseEnter: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ RatingIconProps) => Unit = null,
    selected: js.UndefOr[Boolean] = js.undefined
  ): StrictRatingIconProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction2(onKeyUp))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction2(onMouseEnter))
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictRatingIconProps]
  }
}

