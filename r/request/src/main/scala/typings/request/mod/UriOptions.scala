package typings.request.mod

import typings.node.urlMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UriOptions extends RequiredUriUrl {
  var uri: String | Url = js.native
}

object UriOptions {
  @scala.inline
  def apply(uri: String | Url): UriOptions = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[UriOptions]
  }
  @scala.inline
  implicit class UriOptionsOps[Self <: UriOptions] (val x: Self) extends AnyVal {
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
    def setUri(value: String | Url): Self = this.set("uri", value.asInstanceOf[js.Any])
  }
  
}

