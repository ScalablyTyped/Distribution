package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartialResolvedId extends _ResolveIdResult {
  var external: js.UndefOr[scala.Boolean] = js.undefined
  var id: java.lang.String
  var moduleSideEffects: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
}

object PartialResolvedId {
  @scala.inline
  def apply(
    id: java.lang.String,
    external: js.UndefOr[scala.Boolean] = js.undefined,
    moduleSideEffects: js.UndefOr[scala.Boolean] = js.undefined
  ): PartialResolvedId = {
    val __obj = js.Dynamic.literal(id = id)
    if (!js.isUndefined(external)) __obj.updateDynamic("external")(external)
    if (!js.isUndefined(moduleSideEffects)) __obj.updateDynamic("moduleSideEffects")(moduleSideEffects)
    __obj.asInstanceOf[PartialResolvedId]
  }
}

