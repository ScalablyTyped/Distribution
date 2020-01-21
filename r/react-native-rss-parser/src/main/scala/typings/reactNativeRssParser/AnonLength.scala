package typings.reactNativeRssParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLength extends js.Object {
  var length: String
  var mimeType: String
  var url: String
}

object AnonLength {
  @scala.inline
  def apply(length: String, mimeType: String, url: String): AnonLength = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLength]
  }
}

