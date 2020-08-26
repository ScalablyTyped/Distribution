package typings.qiniuJs.anon

import typings.qiniuJs.qiniuJsNumbers.`0`
import typings.qiniuJs.qiniuJsNumbers.`1`
import typings.qiniuJs.qiniuJsNumbers.`2`
import typings.qiniuJs.qiniuJsNumbers.`3`
import typings.qiniuJs.qiniuJsNumbers.`4`
import typings.qiniuJs.qiniuJsNumbers.`5`
import typings.qiniuJs.qiniuJsStrings.gif
import typings.qiniuJs.qiniuJsStrings.jpg
import typings.qiniuJs.qiniuJsStrings.png
import typings.qiniuJs.qiniuJsStrings.webp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<qiniu-js.qiniu-js.ImageView2Options> */
@js.native
trait PartialImageView2Options extends js.Object {
  var format: js.UndefOr[jpg | gif | png | webp | String] = js.native
  var h: js.UndefOr[Double] = js.native
  var mode: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5`] = js.native
  var q: js.UndefOr[Double] = js.native
  var w: js.UndefOr[Double] = js.native
}

object PartialImageView2Options {
  @scala.inline
  def apply(): PartialImageView2Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialImageView2Options]
  }
  @scala.inline
  implicit class PartialImageView2OptionsOps[Self <: PartialImageView2Options] (val x: Self) extends AnyVal {
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
    def setFormat(value: jpg | gif | png | webp | String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setH(value: Double): Self = this.set("h", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteH: Self = this.set("h", js.undefined)
    @scala.inline
    def setMode(value: `0` | `1` | `2` | `3` | `4` | `5`): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setQ(value: Double): Self = this.set("q", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQ: Self = this.set("q", js.undefined)
    @scala.inline
    def setW(value: Double): Self = this.set("w", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteW: Self = this.set("w", js.undefined)
  }
  
}

