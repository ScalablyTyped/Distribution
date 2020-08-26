package typings.reduxFirstRouter.mod

import typings.reduxFirstRouter.anon.NotFoundPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReceivedActionMeta extends js.Object {
  var meta: NotFoundPath = js.native
  var navKey: js.UndefOr[Nullable[String]] = js.native
  var payload: Payload = js.native
  var query: js.UndefOr[Query] = js.native
  var `type`: String = js.native
}

object ReceivedActionMeta {
  @scala.inline
  def apply(meta: NotFoundPath, payload: Payload, `type`: String): ReceivedActionMeta = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceivedActionMeta]
  }
  @scala.inline
  implicit class ReceivedActionMetaOps[Self <: ReceivedActionMeta] (val x: Self) extends AnyVal {
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
    def setMeta(value: NotFoundPath): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayload(value: Payload): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setNavKey(value: Nullable[String]): Self = this.set("navKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavKey: Self = this.set("navKey", js.undefined)
    @scala.inline
    def setNavKeyNull: Self = this.set("navKey", null)
    @scala.inline
    def setQuery(value: Query): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
  }
  
}

