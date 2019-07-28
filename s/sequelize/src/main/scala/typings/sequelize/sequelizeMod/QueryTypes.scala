package typings.sequelize.sequelizeMod

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
  var BULKDELETE: String
   // 'UPDATE'
  var BULKUPDATE: String
   // 'BULKDELETE'
  var DELETE: String
   // 'SHOWINDEXES'
  var DESCRIBE: String
   // 'RAW'
  var FOREIGNKEYS: String
   // 'SELECT'
  var INSERT: String
   // 'DESCRIBE'
  var RAW: String
  var SELECT: String
   // 'SHOWTABLES'
  var SHOWINDEXES: String
   // 'VERSION'
  var SHOWTABLES: String
   // 'INSERT'
  var UPDATE: String
   // 'DELETE'
  var UPSERT: String
   // 'UPSERT'
  var VERSION: String
}

object QueryTypes {
  @scala.inline
  def apply(
    BULKDELETE: String,
    BULKUPDATE: String,
    DELETE: String,
    DESCRIBE: String,
    FOREIGNKEYS: String,
    INSERT: String,
    RAW: String,
    SELECT: String,
    SHOWINDEXES: String,
    SHOWTABLES: String,
    UPDATE: String,
    UPSERT: String,
    VERSION: String
  ): QueryTypes = {
    val __obj = js.Dynamic.literal(BULKDELETE = BULKDELETE, BULKUPDATE = BULKUPDATE, DELETE = DELETE, DESCRIBE = DESCRIBE, FOREIGNKEYS = FOREIGNKEYS, INSERT = INSERT, RAW = RAW, SELECT = SELECT, SHOWINDEXES = SHOWINDEXES, SHOWTABLES = SHOWTABLES, UPDATE = UPDATE, UPSERT = UPSERT, VERSION = VERSION)
  
    __obj.asInstanceOf[QueryTypes]
  }
}

