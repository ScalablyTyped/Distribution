package typings.reactNativeRssParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmail extends js.Object {
  var email: String
  var name: String
}

object AnonEmail {
  @scala.inline
  def apply(email: String, name: String): AnonEmail = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmail]
  }
}

