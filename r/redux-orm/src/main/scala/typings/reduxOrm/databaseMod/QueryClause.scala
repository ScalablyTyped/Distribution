package typings.reduxOrm.databaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryClause[Payload /* <: js.Object */] extends js.Object {
  var payload: Payload
  var `type`: QueryType
}

object QueryClause {
  @scala.inline
  def apply[Payload](payload: Payload, `type`: QueryType): QueryClause[Payload] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryClause[Payload]]
  }
}

