package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
//  Instance
// ~~~~~~~~~~
//
//  https://github.com/sequelize/sequelize/blob/v3.4.1/lib/instance.js
//
/**
  * Options used for Instance.increment method
  */
trait InstanceIncrementDecrementOptions extends js.Object {
  /**
    * The number to increment by
    *
    * Defaults to 1
    */
  var by: js.UndefOr[scala.Double] = js.undefined
  /**
    * A function that gets executed while running the query to log the sql.
    */
  var logging: js.UndefOr[scala.Boolean | js.Function] = js.undefined
  /**
    * Transaction to run query under
    */
  var transaction: js.UndefOr[Transaction] = js.undefined
  /**
    * A hash of attributes to describe your search. See above for examples.
    */
  var where: js.UndefOr[AnyWhereOptions | (js.Array[col | and | or | java.lang.String])] = js.undefined
}

object InstanceIncrementDecrementOptions {
  @scala.inline
  def apply(
    by: scala.Int | scala.Double = null,
    logging: scala.Boolean | js.Function = null,
    transaction: Transaction = null,
    where: AnyWhereOptions | (js.Array[col | and | or | java.lang.String]) = null
  ): InstanceIncrementDecrementOptions = {
    val __obj = js.Dynamic.literal()
    if (by != null) __obj.updateDynamic("by")(by.asInstanceOf[js.Any])
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (transaction != null) __obj.updateDynamic("transaction")(transaction)
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceIncrementDecrementOptions]
  }
}

