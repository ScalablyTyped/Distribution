package typings
package requestLib.requestMod.requestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlOptions extends RequiredUriUrl {
  var url: java.lang.String | nodeLib.urlMod.Url
}

object UrlOptions {
  @scala.inline
  def apply(url: java.lang.String | nodeLib.urlMod.Url): UrlOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UrlOptions]
  }
}

