package typings.sax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrefix extends js.Object {
  var prefix: String
  var uri: String
}

object AnonPrefix {
  @scala.inline
  def apply(prefix: String, uri: String): AnonPrefix = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPrefix]
  }
}

