package typings.shrinkRay

import typings.shrinkRay.shrinkRayNumbers.`-1`
import typings.shrinkRay.shrinkRayNumbers.`0`
import typings.shrinkRay.shrinkRayNumbers.`1`
import typings.shrinkRay.shrinkRayNumbers.`2`
import typings.shrinkRay.shrinkRayNumbers.`3`
import typings.shrinkRay.shrinkRayNumbers.`4`
import typings.shrinkRay.shrinkRayNumbers.`5`
import typings.shrinkRay.shrinkRayNumbers.`6`
import typings.shrinkRay.shrinkRayNumbers.`7`
import typings.shrinkRay.shrinkRayNumbers.`8`
import typings.shrinkRay.shrinkRayNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  flush ? :number,   finishFlush ? :number,   chunkSize ? :number,   windowBits ? :number,   strategy ? :number,   dictionary ? :any,   level  :-1 | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9,   memLevel  :1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9}> */
trait PartialflushnumberfinishF extends js.Object {
  var chunkSize: js.UndefOr[Double] = js.undefined
  var dictionary: js.UndefOr[js.Any] = js.undefined
  var finishFlush: js.UndefOr[Double] = js.undefined
  var flush: js.UndefOr[Double] = js.undefined
  var level: js.UndefOr[`-1` | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`] = js.undefined
  var memLevel: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`] = js.undefined
  var strategy: js.UndefOr[Double] = js.undefined
  var windowBits: js.UndefOr[Double] = js.undefined
}

object PartialflushnumberfinishF {
  @scala.inline
  def apply(
    chunkSize: Int | Double = null,
    dictionary: js.Any = null,
    finishFlush: Int | Double = null,
    flush: Int | Double = null,
    level: `-1` | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` = null,
    memLevel: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` = null,
    strategy: Int | Double = null,
    windowBits: Int | Double = null
  ): PartialflushnumberfinishF = {
    val __obj = js.Dynamic.literal()
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize.asInstanceOf[js.Any])
    if (dictionary != null) __obj.updateDynamic("dictionary")(dictionary.asInstanceOf[js.Any])
    if (finishFlush != null) __obj.updateDynamic("finishFlush")(finishFlush.asInstanceOf[js.Any])
    if (flush != null) __obj.updateDynamic("flush")(flush.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (memLevel != null) __obj.updateDynamic("memLevel")(memLevel.asInstanceOf[js.Any])
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    if (windowBits != null) __obj.updateDynamic("windowBits")(windowBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialflushnumberfinishF]
  }
}

