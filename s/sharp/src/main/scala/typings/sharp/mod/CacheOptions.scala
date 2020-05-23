package typings.sharp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheOptions extends js.Object {
  /** Is the maximum number of files to hold open (optional, default 20) */
  var files: js.UndefOr[Double] = js.undefined
  /** Is the maximum number of operations to cache (optional, default 100) */
  var items: js.UndefOr[Double] = js.undefined
  /** Is the maximum memory in MB to use for this cache (optional, default 50) */
  var memory: js.UndefOr[Double] = js.undefined
}

object CacheOptions {
  @scala.inline
  def apply(
    files: js.UndefOr[Double] = js.undefined,
    items: js.UndefOr[Double] = js.undefined,
    memory: js.UndefOr[Double] = js.undefined
  ): CacheOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(files)) __obj.updateDynamic("files")(files.get.asInstanceOf[js.Any])
    if (!js.isUndefined(items)) __obj.updateDynamic("items")(items.get.asInstanceOf[js.Any])
    if (!js.isUndefined(memory)) __obj.updateDynamic("memory")(memory.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheOptions]
  }
}

