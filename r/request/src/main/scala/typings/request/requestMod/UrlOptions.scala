package typings.request.requestMod

import typings.node.urlMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlOptions extends RequiredUriUrl {
  var url: String | Url
}

object UrlOptions {
  @scala.inline
  def apply(url: String | Url): UrlOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UrlOptions]
  }
}

