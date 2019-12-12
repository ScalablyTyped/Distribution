package typings.sequelize.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Where Complex nested query
  */
@js.native
trait WhereNested extends js.Object {
  @JSName("$and")
  var $and: js.Array[AnyWhereOptions | WhereLogic] = js.native
  @JSName("$or")
  var $or: js.Array[AnyWhereOptions | WhereLogic] = js.native
}

