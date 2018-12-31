package typings
package sequelizeLib.sequelizeMod.sequelizeNs

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

