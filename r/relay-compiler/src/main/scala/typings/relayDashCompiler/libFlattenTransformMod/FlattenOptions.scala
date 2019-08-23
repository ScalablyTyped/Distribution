package typings.relayDashCompiler.libFlattenTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlattenOptions extends js.Object {
  var flattenAbstractTypes: js.UndefOr[Boolean] = js.undefined
}

object FlattenOptions {
  @scala.inline
  def apply(flattenAbstractTypes: js.UndefOr[Boolean] = js.undefined): FlattenOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(flattenAbstractTypes)) __obj.updateDynamic("flattenAbstractTypes")(flattenAbstractTypes)
    __obj.asInstanceOf[FlattenOptions]
  }
}

