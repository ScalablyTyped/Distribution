package typings.rollup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeshakingOptions extends js.Object {
  var annotations: js.UndefOr[Boolean] = js.undefined
  var moduleSideEffects: js.UndefOr[ModuleSideEffectsOption] = js.undefined
  var propertyReadSideEffects: js.UndefOr[Boolean] = js.undefined
  /** @deprecated Use `moduleSideEffects` instead */
  var pureExternalModules: js.UndefOr[PureModulesOption] = js.undefined
  var tryCatchDeoptimization: js.UndefOr[Boolean] = js.undefined
  var unknownGlobalSideEffects: js.UndefOr[Boolean] = js.undefined
}

object TreeshakingOptions {
  @scala.inline
  def apply(
    annotations: js.UndefOr[Boolean] = js.undefined,
    moduleSideEffects: ModuleSideEffectsOption = null,
    propertyReadSideEffects: js.UndefOr[Boolean] = js.undefined,
    pureExternalModules: PureModulesOption = null,
    tryCatchDeoptimization: js.UndefOr[Boolean] = js.undefined,
    unknownGlobalSideEffects: js.UndefOr[Boolean] = js.undefined
  ): TreeshakingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(annotations)) __obj.updateDynamic("annotations")(annotations.asInstanceOf[js.Any])
    if (moduleSideEffects != null) __obj.updateDynamic("moduleSideEffects")(moduleSideEffects.asInstanceOf[js.Any])
    if (!js.isUndefined(propertyReadSideEffects)) __obj.updateDynamic("propertyReadSideEffects")(propertyReadSideEffects.asInstanceOf[js.Any])
    if (pureExternalModules != null) __obj.updateDynamic("pureExternalModules")(pureExternalModules.asInstanceOf[js.Any])
    if (!js.isUndefined(tryCatchDeoptimization)) __obj.updateDynamic("tryCatchDeoptimization")(tryCatchDeoptimization.asInstanceOf[js.Any])
    if (!js.isUndefined(unknownGlobalSideEffects)) __obj.updateDynamic("unknownGlobalSideEffects")(unknownGlobalSideEffects.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeshakingOptions]
  }
}

