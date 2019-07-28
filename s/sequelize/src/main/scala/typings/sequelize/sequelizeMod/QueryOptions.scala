package typings.sequelize.sequelizeMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for query options
  *
  * @see Options
  */
trait QueryOptions
  extends SearchPathOptions
     with ReturningOptions {
  /**
    * Either an object of named bind parameter in the format `$param` or an array of unnamed
    * bind parameter to replace `$1`, `$2`, ... in your SQL.
    */
  var bind: js.UndefOr[js.Object | js.Array[String]] = js.undefined
  // TODO: force, cascade
  var fieldMap: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * A sequelize instance used to build the return instance
    */
  var instance: js.UndefOr[Instance[_]] = js.undefined
  /**
    * A function that gets executed while running the query to log the sql.
    */
  var logging: js.UndefOr[Boolean | js.Function] = js.undefined
  /**
    * Map returned fields to model's fields if `options.model` or `options.instance` is present.
    * Mapping will occur before building the model instance.
    */
  var mapToModel: js.UndefOr[Boolean] = js.undefined
  /**
    * A sequelize model used to build the returned model instances (used to be called callee)
    */
  var model: js.UndefOr[Model[_, _, _]] = js.undefined
  /**
    * If true, transforms objects with `.` separated property names into nested objects using
    * [dottie.js](https://github.com/mickhansen/dottie.js). For example { 'user.username': 'john' } becomes
    * { user: { username: 'john' }}. When `nest` is true, the query type is assumed to be `'SELECT'`,
    * unless otherwise specified
    *
    * Defaults to false
    */
  var nest: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets the query type to `SELECT` and return a single row
    */
  var plain: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, sequelize will not try to format the results of the query, or build an instance of a model from
    * the result
    */
  var raw: js.UndefOr[Boolean] = js.undefined
  /**
    * Either an object of named parameter replacements in the format `:param` or an array of unnamed
    * replacements to replace `?` in your SQL.
    */
  var replacements: js.UndefOr[js.Object | js.Array[String]] = js.undefined
  /**
    * Set of flags that control when a query is automatically retried.
    */
  var retry: js.UndefOr[RetryOptions] = js.undefined
  /**
    * If false do not prepend the query with the search_path (Postgres only)
    */
  var supportsSearchPath: js.UndefOr[Boolean] = js.undefined
  /**
    * The type of query you are executing. The query type affects how results are formatted before they are
    * passed back. The type is a string, but `Sequelize.QueryTypes` is provided as convenience shortcuts.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * Force the query to use the write pool, regardless of the query type.
    *
    * Defaults to false
    */
  var useMaster: js.UndefOr[Boolean] = js.undefined
}

object QueryOptions {
  @scala.inline
  def apply(
    bind: js.Object | js.Array[String] = null,
    fieldMap: StringDictionary[String] = null,
    instance: Instance[_] = null,
    logging: Boolean | js.Function = null,
    mapToModel: js.UndefOr[Boolean] = js.undefined,
    model: Model[_, _, _] = null,
    nest: js.UndefOr[Boolean] = js.undefined,
    plain: js.UndefOr[Boolean] = js.undefined,
    raw: js.UndefOr[Boolean] = js.undefined,
    replacements: js.Object | js.Array[String] = null,
    retry: RetryOptions = null,
    returning: js.UndefOr[Boolean] = js.undefined,
    searchPath: String = null,
    supportsSearchPath: js.UndefOr[Boolean] = js.undefined,
    transaction: Transaction = null,
    `type`: String = null,
    useMaster: js.UndefOr[Boolean] = js.undefined
  ): QueryOptions = {
    val __obj = js.Dynamic.literal()
    if (bind != null) __obj.updateDynamic("bind")(bind.asInstanceOf[js.Any])
    if (fieldMap != null) __obj.updateDynamic("fieldMap")(fieldMap)
    if (instance != null) __obj.updateDynamic("instance")(instance)
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (!js.isUndefined(mapToModel)) __obj.updateDynamic("mapToModel")(mapToModel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (!js.isUndefined(nest)) __obj.updateDynamic("nest")(nest)
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain)
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    if (replacements != null) __obj.updateDynamic("replacements")(replacements.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry)
    if (!js.isUndefined(returning)) __obj.updateDynamic("returning")(returning)
    if (searchPath != null) __obj.updateDynamic("searchPath")(searchPath)
    if (!js.isUndefined(supportsSearchPath)) __obj.updateDynamic("supportsSearchPath")(supportsSearchPath)
    if (transaction != null) __obj.updateDynamic("transaction")(transaction)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(useMaster)) __obj.updateDynamic("useMaster")(useMaster)
    __obj.asInstanceOf[QueryOptions]
  }
}

