package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
//  Query Types
// ~~~~~~~~~~~~~
//
//  https://github.com/sequelize/sequelize/blob/v3.4.1/lib/query-types.js
//
trait QueryTypes extends js.Object {
   // 'BULKUPDATE'
  var BULKDELETE: java.lang.String
   // 'UPDATE'
  var BULKUPDATE: java.lang.String
   // 'BULKDELETE'
  var DELETE: java.lang.String
   // 'SHOWINDEXES'
  var DESCRIBE: java.lang.String
   // 'RAW'
  var FOREIGNKEYS: java.lang.String
   // 'SELECT'
  var INSERT: java.lang.String
   // 'DESCRIBE'
  var RAW: java.lang.String
  var SELECT: java.lang.String
   // 'SHOWTABLES'
  var SHOWINDEXES: java.lang.String
   // 'VERSION'
  var SHOWTABLES: java.lang.String
   // 'INSERT'
  var UPDATE: java.lang.String
   // 'DELETE'
  var UPSERT: java.lang.String
   // 'UPSERT'
  var VERSION: java.lang.String
}

object QueryTypes {
  @scala.inline
  def apply(
    BULKDELETE: java.lang.String,
    BULKUPDATE: java.lang.String,
    DELETE: java.lang.String,
    DESCRIBE: java.lang.String,
    FOREIGNKEYS: java.lang.String,
    INSERT: java.lang.String,
    RAW: java.lang.String,
    SELECT: java.lang.String,
    SHOWINDEXES: java.lang.String,
    SHOWTABLES: java.lang.String,
    UPDATE: java.lang.String,
    UPSERT: java.lang.String,
    VERSION: java.lang.String
  ): QueryTypes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BULKDELETE")(BULKDELETE)
    __obj.updateDynamic("BULKUPDATE")(BULKUPDATE)
    __obj.updateDynamic("DELETE")(DELETE)
    __obj.updateDynamic("DESCRIBE")(DESCRIBE)
    __obj.updateDynamic("FOREIGNKEYS")(FOREIGNKEYS)
    __obj.updateDynamic("INSERT")(INSERT)
    __obj.updateDynamic("RAW")(RAW)
    __obj.updateDynamic("SELECT")(SELECT)
    __obj.updateDynamic("SHOWINDEXES")(SHOWINDEXES)
    __obj.updateDynamic("SHOWTABLES")(SHOWTABLES)
    __obj.updateDynamic("UPDATE")(UPDATE)
    __obj.updateDynamic("UPSERT")(UPSERT)
    __obj.updateDynamic("VERSION")(VERSION)
    __obj.asInstanceOf[QueryTypes]
  }
}

