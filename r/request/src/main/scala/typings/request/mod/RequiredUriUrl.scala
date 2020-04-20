package typings.request.mod

import typings.node.urlMod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.request.mod.UriOptions
  - typings.request.mod.UrlOptions
*/
trait RequiredUriUrl extends js.Object

object RequiredUriUrl {
  @scala.inline
  def UriOptions(uri: String | Url): RequiredUriUrl = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredUriUrl]
  }
  @scala.inline
  def UrlOptions(url: String | Url): RequiredUriUrl = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredUriUrl]
  }
}

