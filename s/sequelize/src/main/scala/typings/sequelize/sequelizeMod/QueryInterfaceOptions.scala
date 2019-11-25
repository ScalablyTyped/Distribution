package typings.sequelize.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
//  Query Interface
// ~~~~~~~~~~~~~~~~~
//
//  https://github.com/sequelize/sequelize/blob/v3.4.1/lib/query-interface.js
//
/**
  * Most of the methods accept options and use only the logger property of the options. That's why the most used
  * interface type for options in a method is separated here as another interface.
  */
trait QueryInterfaceOptions extends js.Object {
  /**
    * A function that gets executed while running the query to log the sql.
    */
  var logging: js.UndefOr[Boolean | js.Function] = js.undefined
  /**
    * An optional transaction to perform this query in
    */
  var transaction: js.UndefOr[Transaction] = js.undefined
}

object QueryInterfaceOptions {
  @scala.inline
  def apply(logging: Boolean | js.Function = null, transaction: Transaction = null): QueryInterfaceOptions = {
    val __obj = js.Dynamic.literal()
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryInterfaceOptions]
  }
}

