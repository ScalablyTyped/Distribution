package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Owner extends js.Object {
  /**
    * The name of the owner user.
    */
  var username: String
}

object Owner {
  @scala.inline
  def apply(username: String): Owner = {
    val __obj = js.Dynamic.literal(username = username)
  
    __obj.asInstanceOf[Owner]
  }
}

