package typings.socketIoEmitter.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<'broadcast' | 'json' | 'volatile', boolean | undefined> */
@js.native
trait Recordbroadcastjsonvolati extends js.Object {
  var broadcast: js.UndefOr[Boolean] = js.native
  var json: js.UndefOr[Boolean] = js.native
  var volatile: js.UndefOr[Boolean] = js.native
}

object Recordbroadcastjsonvolati {
  @scala.inline
  def apply(): Recordbroadcastjsonvolati = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Recordbroadcastjsonvolati]
  }
  @scala.inline
  implicit class RecordbroadcastjsonvolatiOps[Self <: Recordbroadcastjsonvolati] (val x: Self) extends AnyVal {
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
    def setBroadcast(value: Boolean): Self = this.set("broadcast", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBroadcast: Self = this.set("broadcast", js.undefined)
    @scala.inline
    def setJson(value: Boolean): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
    @scala.inline
    def setVolatile(value: Boolean): Self = this.set("volatile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolatile: Self = this.set("volatile", js.undefined)
  }
  
}

