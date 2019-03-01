package typings
package pusherDashJsLib.pusherDashJsMod.pusherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Member[T] extends js.Object {
  var id: java.lang.String
  var info: T
}

object Member {
  @scala.inline
  def apply[T](id: java.lang.String, info: T): Member[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    __obj.asInstanceOf[Member[T]]
  }
}

