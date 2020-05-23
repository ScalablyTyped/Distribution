package typings.steamLogin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Large extends js.Object {
  var large: String
  var medium: String
  var small: String
}

object Large {
  @scala.inline
  def apply(large: String, medium: String, small: String): Large = {
    val __obj = js.Dynamic.literal(large = large.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any])
    __obj.asInstanceOf[Large]
  }
}

