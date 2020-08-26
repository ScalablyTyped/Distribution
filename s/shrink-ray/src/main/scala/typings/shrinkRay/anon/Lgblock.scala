package typings.shrinkRay.anon

import typings.shrinkRay.shrinkRayNumbers.`0`
import typings.shrinkRay.shrinkRayNumbers.`10`
import typings.shrinkRay.shrinkRayNumbers.`11`
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

@js.native
trait Lgblock extends js.Object {
  var lgblock: Double = js.native
  var lgwin: Double = js.native
  var mode: `0` | `1` | `2` = js.native
  var quality: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` = js.native
}

object Lgblock {
  @scala.inline
  def apply(
    lgblock: Double,
    lgwin: Double,
    mode: `0` | `1` | `2`,
    quality: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11`
  ): Lgblock = {
    val __obj = js.Dynamic.literal(lgblock = lgblock.asInstanceOf[js.Any], lgwin = lgwin.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lgblock]
  }
  @scala.inline
  implicit class LgblockOps[Self <: Lgblock] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLgblock(value: Double): Self = this.set("lgblock", value.asInstanceOf[js.Any])
    @scala.inline
    def setLgwin(value: Double): Self = this.set("lgwin", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: `0` | `1` | `2`): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuality(value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11`): Self = this.set("quality", value.asInstanceOf[js.Any])
  }
  
}

