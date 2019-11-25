package typings.sequelize.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefineIndexOptions extends js.Object {
  /**
    * Pass CONCURRENT so other operations run while the index is created - PostgresSQL only. Default is false
    */
  var concurrently: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the index. Default is __
    */
  var indexName: js.UndefOr[String] = js.undefined
  /**
    * Set a type for the index, e.g. BTREE. See the documentation of the used dialect
    */
  var indexType: js.UndefOr[String] = js.undefined
  /**
    * The index type
    */
  var indicesType: js.UndefOr[IndexType] = js.undefined
  /**
    * A function that receives the sql query, e.g. console.log
    */
  var logging: js.UndefOr[js.Function] = js.undefined
  /**
    * The name of the index. Default is Default is <table>_<attr1>_<attr2>
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Index operator
    */
  var operator: js.UndefOr[String] = js.undefined
  /**
    * For FULLTEXT columns set your parser
    */
  var parser: js.UndefOr[String] = js.undefined
  /**
    * The index type
    */
  var `type`: js.UndefOr[IndexType] = js.undefined
  /**
    * Create a unique index
    */
  var unique: js.UndefOr[Boolean] = js.undefined
  /**
    * Create an unique index
    */
  var using: js.UndefOr[String] = js.undefined
  /**
    * A hash of attributes to limit your index(Filtered Indexes - MSSQL & PostgreSQL only)
    */
  var where: js.UndefOr[AnyWhereOptions] = js.undefined
}

object DefineIndexOptions {
  @scala.inline
  def apply(
    concurrently: js.UndefOr[Boolean] = js.undefined,
    indexName: String = null,
    indexType: String = null,
    indicesType: IndexType = null,
    logging: js.Function = null,
    name: String = null,
    operator: String = null,
    parser: String = null,
    `type`: IndexType = null,
    unique: js.UndefOr[Boolean] = js.undefined,
    using: String = null,
    where: AnyWhereOptions = null
  ): DefineIndexOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(concurrently)) __obj.updateDynamic("concurrently")(concurrently.asInstanceOf[js.Any])
    if (indexName != null) __obj.updateDynamic("indexName")(indexName.asInstanceOf[js.Any])
    if (indexType != null) __obj.updateDynamic("indexType")(indexType.asInstanceOf[js.Any])
    if (indicesType != null) __obj.updateDynamic("indicesType")(indicesType.asInstanceOf[js.Any])
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (parser != null) __obj.updateDynamic("parser")(parser.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique.asInstanceOf[js.Any])
    if (using != null) __obj.updateDynamic("using")(using.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineIndexOptions]
  }
}

