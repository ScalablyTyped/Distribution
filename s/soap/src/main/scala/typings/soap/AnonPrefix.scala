package typings.soap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrefix extends js.Object {
  var name: String
  var prefix: String
}

object AnonPrefix {
  @scala.inline
  def apply(name: String, prefix: String): AnonPrefix = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPrefix]
  }
}

