package typings.reduxOrm.databaseMod

import typings.reduxOrm.ormMod.IndexedModelClasses
import typings.reduxOrm.ormMod.OrmState
import typings.std.Extract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateResult[I /* <: IndexedModelClasses[
_, 
Extract[
  /* keyof any */ String, 
  /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
]] */, Payload /* <: js.Object */] extends js.Object {
  var payload: Payload
  var state: OrmState[I]
  var status: UpdateStatus
}

object UpdateResult {
  @scala.inline
  def apply[I, Payload](payload: Payload, state: OrmState[I], status: UpdateStatus): UpdateResult[I, Payload] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResult[I, Payload]]
  }
}

