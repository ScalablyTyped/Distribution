package typings.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetcherOptions extends js.Object {
  /** A download host to be used. Defaults to `https://storage.googleapis.com`. */
  var host: js.UndefOr[String] = js.native
  /** A path for the downloads folder. Defaults to `<root>/.local-chromium`, where `<root>` is puppeteer's package root. */
  var path: js.UndefOr[String] = js.native
  /** Possible values are: `mac`, `win32`, `win64`, `linux`. Defaults to the current platform. */
  var platform: js.UndefOr[Platform] = js.native
  /**
    * @default 'chrome'
    */
  var product: js.UndefOr[Product] = js.native
}

object FetcherOptions {
  @scala.inline
  def apply(): FetcherOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetcherOptions]
  }
  @scala.inline
  implicit class FetcherOptionsOps[Self <: FetcherOptions] (val x: Self) extends AnyVal {
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
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setPlatform(value: Platform): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    @scala.inline
    def setProduct(value: Product): Self = this.set("product", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProduct: Self = this.set("product", js.undefined)
  }
  
}

