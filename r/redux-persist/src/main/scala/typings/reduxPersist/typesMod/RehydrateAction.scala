package typings.reduxPersist.typesMod

import typings.reduxPersist.reduxPersistStrings.persistSlashREHYDRATE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RehydrateAction extends PersistorAction {
  var err: js.UndefOr[RehydrateErrorType | Null] = js.native
  var key: String = js.native
  var payload: js.UndefOr[js.Object | Null] = js.native
  var `type`: persistSlashREHYDRATE = js.native
}

object RehydrateAction {
  @scala.inline
  def apply(key: String, `type`: persistSlashREHYDRATE): RehydrateAction = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RehydrateAction]
  }
  @scala.inline
  implicit class RehydrateActionOps[Self <: RehydrateAction] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: persistSlashREHYDRATE): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setErr(value: RehydrateErrorType): Self = this.set("err", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErr: Self = this.set("err", js.undefined)
    @scala.inline
    def setErrNull: Self = this.set("err", null)
    @scala.inline
    def setPayload(value: js.Object): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    @scala.inline
    def setPayloadNull: Self = this.set("payload", null)
  }
  
}

