package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataId extends js.Object {
  var data: String
  var id: Double
  var username: String
}

object Anon_DataId {
  @scala.inline
  def apply(data: String, id: Double, username: String): Anon_DataId = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DataId]
  }
}

