package typings.shrinkRay.anon

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

/* Inlined std.Partial<{  flush :number | undefined,   finishFlush :number | undefined,   chunkSize :number | undefined,   windowBits :number | undefined,   strategy :number | undefined,   dictionary :any | undefined,   level :-1 | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9,   memLevel :1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9}> */
@js.native
trait Partialflushnumberundefin extends js.Object {
  var chunkSize: js.UndefOr[Double] = js.native
  var dictionary: js.UndefOr[js.Any] = js.native
  var finishFlush: js.UndefOr[Double] = js.native
  var flush: js.UndefOr[Double] = js.native
  var level: js.UndefOr[`-1` | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`] = js.native
  var memLevel: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`] = js.native
  var strategy: js.UndefOr[Double] = js.native
  var windowBits: js.UndefOr[Double] = js.native
}

object Partialflushnumberundefin {
  @scala.inline
  def apply(): Partialflushnumberundefin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialflushnumberundefin]
  }
  @scala.inline
  implicit class PartialflushnumberundefinOps[Self <: Partialflushnumberundefin] (val x: Self) extends AnyVal {
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
    def setChunkSize(value: Double): Self = this.set("chunkSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChunkSize: Self = this.set("chunkSize", js.undefined)
    @scala.inline
    def setDictionary(value: js.Any): Self = this.set("dictionary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDictionary: Self = this.set("dictionary", js.undefined)
    @scala.inline
    def setFinishFlush(value: Double): Self = this.set("finishFlush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinishFlush: Self = this.set("finishFlush", js.undefined)
    @scala.inline
    def setFlush(value: Double): Self = this.set("flush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlush: Self = this.set("flush", js.undefined)
    @scala.inline
    def setLevel(value: `-1` | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    @scala.inline
    def setMemLevel(value: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`): Self = this.set("memLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemLevel: Self = this.set("memLevel", js.undefined)
    @scala.inline
    def setStrategy(value: Double): Self = this.set("strategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrategy: Self = this.set("strategy", js.undefined)
    @scala.inline
    def setWindowBits(value: Double): Self = this.set("windowBits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowBits: Self = this.set("windowBits", js.undefined)
  }
  
}

