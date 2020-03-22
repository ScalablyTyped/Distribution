package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId extends js.Object {
  var data: String
  var id: Double
  var username: String
}

object AnonId {
  @scala.inline
  def apply(data: String, id: Double, username: String): AnonId = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonId]
  }
}

