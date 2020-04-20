package typings.request.mod

import typings.node.urlMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UriOptions extends RequiredUriUrl {
  var uri: String | Url
}

object UriOptions {
  @scala.inline
  def apply(uri: String | Url): UriOptions = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[UriOptions]
  }
}

