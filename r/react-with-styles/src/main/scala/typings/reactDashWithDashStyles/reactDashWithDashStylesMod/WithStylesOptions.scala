package typings.reactDashWithDashStyles.reactDashWithDashStylesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithStylesOptions extends js.Object {
  var flushBefore: js.UndefOr[Boolean] = js.undefined
  var pureComponent: js.UndefOr[Boolean] = js.undefined
}

object WithStylesOptions {
  @scala.inline
  def apply(flushBefore: js.UndefOr[Boolean] = js.undefined, pureComponent: js.UndefOr[Boolean] = js.undefined): WithStylesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(flushBefore)) __obj.updateDynamic("flushBefore")(flushBefore)
    if (!js.isUndefined(pureComponent)) __obj.updateDynamic("pureComponent")(pureComponent)
    __obj.asInstanceOf[WithStylesOptions]
  }
}

