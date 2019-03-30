package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeshakingOptions extends js.Object {
  var annotations: js.UndefOr[scala.Boolean] = js.undefined
  var propertyReadSideEffects: js.UndefOr[scala.Boolean] = js.undefined
  var pureExternalModules: js.UndefOr[scala.Boolean] = js.undefined
}

object TreeshakingOptions {
  @scala.inline
  def apply(
    annotations: js.UndefOr[scala.Boolean] = js.undefined,
    propertyReadSideEffects: js.UndefOr[scala.Boolean] = js.undefined,
    pureExternalModules: js.UndefOr[scala.Boolean] = js.undefined
  ): TreeshakingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(annotations)) __obj.updateDynamic("annotations")(annotations)
    if (!js.isUndefined(propertyReadSideEffects)) __obj.updateDynamic("propertyReadSideEffects")(propertyReadSideEffects)
    if (!js.isUndefined(pureExternalModules)) __obj.updateDynamic("pureExternalModules")(pureExternalModules)
    __obj.asInstanceOf[TreeshakingOptions]
  }
}

