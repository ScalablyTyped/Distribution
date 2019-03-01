package typings
package requestLib.requestMod.requestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UriOptions extends RequiredUriUrl {
  var uri: java.lang.String | nodeLib.urlMod.Url
}

object UriOptions {
  @scala.inline
  def apply(uri: java.lang.String | nodeLib.urlMod.Url): UriOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[UriOptions]
  }
}

