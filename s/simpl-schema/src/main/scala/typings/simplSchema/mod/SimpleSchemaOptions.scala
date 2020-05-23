package typings.simplSchema.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleSchemaOptions extends js.Object {
  var check: js.UndefOr[Boolean] = js.undefined
  var clean: js.UndefOr[CleanOption] = js.undefined
  var defaultLabel: js.UndefOr[String] = js.undefined
  var humanizeAutoLabels: js.UndefOr[Boolean] = js.undefined
  var requiredByDefault: js.UndefOr[Boolean] = js.undefined
  var tracker: js.UndefOr[js.Any] = js.undefined
}

object SimpleSchemaOptions {
  @scala.inline
  def apply(
    check: js.UndefOr[Boolean] = js.undefined,
    clean: CleanOption = null,
    defaultLabel: String = null,
    humanizeAutoLabels: js.UndefOr[Boolean] = js.undefined,
    requiredByDefault: js.UndefOr[Boolean] = js.undefined,
    tracker: js.Any = null
  ): SimpleSchemaOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(check)) __obj.updateDynamic("check")(check.get.asInstanceOf[js.Any])
    if (clean != null) __obj.updateDynamic("clean")(clean.asInstanceOf[js.Any])
    if (defaultLabel != null) __obj.updateDynamic("defaultLabel")(defaultLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(humanizeAutoLabels)) __obj.updateDynamic("humanizeAutoLabels")(humanizeAutoLabels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requiredByDefault)) __obj.updateDynamic("requiredByDefault")(requiredByDefault.get.asInstanceOf[js.Any])
    if (tracker != null) __obj.updateDynamic("tracker")(tracker.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleSchemaOptions]
  }
}

