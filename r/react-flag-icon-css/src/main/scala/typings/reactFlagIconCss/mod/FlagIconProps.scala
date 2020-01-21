package typings.reactFlagIconCss.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlagIconProps extends js.Object {
  var Component: js.UndefOr[String] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  /**
    * This is always appended as-is to class in the HTML.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * ISO 3166-1-alpha-2 code.
    */
  var code: String
  var flip: js.UndefOr[FlagIconFlip] = js.undefined
  var rotate: js.UndefOr[FlagIconRotate] = js.undefined
  var size: js.UndefOr[FlagIconSize] = js.undefined
  /**
    * 	Uses the 1x1 image if true.
    */
  var squared: js.UndefOr[Boolean] = js.undefined
  /**
    * This is mapped to a CSS module and appended to class in the HTML.
    */
  var styleName: js.UndefOr[String] = js.undefined
}

object FlagIconProps {
  @scala.inline
  def apply(
    code: String,
    Component: String = null,
    children: ReactNode = null,
    className: String = null,
    flip: FlagIconFlip = null,
    rotate: FlagIconRotate = null,
    size: FlagIconSize = null,
    squared: js.UndefOr[Boolean] = js.undefined,
    styleName: String = null
  ): FlagIconProps = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    if (Component != null) __obj.updateDynamic("Component")(Component.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (flip != null) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(squared)) __obj.updateDynamic("squared")(squared.asInstanceOf[js.Any])
    if (styleName != null) __obj.updateDynamic("styleName")(styleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlagIconProps]
  }
}

