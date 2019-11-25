package typings.steamDashLogin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Large extends js.Object {
  var large: String
  var medium: String
  var small: String
}

object Anon_Large {
  @scala.inline
  def apply(large: String, medium: String, small: String): Anon_Large = {
    val __obj = js.Dynamic.literal(large = large.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Large]
  }
}

