package typings.reactNativeRssParser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Length extends js.Object {
  var length: String
  var mimeType: String
  var url: String
}

object Length {
  @scala.inline
  def apply(length: String, mimeType: String, url: String): Length = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Length]
  }
}

