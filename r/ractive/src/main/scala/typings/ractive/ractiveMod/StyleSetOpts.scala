package typings.ractive.ractiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleSetOpts extends SetOpts {
  /** Whether or not to apply the new styles immediately. Defaults to updating the Ractive-managed style tag (true) */
  @JSName("apply")
  var apply: js.UndefOr[Boolean] = js.undefined
}

object StyleSetOpts {
  @scala.inline
  def apply(
    apply: js.UndefOr[Boolean] = js.undefined,
    deep: js.UndefOr[Boolean] = js.undefined,
    keep: js.UndefOr[Boolean] = js.undefined,
    shuffle: Shuffler = null
  ): StyleSetOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(apply)) __obj.updateDynamic("apply")(apply.asInstanceOf[js.Any])
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep.asInstanceOf[js.Any])
    if (!js.isUndefined(keep)) __obj.updateDynamic("keep")(keep.asInstanceOf[js.Any])
    if (shuffle != null) __obj.updateDynamic("shuffle")(shuffle.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleSetOpts]
  }
}

