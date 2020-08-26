package typings.puppeteer.mod

import typings.puppeteer.puppeteerStrings.binary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BinaryScreenShotOptions extends ScreenshotOptions {
  @JSName("encoding")
  var encoding_BinaryScreenShotOptions: js.UndefOr[binary] = js.native
}

object BinaryScreenShotOptions {
  @scala.inline
  def apply(): BinaryScreenShotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BinaryScreenShotOptions]
  }
  @scala.inline
  implicit class BinaryScreenShotOptionsOps[Self <: BinaryScreenShotOptions] (val x: Self) extends AnyVal {
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
    def setEncoding(value: binary): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
  }
  
}

