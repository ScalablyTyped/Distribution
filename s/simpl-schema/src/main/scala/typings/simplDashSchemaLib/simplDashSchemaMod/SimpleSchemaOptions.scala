package typings
package simplDashSchemaLib.simplDashSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleSchemaOptions extends js.Object {
  var check: js.UndefOr[scala.Boolean] = js.undefined
  var clean: js.UndefOr[CleanOption] = js.undefined
  var defaultLabel: js.UndefOr[java.lang.String] = js.undefined
  var humanizeAutoLabels: js.UndefOr[scala.Boolean] = js.undefined
  var requiredByDefault: js.UndefOr[scala.Boolean] = js.undefined
  var tracker: js.UndefOr[js.Any] = js.undefined
}

object SimpleSchemaOptions {
  @scala.inline
  def apply(
    check: js.UndefOr[scala.Boolean] = js.undefined,
    clean: CleanOption = null,
    defaultLabel: java.lang.String = null,
    humanizeAutoLabels: js.UndefOr[scala.Boolean] = js.undefined,
    requiredByDefault: js.UndefOr[scala.Boolean] = js.undefined,
    tracker: js.Any = null
  ): SimpleSchemaOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(check)) __obj.updateDynamic("check")(check)
    if (clean != null) __obj.updateDynamic("clean")(clean)
    if (defaultLabel != null) __obj.updateDynamic("defaultLabel")(defaultLabel)
    if (!js.isUndefined(humanizeAutoLabels)) __obj.updateDynamic("humanizeAutoLabels")(humanizeAutoLabels)
    if (!js.isUndefined(requiredByDefault)) __obj.updateDynamic("requiredByDefault")(requiredByDefault)
    if (tracker != null) __obj.updateDynamic("tracker")(tracker)
    __obj.asInstanceOf[SimpleSchemaOptions]
  }
}

