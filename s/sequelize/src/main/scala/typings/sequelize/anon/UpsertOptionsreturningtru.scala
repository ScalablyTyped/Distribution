package typings.sequelize.anon

import typings.sequelize.mod.Transaction
import typings.sequelize.sequelizeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined sequelize.sequelize.UpsertOptions & {  returning  :true} */
trait UpsertOptionsreturningtru extends js.Object {
  /**
    * Print query execution time in milliseconds when logging SQL.
    */
  var benchmark: js.UndefOr[Boolean] = js.undefined
  /**
    * The fields to insert / update. Defaults to all fields
    */
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * A function that gets executed while running the query to log the sql.
    */
  var logging: js.UndefOr[Boolean | js.Function] = js.undefined
  /**
    * Append RETURNING * to get back auto generated values (Postgres only)
    */
  var returning: js.UndefOr[Boolean with `true`] = js.undefined
  /**
    * An optional parameter to specify the schema search_path (Postgres only)
    */
  var searchPath: js.UndefOr[String] = js.undefined
  /**
    * Transaction to run query under
    */
  var transaction: js.UndefOr[Transaction] = js.undefined
  /**
    * Run validations before the row is inserted
    */
  var validate: js.UndefOr[Boolean] = js.undefined
}

object UpsertOptionsreturningtru {
  @scala.inline
  def apply(
    benchmark: js.UndefOr[Boolean] = js.undefined,
    fields: js.Array[String] = null,
    logging: Boolean | js.Function = null,
    returning: js.UndefOr[Boolean with `true`] = js.undefined,
    searchPath: String = null,
    transaction: Transaction = null,
    validate: js.UndefOr[Boolean] = js.undefined
  ): UpsertOptionsreturningtru = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(benchmark)) __obj.updateDynamic("benchmark")(benchmark.get.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (!js.isUndefined(returning)) __obj.updateDynamic("returning")(returning.get.asInstanceOf[js.Any])
    if (searchPath != null) __obj.updateDynamic("searchPath")(searchPath.asInstanceOf[js.Any])
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpsertOptionsreturningtru]
  }
}

