package typings.rollup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartialResolvedId extends _ResolveIdResult {
  var external: js.UndefOr[Boolean] = js.undefined
  var id: String
  var moduleSideEffects: js.UndefOr[Boolean | Null] = js.undefined
  var syntheticNamedExports: js.UndefOr[Boolean] = js.undefined
}

object PartialResolvedId {
  @scala.inline
  def apply(
    id: String,
    external: js.UndefOr[Boolean] = js.undefined,
    moduleSideEffects: js.UndefOr[Null | Boolean] = js.undefined,
    syntheticNamedExports: js.UndefOr[Boolean] = js.undefined
  ): PartialResolvedId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (!js.isUndefined(external)) __obj.updateDynamic("external")(external.get.asInstanceOf[js.Any])
    if (!js.isUndefined(moduleSideEffects)) __obj.updateDynamic("moduleSideEffects")(moduleSideEffects.asInstanceOf[js.Any])
    if (!js.isUndefined(syntheticNamedExports)) __obj.updateDynamic("syntheticNamedExports")(syntheticNamedExports.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialResolvedId]
  }
}

