package typings.simperium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ghost[T] extends js.Object {
  var data: T = js.native
  var key: EntityId = js.native
  var version: Double = js.native
}

object Ghost {
  @scala.inline
  def apply[T](data: T, key: EntityId, version: Double): Ghost[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ghost[T]]
  }
  @scala.inline
  implicit class GhostOps[Self <: Ghost[_], T] (val x: Self with Ghost[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setData(value: T): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: EntityId): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

