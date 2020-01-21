package typings.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetOpts extends js.Object {
  /** Whether or not to merge the given value into the existing data or replace the existing data. Defaults to replacing the existing data (false). */
  var deep: js.UndefOr[Boolean] = js.undefined
  /** Whether or not to keep the template sturctures removed by this set around for future reinstatement. This can be used to avoid throwing away and recreating components when hiding them. Defaults to false. */
  var keep: js.UndefOr[Boolean] = js.undefined
  /** When applied to an array keypath, whether or not to move the existing elements and their associated template around or simply replace them. Defaults to replacement (false). */
  var shuffle: js.UndefOr[Shuffler] = js.undefined
}

object SetOpts {
  @scala.inline
  def apply(
    deep: js.UndefOr[Boolean] = js.undefined,
    keep: js.UndefOr[Boolean] = js.undefined,
    shuffle: Shuffler = null
  ): SetOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep.asInstanceOf[js.Any])
    if (!js.isUndefined(keep)) __obj.updateDynamic("keep")(keep.asInstanceOf[js.Any])
    if (shuffle != null) __obj.updateDynamic("shuffle")(shuffle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetOpts]
  }
}

