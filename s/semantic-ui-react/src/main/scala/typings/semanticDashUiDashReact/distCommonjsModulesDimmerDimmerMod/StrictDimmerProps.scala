package typings.semanticDashUiDashReact.distCommonjsModulesDimmerDimmerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictDimmerProps extends js.Object {
  /** An active dimmer will dim its parent container. */
  var active: js.UndefOr[Boolean] = js.undefined
  /** A dimmer can be formatted to be fixed to the page. */
  var page: js.UndefOr[Boolean] = js.undefined
}

object StrictDimmerProps {
  @scala.inline
  def apply(active: js.UndefOr[Boolean] = js.undefined, page: js.UndefOr[Boolean] = js.undefined): StrictDimmerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictDimmerProps]
  }
}

