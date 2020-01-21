package typings.pusherJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Member[T] extends js.Object {
  var id: String
  var info: T
}

object Member {
  @scala.inline
  def apply[T](id: String, info: T): Member[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Member[T]]
  }
}

