package typings.sparkpost.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTemplateOptions extends js.Object {
  /** Enable or disable click tracking */
  var click_tracking: js.UndefOr[Boolean] = js.undefined
  /** Enable or disable open tracking */
  var open_tracking: js.UndefOr[Boolean] = js.undefined
  /** Distinguish between transactional and non-transactional messages for unsubscribe and suppression purposes */
  var transactional: js.UndefOr[Boolean] = js.undefined
}

object CreateTemplateOptions {
  @scala.inline
  def apply(
    click_tracking: js.UndefOr[Boolean] = js.undefined,
    open_tracking: js.UndefOr[Boolean] = js.undefined,
    transactional: js.UndefOr[Boolean] = js.undefined
  ): CreateTemplateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(click_tracking)) __obj.updateDynamic("click_tracking")(click_tracking.asInstanceOf[js.Any])
    if (!js.isUndefined(open_tracking)) __obj.updateDynamic("open_tracking")(open_tracking.asInstanceOf[js.Any])
    if (!js.isUndefined(transactional)) __obj.updateDynamic("transactional")(transactional.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTemplateOptions]
  }
}

