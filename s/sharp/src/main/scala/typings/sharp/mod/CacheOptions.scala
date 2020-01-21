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
  def apply(files: Int | Double = null, items: Int | Double = null, memory: Int | Double = null): CacheOptions = {
    val __obj = js.Dynamic.literal()
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (memory != null) __obj.updateDynamic("memory")(memory.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheOptions]
  }
}

