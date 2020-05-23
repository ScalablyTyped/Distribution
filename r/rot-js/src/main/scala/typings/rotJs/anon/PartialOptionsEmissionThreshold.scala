package typings.rotJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<rot-js.rot-js/lib/lighting.Options> */
trait PartialOptionsEmissionThreshold extends js.Object {
  var emissionThreshold: js.UndefOr[Double] = js.undefined
  var passes: js.UndefOr[Double] = js.undefined
  var range: js.UndefOr[Double] = js.undefined
}

object PartialOptionsEmissionThreshold {
  @scala.inline
  def apply(
    emissionThreshold: js.UndefOr[Double] = js.undefined,
    passes: js.UndefOr[Double] = js.undefined,
    range: js.UndefOr[Double] = js.undefined
  ): PartialOptionsEmissionThreshold = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(emissionThreshold)) __obj.updateDynamic("emissionThreshold")(emissionThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passes)) __obj.updateDynamic("passes")(passes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptionsEmissionThreshold]
  }
}

