package typings.shrinkDashRay

import typings.shrinkDashRay.shrinkDashRayNumbers.`-1`
import typings.shrinkDashRay.shrinkDashRayNumbers.`0`
import typings.shrinkDashRay.shrinkDashRayNumbers.`1`
import typings.shrinkDashRay.shrinkDashRayNumbers.`2`
import typings.shrinkDashRay.shrinkDashRayNumbers.`3`
import typings.shrinkDashRay.shrinkDashRayNumbers.`4`
import typings.shrinkDashRay.shrinkDashRayNumbers.`5`
import typings.shrinkDashRay.shrinkDashRayNumbers.`6`
import typings.shrinkDashRay.shrinkDashRayNumbers.`7`
import typings.shrinkDashRay.shrinkDashRayNumbers.`8`
import typings.shrinkDashRay.shrinkDashRayNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0 extends js.Object {
  /** default: 16*1024 */
  var chunkSize: js.UndefOr[Double] = js.undefined
  /** deflate/inflate only, empty dictionary by default */
  var dictionary: js.UndefOr[js.Any] = js.undefined
  /** default: zlib.constants.Z_FINISH */
  var finishFlush: js.UndefOr[Double] = js.undefined
  /** default: zlib.constants.Z_NO_FLUSH */
  var flush: js.UndefOr[Double] = js.undefined
  /** compression only */
  var level: `-1` | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`
  /** compression only */
  var memLevel: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`
  /** compression only */
  var strategy: js.UndefOr[Double] = js.undefined
  var windowBits: js.UndefOr[Double] = js.undefined
}

object Anon_0 {
  @scala.inline
  def apply(
    level: `-1` | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`,
    memLevel: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`,
    chunkSize: Int | Double = null,
    dictionary: js.Any = null,
    finishFlush: Int | Double = null,
    flush: Int | Double = null,
    strategy: Int | Double = null,
    windowBits: Int | Double = null
  ): Anon_0 = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], memLevel = memLevel.asInstanceOf[js.Any])
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize.asInstanceOf[js.Any])
    if (dictionary != null) __obj.updateDynamic("dictionary")(dictionary)
    if (finishFlush != null) __obj.updateDynamic("finishFlush")(finishFlush.asInstanceOf[js.Any])
    if (flush != null) __obj.updateDynamic("flush")(flush.asInstanceOf[js.Any])
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    if (windowBits != null) __obj.updateDynamic("windowBits")(windowBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_0]
  }
}

