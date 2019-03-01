package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchPathOptions extends js.Object {
  /**
    * An optional parameter to specify the schema search_path (Postgres only)
    */
  var searchPath: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Transaction to run query under
    */
  var transaction: js.UndefOr[Transaction] = js.undefined
}

object SearchPathOptions {
  @scala.inline
  def apply(searchPath: java.lang.String = null, transaction: Transaction = null): SearchPathOptions = {
    val __obj = js.Dynamic.literal()
    if (searchPath != null) __obj.updateDynamic("searchPath")(searchPath)
    if (transaction != null) __obj.updateDynamic("transaction")(transaction)
    __obj.asInstanceOf[SearchPathOptions]
  }
}

