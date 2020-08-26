package typings.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleTagOptions extends js.Object {
  /** Raw CSS content to be injected into frame. */
  var content: js.UndefOr[String] = js.native
  /** Path to the CSS file to be injected into frame. If `path` is a relative path, then it is resolved relative to current working directory. */
  var path: js.UndefOr[String] = js.native
  /** Url of the <link> tag. */
  var url: js.UndefOr[String] = js.native
}

object StyleTagOptions {
  @scala.inline
  def apply(): StyleTagOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleTagOptions]
  }
  @scala.inline
  implicit class StyleTagOptionsOps[Self <: StyleTagOptions] (val x: Self) extends AnyVal {
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

