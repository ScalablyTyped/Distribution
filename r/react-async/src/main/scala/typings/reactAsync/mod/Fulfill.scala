package typings.reactAsync.mod

import typings.reactAsync.anon.Dictmeta
import typings.reactAsync.reactAsyncStrings.fulfill
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-async.react-async.AbstractAction & {  type :'fulfill',   payload :T} */
@js.native
trait Fulfill[T] extends AsyncAction[T] {
  var meta: Dictmeta = js.native
  var payload: T = js.native
  var `type`: String with fulfill = js.native
}

object Fulfill {
  @scala.inline
  def apply[T](meta: Dictmeta, payload: T, `type`: String with fulfill): Fulfill[T] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fulfill[T]]
  }
  @scala.inline
  implicit class FulfillOps[Self <: Fulfill[_], T] (val x: Self with Fulfill[T]) extends AnyVal {
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
    def setMeta(value: Dictmeta): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayload(value: T): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String with fulfill): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

