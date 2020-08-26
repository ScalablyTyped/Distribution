package typings.reduxOrm.databaseMod

import typings.reduxOrm.ormMod.IndexedModelClasses
import typings.reduxOrm.ormMod.OrmState
import typings.std.Extract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateResult[I /* <: IndexedModelClasses[
_, 
Extract[
  /* keyof any */ String, 
  /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
]] */, Payload /* <: js.Object */] extends js.Object {
  var payload: Payload = js.native
  var state: OrmState[I] = js.native
  var status: UpdateStatus = js.native
}

object UpdateResult {
  @scala.inline
  def apply[/* <: typings.reduxOrm.ormMod.IndexedModelClasses[
  _, 
  typings.std.Extract[
    / * keyof any * / java.lang.String, 
    / * import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] * / js.Any
  ]] */ I, /* <: js.Object */ Payload](payload: Payload, state: OrmState[I], status: UpdateStatus): UpdateResult[I, Payload] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResult[I, Payload]]
  }
  @scala.inline
  implicit class UpdateResultOps[Self <: UpdateResult[_, _], /* <: typings.reduxOrm.ormMod.IndexedModelClasses[
  _, 
  typings.std.Extract[
    / * keyof any * / java.lang.String, 
    / * import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] * / js.Any
  ]] */ I, /* <: js.Object */ Payload] (val x: Self with (UpdateResult[I, Payload])) extends AnyVal {
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
    def setPayload(value: Payload): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: OrmState[I]): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: UpdateStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

