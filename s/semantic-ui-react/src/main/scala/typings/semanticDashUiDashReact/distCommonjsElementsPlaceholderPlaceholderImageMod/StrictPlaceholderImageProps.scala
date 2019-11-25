package typings.semanticDashUiDashReact.distCommonjsElementsPlaceholderPlaceholderImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictPlaceholderImageProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** An image can modify size correctly with responsive styles. */
  var rectangular: js.UndefOr[Boolean] = js.undefined
  /** An image can modify size correctly with responsive styles. */
  var square: js.UndefOr[Boolean] = js.undefined
}

object StrictPlaceholderImageProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    className: String = null,
    rectangular: js.UndefOr[Boolean] = js.undefined,
    square: js.UndefOr[Boolean] = js.undefined
  ): StrictPlaceholderImageProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(rectangular)) __obj.updateDynamic("rectangular")(rectangular.asInstanceOf[js.Any])
    if (!js.isUndefined(square)) __obj.updateDynamic("square")(square.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictPlaceholderImageProps]
  }
}

