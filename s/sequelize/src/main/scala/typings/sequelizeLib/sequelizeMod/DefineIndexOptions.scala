package typings
package sequelizeLib.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefineIndexOptions extends js.Object {
  /**
    * Pass CONCURRENT so other operations run while the index is created - PostgresSQL only. Default is false
    */
  var concurrently: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The name of the index. Default is __
    */
  var indexName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set a type for the index, e.g. BTREE. See the documentation of the used dialect
    */
  var indexType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The index type
    */
  var indicesType: js.UndefOr[
    sequelizeLib.sequelizeLibStrings.UNIQUE | sequelizeLib.sequelizeLibStrings.FULLTEXT | sequelizeLib.sequelizeLibStrings.SPATIAL
  ] = js.undefined
  /**
    * A function that receives the sql query, e.g. console.log
    */
  var logging: js.UndefOr[js.Function] = js.undefined
  /**
    * For FULLTEXT columns set your parser
    */
  var parser: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A hash of attributes to limit your index(Filtered Indexes - MSSQL & PostgreSQL only)
    */
  var where: js.UndefOr[AnyWhereOptions] = js.undefined
}

object DefineIndexOptions {
  @scala.inline
  def apply(
    concurrently: js.UndefOr[scala.Boolean] = js.undefined,
    indexName: java.lang.String = null,
    indexType: java.lang.String = null,
    indicesType: sequelizeLib.sequelizeLibStrings.UNIQUE | sequelizeLib.sequelizeLibStrings.FULLTEXT | sequelizeLib.sequelizeLibStrings.SPATIAL = null,
    logging: js.Function = null,
    parser: java.lang.String = null,
    where: AnyWhereOptions = null
  ): DefineIndexOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(concurrently)) __obj.updateDynamic("concurrently")(concurrently)
    if (indexName != null) __obj.updateDynamic("indexName")(indexName)
    if (indexType != null) __obj.updateDynamic("indexType")(indexType)
    if (indicesType != null) __obj.updateDynamic("indicesType")(indicesType.asInstanceOf[js.Any])
    if (logging != null) __obj.updateDynamic("logging")(logging)
    if (parser != null) __obj.updateDynamic("parser")(parser)
    if (where != null) __obj.updateDynamic("where")(where)
    __obj.asInstanceOf[DefineIndexOptions]
  }
}

