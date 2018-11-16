package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DefineIndexOptions extends js.Object {
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

