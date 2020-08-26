package typings.reactAsync.mod

import typings.reactAsync.anon.Dictmeta
import typings.reactAsync.reactAsyncStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-async.react-async.AbstractAction & {  type :'start', payload (): std.Promise<void>} */
@js.native
trait Start
  extends AsyncAction[js.Any] {
  var meta: Dictmeta = js.native
  var `type`: String with start = js.native
  def payload(): js.Promise[Unit] = js.native
}

object Start {
  @scala.inline
  def apply(meta: Dictmeta, payload: () => js.Promise[Unit], `type`: String with start): Start = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = js.Any.fromFunction0(payload))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Start]
  }
  @scala.inline
  implicit class StartOps[Self <: Start] (val x: Self) extends AnyVal {
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
    def setPayload(value: () => js.Promise[Unit]): Self = this.set("payload", js.Any.fromFunction0(value))
    @scala.inline
    def setType(value: String with start): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

