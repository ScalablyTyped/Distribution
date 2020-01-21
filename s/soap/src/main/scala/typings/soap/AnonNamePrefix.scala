package typings.soap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNamePrefix extends js.Object {
  var name: String
  var prefix: String
}

object AnonNamePrefix {
  @scala.inline
  def apply(name: String, prefix: String): AnonNamePrefix = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNamePrefix]
  }
}

