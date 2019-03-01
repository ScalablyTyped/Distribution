package typings
package shrinkDashRayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0 extends js.Object {
  /** default: 16*1024 */
  var chunkSize: js.UndefOr[scala.Double] = js.undefined
  /** deflate/inflate only, empty dictionary by default */
  var dictionary: js.UndefOr[js.Any] = js.undefined
  /** default: zlib.constants.Z_FINISH */
  var finishFlush: js.UndefOr[scala.Double] = js.undefined
  /** default: zlib.constants.Z_NO_FLUSH */
  var flush: js.UndefOr[scala.Double] = js.undefined
  /** compression only */
  var level: shrinkDashRayLib.shrinkDashRayLibNumbers.`-1` | shrinkDashRayLib.shrinkDashRayLibNumbers.`0` | shrinkDashRayLib.shrinkDashRayLibNumbers.`1` | shrinkDashRayLib.shrinkDashRayLibNumbers.`2` | shrinkDashRayLib.shrinkDashRayLibNumbers.`3` | shrinkDashRayLib.shrinkDashRayLibNumbers.`4` | shrinkDashRayLib.shrinkDashRayLibNumbers.`5` | shrinkDashRayLib.shrinkDashRayLibNumbers.`6` | shrinkDashRayLib.shrinkDashRayLibNumbers.`7` | shrinkDashRayLib.shrinkDashRayLibNumbers.`8` | shrinkDashRayLib.shrinkDashRayLibNumbers.`9`
  /** compression only */
  var memLevel: shrinkDashRayLib.shrinkDashRayLibNumbers.`1` | shrinkDashRayLib.shrinkDashRayLibNumbers.`2` | shrinkDashRayLib.shrinkDashRayLibNumbers.`3` | shrinkDashRayLib.shrinkDashRayLibNumbers.`4` | shrinkDashRayLib.shrinkDashRayLibNumbers.`5` | shrinkDashRayLib.shrinkDashRayLibNumbers.`6` | shrinkDashRayLib.shrinkDashRayLibNumbers.`7` | shrinkDashRayLib.shrinkDashRayLibNumbers.`8` | shrinkDashRayLib.shrinkDashRayLibNumbers.`9`
  /** compression only */
  var strategy: js.UndefOr[scala.Double] = js.undefined
  var windowBits: js.UndefOr[scala.Double] = js.undefined
}

object Anon_0 {
  @scala.inline
  def apply(
    level: shrinkDashRayLib.shrinkDashRayLibNumbers.`-1` | shrinkDashRayLib.shrinkDashRayLibNumbers.`0` | shrinkDashRayLib.shrinkDashRayLibNumbers.`1` | shrinkDashRayLib.shrinkDashRayLibNumbers.`2` | shrinkDashRayLib.shrinkDashRayLibNumbers.`3` | shrinkDashRayLib.shrinkDashRayLibNumbers.`4` | shrinkDashRayLib.shrinkDashRayLibNumbers.`5` | shrinkDashRayLib.shrinkDashRayLibNumbers.`6` | shrinkDashRayLib.shrinkDashRayLibNumbers.`7` | shrinkDashRayLib.shrinkDashRayLibNumbers.`8` | shrinkDashRayLib.shrinkDashRayLibNumbers.`9`,
    memLevel: shrinkDashRayLib.shrinkDashRayLibNumbers.`1` | shrinkDashRayLib.shrinkDashRayLibNumbers.`2` | shrinkDashRayLib.shrinkDashRayLibNumbers.`3` | shrinkDashRayLib.shrinkDashRayLibNumbers.`4` | shrinkDashRayLib.shrinkDashRayLibNumbers.`5` | shrinkDashRayLib.shrinkDashRayLibNumbers.`6` | shrinkDashRayLib.shrinkDashRayLibNumbers.`7` | shrinkDashRayLib.shrinkDashRayLibNumbers.`8` | shrinkDashRayLib.shrinkDashRayLibNumbers.`9`,
    chunkSize: scala.Int | scala.Double = null,
    dictionary: js.Any = null,
    finishFlush: scala.Int | scala.Double = null,
    flush: scala.Int | scala.Double = null,
    strategy: scala.Int | scala.Double = null,
    windowBits: scala.Int | scala.Double = null
  ): Anon_0 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.updateDynamic("memLevel")(memLevel.asInstanceOf[js.Any])
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize.asInstanceOf[js.Any])
    if (dictionary != null) __obj.updateDynamic("dictionary")(dictionary)
    if (finishFlush != null) __obj.updateDynamic("finishFlush")(finishFlush.asInstanceOf[js.Any])
    if (flush != null) __obj.updateDynamic("flush")(flush.asInstanceOf[js.Any])
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    if (windowBits != null) __obj.updateDynamic("windowBits")(windowBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_0]
  }
}

