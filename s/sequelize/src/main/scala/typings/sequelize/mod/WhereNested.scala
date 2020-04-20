package typings.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Where Complex nested query
  */
trait WhereNested extends js.Object {
  @JSName("$and")
  var $and: js.Array[AnyWhereOptions | WhereLogic]
  @JSName("$or")
  var $or: js.Array[AnyWhereOptions | WhereLogic]
}

object WhereNested {
  @scala.inline
  def apply($and: js.Array[AnyWhereOptions | WhereLogic], $or: js.Array[AnyWhereOptions | WhereLogic]): WhereNested = {
    val __obj = js.Dynamic.literal($and = $and.asInstanceOf[js.Any], $or = $or.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhereNested]
  }
}

