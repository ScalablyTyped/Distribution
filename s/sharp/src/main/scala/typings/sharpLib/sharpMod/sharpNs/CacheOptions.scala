package typings
package sharpLib.sharpMod.sharpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheOptions extends js.Object {
  /** Is the maximum number of files to hold open (optional, default 20) */
  var files: js.UndefOr[scala.Double] = js.undefined
  /** Is the maximum number of operations to cache (optional, default 100) */
  var items: js.UndefOr[scala.Double] = js.undefined
  /** Is the maximum memory in MB to use for this cache (optional, default 50) */
  var memory: js.UndefOr[scala.Double] = js.undefined
}

